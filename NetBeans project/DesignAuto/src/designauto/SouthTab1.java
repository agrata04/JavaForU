/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designauto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.datatransfer.*;
import javax.swing.event.*;
/**
 *
 * @author Agrata
 */
public class SouthTab1 extends DesignAbstract implements MyInterface {
    
  
    public SouthTab1()
    {
        mainp1 = new JPanel();
        lab1 = new JLabel("Button");
        tbar1 = new JToolBar();
        tbar1.add(lab1);
        tbpane1.addTab("ToolBox",tbar1);
        mainp1.add(tbpane1);
        f.add(mainp2,BorderLayout.SOUTH);
    }
    
    @Override
    public void setPro()
    {
        lab1.setTransferHandler(new TransferHandler("text"));
        MouseListener ml = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JComponent jc = (JComponent)e.getSource();
                TransferHandler th = jc.getTransferHandler();
                JButton btn = new JButton("Button");
                btn.setVisible(true);
                userf.add(btn);
            } 
                
            };
        lab1.addMouseListener(ml);
        
        }
    }
    
    
    
}
