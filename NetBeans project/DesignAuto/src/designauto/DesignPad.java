/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designauto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Agrata
 */
public class DesignPad extends DesignAbstract implements DropTargetListener ,MyInterface{
    
    DropTarget dtlisten;
   DesignPad()
   {
       dtlisten = new DropTarget();
       mainp2 = new JPanel();
       tbpane2 = new JTabbedPane();
       userf = new JFrame("New");
       userf.setVisible(true);
       
       tbpane2.addTab("Design", userf);
       mainp2.add(tbpane2); 
       f.add(mainp2,BorderLayout.CENTER);
       f.setVisible(true);
       f.setSize(400,400);
   }
   
    @Override
   public void setPro()
   {
       DropTarget dt;
       userf.setDropTarget(dt = new DropTarget());
       dt.setComponent(lab1);
        try {
            dt.addDropTargetListener(this);
        } catch (TooManyListenersException ex) {
            Logger.getLogger(DesignPad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  }
   
    @Override
   public void dragEnter(DropTargetDragEvent dtde)
   {
    dtde.acceptDrag(DnDConstants.ACTION_REFERENCE);
    
   }
    
    @Override
    public void dragExit(DropTargetEvent dtde)
    {
     dtde.getDropTargetContext();   
    }
    
    @Override
    public void dragOver(DropTargetDragEvent dtde)
    {
     dtde.getSourceActions();   
    }
    
    @Override
    public void drop(DropTargetDropEvent dtde)
    {
     dtlisten = (DropTarget) dtde.getSource();
     
        if(dtlisten.getComponent() == lab1)
        {
            JButton btn = new JButton("Button1");
            userf.add(btn);
        }
        dtde.acceptDrop(dtde.getDropAction());
        
    }
    
    @Override
    public void dropActionChanged(DropTargetDragEvent dtde)
    {
        int dropaction = dtde.getDropAction();
        dtde.acceptDrag(dropaction);
        
       
    }
 
}

