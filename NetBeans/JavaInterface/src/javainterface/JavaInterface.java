/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface;

/**
 *
 * @author asd
 */
public class JavaInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Busticket bus = new Busticket(); 
        bus.show();
        Cinema cinema = new Cinema();
        cinema.show();
        cinema.virtue();
        
        railway rail = new railway();
        rail.ticketType("Super");
        rail.NameOf("David");
        rail.ageOf(34);
        rail.show();
    }
}
