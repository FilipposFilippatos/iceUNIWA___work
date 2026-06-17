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

public class TextFieldTest extends Frame {

    public TextFieldTest() {
        setLayout(new FlowLayout());

        TextField normal   = new TextField("type here");
        TextField password = new TextField("secret");
        TextField readOnly = new TextField("cannot edit");

        password.setEchoChar('*');
        readOnly.setEditable(false);

        add(normal);
        add(password);
        add(readOnly);

        setSize(250, 150);
        setVisible(true);
        
        // allows the window to close when X is pressed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new TextFieldTest();
    }
}

// EXERCISE: Add a Label before each TextField so the user knows what each field is
// Example: "Username:", "Password:", "ID:"