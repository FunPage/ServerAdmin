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
        b.setUrl("jdbc:mysql://localhost:3306/SGCTECH");
        // b.UrlMaker("members");
        ResultSet rs=b.Listenquery("select * from members");
        String[] sample=null;
        String[][] hello=b.getRowData(rs, 1000);
        sample=b.getColumnNames(rs);
        b.DisplayTable(hello, sample, "Sampledb");
        }
    catch(Exception e){System.out.println("exception");
    e.printStackTrace();}
    }
        
}
