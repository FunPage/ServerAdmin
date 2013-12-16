/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sathyagriffin
 */
public class Errorpanel extends JFrame {
    
    public Errorpanel(String s)
    {
    JLabel l=new JLabel(s);
    JButton b=new JButton("Ok");
    l.setBounds(20,30,150,50);
    b.setBounds(80,80,60,50);
    b.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
           System.exit(0);
        }
    });
    add(l);
    add(b);
    setTitle("Error");
    setLayout(null);
    setVisible(true);
    setSize(200,200);
    }

   
}
