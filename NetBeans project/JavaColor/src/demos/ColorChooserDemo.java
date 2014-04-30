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
public class ColorChooserDemo  implements ActionListener,ChangeListener {
    
    JLabel paintlabel;
    JButton btn;
    JColorChooser choose;
    JPanel p;
    JFrame frame;
    
    public ColorChooserDemo()
    {
        paintlabel = new JLabel("Color me");
        btn = new JButton("Color");
        choose = new JColorChooser();
        p = new JPanel();
        frame = new JFrame("Color");
        
    }
    public void setComp()
    {
        paintlabel.setBackground(Color.BLUE);
        paintlabel.setForeground(Color.YELLOW);
        
        p.add(paintlabel);
        btn.addActionListener(this);
        
        p.add(btn);
        
        choose.getSelectionModel().addChangeListener(this);
        frame.getContentPane().add(p);
        frame.pack();
        frame.setVisible(true);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
     Color newColor = JColorChooser.showDialog(p,"Choose background color", paintlabel.getForeground());
     
     if(newColor != null)
     {
      paintlabel.setForeground(newColor);
      
     }
     
    }
    @Override
    public void stateChanged(ChangeEvent e)
    {
     Color newColor = choose.getColor();
     paintlabel.setForeground(newColor);
     
    }
    public static void main(String[] args)
    {
        ColorChooserDemo c = new ColorChooserDemo();
        c.setComp();
        
    }
}
