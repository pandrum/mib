/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.*;

/**
 *
 * @author sbf
 */
public class Start {

    private static InfDB idb;

    public static void main(String[] args) {
        try {
            String dir = System.getProperty("user.dir");
            String os = System.getProperty("os.name");
            String dbPath = "";
            switch (os) {
                case "Mac OS X":
                    dbPath = dir + "/db/MIBDB.FDB";
                    break;
                case "Windows 10":
                case "Windows 7":
                    dbPath = dir + ("\\db\\MIBDB.FDB");
                    System.out.println(dbPath);
                    break;
            }
            idb = new InfDB(dbPath);
            new MainWindow(idb).setVisible(true);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }
    }

}
