/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author hp
 */
class Positioning extends JFrame {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 220;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private static final int BUTTON_WIDTH = 80; 
    private static final int BUTTON_HEIGHT = 80; 
    
    private JButton cancelButton;
    private JButton okButton;
    
    //Main method
    public static void main(String[] args) {
        Positioning p = new Positioning();
        p.setVisible(true);
    }
    
    public Positioning() {
        
        Container contentPane = getContentPane();
        
        //set frame properties
        setTitle("Program Positioning");
        setResizable(false);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane.setLayout(null);
        contentPane.setBackground(Color.WHITE);
        
        //Create and place buttons
        okButton = new JButton("OK");
        okButton.setBounds(70, 125, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);
        
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(160, 125, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        
        //register exit close
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
