/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javainput;
import java.io.*;
/**
 *
 * @author Agrata
 */
public class Cube {
    
    int edge;
    
    public  void readVal(int edge)throws IOException
    {
        this.edge = edge;
        System.out.println("Enter a value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        edge = Integer.parseInt(br.readLine());
        System.out.println("Area of cube = "+edge*edge);
    
    }
}
