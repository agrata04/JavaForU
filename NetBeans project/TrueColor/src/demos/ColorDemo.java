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
public class ColorDemo  implements ChangeListener {
    
    JPanel p;
    JLabel lab,banner;
    JColorChooser ch,tcc;
    
    public JPanel mypanel(JPanel p)
    {
        this.p = p;
        p = new JPanel();
        return p;
    }
    
    public JLabel mylabel(JLabel lab)
    {
        this.lab = lab;
        lab = new JLabel();
        lab.setBackground(Color.MAGENTA);
        lab.setForeground(Color.YELLOW);
        lab.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,22));
        return lab;
        
    }
    
    public JColorChooser mycolorchooser(JColorChooser ch)
    {
       this.ch = ch;
       ch = new JColorChooser();
       return ch;
    }
    
   
    
     public void Compose()
    {
        JFrame f = new JFrame("Color chooser frame");
        tcc = mycolorchooser(ch);
        
        tcc.getSelectionModel().addChangeListener(this);
        
        JPanel main = mypanel(p);
        banner = mylabel(lab);
        banner.setText("Paint Me!!");
        
        JPanel forp = mypanel(p);
        
        forp.add(banner,BorderLayout.CENTER);
        forp.setBorder(BorderFactory.createTitledBorder("Banner"));
       
        
        main.add(forp);
        JPanel ft = mypanel(p);
        ft.add(tcc,BorderLayout.PAGE_END);
        ft.setBorder(BorderFactory.createTitledBorder("Colorchooser"));
        
        main.add(ft);
//        main.setLayout(new GridLayout(2,1));
        
        
        f.add(main);
        f.pack();
        f.setVisible(true);
        
    }
    @Override
     public void stateChanged(ChangeEvent e)
     {
         Color newColor = tcc.getColor();
         banner.setForeground(newColor);
         
     }
    public static void main(String[] args)
    {
        ColorDemo cd = new ColorDemo();
        cd.Compose();
    }
    
    
    
    
}
