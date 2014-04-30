import java.sql.*;
public class NewEmpty
{
    public static void main(String[] args)
    {
        SimpleDataSource s = new SimpleDataSource();
        Connection conn = s.getConnection();
        try {
            
            Statement st = conn.createStatement();
            st.execute("CREATE TABLE EMP(Name CHAR(20))");
            st.execute("INSERT INTO EMP VALUES('Jack')");
            ResultSet rs = st.executeQuery("SELECT * FROM EMP");
            rs.next();
            System.out.println(rs.getString("Name"));
            
        }
        catch(Exception e)
        {
            System.out.println("Error");
            
        }
    }
}