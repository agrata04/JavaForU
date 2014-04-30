/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

/**
 *
 * @author asd
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Santro san = new Santro();
        san.Oftype("Family_Vechical");
        san.hasName("Santro deleux");
        san.hasCost(233400);
        san.display();
        san.luxary();
        
        Safari safari = new Safari();
        safari.Oftype("Commercial");
        safari.hasName("Safari");
        safari.hasCost(564400);
        safari.display();
        safari.ShowBenefit();
        
    }
}
