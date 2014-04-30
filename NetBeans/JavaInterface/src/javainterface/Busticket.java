/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface;

/**
 *
 * @author asd
 */
public class Busticket implements ticket {
    
    public String type;
    public int cost;
    Busticket()
    {
        type = "Bus ticket";
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
        System.out.println("Ticket type"+type);
        System.out.println("Ticket average cost"+Avgcost(200));
        
    }
    
}
