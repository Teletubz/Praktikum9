/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
class JButtonEvent extends JFrame implements ActionListener {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 150;
    
    private JButton cancelButton;
    private JButton okButton;
    
    public static void main(String[] args) {
        JButtonEvent sb = new JButtonEvent();
        sb.setVisible(true);
    }
    
    public JButtonEvent () {
        
        setTitle("Program SecondJFrame");
        setResizable(false);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //set layout
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        okButton = new JButton("OK");
        contentPane.add(okButton);
        
        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);
        
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }    
    
    public void actionPerformed(ActionEvent event) {
        
        JButton clickedButton = (JButton) event.getSource();
        
        String buttonText = clickedButton.getText();
        setTitle("You clicked" + buttonText);
                
    }
}
