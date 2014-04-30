/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Agrata
 */
public class NewClass {
    
    
    NewClass()
    {
        JFrame f = new JFrame();
        JLabel[] lab = new JLabel[2];
        lab[0] = new JLabel("Hello");
        lab[1] = new JLabel("Friend");
        for(int i=0;i<2;i++){
            f.add(lab[i]);
        }
        f.setLayout(new FlowLayout());
        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
        
        NewClass n = new NewClass();
    }
}
