/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.util.*;
/**
 *
 * @author Agrata
 */
public class IteratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        ArrayList al = new ArrayList();
        al.add('a');
        al.add('b');
        al.add('c');
        
        System.out.print("Contents of al =");
        
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            Object element = itr.next();
            System.out.print(element);
        }
        
        System.out.println();
        
        ListIterator litr = al.listIterator();
        while(litr.hasNext())
        {
            Object element = litr.next();
            litr.set(element+"+");
            
        }
        
        System.out.print("Contents of al ,modified");
         itr = al.iterator();
         while(itr.hasNext())
         {
             Object element = itr.next();
             System.out.print(element+"");
         }
         
         System.out.println();
         
         System.out.println("Modified list backwords");
         while(litr.hasPrevious())
         {
             Object element = litr.previous();
             System.out.print(element+"");
             
         }
         System.out.println();        
    }
}
