import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JComboDemo implements ActionListener
{
 JFrame f;
 JPanel p;
 JLabel picture;
 JComboBox box;
 ImageIcon image;
 private String[] petnames = {"Bird","Cat","Dog","Rabbit","Elephant"};
 private String path;
 public JComboDemo()
 {
     f = new JFrame("Select pet names");
     p = new JPanel();
     picture = new JLabel();
     box = new JComboBox(petnames);
     box.setSelectedItem(4);
     box.addActionListener(this);
     image  = createImageIcon(path);
     picture.setIcon(image);
     p.add(box);
     p.add(picture);
     p.setLayout(new GridLayout(2,1));
     f.getContentPane().add(p);
     
     f.pack();
     f.setVisible(true);
     
 }
 
  public void actionPerformed(ActionEvent ae)
  {
      String s = box.getSelectedItem();
      
      if(s.equals("Bird"))
          path = "Bird.jpg";
      if(s.equals("Cat"))
          path = "Cat.jpg";
      if(s.equals("Dog"))
          path = "Dog.jpg";
      if(s.equals("Rabbit")) 
          path = "Rabbit.jpg";
      if(s.equals("Elephant.jpg"))
          path  = "Elephant.jpg";
      
       }
  protected static ImageIcon createImageIcon(String name)
  {
      java.net.URL imgURL = JComboDemo.class.getResource(name);
      if(imgURL == null)
      {
          return new ImageIcon(imgURL);
          
      }
      else
      {
          System.err.println("Missing image"+name);
          return null;
      }
  }
  
  public static void main(String[] args)
  {
      new JComboDemo();
  }
}