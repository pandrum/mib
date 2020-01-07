/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import oru.inf.InfDB;

/**
 *
 * @author carllindstrom
 */
public class AlienWindow extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form AlienWindow
     */
    public AlienWindow(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSettings = new javax.swing.JPanel();
        labelSettings = new javax.swing.JLabel();
        imageSettings = new javax.swing.JLabel();
        panelEquipment = new javax.swing.JPanel();
        labelEquipment = new javax.swing.JLabel();
        imageToolbox = new javax.swing.JLabel();
        alienLogout = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelSettings.setText("Inställningar");
        labelSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSettingsMouseClicked(evt);
            }
        });

        imageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/gear-option.png"))); // NOI18N
        imageSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageSettingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSettingsLayout = new javax.swing.GroupLayout(panelSettings);
        panelSettings.setLayout(panelSettingsLayout);
        panelSettingsLayout.setHorizontalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageSettings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSettings)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        panelSettingsLayout.setVerticalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSettingsLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(labelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEquipment.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelEquipment.setText("Min Områdeschef");

        imageToolbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/toolbox.png"))); // NOI18N

        javax.swing.GroupLayout panelEquipmentLayout = new javax.swing.GroupLayout(panelEquipment);
        panelEquipment.setLayout(panelEquipmentLayout);
        panelEquipmentLayout.setHorizontalGroup(
            panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageToolbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEquipment)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        panelEquipmentLayout.setVerticalGroup(
            panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageToolbox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEquipmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelEquipment)
                .addGap(40, 40, 40))
        );

        alienLogout.setText("Logout");
        alienLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienLogoutActionPerformed(evt);
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/agent.png"))); // NOI18N

        labelWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelWelcome.setText("Välkommen ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(panelEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(labelLogo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(alienLogout))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(alienLogout)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSettingsMouseClicked
        //TODO
    }//GEN-LAST:event_labelSettingsMouseClicked

    private void imageSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageSettingsMouseClicked
        PasswordWindow password = new PasswordWindow(idb);
        password.setVisible(true);
    }//GEN-LAST:event_imageSettingsMouseClicked

    private void alienLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienLogoutActionPerformed
        setVisible(false);
        MainWindow mainwindow = new MainWindow(idb);
        mainwindow.setVisible(true);    }//GEN-LAST:event_alienLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AlienWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alienLogout;
    private javax.swing.JLabel imageSettings;
    private javax.swing.JLabel imageToolbox;
    private javax.swing.JLabel labelEquipment;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSettings;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelEquipment;
    private javax.swing.JPanel panelSettings;
    // End of variables declaration//GEN-END:variables
}
