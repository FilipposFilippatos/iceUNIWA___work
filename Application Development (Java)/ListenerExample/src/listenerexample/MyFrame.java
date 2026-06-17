/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listenerexample;

import java.awt.Frame;

/**
 *
 * @author user
 */
public class MyFrame extends Frame{

    public MyFrame() {
        this.setSize(300, 440);
        this.setTitle("Listener");
        this.addWindowListener(new MyWindowListener());
        this.setVisible(true);
    }
    
    
}
