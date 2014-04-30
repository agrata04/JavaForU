/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.io.*;
import java.util.*;
/**
 *
 * @author Agrata
 */
public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here 
        File f = new File("E:/NetBeans project/JavaProject2/src/demos/HelloData.txt");
        
        
        
        try
        {
            Scanner sc = new Scanner(f);
            while(sc.hasNext())
            {
             String line = sc.nextLine();
             System.out.println(line);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
