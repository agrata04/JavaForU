/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.io.*;

/**
 *
 * @author Agrata
 */
public class TestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String name;
        
        System.out.println("Could ,you tell my name?");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        
        if((name.endsWith("Agrata"))||(name.startsWith("Agrata")))
        {
            System.out.println("Correct answer");
        }
        else
        {
            System.out.println("Incorrect");
        }
        
        
        
    }
}
