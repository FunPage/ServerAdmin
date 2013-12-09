/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;
import javax.swing.JFrame;
import Framework.Errorpanel;
import Framework.sqlop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
/**
 *
 * @author taggo
 */
public class QueryLib {
    
    public void listenquery(String url,String query)
    {
        try
        {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,"root","root");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(query);
    ResultSetMetaData mt=rs.getMetaData();
    int Coloumncount=mt.getColumnCount();
    int itr=0;
    while(itr<Coloumncount)
    {
    System.out.println(mt.getColumnName(++itr));
    }
    
        }
        catch(Exception e)
        {
            System.out.println("exception");
        }
    }
}
