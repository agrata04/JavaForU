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
public class WriteClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        try
        {
            FileWriter fw = new FileWriter("E:/Files/WriteClass.java");
            BufferedWriter bw = new BufferedWriter(fw);
            File f = new File("E:/NetBeans project/JavaProject2/src/demos/WriteClass.java");
            Scanner sc = new Scanner(f);
            while(sc.hasNext())
            {
                String w = sc.nextLine();
                bw.write(w);
                bw.newLine();
                bw.flush();
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
