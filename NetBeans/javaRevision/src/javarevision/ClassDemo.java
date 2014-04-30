/*
 * To change this template, choose Tools | Template
 * and open the template in the editor.
 */
package javarevision;

/**
 *
 * @author asd
 */
public class ClassDemo {

    /**
     * @param args the command line arguments
     */
    private int area;
    private String color;
    
    public int addNewArea(int area)
    {
        this.area = area;
        return area;
    }
    
    public void addNewArea()
    {
        System.out.println("Area is increased by:"+addNewArea(area));
               
        
    }
    
    public String whitewash(String color)
    {
        this.color = color;
        return color;
    }    
    public void whitewash()
    {
        System.out.println("New color"+whitewash(color));
        // TODO code application logic here
        
    }
    public static void main(String[] args) 
    {
      ClassDemo cd = new ClassDemo();
        cd.addNewArea(45);
        cd.addNewArea();
        cd.whitewash("Red");
        cd.whitewash();
        
        ClassDemo cd1 = new ClassDemo();
        cd1.addNewArea(14);
        cd1.addNewArea();
        cd1.whitewash("Yellow");
        cd1.whitewash();
        
    }
}
