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
        fn = open("C:/Users/***/Desktop/Python数据分析与数据化运营/chapter1/data.txt")
        all_data = fn.readlines()
        fn.close()

        x = []
        y = []
        for single_data in all_data:
            temp_data = re.split('\t|\n', single_data)
            x.append(float(temp_data[0]))
            y.append(float(temp_data[1]))
        x = numpy.array(x).reshape([100, 1])
        y = numpy.array(y).reshape([100, 1])

        plt.scatter(x, y)
        plt.show()

        from sklearn.linear_model import LinearRegression
        model=LinearRegression()
        model.fit(x, y)

        model_coef = model.coef_  # 获取模型自变量系数并赋值给model_coef
        model_intercept = model.intercept_  # 获取模型的截距并赋值给model_intercept
        r2 = model.score(x, y)  # 回归方程 y = model_coef*x + model_intercept
        new_x = 84610
        pre_y = model.predict(new_x)
        print(pre_y)





if __name__ == '__main__':
    sql='select * from sale_money;'
    a=Gui()
    a.init()



