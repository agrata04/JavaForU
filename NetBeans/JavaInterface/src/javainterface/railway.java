/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface;

/**
 *
 * @author asd
 */
public class railway extends Busticket implements ticket{

    private String name;
    private int age;
    
    public void ticketType(String type)
    {
        this.type = type;
    }
    public int Avgcost(int cost)
    {
      this.cost = cost;
      return cost;
      
             
    }
    
    public void NameOf(String name)
    {
        this.name = name;
    }
    public void ageOf(int age)
    {
        this.age = age;
    }
    public void show()
    {
        System.out.println("____________");
        System.out.println("Ticket type"+type);
        System.out.println("Average cost"+Avgcost(1000));
        System.out.println("Person name"+name);
        System.out.println("Person age"+age);
    }
    
}
