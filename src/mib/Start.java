/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import oru.inf.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sbf
 */
public class Start {

    private static InfDB db;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            db = new InfDB("/Users/Shared/db/MIBDB.FDB");
            new MainWindow(db).setVisible(true);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
