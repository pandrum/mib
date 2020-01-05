/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import javax.swing.*;

/**
 *
 * @author Simpa
 */
public class Validation {

    public static boolean isNotEmpty(JTextField... args) {
        boolean result = true;

        for (JTextField arg : args) {
            if (arg.getText().isEmpty()) {
                result = false;
            }
        }
        if (!result) {
            JOptionPane.showMessageDialog(null, "Fyll i alla fält!");
        }
        return result;
    }

    public static boolean isInteger(JTextField text) {
        boolean result = true;

        try {
            String temp = text.getText();
            Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            result = false;
            text.requestFocus();
        }
        if (!result) {
            JOptionPane.showMessageDialog(null, "Enbart numeriska värden är tillåtna!");
        }
        return result;
    }
}
