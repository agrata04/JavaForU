/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author Agrata
 */
public class MyAppletCode extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        Button b = new Button("Yes");
        b.setVisible(true);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
