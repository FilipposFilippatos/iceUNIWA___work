package GUI;
import java.awt.*;
import java.awt.event.*;

public class ButtonTest extends Frame {

    public ButtonTest() {
        // Create a button and add it to the window
        Button button = new Button("OK");
        add(button);

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
        new ButtonTest();
    }
    
    // EXERCISE: Add a second button that says "Cancel"

}