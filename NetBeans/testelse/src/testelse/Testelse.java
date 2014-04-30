/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testelse;

/**
 *
 * @author asd
 */
public class Testelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num =20 ;
        if((num<20)&&(num>10))
            System.out.println("good test marks");
        else if(num== 20)
            System.out.println("Excellent score");
        else if(num <= 10)
            System.out.println("sorry ,poor marks");
        else
            System.out.println("Bomb...!");
        
        
    }
}
