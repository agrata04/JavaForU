/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.datatransfer.*;

/**
 *
 * @author Agrata
 */
public class Palette {
    
    
   JFrame f;
   JButton b;
   JToolBar tb;
   
   
   Palette()
   {
       f = new JFrame();
       b = new JButton();
       f.add(b);
       f.setVisible(true);
       f.setSize(200,200);
       f.setLayout(new FlowLayout());
   }
   
   public static void main(String[] args)
   {
        Palette palette = new Palette();
   }
   
    
   
}