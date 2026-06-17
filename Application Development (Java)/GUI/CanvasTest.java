/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.awt.*;
import java.awt.event.*;

// A canvas is a drawable area — we override paint() to draw on it
class DrawingRegion extends Canvas {

    public DrawingRegion() {
        setSize(200, 100);
    }

    // paint() is called automatically when the window appears
    public void paint(Graphics g) {
        g.drawRect(0, 0, 199, 99);       // draws a border
        g.drawString("A Canvas", 20, 20); // draws text inside
    }
}

public class CanvasTest extends Frame {

    public CanvasTest() {
        DrawingRegion region = new DrawingRegion();
        add(region);

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
        new CanvasTest();
    }
    
    // EXERCISE: Inside paint(), add a line that draws a circle using g.drawOval()
    // Hint: g.drawOval(x, y, width, height)
}