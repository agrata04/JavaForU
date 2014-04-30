/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.io.File;
/**
 *
 * @author Agrata
 */
public class Tracing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
         String direct = "E:/Files";
         File f = new File(direct);
         if(f.isDirectory())
         {
             System.out.println("Directory of"+direct);
             String size[] = f.list();
             for(int i=0;i<size.length;i++)
             {
                 File f2 = new File(direct+"/"+size[i]);
                 if(f2.isDirectory())
                 {
                     System.out.println(size[i]+"is a directory");
                     
                 }
                 else
                 {
                     System.out.println(size[i]+"is a file");
                     
                 }
                       
             }
         }
            else
         {
             System.out.println(direct+"is not a directory");
         }
        }
        
         catch(Exception e)
         {
         System.out.println(e.getMessage());    
         
         }
           
        
        
    }
}
