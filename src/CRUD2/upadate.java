package CRUD2;

import in.JDBCcommon.JDBCUtill;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class upadate {
    public static void main(String[] args) {

        Connection connection=null;
        PreparedStatement statement=null;

        try {
            connection= JDBCUtill.getjdbcconnectio();
            if(connection!=null)
            {
                String myupadate="update billinfo set s=? where bid=? ";
                statement =connection.prepareStatement(myupadate);
            }
            if (statement!=null)
            {
                Scanner sc1=new Scanner(System.in);
                System.out.println("enter id number yop want to cahnge status :");
                String id=sc1.nextLine();
                statement.setString(2,id);

                Scanner sc=new Scanner(System.in);
                System.out.println("enter stusta you want to update paid or not :");
                String s=sc.nextLine();
                statement.setString(1,s);


            }
            statement.executeUpdate();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
