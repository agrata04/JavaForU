import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class JComboDemo implements ItemListener
{
 JFrame f;
 JPanel p;
 JLabel picture;
 JComboBox box;
 ImageIcon image;
 private String[] petnames = {"Select","Bird","Cat","Dog","Rabbit","Elephant"};
 private String path;
 public JComboDemo()
 {
     f = new JFrame("Select pet names");
     p = new JPanel();
     picture = new JLabel();
     box = new JComboBox(petnames);
     box.setSelectedIndex(4);
     box.addItemListener(this);
     //path = "Elephant.jpg";
     //image  = createImageIcon(path);
     //picture.setIcon(image);
     p.add(box);
     p.add(picture);
     p.setLayout(new GridLayout(2,1));
     f.getContentPane().add(p);
     
     f.pack();
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
 }
 
  public void itemStateChanged(ItemEvent ae)
  {
      
       int num = box.getSelectedIndex();

      if(num == 0) {
       image = createIcon(path);
       picture.setIcon(image);
      
      if(num ==1){
          
       image  = createIcon(path);
     picture.setIcon(image);
        }
      if(num == 2) {
      image  = createIcon(path);
     picture.setIcon(image);
          
     }
      if(num == 3){
          
          image  = createIcon(path);
         picture.setIcon(image);
       }
      if(num == 4){
        image  = createIcon(path);
     picture.setIcon(image); 
          
      }
      if(num == 5){
         image  = createIcon(path);
     picture.setIcon(image);
          
      }
       }
    public ImageIcon createIcon(String path)
  {
      java.net.URL imgURL = JComboDemo.class.getResource(path);
      if(imgURL == null)
      {
          return new ImageIcon(imgURL);
          
      }
      else
      {
          System.err.println("Missing image"+path);
          return null;
      }
  }
    
   
  
  public static void main(String[] args)
  {
      new JComboDemo();
  }
}