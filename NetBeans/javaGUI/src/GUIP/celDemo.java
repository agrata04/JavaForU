import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;

public class celDemo implements ActionListener
{
    JFrame f;
    JLabel lb1,lb2;
    JTextField text;
    JButton convert;
    JPanel p1;
    
  public celDemo()
  {
       f = new JFrame("Celsius convertor");
      
       p1 = new JPanel();
      //JPanel p2 = new JPanel();
      
       lb1 = new JLabel("Celsius");
       lb2 = new JLabel("Faherinet");
      
       text = new JTextField(5);
      
       convert = new JButton("Convert");
      convert.addActionListener(this);
      convert.setActionCommand("Convert");
      
      p1.add(text);
      p1.add(convert);
      p1.add(lb1);
      p1.add(lb2);
      
      p1.setLayout(new GridLayout(2,2));
      
      f.getContentPane().add(p1);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
      f.setSize(400,200);
      
      
      
  }
  
  public void actionPerformed(ActionEvent ae)
  {
      String s = text.getText();
      String s1 = ae.getActionCommand();
      //String s2;
      
      if(s1.equals("Convert"))
      {
          int num = (int)((Double.parseDouble(s))*1.8+32);
          lb2.setText(num +"Faherinet");
      }
  }
  
  public static void main(String[] args)
  {
      new celDemo();
  }
}