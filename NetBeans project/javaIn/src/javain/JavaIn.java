/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javain;
import java.io.*;

/**
 *
 * @author Agrata
 */
public class JavaIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here 
        True t = new True();
        
        System.out.println("Enter edge of square");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int e = Integer.parseInt(br.readLine());
        
        t.area(e);
        t.show();
    }
}
