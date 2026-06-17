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

public class ListTest extends Frame {

    public ListTest() {
        setLayout(new FlowLayout());

        List list = new List(5, false);
        list.add("Seattle");
        list.add("New York");
        list.add("Chicago");
        list.add("Miami");
        list.add("Denver");

        add(list);

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
        new ListTest();
    }
}

// EXERCISE: Change the list to allow multiple selections
// Then add 3 more cities of your choice