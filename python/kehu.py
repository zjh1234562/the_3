import matplotlib.pyplot as plt
import matplotlib.pyplot
import pandas as pd
import pymysql

plt.rcParams['font.sans-serif']=['SimHei'] #解决中文乱码

class Visualization:
    def __init__(self):
        self.con = pymysql.connect(host = "localhost",
                                  user = "root", password = 'zjh123456',
                                  db = "shop", charset='utf8')
        #charset用于修正中文输出为问号的问题

    def bar(self,sql):#客户性别可视化
        df = pd.read_sql(sql, self.con)

        plt.subplot(1,2,1)#性别分布
        labels = [u'男', u'女']  # 定义标签
        #sizes = [46, 253]  # 每块值
        sizes=list(df['gender'].value_counts())
        colors = ['red', 'yellowgreen']  # 每块颜色定义
        explode = (0, 0.02)  # 将某一块分割出来，值越大分割出的间隙越大
        patches, text1, text2 = plt.pie(sizes,
                                        explode=explode,
                                        labels=labels,
                                        colors=colors,
                                        labeldistance=1.2,  # 图例距圆心半径倍距离
                                        autopct='%3.2f%%',  # 数值保留固定小数位
                                        shadow=False,  # 无阴影设置
                                        startangle=90,  # 逆时针起始角度设置
                                        pctdistance=0.6)  # 数值距圆心半径倍数距离
        # patches饼图的返回值，texts1饼图外label的文本，texts2饼图内部文本
        # x，y轴刻度设置一致，保证饼图为圆形
        plt.axis('equal')
        plt.title('性别分布')
        plt.legend()

        plt.subplot(1, 2, 2)
        name_list = ['25以下', '25-50岁', '50-75岁', '75岁以上']
        # 设置切分区域
        listBins = [0,25,50,75,100]
        # 利用pd.cut进行数据离散化切分
        num_list = pd.cut(list(df[df['gender']=='男']['age']), bins=listBins).value_counts()
        num_list1 = pd.cut(list(df[df['gender'] == '女']['age']), bins=listBins).value_counts()
        plt.bar(range(len(num_list)), num_list, label='boy', fc='y')
        plt.bar(range(len(num_list)), num_list1, bottom=num_list, label='girl', tick_label=name_list, fc='r')
        plt.legend()
        plt.title('年龄分布')

        plt.show()

if __name__ == '__main__':
    a=Visualization()
    sql = "select * from client;"
    a.bar(sql)
    a.con.close()
