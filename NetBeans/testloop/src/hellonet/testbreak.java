/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellonet;

/**
 *
 * @author asd
 */
public class testbreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {20,30,40,50,100};
        int i;
        for(i=0;i<5;i++)
        {
            if(arr[i]==40)
            {
                System.out.println("Number found");
                break;
               // System.out.println("Thankx");
            }
            //System.out.println("Thankx");
            
            
        }
    }
}
