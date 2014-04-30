/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlapp;
import java.sql.*;
/**
 *
 * @author asd
 */
public class Sqlapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        // TODO code application logic here
        
   Class.forName("jdbc.driver");
   Connection conn = DriverManager.getConnection("jdbc.url","jdbc.username","jdbc.passowrd");
   Statement stat = conn.createStatement();
   stat.execute("CREATE TABLE Tester(Name CHAR(20))");
   stat.execute("INSERT INTO Tester VALUES('Romeo')");
   String query = "SELECT * FROM Tester";
   ResultSet result = stat.executeQuery(query);
   result.next();
   System.out.println(result.getString("Name"));
   
        
    }
}
