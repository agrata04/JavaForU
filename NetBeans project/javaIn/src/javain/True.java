/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javain;

/**
 *
 * @author Agrata
 */
public class True {
    
    int edge;
    
    public int area(int edge)
    {
        this.edge = edge;
        return edge*edge;
    }
    public void show()
    {
        System.out.println("Area of square ="+area(edge));
    }
    
    
}
