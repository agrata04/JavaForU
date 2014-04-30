/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface;

/**
 *
 * @author asd
 */
public interface ticket {
    
    void ticketType(String type);
    int Avgcost(int cost);
    void show();
    
    
}

interface ticketPerson extends ticket
{
    void NameOf(String name);
    void ageOf(int age);
}
