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
public class ButtonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
       Frame f = new Frame();
       Button btn = new Button("OK");
       f.add(btn);
       f.setLayout(new FlowLayout());
       f.addWindowListener(new WindowAdapter()
       {
           public void windowClosing(WindowEvent e)
           {
               System.exit(0);
           }
       });
       f.setSize(200,200);
       f.setVisible(true);
       
    }
}
