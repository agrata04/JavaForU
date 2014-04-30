/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellonet;

/**
 *
 * @author asd
 */
public class testcon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        for(i=1;i<=10;i++)
        {
            int t = 4*i;
            if(t!=36)
                System.out.println(t);
            continue;
        }
    }
}
