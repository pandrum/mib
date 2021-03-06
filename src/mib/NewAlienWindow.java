/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.*;

/**
 *
 * @author sbf
 */
public class NewAlienWindow extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form PasswordWindow
     */
    public NewAlienWindow(InfDB idb) {
        initComponents();
        this.idb = idb;
        txtRaceInfo.setVisible(false);
        labelRaceInfo.setVisible(false);
        // Kör metoderna som fyller comboboxarna
        fillCbs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAlien = new javax.swing.JPanel();
        cbArea = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        labelAgent = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        cbAgent = new javax.swing.JComboBox<>();
        labelArea = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        labelDate = new javax.swing.JLabel();
        imageAlien = new javax.swing.JLabel();
        labelRace = new javax.swing.JLabel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        cbRace = new javax.swing.JComboBox<>();
        labelRaceInfo = new javax.swing.JLabel();
        txtRaceInfo = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelAlien.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelAgent.setText("Ansvarig agent");

        labelPassword.setText("Lösenord");

        labelArea.setText("Tillhörande plats");

        labelName.setText("Namn");

        labelPhone.setText("Telefon");

        btnRegister.setText("Registrera");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        labelDate.setText("Registreringsdatum");

        imageAlien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/alien.png"))); // NOI18N

        labelRace.setText("Ras");

        cbRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Squid", "Boglodite", "Worm" }));
        cbRace.setSelectedIndex(-1);
        cbRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAlienLayout = new javax.swing.GroupLayout(panelAlien);
        panelAlien.setLayout(panelAlienLayout);
        panelAlienLayout.setHorizontalGroup(
            panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlienLayout.createSequentialGroup()
                .addGroup(panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAlienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbRace, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlienLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelRace)
                                    .addComponent(labelDate)
                                    .addGroup(panelAlienLayout.createSequentialGroup()
                                        .addComponent(labelName)
                                        .addGap(74, 74, 74)
                                        .addComponent(imageAlien))
                                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPhone)
                                    .addComponent(cbArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(labelArea)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(txtPassword)
                                    .addComponent(txtName)))
                            .addComponent(txtRaceInfo)
                            .addGroup(panelAlienLayout.createSequentialGroup()
                                .addComponent(labelRaceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelAlienLayout.setVerticalGroup(
            panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelName)
                    .addComponent(imageAlien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelRace)
                .addGap(1, 1, 1)
                .addComponent(cbRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRaceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRaceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(labelArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtName.getAccessibleContext().setAccessibleName("");

        btnBack.setText("Tillbaka");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metod som tömmer alla textfält och comboboxar/datepicker.
    private void emptyInputs() {
        txtName.setText("");
        txtPassword.setText("");
        txtPhone.setText("");
        txtRaceInfo.setText("");
        // Reset comboboxar
        cbAgent.setSelectedIndex(-1);
        cbArea.setSelectedIndex(-1);
        cbRace.setSelectedIndex(-1);
        txtRaceInfo.setVisible(false);
        datePicker.setText("");
    }

    private void fillCbs() {
        //Hämtar och fyllar i alla Platser i comboboxarna i fönstret.
        //Databasfråga.
        String queryLocation = "SELECT BENAMNING FROM PLATS;";
        ArrayList<String> areas = new ArrayList<>();
        try {
            areas = idb.fetchColumn(queryLocation);
            //Loopar igenom alla platser och sätter ut namnen i combobox.
            for (String area : areas) {
                cbArea.addItem(area);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }
        //Blankar combobox
        cbArea.setSelectedIndex(-1);

        //Hämtar och fyllar i alla Agenter i combobox.
        String queryAgent = "SELECT Namn FROM AGENT;";
        ArrayList<String> agents = new ArrayList<>();
        try {
            agents = idb.fetchColumn(queryAgent);

            //Loopar igenom alla platser och sätter ut namnen i combobox.
            for (String agent : agents) {
                cbAgent.addItem(agent);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }
        //Blankar combobox

        cbAgent.setSelectedIndex(-1);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        //Kollar så att alla textfält, combobox är ifyllda och att datum är korrekt ifyllt.
        if (Validation.isNotEmpty(txtName, txtPassword, txtPhone) && Validation.ifCBEmpty(cbAgent, cbArea, cbRace) && Validation.ifDatePickerEmpty(datePicker)) {

            // Hämtar in alla nödvändiga textfält och combobox från användaren.
            String name = txtName.getText();
            String registration = datePicker.getDateStringOrEmptyString();
            String password = txtPassword.getText();
            String telephone = txtPhone.getText();
            String raceInfo = txtRaceInfo.getText();
            String agent = cbAgent.getSelectedItem().toString();
            String area = cbArea.getSelectedItem().toString();
            String race = cbRace.getSelectedItem().toString();

            try {
                //Skapar ett nytt ALIEN_ID att föra in i databasen mha metoden getAutoIncrement som 'simulerar' ett uppräknande index.
                String autoId = idb.getAutoIncrement("ALIEN", "ALIEN_ID");
                //Gör om till int för att kunna föras in i databasen.
                Integer.parseInt(autoId);

                //Hämtar plats ID från databas vart alien ska befinna sig.
                String areaID = idb.fetchSingle("SELECT PLATS_ID FROM PLATS WHERE BENAMNING = " + "'" + area + "'");
                Integer.parseInt(areaID);

                //Hämtar agent ID från databas vem som är ansvarig agent.
                String agentID = idb.fetchSingle("SELECT AGENT_ID FROM AGENT WHERE NAMN = " + "'" + agent + "'");
                Integer.parseInt(agentID);

                //Petar in alla data i databasens alien tabell.
                idb.insert("INSERT INTO ALIEN VALUES (" + autoId + ",'" + registration + "','" + password + "','" + name + "'," + telephone + "," + areaID + "," + agentID + ")");

                //Sätter rastillhörighet
                //Om boglodite, skicka med ytterligare info om Boogies.
                if (race.equals("Boglodite")) {
                    Integer.parseInt(raceInfo);
                    idb.insert("INSERT INTO BOGLODITE VALUES (" + autoId + "," + raceInfo + ")");
                } else if (race.equals("Squid")) {
                    //Om Squid, skicka med ytterligare info om Boogies.
                    Integer.parseInt(raceInfo);
                    idb.insert("INSERT INTO SQUID VALUES (" + autoId + "," + raceInfo + ")");
                } else if (race.equals("Worm")) {
                    idb.insert("INSERT INTO WORM VALUES (" + autoId + ")");
                }

                //All went smooth!
                JOptionPane.showMessageDialog(null, "Registrering av ny alien lyckades!");

            } catch (InfException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
                System.out.println(e);
            }
            //Töm alla fält/comboboxes
            emptyInputs();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cbRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRaceActionPerformed
        try {
            //Hämtar ras från combobox som användare valt
            String choice = cbRace.getSelectedItem().toString();
            //Om Boglodite, visa ny ruta med tillhörande text för användare att mata in.
            if (choice.equals("Boglodite")) {
                txtRaceInfo.setVisible(true);
                labelRaceInfo.setVisible(true);
                labelRaceInfo.setText("Antal Boogies");
                txtRaceInfo.setText("");
            } else if (choice.equals("Squid")) {
                //Om Squid, visa ny ruta med tillhörande text för användare att mata in.
                txtRaceInfo.setVisible(true);
                labelRaceInfo.setVisible(true);
                labelRaceInfo.setText("Antal armar");
                txtRaceInfo.setText("");
            } else if (choice.equals("Worm")) {
                txtRaceInfo.setText("");
                txtRaceInfo.setVisible(false);
                labelRaceInfo.setVisible(false);
            }
        } catch (NullPointerException e) {
            //
        }
    }//GEN-LAST:event_cbRaceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgentPasswordWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentPasswordWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentPasswordWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentPasswordWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cbAgent;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<String> cbRace;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JLabel imageAlien;
    private javax.swing.JLabel labelAgent;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelRace;
    private javax.swing.JLabel labelRaceInfo;
    private javax.swing.JPanel panelAlien;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRaceInfo;
    // End of variables declaration//GEN-END:variables
}
