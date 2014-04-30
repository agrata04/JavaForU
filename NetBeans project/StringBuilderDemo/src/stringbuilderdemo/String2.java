/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderdemo;

/**
 *
 * @author Agrata
 */
public class String2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder sb1 = new StringBuilder("Good");
        sb1.append(true);
        sb1.append("Morning");
        System.out.println(sb1);
        sb1.append('h');
        System.out.println(sb1);
        char[] c = {'e','y','u'};
        sb1.append(c);
        System.out.println(sb1);
//        sb1.append(c, 2,3);
//        System.out.println(sb1);
        sb1.append(0.455);
        System.out.println(sb1);
        sb1.append(90);
        System.out.println(sb1);
        sb1.append(0.9f);
        System.out.println(sb1);
    }
}
