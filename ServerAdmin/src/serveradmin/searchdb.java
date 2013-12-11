/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;
import com.mysql.jdbc.*;
import Framework.*;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author taggo
 */
public class searchdb {
    searchdb() throws SQLException, ClassNotFoundException
    {try{
        basicop b=new basicop();
        b.setUrl("jdbc:mysql://localhost:3306/");
        ResultSet rs=b.Listenquery("show databases");
        String[] sample=null;
        String[][] hello={{"2"}};
        sample=b.getColumnNames(rs);
        }
    catch(Exception e){System.out.println("exception");
    e.printStackTrace();}
    }
        
}
