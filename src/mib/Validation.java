/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import com.github.lgooddatepicker.components.DatePicker;
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

    public static boolean isInteger(JTextField... args) {
        boolean result = true;

        for (JTextField arg : args) {
            try {
                String temp = arg.getText();
                Integer.parseInt(temp);
            } catch (NumberFormatException e) {
                result = false;
                arg.requestFocus();
            }
            if (!result) {
                JOptionPane.showMessageDialog(null, "Enbart numeriska värden är tillåtna!");
            }
        }
        return result;
    }

    public static boolean ifCBEmpty(JComboBox... args) {
        boolean result = true;

        for (JComboBox arg : args) {
            if (arg.getSelectedIndex() == -1) {
                result = false;
            }
        }
        if (!result) {
            JOptionPane.showMessageDialog(null, "Fyll i alla rullgardinsmenyer!");
        }
        return result;
    }

    public static boolean ifDatePickerEmpty(DatePicker... args) {
        boolean result = true;

        for (DatePicker arg : args) {
            if (arg.getDateStringOrEmptyString().isEmpty()) {
                result = false;
            }
        }
        if (!result) {
            JOptionPane.showMessageDialog(null, "Fyll i datum!");
        }
        return result;
    }
}
