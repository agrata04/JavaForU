package demos;
import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;
class MyFirstApplet extends Applet
{
  public static void main(String[] args)
  {
      Frame f = new Frame("www.gmail.com");
      f.setSize(200,200);
      Applet ap = new MyFirstApplet();
      f.add(ap);
      f.setVisible(true);
      f.addWindowListener(new WindowAdapter()
      {
          public void windowClosing(WindowEvent e)
          {
              System.exit(0);
          }
      });
      
      
  }
  public void paint(Graphics g)
  {
   g.drawString("Hello,my first applet", 50,50);   
  }
}