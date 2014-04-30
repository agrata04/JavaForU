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
public class TextPane implements ActionListener{
    
    JFrame frame;
    JPanel mainpanel,textpanel1;
    JMenuBar mb;
    JMenu m;
    JMenuItem item1;
    JTabbedPane tb;
    JTextArea area;
    JButton btn;
    Icon icon;
    
    public TextPane()
    {
        frame = new JFrame("TextPad");
        mainpanel = new JPanel(); // for add tab
        textpanel1 = new JPanel();
        mb = new JMenuBar();
        m = new JMenu("Add");
        item1 = new JMenuItem("Tab");
        tb = new JTabbedPane();
        area = new JTextArea(5,50);
        icon = new ImageIcon("jellycross.jpg");
        
        
    }
    
    public void setComp()
    {
      textpanel1.add(area);
      tb.addTab("Welcome",icon, textpanel1);
     
      
      
      mainpanel.add(tb);
      
      item1.addActionListener(this);
      item1.setActionCommand("Tab");
      
      m.add(item1);
      mb.add(m);
      frame.setJMenuBar(mb);
      frame.getContentPane().add(mainpanel);
      frame.pack();
      frame.setVisible(true);
      
      
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
     String s = ae.getActionCommand();
     
     if(s.equals("Tab"))
     {
         JPanel newpanel = new JPanel();
         newpanel.add(new JTextArea(5,50));
         tb.addTab("untitled",icon, newpanel);
         
         
         
         mainpanel.add(tb);
     }
    }
    public static void main(String[] args)
    {
        TextPane textpane = new TextPane();
        textpane.setComp();
    }
    
    
}
