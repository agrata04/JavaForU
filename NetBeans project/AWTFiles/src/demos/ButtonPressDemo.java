/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Agrata
 */
public class ButtonPressDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Button b;
        ActionListener al = new ButtonPress();
        Frame f = new Frame();
        f.add(b = new Button("Welcome to"),BorderLayout.NORTH);
        b.addActionListener(al);
        b.setActionCommand("Welcome to");
        f.add(b = new Button("Siliconindia"),BorderLayout.CENTER);
        b.addActionListener(al);
        b.setActionCommand("Siliconindia");
        f.add(b = new Button("Bye-Bye"),BorderLayout.SOUTH);
        b.addActionListener(al);
        b.setActionCommand("Exit");
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
            f.pack();
            f.setVisible(true);
    }
}
