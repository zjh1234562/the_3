import matplotlib.pyplot as plt
import matplotlib.pyplot
import pandas as pd
import pymysql
import tkinter

plt.rcParams['font.sans-serif']=['SimHei'] #解决中文乱码

class Gui:
    def init(self):
        top = tkinter.Tk()

        top.title('数据可视化')
        top.geometry('500x300')

        menubar=tkinter.Menu(top)
        selectmenu=tkinter.Menu(menubar,tearoff=0)
        menubar.add_cascade(label='图表', menu=selectmenu)

        selectmenu.add_command(label='销售额',command=self.salemoney)
        selectmenu.add_command(label='客户分类', )
        #selectmenu.add_command(label='Save', )
        selectmenu.add_separator()  # 添加一条分隔线

        premenu = tkinter.Menu(menubar, tearoff=0)
        # 将上面定义的空菜单命名为 Edit，放在菜单栏中，就是装入那个容器中
        menubar.add_cascade(label='预测', menu=premenu)

        # 同样的在 Edit 中加入Cut、Copy、Paste等小命令功能单元，如果点击这些单元, 就会触发do_job的功能
        premenu.add_command(label='预测销售额')

        top.config(menu=menubar)

        button=tkinter.Button(width=5)
        button.pack()





        # 进入消息循环
        top.mainloop()

    def aa(self,e):
        year = e.get()
        return year

    def salemoney(self):
        vis=Visualization()

        top = tkinter.Tk()
        top.geometry('200x120')
        e = tkinter.Entry(top, show=None,width=10)  # 显示成明文形式
        e.pack()

        button=tkinter.Button(top,text='生成', width=10,
               height=2,command=lambda : vis.all_sale(sql='select * from sale_money;',year=e.get()))
        button.pack()
        top.mainloop()


class Visualization:
    def __init__(self):
        self.con = pymysql.connect(host = "localhost",
                                  user = "root", password = 'zjh123456',
                                  db = "shop", charset='utf8')
        #charset用于修正中文输出为问号的问题

    def all_sale(self,sql,year):
        df = pd.read_sql(sql, self.con)
        sales=df[df['year']==year][['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
       'Jul', 'Aug', 'Sept', 'Oct', 'Nov', 'Dec']].fillna(0)

        x = [1, 2, 3, 4, 5, 6,7,8,9,10,11,12]
        y = list(sales.loc[sales.index.tolist()[0]])
        plt.figure(figsize=(8, 4))  # 创建绘图对象
        plt.plot(x, y, "b--", linewidth=1)  # 在当前绘图对象绘图（X轴，Y轴，蓝色虚线，线宽度）
        plt.xlabel("Month")  # X轴标签
        plt.ylabel("money")  # Y轴标签
        plt.title("销售额")  # 图标题
        plt.show()  # 显示图

    def gukefxi(self):
        import matplotlib as plt
        import numpy as np
        import warnings
        warnings.filterwarnings('ignore')
        import pandas as pd
        url = 'https://github.com/tristanga/Data-Analysis/raw/master/Global%20Superstore.xls'
        df = pd.read_excel(url)
        df = df[(df.Segment == 'Consumer') & (df.Country == 'United States')]
        df.head()

        df_RFM = df.groupby('Customer ID').agg(
            {'Order Date': lambda y: (df['Order Date'].max().date() - y.max().date()).days,
             'Order ID': lambda y: len(y.unique()),
             'Sales': lambda y: round(y.sum(), 2)})
        df_RFM.columns = ['Recency', 'Frequency', 'Monetary']
        df_RFM = df_RFM.sort_values('Monetary', ascending=False)
        df_RFM.head()

        # We will use the 80% quantile for each feature
        quantiles = df_RFM.quantile(q=[0.8])
        print(quantiles)
        df_RFM['R'] = np.where(df_RFM['Recency'] <= int(quantiles.Recency.values), 2, 1)
        df_RFM['F'] = np.where(df_RFM['Frequency'] >= int(quantiles.Frequency.values), 2, 1)
        df_RFM['M'] = np.where(df_RFM['Monetary'] >= int(quantiles.Monetary.values), 2, 1)
        df_RFM.head()

        # To do the 2 x 2 matrix we will only use Recency & Monetary
        df_RFM['RMScore'] = df_RFM.M.map(str) + df_RFM.R.map(str)
        df_RFM = df_RFM.reset_index()
        df_RFM_SUM = df_RFM.groupby('RMScore').agg({'Customer ID': lambda y: len(y.unique()),
                                                    'Frequency': lambda y: round(y.mean(), 0),
                                                    'Recency': lambda y: round(y.mean(), 0),
                                                    'R': lambda y: round(y.mean(), 0),
                                                    'M': lambda y: round(y.mean(), 0),
                                                    'Monetary': lambda y: round(y.mean(), 0)})
        df_RFM_SUM = df_RFM_SUM.sort_values('RMScore', ascending=False)
        df_RFM_SUM.head()

        # 1) Average Monetary Matrix
        df_RFM_M = df_RFM_SUM.pivot(index='M', columns='R', values='Monetary')
        df_RFM_M = df_RFM_M.reset_index().sort_values(['M'], ascending=False).set_index(['M'])


        # 2) Number of Customer Matrix
        df_RFM_C = df_RFM_SUM.pivot(index='M', columns='R', values='Customer ID')
        df_RFM_C = df_RFM_C.reset_index().sort_values(['M'], ascending=False).set_index(['M'])

        # 3) Recency Matrix

