/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.awt.geom.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Agrata
 */
public class Circle extends Frame  {
    
    Shape circle = new Ellipse2D.Float(100.0f, 100.0f, 100.0f,100.0f);
    Shape square = new Rectangle2D.Double(300,300,200,200);
    
    @Override
    public void paint(Graphics g)
    {
        Graphics2D g1 = (Graphics2D)g;
        g1.draw(circle);
        g1.setPaint(Color.green);
        g1.fill(circle);
        g1.draw(square);
        g1.setPaint(Color.ORANGE);
       g1.fill(square);
    }
    public static void main(String[] args)
    {
        Frame f = new Circle();
        f.addWindowListener(new WindowAdapter() {
            @Override
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
        });
        f.setSize(400,400);
        f.setVisible(true);
        

                
    }
}
