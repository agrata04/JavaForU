/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexception;

/**
 *
 * @author Agrata
 */
public class JavaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 23;
        int num2 = 0;
        
        try
        {
            int num3 = num1/num2;
            System.out.println("Division ="+num3);
        }
        catch(Exception e )
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            System.out.println("Fill a non zero number");
        }
    }
}
