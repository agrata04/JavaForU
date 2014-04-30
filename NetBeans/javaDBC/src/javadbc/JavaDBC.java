/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javadbc;
import java.sql.*;

/**
 *
 * @author asd
 */
public class JavaDBC {

    /**
     * @param args the command line arguments
     */
    String username;
    String password;
    /*JavaDBC()
    {
    connectToAndQueryDataBase(username,password)throws SQLException;    
    }*/
    
    public void connectToAndQueryDataBase(String username,String password) throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:Driver:MyDataBase",username,password);
        Statement stmt = con.createStatement();
        stmt.execute("create table person(Name char(20))");
        stmt.execute("Insert into person values('Romeo') ");
        
        ResultSet rs = stmt.executeQuery("select * from person");
        while(rs.next())
        {
            System.out.println(rs.getString("Name"));
        }        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       try 
       {
         JavaDBC j =   new JavaDBC();
         j.connectToAndQueryDataBase("jdbc.username", "jdbc.password");
       }
       catch(Exception se)
       {
           System.out.println("Error");
       }
      }
}
