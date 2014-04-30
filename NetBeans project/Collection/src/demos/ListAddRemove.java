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
public class ListAddRemove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        ArrayList al = new ArrayList();
        System.out.println("Size of al ="+al.size());
        
        al.add("Computer engg.");
        al.add("Mechnical engg.");
        al.add("Ec");
        al.add(1,"EX");
        System.out.println("Contents of al --"+"Engg.branches");
        System.out.print(""+al);
        
        System.out.println("Size of al ="+al.size());
        
        al.remove("Ec");
        al.remove(1);
        
        System.out.println();
        System.out.println("Elements of al = ");
        System.out.print(""+al);
        System.out.println("Size= "+al.size());
        
    }
}
