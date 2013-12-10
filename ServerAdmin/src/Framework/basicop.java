/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author taggo
 */
public class basicop {
    
    public String[][] getStrings(int row,int col)
    {
    String[][] temp=new String[row][col];
    //
    Scanner s=new Scanner(System.in);
    for(int i=0;i<row;i++)
    {
    for(int j=0;j<col;j++)
    {
    temp[i][j]=s.next();
    }
    }
    //
    return temp;
    }
    
    public Connection getDBconnection(String url) throws SQLException, ClassNotFoundException
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,"root","root");
    return con;
    }
    
    public String[] getStrings(int row)
    {
    String[] temp=new String[row];
    Scanner s=new Scanner(System.in);
    for(int i=0;i<row;i++)
    {
    temp[i]=s.next();
    }
    return temp;
    }
    public void DisplayTable(String[][] rowData,String[] colname,String name)
    {
    JFrame frame=new JFrame(name);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTable table=new JTable(rowData,colname);
    JScrollPane pane=new JScrollPane(table);
    frame.add(pane,BorderLayout.CENTER);
    frame.setSize(300,300);
    frame.setVisible(true);
    }
}
