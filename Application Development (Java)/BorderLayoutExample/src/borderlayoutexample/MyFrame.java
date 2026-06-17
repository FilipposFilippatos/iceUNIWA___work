/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package borderlayoutexample;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class MyFrame extends JFrame{

    private JButton btn1, btn2, btn3, btn4, btn5;
    private JTextArea text;
    
    public MyFrame() {
        this.setSize(500, 500);
        this.setTitle("Border Layout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btn1 = new JButton("btn1");
        btn2 = new JButton("btn2");
        btn3 = new JButton("btn3 btn3");
        btn4 = new JButton("btn4");
        btn5 = new JButton("btn5");
        text = new JTextArea();
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(btn1);
        panel.add(btn2);
        
        //this.add(btn1, BorderLayout.NORTH);
        //this.add(btn2, BorderLayout.SOUTH);
        //this.add(btn3, BorderLayout.EAST);
        //this.add(btn4, BorderLayout.WEST);
        this.add(text, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
    
    
}
