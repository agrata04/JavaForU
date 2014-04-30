/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author asd
 */
public class simple {
    int speed;
    int gear;
    
    void change(int value)
    {
        speed  = value;
    }
    void changeG(int value)
    {
        gear = value;
    }
    
    void printall()
    {
        System.out.println("Speed of car:"+speed);
        System.out.println("Gear of car"+gear);
    }
}
