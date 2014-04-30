/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javainput;

import java.io.IOException;

/**
 *
 * @author Agrata
 */
public class JavaInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here 
        Cube c = new Cube();
        int e = c.edge;
        c.readVal(e);

        
    }
}
