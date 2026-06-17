/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupTest extends Frame {

    public CheckboxGroupTest() {
        setLayout(new FlowLayout());

        CheckboxGroup group = new CheckboxGroup();

        Checkbox cb1 = new Checkbox("Option A", group, true);
        Checkbox cb2 = new Checkbox("Option B", group, false);

        add(cb1);
        add(cb2);

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
        new CheckboxGroupTest();
    }
}

// EXERCISE: Add a third option "Option C" to the same group
// Make it the one that starts selected instead of Option A