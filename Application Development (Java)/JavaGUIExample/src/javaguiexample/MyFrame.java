/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaguiexample;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class MyFrame extends JFrame {
    
    public void initUI() {
        this.setSize(400, 500);
        this.setTitle("Swing frame");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setLayout(null);
        
        JLabel label1 = new JLabel("this is the first label");
        label1.setBackground(Color.CYAN);
        label1.setOpaque(true);
        label1.setBounds(20, 30, 90, 30);
        this.add(label1);
        
        JButton btn1 = new JButton("new button");
        btn1.setBounds(20, 70, 100, 30);
        this.add(btn1);
        
        JButton btn2 = new JButton("another button");
        btn2.setBounds(130, 70, 100, 30);
        this.add(btn2);
        
        
        
        this.setVisible(true);
    }
}
