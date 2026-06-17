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

public class KeyListenerTest extends Frame {

    private Label message;

    public KeyListenerTest() {
        setLayout(new FlowLayout());

        message = new Label("Press any key");
        add(message);

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                message.setText("You typed: " + e.getKeyChar());
            }
        });

        setSize(300, 100);
        setVisible(true);
        
        // allows the window to close when X is pressed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new KeyListenerTest();
    }
}

// EXERCISE: Add a second Label that counts how many keys have been pressed
// Hint: create a counter variable, increment it in keyTyped(), show it in the label