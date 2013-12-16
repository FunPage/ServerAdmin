/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//deleting the data in a table is not provided will be done only manually through database
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
          
                 System.exit(0);
                 
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
    public void CreateTable(String dbname,String Tblname,String query,String uname,String pass)
    {
      
      try
      {
      String Url="jdbc:mysql://localhost:3306/"+dbname;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(Url,uname,pass);
      Statement stmt=con.createStatement();
      sqlop sp=new sqlop();
      String statement=sp.StatementCreator(Tblname, query);
      try
      {
      stmt.executeUpdate(statement);
      System.exit(0);
      }
      catch(Exception e)
      {
      
      }
      }
      catch(Exception e)
      {
      Errorpanel erp=new Errorpanel("Error occured");
      }
    }
    public String StatementCreator(String tblname,String Query)
    {
    return "Create Table "+tblname+" ("+Query+")";
    }
    public String InsertCreator(String tblname,String Query)
    {
    return "insert into "+tblname+" values("+Query+")";
    }
    public void InsertIntoTable(String dbname,String tblname,String Query,String uname,String pass)
    {
    try
      {
      String Url="jdbc:mysql://localhost:3306/"+dbname;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(Url,uname,pass);
      Statement stmt=con.createStatement();
      sqlop sp=new sqlop();
      String statement=sp.InsertCreator(tblname, Query);
      try
      {
      stmt.executeUpdate(statement);
      System.exit(0);
      }
      catch(Exception e){}
      }
    catch(Exception e){}
    }
}
