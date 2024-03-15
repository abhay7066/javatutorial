package CRUD2;

import in.JDBCcommon.JDBCUtill;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) throws FileNotFoundException
    {

        Connection connection=null;
        PreparedStatement statement=null;

        try {
            connection =  JDBCUtill.getjdbcconnectio();
            if(connection!=null)
            {
                String myinsert="insert into billinfo(bname,money,s) value(?,?,?)";
                statement=connection.prepareStatement(myinsert);

                if (statement!=null)
                {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("enter yout bill name :");
                    String bname=sc.nextLine();
                    statement.setString(1,bname);

                    Scanner sc1=new Scanner(System.in);
                    System.out.println("enter money of your bill :");
                    int money=sc1.nextInt();
                    statement.setInt(2,money);

                    Scanner sc2=new Scanner(System.in);
                    System.out.println("enter the status paid or not");
                    String status=sc.nextLine();
                    statement.setString(3,status);

                }
               int noterror= statement.executeUpdate();
                if (noterror ==1)
                {
                    System.out.println("row inserted :");
                }
                else {
                    System.out.println("not inserted :");
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
