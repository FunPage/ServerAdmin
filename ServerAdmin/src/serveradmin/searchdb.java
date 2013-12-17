/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;
import com.mysql.jdbc.*;
import Framework.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author taggo
 */
public class searchdb{
   JFrame frame=new JFrame("search window");
   JTextField database=new JTextField("database name");
   JTextField table=new JTextField("Table name");
   JButton button=new JButton("search");
    searchdb() throws SQLException, ClassNotFoundException
    {
        DisplaySearchPane();
    }
    public void DisplaySearchPane()
    {
     JLabel label1=new JLabel("Enter the Database name");
     JLabel label2=new JLabel("Enter the table name");
     label1.setBounds(30,30,200,50);
     database.setBounds(30,90,200,50);
     label2.setBounds(30,150,200,50);
     table.setBounds(30,210,200,50);
     button.setBounds(120,290,100,40);
     button.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent ae) {
            try{ String dbname=database.getText();
             String tblname=table.getText();
             basicop b=new basicop();
             b.setUrl("jdbc:mysql://localhost:3306");
             b.UrlMaker(dbname);
             ResultSet rs;
             rs =b.Listenquery(b.selectfromtable(tblname));
             String colname[]=null;
             String rownames[][]=null;
             colname=b.getColumnNames(rs);
             rownames=b.getRowData(rs, 100);
             b.DisplayTable(rownames, colname, dbname);
            }
            catch(Exception e){
            Errorpanel er=new Errorpanel("database unknown");
            }
             
         }
     });
     frame.add(label1);
     frame.add(label2);
     frame.add(database);
     frame.add(table);
     frame.add(button);
     frame.setLayout(null);
     frame.setSize(275,375);
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
