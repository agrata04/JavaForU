package demos;
import java.awt.*;
import java.awt.event.*;
class CheckBoxDemo 
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        Checkbox check1 = new Checkbox("welcome");
        Checkbox check2 = new Checkbox("siliconindia");
        f.add(check1);
        f.add(check2);
        f.setLayout(new FlowLayout());
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        f.setVisible(true);
        f.setSize(400,400);
    }
}
