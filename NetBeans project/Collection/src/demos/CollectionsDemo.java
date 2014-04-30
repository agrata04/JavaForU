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
public class CollectionsDemo {
    
    public static void main(String[] args)
    {
        List al = new ArrayList();
        al.add("Night--");
        al.add("sleep");
        al.add("dreams");
        al.add("wake");
        System.out.println();
        System.out.println("Array list elements"+" Night doings");
        System.out.print(""+al);
        
        List ll = new LinkedList();
        ll.add("Morning--");
        ll.add("Brush");
        ll.add("Breakfast");
        System.out.println();
        System.out.println("Linked list"+" Morning Doings");
        System.out.print(""+ll);
        
       Set s = new HashSet();
       s.add("Apple");
       s.add("Mango");
       s.add("Banana");
       System.out.println();
       System.out.println("Set -- fruits");
       System.out.print(""+s);
       
       Map m = new HashMap();
       m.put("potato", "10kg");
       m.put("Brinzle","12kg");
       System.out.println();
       System.out.println("Map -- vegatable with weight");
       System.out.print(""+m);
       System.out.println();
        
    }
    
}
