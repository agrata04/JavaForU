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
public class CollectItert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        LinkedList ll = new LinkedList();
        ll.add(new Integer(100));
        ll.add(new Integer(-100));
        ll.add(new Integer(45));
        
        Comparator r = Collections.reverseOrder();
        Collections.sort(ll,r);
        
        System.out.println("Elements in reverse order");
        Iterator l1 = ll.iterator();
        
        while(l1.hasNext())
        {
            System.out.println(l1.next()+"");
            
        }
        
        Collections.shuffle(ll);
        l1 = ll.iterator();
        
        System.out.println("Elements in random order");
        while(l1.hasNext())
        {
            System.out.println(l1.next());
        }
        System.out.println();
        System.out.println("Minimum number ="+Collections.min(ll));
        System.out.println("Maximum number ="+Collections.max(ll));
        
        
    }
}
