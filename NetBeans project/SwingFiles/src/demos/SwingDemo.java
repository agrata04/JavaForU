/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import javax.swing.*;
/**
 *
 * @author Agrata
 */
public class SwingDemo extends JFrame {
    
    SwingDemo()
    {
        JLabel lab = new JLabel("siliconindia");
        add(lab);
        setSize(100,100);
        setVisible(true);
        
    }
    public static void main(String[] args)
    {
        new SwingDemo();
    }
    
    
}
