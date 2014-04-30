import javax.swing.*;
public class mynewframe
{
    private static CreateandShowGUI()
    {
        JFrame f = new JFrame("Hello free");
        JLabel lab = new JLabel("Hello ");
        f.add(lab);
        f.setSize(200, 200);
        f.setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
        public void run()
        {
            CreateandShowGUI();
        }
    });
    }
}