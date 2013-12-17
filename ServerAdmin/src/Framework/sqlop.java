/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;
import serveradmin.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
//deleting the data in a table is not provided will be done only manually through database
/**
 *
 * @author sathyagriffin
 */
public class sqlop {
    //
   public String url="jdbc:mysql://localhost:3306/";
    public void createdbs(String databasename,String uname,String pass) throws SQLException
    {
       
        try {
           //  String url="jdbc:mysql://localhost:3306/";
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
    //
    public void CreateTable(String dbname,String Tblname,String query,String uname,String pass)
    {
      
      try
      {
     // String Url="jdbc:mysql://localhost:3306/"+dbname;
          String Url=url+dbname;
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
    //
    public String StatementCreator(String tblname,String Query)
    {
    return "Create Table "+tblname+" ("+Query+")";
    }
    //
    public String InsertCreator(String tblname,String Query)
    {
    return "insert into "+tblname+" values("+Query+")";
    }
    //
    public void InsertIntoTable(String dbname,String tblname,String Query,String uname,String pass)
    {
    try
      {
      String Url=url+dbname;
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
    //
    public String DeleteCreator(String tblname)
    {
    return "drop table "+tblname;
    }
    //
    public void DeleteTable(String dbname,String tblname,String uname,String pass)
    {
    try
    {
     //String Url="jdbc:mysql://localhost:3306/"+dbname;
        String Url=url+dbname;
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(Url,uname,pass);
      Statement stmt=con.createStatement();
      sqlop sp=new sqlop();
      String statement=sp.DeleteCreator(tblname);
      try
      {
      stmt.executeUpdate(statement);
      System.exit(0);
      }
      catch(Exception e){}
    }
    catch(Exception e)
    {}
    }
    //
    public void displayUrl()
    {
    final JFrame frame=new JFrame("ip");
    final JTextField ip=new JTextField("ip");
    JButton next=new JButton("next");
    ip.setBounds(30,30,120,40);
    next.setBounds(30,80,80,40);
    next.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String address=ip.getText();
                url="jdbc:mysql://"+address+":3306/";
                ServerAdmin st=new ServerAdmin();
                frame.dispose();
            }

        });
    frame.add(ip);
    frame.add(next);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setSize(200,200);
   
    }
}
