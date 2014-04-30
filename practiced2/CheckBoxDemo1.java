import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.font.*;

  public class CheckBoxDemo1 extends JPanel implements ItemListener
  {
    JCheckBox glassesButton;
    JCheckBox teethButton;
    JCheckBox hairButton;

    StringBuffer choices;
    JLabel pictureLabel;

    public CheckBoxDemo1()
    {
      super(new BorderLayout());
 
      glassesButton = new JCheckBox("Glasses");
      glassesButton.setMnemonic(KeyEvent.VK_G);
      glassesButton.setSelected(true);

      teethButton = new JCheckBox("Teeth");
      teethButton.setMnemonic(KeyEvent.VK_T);
      teethButton.setSelected(true);

      hairButton = new JCheckBox("Hair");
      hairButton.setMnemonic(KeyEvent.VK_H);
      hairButton.setSelected(true);

      glassesButton.addItemListener(this);
      teethButton.addItemListener(this);
      hairButton.addItemListener(this);

      choices = new StringBuffer("gth");

      pictureLabel = new JLabel();
      pictureLabel.setFont(pictureLabel.getFont().deriveFont(Font.ITALIC));
      updatePicture();
      


      JPanel p = new JPanel(new GridLayout(0,1));
       p.add(glassesButton);
       p.add(teethButton);
       p.add(hairButton);

     add(p,BorderLayout.LINE_START);
     add(pictureLabel,BorderLayout.CENTER);
     setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

    }

    public void itemStateChanged(ItemEvent e)
    {
      int index = 0;
      char c = '-';

       Object source = e.getItemSelectable();
    
       if(source == glassesButton)
      {
         index = 0;
          c = 'g';
      }

       if(source == teethButton)
       {
         index = 1;
         c = 't';
       }

       if(source == hairButton)
       {
         index = 2;
         c = 'h';
       }

       if(e.getStateChange() == ItemEvent.DESELECTED)
       {
         c = '-';
        }

      choices.setCharAt(index,c);

     }

      protected void updatePicture() {
      
       ImageIcon icon = createImageIcon("cartoon"+choices.toString()+".jpg");
       pictureLabel.setIcon(icon);
       pictureLabel.setToolTipText(choices.toString());
       if(icon == null)
         {
           pictureLabel.setText("Missing Image");
        }
      else
       {
        pictureLabel.setText(null);
       }

     }


    protected static ImageIcon createImageIcon(String path)
      {
        java.net.URL imgURL = CheckBoxDemo1.class.getResource(path);
        if(imgURL != null){
         return new ImageIcon(imgURL);
         }
       else
          {
           System.err.println("Could not find path"+path);
          return null;
           }
   }

      public static void main(String[] args)
      {
         JFrame f = new JFrame("CheckBox Demo");
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JComponent newContentPane = new CheckBoxDemo1();

        newContentPane.setOpaque(true);
       f.setContentPane(newContentPane);

       f.pack();
          f.setVisible(true);

         }
    }


     

      