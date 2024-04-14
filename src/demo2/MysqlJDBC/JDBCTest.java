package demo2.MysqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Zhong.Yl
 * 2024/4/12 9:59
 * java_xuexi
 */
public class JDBCTest {
    public static void main(String[] args) throws Exception {
        //加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        try(
                //使用DriverManager获取数据库连接
                //其中放回的connection就代表java程序和数据库的连接
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/select_text?useSSL=true",
                        "root","32147");
                //使用Connection创建statement对象
                Statement sta = con.createStatement();
                ){

        }

    }
}
