package Test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class Price_change {
    public static void main(String args[]){ new Price_change(2);}

    Price_change(double price_add_percent){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.microsoft.sqlserver.jdbc.SQLServerDriver
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_test", "testuser","123456");
            Statement st = conn.createStatement();
            st.execute("UPDATE Info_shop SET price = price * "+price_add_percent);
            System.out.println("更新数据成功");
            st.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    Price_change(int price_add_number){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.microsoft.sqlserver.jdbc.SQLServerDriver
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_test", "testuser","123456");
            Statement st = conn.createStatement();
            st.execute("UPDATE Info_shop SET price = price + "+price_add_number);
            System.out.println("更新数据成功");
            st.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    Price_change(String commodity,double price){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.microsoft.sqlserver.jdbc.SQLServerDriver
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_test", "testuser","123456");
            Statement st = conn.createStatement();
            st.execute("UPDATE Info_shop SET price = "+price+"WHERE commodity =" + commodity);
            System.out.println("更新数据成功");
            st.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
