/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JColorChooser.*;
/**
 *
 * @author Agrata
 */
public class JColorDemo implements ChangeListener {
    
    JFrame frame;
    JPanel main,forlabel,forchooser;
    JColorChooser ch;
    JLabel banner;
    
    public JColorDemo()
    {
        frame = new JFrame("Label to color");
        main = new JPanel();
        forlabel = new JPanel();
        forchooser = new JPanel();
        ch = new JColorChooser();
        banner = new JLabel("Hello");
    }
    
    
    public void SetGUI()
    {
        
        ch.getSelectionModel().addChangeListener(this);
        
        
        forlabel.setBorder(BorderFactory.createTitledBorder("Banner"));
        forchooser.setBorder(BorderFactory.createTitledBorder("Choose color"));
        
        banner.setBackground(Color.lightGray);
        banner.setForeground(Color.GREEN);
        
        forlabel.add(banner,BorderLayout.CENTER);
        
         main.add(forlabel);
         forchooser.add(ch,BorderLayout.PAGE_END);
       
         main.add(forchooser);
//         main.setLayout(new GridLayout(2,1));
         
        
        
        frame.add(main);
        frame.pack();
        frame.setVisible(true);
        
        
    }
    @Override
    public void stateChanged(ChangeEvent e)
    {
     Color newColor = ch.getColor();
     banner.setForeground(newColor);
     
    }
    public static void main(String[] args)
    {
     JColorDemo demo = new JColorDemo();
     demo.SetGUI();
    }    
    
}
