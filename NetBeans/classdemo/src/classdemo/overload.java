/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author asd
 */
public class overload {
    
    int x;
    double z;
    
    public int area(int y)
    {
        x = y;
        return x*x;
        
    }
    
    public double area(double y)
    {
        z = y;
        return z*z;
    }
    
    public void area()
    {
        System.out.println("Area of int"+area(x));
        System.out.println("Area ,double"+area(z));
    }
    
}
