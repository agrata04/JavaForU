/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author asd
 */
public class construct {
    
    int length;
    int width;
    int height;
    
    construct()
    {
        length = 10;
        width = 10;
        height = 10;
    }
    
    construct(int l,int b,int h)
    {
        length=l;
        width=b;
        height =h;
    }
    
    public int calculate()
    {
        return length*width*height;
    }
    
    public void show()
    {
        System.out.println("Volume of cube"+calculate());
    }
    
    
}
