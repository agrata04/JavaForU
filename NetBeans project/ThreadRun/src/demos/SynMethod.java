/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

/**
 *
 * @author Agrata
 */
public class SynMethod {
    
    public static synchronized void display(String name,int id)
    {
//        SynMethodExample t = (SynMethodExample)Thread.currentThread();
        
        
       
        System.out.println(name+id);
    }
    
}
