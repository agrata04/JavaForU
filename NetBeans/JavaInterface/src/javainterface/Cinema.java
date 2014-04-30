/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface;

/**
 *
 * @author asd
 */
public class Cinema extends Busticket implements ticket {
    
    Cinema()
    {
        type = "Cinema ticket";
    }
    
    public void ticketType(String type)
    {
        this.type = type;
    }
    
    public int Avgcost(int cost)
    {
        this.cost = cost;
        return cost;
    }
    public void show()
    {
    System.out.println("Ticket type:"+type);
    System.out.println("Ticket cost;average"+Avgcost(100));
    }
    
    public void virtue()
    {
        System.out.println("Two virtues,Balcony and simple");
    }
    
}
