package Test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class Insert {

    public static void main(String[] args) {
        new Insert();
    }

    Insert(){

        int is_id,is_stock;
        String is_commodity;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入进货的id：");
        is_id = sc.nextInt();
        System.out.println("请输入进货的名称：");
        is_commodity = sc.next();
        System.out.println("请输入商品增加数量：");
        is_stock = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.microsoft.sqlserver.jdbc.SQLServerDriver
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_test", "testuser","123456");
            Statement st = conn.createStatement();
            st.execute("UPDATE Info_shop SET stock = stock +"+is_stock+" WHERE id = "+is_id+"AND commodity ="+is_commodity);
            System.out.println("更新数据成功");
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
