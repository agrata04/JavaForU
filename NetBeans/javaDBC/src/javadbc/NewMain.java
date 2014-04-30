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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String driver;
        String url;
        String password;
        String username;
        
        Properties props = new Properties();
        
        driver = props.getProperty("jdbc.driver");
        url = props.getProperty("jdbc.url");
        username = props.getProperty("jdbc.username");
        password = props.getProperty("jdbc.password");
        
        Class.forName(driver);
        
        Connection conn = DriverManager.getConnection(url,username,password);
        
        Statement st = conn.createStatement();
        
        st.execute(create table customer(Name CHAR(20)));
        st.execute("Insert into customer values('Agrata')");
        
        ResultSet rs = stat.executeQuery("Select * from customer");
        
        rs.next();
        
        System.out.println(rs.getString("Name"));
        
    }
}
