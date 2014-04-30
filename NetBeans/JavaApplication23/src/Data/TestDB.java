import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

  public class TestDB 
  {
     public static void main(String[] args)throws Exception  
      {

      if(args.length==0)
      {
       System.out.println("Usage:java-classpath driver_class_path;."
                           +"TestDB propertiesfile");
       return;
      }
      else 
         SimpleDataSource.init("TestDB.java");
      
      Connection conn = SimpleDataSource.getConnection();
      try  
      {
       Statement stat = conn.createStatement();
       
        stat.execute("CREATE TABLE Test(Name CHAR(20))");
        stat.execute("INSERT INTO Test VALUES('Romeo')");

        ResultSet result = stat.executeQuery("SELECT * FROM Test");

        result.next();
        System.out.println(result.getString("Name"));

        stat.execute("DROP TABLE Test");

        }

        finally
        {
          conn.close();
         }
        }
     } 
