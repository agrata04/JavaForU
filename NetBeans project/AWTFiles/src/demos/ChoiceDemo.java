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
public class ChoiceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
       Frame f = new Frame();
       Label lab = new Label("What is your choice?");
       Choice c = new Choice();
       c.add("welcome");
       c.add("siliconindia");
       f.add(lab);
       f.add(c);
       f.setLayout(new FlowLayout());
       f.addWindowListener(new WindowAdapter()
       {
           public void windowClosing(WindowEvent e)
           {
               System.exit(0);
           }
       });
       f.setSize(400,400);
       f.setVisible(true);
       
    }
}
