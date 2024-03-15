package CRUD2;

import in.JDBCcommon.JDBCUtill;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class select {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet result=null;

        try {
            connection=JDBCUtill.getjdbcconnectio();
            if (connection!=null)
            {
                String myselect="select * from billinfo where bid=?";
                statement = connection.prepareStatement(myselect);
            }
            if (statement!=null)
            {
                Scanner sc =new Scanner (System.in);
                System.out.println("enter id wich you wat to see data :");
                int id=sc.nextInt();
                statement.setInt(1,id);
            }
            result =statement.executeQuery();
            if(result!=null)
            {
                if(result.next())
                {
                    System.out.println(" bid \t  billname  \t  money  \t  status  ");
                    System.out.println(result.getInt(1)+ " \t   "+ result.getString(2)+" \t    "+ result.getInt(3)+ "\t      "+result.getString(4));


                }
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
