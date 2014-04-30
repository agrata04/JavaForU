import javax.swing.*;
public class javaff
{
    public javaff()
    {
        JFrame f = new JFrame("Hello");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lab = new JLabel("Hello");
        f.add(lab);
        f.setVisible(true);
        f.setSize(200,200);
    }
    
    public static void main(String[] args)
    {
        new javaff();
    }
}