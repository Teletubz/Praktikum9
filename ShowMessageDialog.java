/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gui;

import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class ShowMessageDialog {
    
    public static void main(String[] args) {
        
    JFrame jFrame;
    
    jFrame = new JFrame();
    jFrame.setVisible(true);
        
    String input;
    input = JOptionPane.showInputDialog(jFrame, "What is your name?");
    
        
    }
}
