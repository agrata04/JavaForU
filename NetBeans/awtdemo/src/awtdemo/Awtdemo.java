/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package awtdemo;

import java.awt.SystemTray;
import java.awt.TrayIcon;

/**
 *
 * @author asd
 */
public class Awtdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TrayIcon trayicon = null;
        if(SystemTray.isSupported())
        {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().getImage("tt.png");
            trayicon = new TrayIcon(image);
            try
            {
             tray.add(trayicon);
            }
            catch(Exception e)
            {
                System.out.println("Sorry");
            }

         }
            
        
    }
}
