/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designauto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
/**
 *
 * @author Agrata
 */
public class DesignAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        DesignAbstract[] da = new DesignAbstract[2];
        da[0] = new SouthTab1();
        da[0].setPro();
        
        
        da[1] = new DesignPad();
        
        
        da[1].setPro();
        
        
    }
}
