/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author ArisS
 */
import java.awt.*;
import java.awt.event.*;

public class FlowLayoutTest extends Frame {

    public FlowLayoutTest() {
        setLayout(new FlowLayout());

        add(new Button("One"));
        add(new Button("Two"));
        add(new Button("Three"));
        add(new Button("Four"));
        add(new Button("Five"));

        setSize(200, 150);
        setVisible(true);
                        // allows the window to close when X is pressed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}

// EXERCISE: Change FlowLayout() to FlowLayout(FlowLayout.RIGHT)
// See how the buttons align differently
// Then try FlowLayout.LEFT and FlowLayout.CENTER