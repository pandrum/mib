/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import oru.inf.*;
import javax.swing.JOptionPane;

/**
 * @author sbf
 */
public class Start {

    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String dir = System.getProperty("user.dir");
            String os = System.getProperty("os.name");
            String dbPath = "";
            switch (os) {
                case "Mac OS X":
                    System.out.println(os);
                    dbPath = dir + "/db/MIBDB.FDB";
                    break;
                case "Windows":
                    System.out.println(os);
                    dbPath = dir + ("\\db\\MIBDF.FDB");
            }
            idb = new InfDB(dbPath);
            new MainWindow(idb).setVisible(true);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }
    }
}
