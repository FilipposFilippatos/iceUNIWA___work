/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.*;
import java.awt.event.*;

public class CheckboxTest extends Frame {

    public CheckboxTest() {
        setLayout(new FlowLayout());

        // true = starts checked
        Checkbox c = new Checkbox("I agree", true);
        add(c);

        setSize(200, 100);
        setVisible(true);
        
                        // allows the window to close when X is pressed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new CheckboxTest();
    }
    
    // EXERCISE: Add two more checkboxes: "Subscribe to newsletter" and "Remember me"
    // Make "Remember me" start unchecked
}
