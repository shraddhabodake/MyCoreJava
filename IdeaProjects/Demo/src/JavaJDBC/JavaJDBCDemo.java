package JavaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by shraddha on 31/10/17.
 */
public class JavaJDBCDemo
{

    public static void main(String[] args)
    {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass","root","shraddha");
            Statement stmt=con.createStatement();

            stmt.execute(""+"Create table javabatch10am(id int(10),name varchar(20),city varchar(20))");
            con.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
