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
class TextFrame2 extends JFrame implements ActionListener {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    private static final String EMPTY_STRING = "";
    private static final String NEWLINE = System.getProperty("line.separator");
    
    private JButton clearButton;
    private JButton addButton;
    private JTextField inputLine;
    private JTextArea textArea;
    
    public static void main(String[] args) {
        TextFrame2 frame = new TextFrame2();
        frame.setVisible(true);
    }
    
    public TextFrame2() {
        Container contentPane;
        
        //set frame properties
        setTitle("Program TextFrame2");
        setResizable(false);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane =  getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        textArea = new JTextArea();
        textArea.setColumns(22);
        textArea.setRows(8);
        textArea.setBorder(BorderFactory.createLineBorder(Color.RED));
        textArea.setEditable(false);
        contentPane.add(textArea);
        
        inputLine = new JTextField();
        inputLine.setColumns(22);
        contentPane.add(inputLine);
        
        inputLine.addActionListener(this);
        
        //create and place two buttons
        addButton = new JButton("ADD");
        contentPane.add(addButton);
        
        clearButton = new JButton("CLEAR");
        contentPane.add(clearButton);
        
        //Register this frame
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event) {
        
        if (event.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) event.getSource();
            
            if(clickedButton == addButton) {
               addText(inputLine.getText());
                
            } else { 
                clearText();
            }
            
        } else { //the event source is inputline
            addText(inputLine.getText());
        }
    }
    
    private void addText(String newline) {
        textArea.append(newline + NEWLINE);
        inputLine.setText("");
    }
    
    private void clearText() {
        textArea.setText(EMPTY_STRING);
        inputLine.setText(EMPTY_STRING);
    } 
}
