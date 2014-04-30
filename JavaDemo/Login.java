
  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;

  class Login  implements ActionListener
   {
    protected JFrame f;
    public JFrame frame;
    public JPanel left,right,center,p;
    public JLabel lab1,lab2,lab3,lab;
    public JTextField txt1,txt2,txt3;
    public JButton in;

    public Login()
    {
     
     f = new JFrame("SignUp");

     left = new JPanel();
     right = new JPanel();
     center = new JPanel();

     lab1 = new JLabel("UserName");
     lab2 = new JLabel("password");
     lab3 = new JLabel("Email");

     txt1 = new JTextField(10);
     txt2 = new JTextField(10);
     txt3 = new JTextField(10);

     in = new JButton("Login");
     in.addActionListener(this);
     in.setActionCommand("Login");

     left.add(lab1);
     left.add(lab2);
     left.add(lab3);
     left.setLayout(new GridLayout(3,1));

     right.add(txt1);
     right.add(txt2);
     right.add(txt3);
     right.add(in);
     right.setLayout(new GridLayout(4,1));

     center.add(left);
     center.add(right);
     //center.setLayout(BorderLayout.CENTER);
     
     f.add(center,BorderLayout.CENTER);

     f.pack();
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

    public void actionPerformed(ActionEvent ae)
     {
       String s = ae.getActionCommand();
       String s1 = txt1.getText();
       String s2 = txt2.getText();
       String s3 = txt3.getText();

       

        if(s.equals("Login")) 
        {

           if((s1.equals("Agrata"))&&(s2.equals("04July1991")))
            {
                if(s3.equals("missagrata@gmail.com"))
                {
           
                   
                 setMethod();
                 frame.setVisible(true);
                 lab.setText("You are sucessfully logged in");
                }
               else
               {
                 setMethod();
                 frame.setVisible(true);
                 lab.setText("Login failed ,please try again");
               }
            }
        

        else
        {
           setMethod();
           frame.setVisible(true);
           lab.setText("Login Failed, please try again");
        }
     }
   }

   public void setMethod()
   {
        frame = new JFrame("Report");
        p = new JPanel();
        lab = new JLabel();
        p.add(lab);
        frame.add(p,BorderLayout.NORTH);
        frame.pack();
        //frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    }

   public static void main(String[] args)
   {

       new Login();

   }
  }
         
                
     