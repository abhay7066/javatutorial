package CRUD2;

import in.JDBCcommon.JDBCUtill;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class delet {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement statement =null;

        try {
            connection= JDBCUtill.getjdbcconnectio();

            if (connection!=null)
            {
                String mydelet="delete from billinfo where bid=?";
               statement= connection.prepareStatement(mydelet);
            }
            if (statement!=null)
            {
                Scanner sc=new Scanner (System.in);
                System.out.println("enter bill id wich you want delete :");
                int id=sc.nextInt();
                statement.setInt(1,id);
            }
            int  noteffected= statement.executeUpdate();
            if (noteffected==1)
            {
                System.out.println("row deleted :");
            }
            else {
                System.out.println("not deleted :");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
