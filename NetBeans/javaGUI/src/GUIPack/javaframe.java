/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPack;
import javax.swing.*;
/**
 *
 * @author asd
 */
public class javaframe {

    /**
     * @param args the command line arguments
     */
    
    public javaframe()
    {
        JFrame f = new JFrame("Hello");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lab = new JLabel("Hello,good day");
        f.add(lab);
        
        f.setVisible(true);
        f.setSize(200,200);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new javaframe();
    }
}
