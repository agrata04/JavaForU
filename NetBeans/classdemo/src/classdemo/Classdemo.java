/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author asd
 */
public class Classdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        simple s = new simple();
        s.change(20);
        s.changeG(3);
        s.printall();
        
        overload over = new overload();
        over.area(2);
        over.area(2.5);
        over.area();
        
        construct c = new construct();
        c.calculate();
        c.show();
        construct c1 = new construct(20,10,4);
        c1.calculate();
        c1.show(); 
        
        thiskey t = new thiskey(5);
        t.show(); 
        
        finalkey f = new finalkey();
        f.valueOf();
    }
}
