/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderdemo;

/**
 *
 * @author Agrata
 */
public class StringBuilderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder sb = new StringBuilder("your");
        sb.setLength(9);
        sb.ensureCapacity(15);
        sb.append("Greetings");
        System.out.println(sb);
        sb.append("are");
        System.out.println(sb);
        sb.ensureCapacity(3);
        sb.setLength(2);
        sb.append("Good");
        System.out.println(sb);
        
        
    }
}
