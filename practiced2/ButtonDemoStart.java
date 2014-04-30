import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;

 public class ButtonDemoStart implements ActionListener 
 {
    JFrame f;
    JPanel p;
    JButton left,middle,right;
    //ImageIcon leftIcon,rightIcon,middleIcon;

    public ButtonDemoStart()
    {
      f = new JFrame("Button");
      p = new JPanel();
     ImageIcon LIcon = new ImageIcon("leftarrow.jpg");
     ImageIcon RIcon = new ImageIcon("Rightarrow.jpg");
     ImageIcon MIcon = new ImageIcon("middle.jpg");
      left = new JButton("Disable middle button",LIcon);
      right = new JButton("Enable middle button",RIcon);
      middle = new JButton("Middle button",MIcon);

      left.setVerticalTextPosition(AbstractButton.CENTER);
      left.setHorizontalTextPosition(AbstractButton.LEADING);

      middle.setVerticalTextPosition(AbstractButton.BOTTOM);
      middle.setHorizontalTextPosition(AbstractButton.CENTER);

      left.addActionListener(this);
      right.addActionListener(this);

      left.setActionCommand("Disable middle button");
      right.setActionCommand("Enable middle button");

      left.setToolTipText("Please click here to "+"disable middle button");
      middle.setToolTipText("This is middle button");
      right.setToolTipText("Please click here to "+"Enable middle button");

      p.add(left);
      p.add(middle);
      p.add(right);
      //p.setLayout(new FlowLayout());

      f.getContentPane().add(p);
      f.setSize(400,200);
      f.setVisible(true);

    }

     public void actionPerformed(ActionEvent ae)
     {
        String s = ae.getActionCommand();

         if(s.equals("Disable middle button"))
           middle.setEnabled(false);
         else if(s.equals("Enable middle button"))
           middle.setEnabled(true);
         else
          System.out.println("");

     }

     public static void main(String[] args)
     {

        new ButtonDemoStart();
      }
  }
        