/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;

import Framework.sqlop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author taggo
 */
public class deletedb {
   JFrame frame=new JFrame("Delete Table");
   JTextField dbname=new JTextField("enter the database name");
   JTextField tblname=new JTextField("enter the table name");
   JTextField rootuser=new JTextField("username");
   JTextField rootpass=new JTextField("password");
   JButton button=new JButton("Delete");
   deletedb()
   {
       printdisplay();
   }
   public void printdisplay()
   {
   JLabel label1=new JLabel("enter the database name");
   JLabel label2=new JLabel("enter the table name");
   JLabel label3=new JLabel("username");
   JLabel label4=new JLabel("password");
   label1.setBounds(30,30,250,50);
   dbname.setBounds(30,90,200,50);
   label2.setBounds(30,150,200,50);
   tblname.setBounds(30,210,200,50);
   label3.setBounds(30,270,200,50);
   rootuser.setBounds(30,330,200,50);
   label4.setBounds(30,390,200,50);
   rootpass.setBounds(30,450,200,50);
   button.setBounds(135,520,90,40);
   button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String database=dbname.getText();
                String table=tblname.getText();
                String user=rootuser.getText();
                String pass=rootpass.getText();
                sqlop sp=new sqlop();
                sp.DeleteTable(database, table, user, pass);
            }
        });
   frame.add(label1);
   frame.add(dbname);
   frame.add(label2);
   frame.add(tblname);
   frame.add(label3);
   frame.add(rootuser);
   frame.add(label4);
   frame.add(rootpass);
   frame.add(button);
   frame.setLayout(null);
   frame.setVisible(true);
   frame.setSize(270,600);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
