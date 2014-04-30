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
public class SwingWindow extends JWindow{
    
    private int X=0;
    private int Y=0;
    
    SwingWindow()
    {
        //JWindow win = new JWindow();
        setBounds(100, 100,100,100);
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
             System.exit(0);   
            }
        });
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e)
            {
                X = e.getX();
                Y = e.getY();
             System.out.println("The x="+X+"y="+Y);   
            }
        });
       addMouseListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent e)
            {
              setLocation(getLocation().x+(e.getX()-X),getLocation().y+(e.getY()-Y));
              
            }
        });
       setVisible(true);
        
    }
    public static void main(String[] args)
    {
        SwingWindow swingWindow = new SwingWindow();
    }
    
    
}
