/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Agrata
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        MyHello h[] = new MyHello[2];
        h[0] = new HerHello();
        h[1] = new yourHello();
        
        for(int x=0;x<2;++x)
        {
            h[x].method();
        }
     
    }
}
