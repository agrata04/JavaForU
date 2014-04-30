import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class JCombos implements ItemListener
  {
     JFrame f;
     JPanel p1,p2;
     JComboBox box;
     JLabel picture;
     private String[] petnames ={"Select","Bird","Cat","Dog","Rabbit","Elephant"};
     
     public JCombos()
     {

      f = new JFrame("Petnames");
      p1 = new JPanel();
      p2 = new JPanel();
    
      box  = new JComboBox(petnames);
      box.addItemListener(this);
      
      /*box.setActionCommand("Bird");
      box.setActionCommand("Cat");
      box.setActionCommand("Dog");
      box.setActionCommand("Rabbit");
      box.setActionCommand("Elephant");
       */
     
      picture = new JLabel();
      
      p1.add(box);
      p2.add(picture);
      //p.setLayout(new GridLayout(2,1));
      
      f.add(p1,BorderLayout.NORTH);
      f.add(p2,BorderLayout.CENTER);
      //f.setLayout(new FlowLayout(FlowLayout.LEFT));
      f.setSize(400,400);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }

     public void itemStateChanged(ItemEvent e)
     {
       int num =  box.getSelectedIndex();
    
         if(num == 0)
          picture.setIcon(new ImageIcon(""));
         if(num == 1)
          picture.setIcon(new ImageIcon("Bird.jpg"));
         if(num == 2)
          picture.setIcon(new ImageIcon("Cat.jpg"));
         if(num == 3)
           picture.setIcon(new ImageIcon("Dog.jpg"));
         if(num == 4)
           picture.setIcon(new ImageIcon("Rabbit.jpg"));
         if(num == 5)
           picture.setIcon(new ImageIcon("Elephant.jpg"));

    }

    public static void main(String[] args)
     {
        new JCombos();

      }
    }

     