/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serveradmin;
import Framework.QueryLib;
/**
 *
 * @author taggo
 */
public class searchdb {
    searchdb()
    {
    QueryLib q=new QueryLib();
    q.listenquery("jdbc:mysql://localhost:3306/", "show databases");
    }
}
