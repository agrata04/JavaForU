/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Agrata
 */
public class TabDemo {
    
    public TabDemo()
    {
        JFrame f = new JFrame();
        JPanel mainpanel = new JPanel();
        JPanel textpanel1 = new JPanel();
        JTextArea area = new JTextArea(5,50);
        textpanel1.add(area);
        
        JTabbedPane tb = new JTabbedPane();
        tb.addTab("New", textpanel1);
//        tb.addTab("First", textpanel1);
        tb.setTabPlacement(JTabbedPane.TOP);
        mainpanel.add(tb);
        f.add(mainpanel);
        f.pack();
        f.setVisible(true);
        
        
         }
    public static void main(String[] args)
    {
        TabDemo tabDemo = new TabDemo();
    }
    
}
