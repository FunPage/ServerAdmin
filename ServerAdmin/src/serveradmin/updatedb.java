/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;

import Framework.Errorpanel;
import Framework.sqlop;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Framework.updatepack.CreateTables;
import Framework.updatepack.InsertTables;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sathyagriffin
 */
public class updatedb {
    updatedb()
    {
        printdisplay();
    }
    public void printdisplay()
    {
    JFrame frame=new JFrame("Update Database");
    JLabel label=new JLabel("select an update operation below");
    JButton createtbl=new JButton("create");
    JButton inserttbl=new JButton("insert");
    label.setBounds(30,30,250,50);
    createtbl.setBounds(30,90,90,50);
    inserttbl.setBounds(160,90,90,50);
    createtbl.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTables ct=new CreateTables();
                try {
                    ct.PrintDisplayCreate();
                } catch (SQLException ex) {
                  Errorpanel er=new Errorpanel("Operation Failed");
                }
            }
        });
    inserttbl.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                InsertTables it=new InsertTables();
                try {
                    it.PrintDisplayCreate();
                } catch (SQLException ex) {
                   Errorpanel er=new Errorpanel("Operation Failed");
                }
            }
        });
    frame.add(label);
    frame.add(createtbl);
    frame.add(inserttbl);
    frame.setLayout(null);
    frame.setSize(300,300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
