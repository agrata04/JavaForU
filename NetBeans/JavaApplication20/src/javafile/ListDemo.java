  

  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;

  class ListDemo 
  {

    private JFrame f;
    private JPanel top,bottom,plus;
    private JList names;
    private DefaultListModel listmodel;
    private JButton hire,fire;
    private JTextField text;

    ListDemo()
    {

      f = new JFrame("Employee");
      
      top = new JPanel();
      bottom = new JPanel();
      plus = new JPanel();
  
      listmodel = new DefaultListModel();
      listmodel.addElement("Arun");
      listmodel.addElement("Shivang");
      listmodel.addElement("sanjana");

      names = new JList(listmodel);
      names.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      names.setLayoutOrientation(JList.VERTICAL);
     
      JScrollPane pane = new JScrollPane(names);
      pane.setPreferredSize(new Dimension(250,80));
      
      top.add(names);
      
      hire = new JButton("Hire");
      fire = new JButton("Fire");
      text = new JTextField(10);

      bottom.add(fire);
      bottom.add(text);
      bottom.add(hire);

      bottom.setLayout(new GridLayout(1,3));

      plus.add(top);
      plus.add(bottom);
      
      f.add(plus,BorderLayout.CENTER);
   
      f.setSize(400,400);
      f.setVisible(true);
      
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

      public static void main(String[] args)
       {

         new ListDemo();

       }
   }