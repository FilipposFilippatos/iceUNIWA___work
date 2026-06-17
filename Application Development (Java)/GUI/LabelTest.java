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

public class LabelTest extends Frame {

    public LabelTest() {
        setLayout(new FlowLayout());

        add(new Label("A label"));
        add(new Label("Right aligned", Label.RIGHT));

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
        new LabelTest();
    }
}

// EXERCISE: Add a third label that is center aligned
// Hint: use Label.CENTER