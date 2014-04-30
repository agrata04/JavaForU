/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexception;

/**
 *
 * @author Agrata
 */
public class FinallyBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int[] a = {3,4,5};
        
        try
        {
            a[5] = 45;
            System.out.println(a[5]);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            System.out.println("Out of bound");
        }
                
                    
                
    }
}
