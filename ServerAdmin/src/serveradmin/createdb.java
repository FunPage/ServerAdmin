/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author sathyagriffin
 */
public class createdb {
    //class is used to create database
    //Global variable decleration
    JFrame container=new JFrame("Create Table");
    JTextField Tabelname=new JTextField("enter the table name");
    JTextField Databasename=new JTextField("enter the database name");
    JButton create=new JButton("create");
    void displayPanel()
    {
    JLabel dbname=new JLabel("Enter the database name");
    JLabel tblname=new JLabel("Enter the Table name");
    dbname.setBounds(30,30,200,50);
    Databasename.setBounds(30,80,200,50);
    tblname.setBounds(30,140,200,50);
    Tabelname.setBounds(30,200,200,50);
    create.setBounds(140,260,80,40);
    create.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
           String strdbname=Databasename.getText();
           String strtblname=Tabelname.getText();
           CreateDBandTable(strdbname,strtblname);
        }
    });
    container.add(dbname);
    container.add(tblname);
    container.add(Databasename);
    container.add(Tabelname);
    container.add(create);
    container.setSize(300,300);
    container.setLayout(null);
    container.setTitle("Create Table");
    container.setVisible(true);
    
    }
    public void CreateDBandTable(String database,String table)
    {
    //to be continued
    }
}
