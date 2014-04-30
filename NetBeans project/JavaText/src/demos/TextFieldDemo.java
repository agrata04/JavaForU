/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Agrata
 */
public class TextFieldDemo implements ActionListener {
    
    JTextField textf;
    JTextArea area;
    String newline = "\n";
    
    public TextFieldDemo()
    {
        createAndshowGUI();
    }
    public void createAndshowGUI()
    {
      JFrame f = new JFrame();
      textf = new JTextField(20);
      
      textf.addActionListener(this);
      area = new JTextArea(5,20);
      
      JScrollPane jsp = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      
      GridBagLayout gb = new GridBagLayout();
      JPanel p = new JPanel();
      p.setLayout(gb);
      
      
      GridBagConstraints gb1 = new GridBagConstraints();
      gb1.gridwidth = GridBagConstraints.REMAINDER;
      gb1.fill = GridBagConstraints.HORIZONTAL;
      p.add(textf,gb1);
//      gb.setConstraints(textf, gb1);
//      textf.setLayout(gb);
      
      GridBagConstraints gb2 = new GridBagConstraints();
      gb2.weightx = 1.0;
      gb2.weighty = 1.0;
      p.add(jsp,gb2);
      //gb.setConstraints(area, gb2);
//      area.setLayout(gb);
      
      //f.getContentPane().add(textf);
      //f.getContentPane().add(area);
      
      f.add(p);
      
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.pack();
      f.setVisible(true);
      
     
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = textf.getText();
        area.append(s+newline);
        
    }
    public static void main(String[] args)
    {
        new TextFieldDemo();
    }
}
