/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Agrata
 */
public class WindowDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int X=0;
        int Y =0;
        
        JWindow win = new JWindow();
        win.setBounds(100, 100,100,100);
        win.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
             System.exit(0);   
            }
        });
        win.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e)
            {
                X = e.getX();
                Y = 
             System.out.println("The x="+X+"y="+Y);   
            }
        });
        win.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent e)
            {
              setLocation()  
            }
        });
        
    }
}
