/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playwithapplets;

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author acer
 */
public class MyFirstApplets extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        
        setSize(1400,1000);
        
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g){
        Image img =getImage(getCodeBase(),"tenor.gif");
        
        for(int x=0; x<1200; x++){
            
           g.drawImage(img, x, 0, null);
           
            try {
                Thread.sleep(20);
                
            } catch (Exception e) {
            }
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
