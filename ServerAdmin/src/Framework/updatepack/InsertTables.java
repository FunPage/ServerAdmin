/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.updatepack;

import Framework.sqlop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author taggo
 */
public class InsertTables {
    JFrame frame=new JFrame("Insert values into table");
    JTextField dbname=new JTextField("enter your dbname");
    JTextField Tblname=new JTextField("enter your table name");
    JTextField ctbquery=new JTextField("enter the table details");
    JButton button=new JButton("Insert");
    JTextField rootuser=new JTextField("username");
    JTextField rootpass=new JTextField("password");
    public void PrintDisplayCreate() throws SQLException
    {
     JLabel label1=new JLabel("Database Name:");
     JLabel label2=new JLabel("Table Name:");
     JLabel label3=new JLabel("values seperated by comma");
     JLabel labelroot=new JLabel("username:");
     JLabel labelpass=new JLabel("password:");
     label1.setBounds(30,30,200,50);labelroot.setBounds(275,30,120,50);
     dbname.setBounds(30,90,200,50);rootuser.setBounds(275,90,150,50);
     label2.setBounds(30,150,200,50);labelpass.setBounds(275,150,150,50);
     Tblname.setBounds(30,210,200,50);rootpass.setBounds(275,210,150,50);
     label3.setBounds(30,270,320,50);
     ctbquery.setBounds(30,330,400,50);
     button.setBounds(185,390,90,40);
     button.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent ae) {
           try
           { 
            String databasename=dbname.getText();
            String Tabelname=Tblname.getText();
            String Query=ctbquery.getText();
            String user=rootuser.getText();
            String pass=rootpass.getText();
            sqlop sqp=new sqlop();
           sqp.InsertIntoTable(databasename, Tabelname, Query, pass, pass);
           }
           catch(Exception e)
           {
              System.out.println("exception");
           }
         }
     });
     frame.add(label1);
     frame.add(label2);
     frame.add(label3);
     frame.add(labelroot);
     frame.add(labelpass);
     frame.add(dbname);
     frame.add(Tblname);
     frame.add(ctbquery);
     frame.add(rootuser);
     frame.add(rootpass);
     frame.add(button);
     frame.setLayout(null);
     frame.setVisible(true);
     frame.setSize(500,500);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
   
    
}
