/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author sathyagriffin
 */
public class sqlop {
    public void createdbs(String databasename,String uname,String pass) throws SQLException
    {
       
        try {
             String url="jdbc:mysql://localhost:3306/";
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection(url,uname,pass);
             Statement stmt=con.createStatement();
             try
             {
                 boolean bool=stmt.execute("create database "+databasename);
                 if(bool)
                 {
                 System.exit(0);
                 }
             }
             catch(Exception e)
             {
             System.out.println(e);
                
             }
             
        }  
        catch (ClassNotFoundException ex) 
        {
            
        }
    }
}
