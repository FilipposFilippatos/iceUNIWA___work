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

public class TextAreaTest extends Frame {

    public TextAreaTest() {
        setLayout(new FlowLayout());

        TextArea area = new TextArea("Type here...", 5, 30);
        add(area);

        setSize(300, 200);
        setVisible(true);
        
        // allows the window to close when X is pressed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new TextAreaTest();
    }
}

// EXERCISE: Add a Label above the TextArea that says "Write your message below:"
// Then add a Button below it that says "Submit"