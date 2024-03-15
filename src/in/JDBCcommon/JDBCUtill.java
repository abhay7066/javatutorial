package in.JDBCcommon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtill
{

    public static Connection getjdbcconnectio() throws IOException, SQLException {
        FileInputStream fis=new FileInputStream("Application.properties");
        Properties p=new Properties();
        p.load(fis);

        String url=p.getProperty("url");
        String user=p.getProperty("user");
        String password =p.getProperty("password");

        System.out.println(url);
        System.out.println(user);
        System.out.println(password);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("driver not found");;
        }
       Connection connection= DriverManager.getConnection(url,user,password);
        return connection;
    }
    public static void ColseResource(Connection connection, Statement statement) throws SQLException {
        if (connection!=null)
        {
            connection.close();
        }
        if (statement!=null)
        {
            statement.close();
        }
    }
}

