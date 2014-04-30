package demos;
import java.awt.*;
import java.awt.event.*;
class Button3 
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Three Buttons");
        Panel p = new Panel();
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        f.add(p,BorderLayout.SOUTH);
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}