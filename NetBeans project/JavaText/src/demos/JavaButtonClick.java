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
public class JavaButtonClick {

    public static void main(String[] args)
    {
        JFrame f = new JFrame("Click");
        JButton btn1 = new JButton("Button1!");
        JButton btn2 = new JButton("Button2!");
        final JTextField text = new JTextField(20);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                text.setText("This is button1 click");
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                text.setText("This is button2 click");
            }
        });
        
//        f.add(text);
        f.add(btn1);
        f.add(btn2);
        f.add(text);
        f.setLayout(new FlowLayout());
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
        
        
        
    }
}
