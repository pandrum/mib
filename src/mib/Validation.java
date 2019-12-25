/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import java.awt.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Simpa
 */
public class Validation {

    public static boolean isNotEmpty(JTextField text) {
        boolean result = true;

        if (text.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Text field is empty!");
            result = false;
            text.requestFocus();
        }
        return result;
    }

    public static boolean isInteger(JTextField text) {
        boolean result = true;

        try {
            String temp = text.getText();
            Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Only integers is allowed!");
            result = false;
            text.requestFocus();
        }
        return result;
    }
}
