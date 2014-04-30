/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor
 */
package javarevision;

/**
 *
 * @author asd
 */
public class Santro 
{ 
    
    public String type;
    public String name;
    public int cost;
    
    public String Oftype(String type)
    {
        this.type = type;
        return type;
    }
    
    public String hasName(String name)
    {
        this.name = name;
        return name;
    }
   
    public int hasCost(int cost)
    {
        this.cost = cost;
        return cost;
    }
    
    public void luxary()
    {
        System.out.println("Super A.C.,cd player");
    }
    
    public void display()
    {
        System.out.println(hasName(name)+"Car is of type"+Oftype(type)+"with Cost"+hasCost(cost));
        
    }
    
    
}