class Pre:

    def pre(self):
        import re
        import pandas as pd
        import numpy
        fn = open("1.txt")
        all_data = fn.readlines()
        fn.close()

        x = []
        y = []
        # for single_data in all_data:
        #     temp_data = re.split('\t|\n', single_data)
        #     x.append(float(temp_data[0]))
        #     y.append(float(temp_data[1]))
        x = numpy.array([1,2,3,4,5,6,7,8,9,10,11,12]).reshape([12, 1])
        y = numpy.array([100,200,200,100,400,300,500,100,300,800,600,200]).reshape([12, 1])

        plt.scatter(x, y)
        # plt.show()

        from sklearn.linear_model import LinearRegression
        model=LinearRegression()
        model.fit(x, y)

        model_coef = model.coef_  # 获取模型自变量系数并赋值给model_coef
        model_intercept = model.intercept_  # 获取模型的截距并赋值给model_intercept
        r2 = model.score(x, y)  # 回归方程 y = model_coef*x + model_intercept
        new_x = 11
        pre_y = model.predict(new_x)
        return pre_y






if __name__ == '__main__':
    # sql='select * from sale_money;'
    # a=Gui()
    # a.init()

    from kehu import Visualization

    a = Visualization()
    sql = "select * from client;"
    # a.bar(sql)
    #a.con.close()



    def sss(Receive_Window):
        from tkinter import END
        pre = Pre()
        y=pre.pre()
        month=10
        strs=str(month)+'月的销售额预计为'+str(y[0][0])+'元'
        print(strs)
        Receive_Window.insert(END,strs)

    def bb():
        a=Visualization()
        a.all_sale()




    import threading
    import tkinter as tk
    #import serial.tools.list_ports
    from tkinter import ttk
    from tkinter import scrolledtext

    #SerialPort = serial.Serial()
    GUI = tk.Tk()  # 父容器
    GUI.title("数据可视化")  # 父容器标题
    GUI.geometry("440x320")  # 父容器大小

    # Information = tk.LabelFrame(GUI, text="操作信息", padx=10, pady=10)  # 水平，垂直方向上的边距均为10
    # Information.place(x=20, y=20)
    # Information_Window = scrolledtext.ScrolledText(Information, width=20, height=5, padx=10, pady=10, wrap=tk.WORD)
    # Information_Window.grid()

    Send2 = tk.LabelFrame(GUI, text="预测销售额，输入月份", padx=10, pady=10)  # 水平，垂直方向上的边距均为 10
    Send2.place(x=20, y=20)

    DataSend2 = tk.StringVar()  # 定义DataSend为保存文本框内容的字符串

    EntrySend2 = tk.StringVar()
    Send_Window2 = ttk.Entry(Send2, textvariable=EntrySend2, width=23)
    Send_Window2.grid()

    tk.Button(Send2, text="查询", command=lambda :sss(Receive_Window)).grid(pady=5, sticky=tk.E)

    Send = tk.LabelFrame(GUI, text="查询销售额，输入年份", padx=10, pady=5)  # 水平，垂直方向上的边距均为 10
    Send.place(x=240, y=20)

    DataSend = tk.StringVar()  # 定义DataSend为保存文本框内容的字符串

    EntrySend = tk.StringVar()
    Send_Window = ttk.Entry(Send, textvariable=EntrySend, width=23)
    Send_Window.grid()

    tk.Button(Send, text="查询",).grid(pady=5, sticky=tk.E)

    Receive = tk.LabelFrame(GUI, text="接收区", padx=10, pady=10)  # 水平，垂直方向上的边距均为 10
    Receive.place(x=240, y=124)
    Receive_Window = scrolledtext.ScrolledText(Receive, width=18, height=9, padx=8, pady=10, wrap=tk.WORD)
    Receive_Window.grid()

    option = tk.LabelFrame(GUI, text="选项", padx=10, pady=10)  # 水平，垂直方向上的边距均为10
    option.place(x=20, y=150, width=203)  # 定位坐标
    # ************创建下拉列表**************
    # ttk.Label(option, text="串口号:").grid(column=0, row=0)  # 添加串口号标签
    # ttk.Label(option, text="波特率:").grid(column=0, row=1)  # 添加波特率标签

    # Port = tk.StringVar()  # 端口号字符串
    # Port_list = ttk.Combobox(option, width=12, textvariable=Port, state='readonly')
    # #ListPorts = list(serial.tools.list_ports.comports())
    # #Port_list['values'] = [i[0] for i in ListPorts]
    # Port_list.current(0)
    # Port_list.grid(column=1, row=0)  # 设置其在界面中出现的位置  column代表列   row 代表行
    #
    # BaudRate = tk.StringVar()  # 波特率字符串
    # BaudRate_list = ttk.Combobox(option, width=12, textvariable=BaudRate, state='readonly')
    # BaudRate_list['values'] = (1200, 2400, 4800, 9600, 14400, 19200, 38400, 43000, 57600, 76800, 115200)
    # BaudRate_list.current(3)
    # BaudRate_list.grid(column=1, row=1)  # 设置其在界面中出现的位置  column代表列   row 代表行

    switch = tk.LabelFrame(GUI, text="", padx=10, pady=10)  # 水平，垂直方向上的边距均为 10
    switch.place(x=20, y=250, width=203)  # 定位坐标


    tk.Button(switch, text="客户信息",command=lambda :a.bar(sql)).pack(side="left", padx=13)
    tk.Button(switch, text="客户分类",).pack(side="right", padx=13)

    GUI.mainloop()



