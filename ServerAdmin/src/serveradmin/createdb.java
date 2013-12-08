/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;
import Framework.Errorpanel;
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
 * @author sathyagriffin
 */
public class createdb extends JFrame
{
   /* Global parameter Decleration */
    JTextField dbname=new JTextField("database name");
    JTextField uname=new JTextField("Enter your username");
    JTextField pass=new JTextField("Enter your password");
    JButton submit=new JButton("create");
    public void displaypanel()
    {
    JLabel label1=new JLabel("Database Name");
    JLabel label2=new JLabel("Username");
    JLabel label3=new JLabel("password");
    //setting bounds for each element
    label1.setBounds(30,30,200,50);
    dbname.setBounds(30,90,200,50);
    label2.setBounds(30,150,200,50);
    uname.setBounds(30,210,200,50);
    label3.setBounds(30,270,200,50);
    pass.setBounds(30,330,200,50);
    submit.setBounds(100,390,90,50);
    submit.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
           String dname=dbname.getText();
           String usr=uname.getText();
           String pwd=pass.getText();
           sqlop s=new sqlop();
            try
            {
                s.createdbs(dname, usr, pwd);
            } 
            catch (SQLException ex) 
            {
               System.out.print(ex);
               Errorpanel errorpanel = new Errorpanel();
            }
        }
    });
    add(label1);
    add(label2);
    add(label3);
    add(dbname);
    add(uname);
    add(pass);
    add(submit);
    setTitle("Create Table");
    setLayout(null);
    setVisible(true);
    setSize(275,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
createdb()
{
displaypanel();
}
}
