/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;

import Framework.Errorpanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Framework.updatepack.CreateTables;
/**
 *
 * @author sathyagriffin
 */
public class updatedb {
    updatedb()
    {try
    {
    CreateTables ct=new CreateTables();
    ct.PrintDisplayCreate();}
    catch(Exception e)
    {
     Errorpanel erp=new Errorpanel("Error occured");
    }
    }
}
