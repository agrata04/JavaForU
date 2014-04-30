import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

   public class NewButtonSet implements ActionListener 
   {
    JFrame f;
    JPanel p;
    ButtonGroup bg;
    JButton red,yellow,green;
    JLabel lab;
    
     public NewButtonSet()
     {
       f = new JFrame("Button");
       p = new JPanel();
       bg = new ButtonGroup();
       lab = new JLabel("Color");

       red = new JButton("Red");
       red.addActionListener(this);
       red.setActionCommand("Red");

       yellow = new JButton("Yellow");
       yellow.addActionListener(this);
       yellow.setActionCommand("Yellow");
       
       green = new JButton("Green");
       green.addActionListener(this);
       green.setActionCommand("Green");
      
       bg.setSelected(new DefaultButtonModel(),true);

       bg.add(red);
       bg.add(yellow);
       bg.add(green);

       p.add(red);
       p.add(yellow);
       p.add(green);
       p.add(lab);
       
       f.add(p);
       f.setLayout(new FlowLayout(FlowLayout.LEFT));
       f.setSize(400,400);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }

     public void actionPerformed(ActionEvent ae)
     {
        String s = ae.getActionCommand();

        if(s.equals("Red"))
         lab.setForeground(Color.red);
        if(s.equals("Yellow"))
         lab.setForeground(Color.yellow);
        if(s.equals("Green"))
         lab.setForeground(Color.green);

     }

     public static void main(String[] args)
     {

       new NewButtonSet();

      }
   }

    