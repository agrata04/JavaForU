package padmy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

  public class SimpleDataSource
  {
    public static void init(String fileName) throws IOException,ClassNotFoundException

     {
       // fileName = "newSQLTemplate.sql";
        Properties props = new Properties();
        FileInputStream in = new FileInputStream(fileName);
        props.load(in);
       
        String driver = props.getProperty("jdbc.driver");
        url = props.getProperty("jdbc.url");
        username = props.getProperty("jdbc.username");
        password = props.getProperty("jdbc.password");
         
        Class.forName(driver);
        
     }

      public static Connection getConnection() throws SQLException
       {
         return DriverManager.getConnection(url,username,password);

        }

     private static String url;
     private static String username;
     private static String password;

     }