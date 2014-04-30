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
public class Dog implements Comparator<Dog>,Comparable<Dog>{
    
    private String name;
    private int age;
    
   public Dog()
    {
        
    }
   public Dog(String n,int a)
   {
       name = n;
       age = a;
   }
   public String getDogName()
   {
       return name;
   }
   public int getDogAge()
   {
       return age;
   }
   public int compareTo(Dog d)
   {
       return (this.name).compareTo(d.name);
   }
   public int compare(Dog d,Dog d1)
   {
       return d.age-d1.age;
   }
   
}
