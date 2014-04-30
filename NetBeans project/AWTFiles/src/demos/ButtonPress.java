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
public class ButtonPress implements ActionListener{
    
    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
        if(s.equals("Exit"))
        {
            System.exit(0);
        }
        if(s.equals("Welcome to"))
        {
            System.out.println("Welcome to");
        }
        else
        {
            System.out.println("Siliconindia");
        }
    
}
}

