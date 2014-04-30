/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author Agrata
 */
public class MyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        FirstClass fc[] = new FirstClass[2];
        fc[0] = new SecondClass();
        fc[1] = new ThirdClass();
        
        for(int x=0;x<2;++x)
        {
            fc[x].display();
        }
        
        
    }
}
