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
public class ComparatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        List<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("tomy",3));
        list.add(new Dog("Shmmy",2));
        
        Collections.sort(list);
        
        for(Dog a:list)
        
        System.out.print(a.getDogName()+",");
        
        Collections.sort(list,new Dog());
        System.out.println("");
        
        for(Dog a:list)
         System.out.println(a.getDogName()+""+a.getDogAge());        
        
    }
}
