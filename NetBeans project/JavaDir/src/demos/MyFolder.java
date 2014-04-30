/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.io.File;
/**
 *
 * @author Agrata
 */
public class MyFolder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        try
        {
        File f = new File("MyFolder");
        f.mkdir();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
          
    }
}
