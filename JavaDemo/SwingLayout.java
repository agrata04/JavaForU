 
  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;

  class SwingLayout extends Multiply implements ActionListener 
  {

   protected JFrame f;
   public JPanel p,p1,p2,up,down;
   JLabel lab1,lab2,lab3,head;
   JTextField txt1,txt2,txt3;
   JButton btn,reset,cancel,exiting;

   SwingLayout()
    {
      f = new JFrame("Rectangle");
      p = new JPanel();
      lab1 = new JLabel("Length");
      lab2 = new JLabel("Width");
      lab3 = new JLabel("Area");
      head = new JLabel("Area Calculation software");
      txt1 = new JTextField(10);
      txt2 = new JTextField(10);
      txt3 = new JTextField(10);
   
      btn = new JButton("calculate");
      btn.addActionListener(this);
      btn.setActionCommand("calculate");

      reset = new JButton("Reset");
      reset.addActionListener(this);
      reset.setActionCommand("Reset");
      
      cancel = new JButton("Cancel");
      cancel.addActionListener(this);
      cancel.setActionCommand("Cancel");

      exiting = new JButton("Exit");
      exiting.addActionListener(this);
      exiting.setActionCommand("Exit");

      p.add(lab1);
      p.add(txt1);
      p.add(lab2);
      p.add(txt2);
      p.add(lab3);
      p.add(txt3);
      //p.add(btn);
      p.setLayout(new GridLayout(3,3));
      
      p1 = new JPanel();
      p1.add(btn);
      //p1.setLayout(new FlowLayout(FlowLayout.RIGHT));

      p2 = new JPanel();
      p2.add(p);
      p2.add(p1);


      up = new JPanel();
      up.add(head);

      down = new JPanel();
      down.add(reset);
      down.add(cancel);
      down.setLayout(new FlowLayout(FlowLayout.RIGHT));
      
      f.add(up,BorderLayout.NORTH);
      f.add(p2,BorderLayout.CENTER);
      f.add(down,BorderLayout.SOUTH);

      f.setSize(400,400);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }

    public void actionPerformed(ActionEvent ae) 
    {
 
       String s = ae.getActionCommand();
       String s_len = txt1.getText();
       String s_wid = txt2.getText();

        int len = Integer.parseInt(s_len);
        int wid = Integer.parseInt(s_wid);

       

            if(s.equals("calculate"))
            {
              txt3.setText(""+cal(len,wid));
              txt1.setEnabled(false);
              txt2.setEnabled(false);
              txt3.setEnabled(false);
            }
            else if(s.equals("Reset"))
            {
              txt1.setEnabled(true);
              txt1.setText("");
 
              txt2.setEnabled(true);
              txt2.setText("");

              txt3.setEnabled(true);
              txt3.setText("");
            }

            else if(s.equals("Cancel"))
           {
              try
              {
                 //System.exit(0);
                   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              }
           
       

              catch(Exception e)
              {
                JFrame small= new JFrame("Notice");
                JLabel note = new JLabel("Can not exit after reset");
                small.add(note);
                small.add(exiting);
                small.setLayout(new GridLayout(2,1));
                small.setSize(400,100);
                small.setVisible(true);

                     if(s.equals("Exit"))
                      {
                        System.exit(0);
                        txt1.setText(s_len);
                        txt2.setText(s_wid);
                        txt3.setText(""+cal(len,wid));
                      }
               }
      
          }
              else
             {
             }
          
   }
       
          

    public static void main(String[] args)
    {

       new SwingLayout();
     }
   } 

      

      