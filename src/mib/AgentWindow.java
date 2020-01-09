/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import java.awt.Color;
import oru.inf.*;
import javax.swing.JOptionPane;

/**
 *
 *
 * @author sbf
 */
public class AgentWindow extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form agentWindow
     */
    public AgentWindow(InfDB idb) {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        btnLogout = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        panelInner = new javax.swing.JPanel();
        panelAlien = new javax.swing.JPanel();
        imageAlien = new javax.swing.JLabel();
        labelAlien = new javax.swing.JLabel();
        panelEquipment = new javax.swing.JPanel();
        labelEquipment = new javax.swing.JLabel();
        imageToolbox = new javax.swing.JLabel();
        panelSettings = new javax.swing.JPanel();
        labelSettings = new javax.swing.JLabel();
        imageSettings = new javax.swing.JLabel();
        panelManager = new javax.swing.JPanel();
        labelManager = new javax.swing.JLabel();
        imageManager = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogout.setText("Logga ut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        panelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelInner.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelAlien.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelAlien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelAlien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAlienMouseClicked(evt);
            }
        });

        imageAlien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/alien.png"))); // NOI18N

        labelAlien.setText("Hantera Alien...");

        javax.swing.GroupLayout panelAlienLayout = new javax.swing.GroupLayout(panelAlien);
        panelAlien.setLayout(panelAlienLayout);
        panelAlienLayout.setHorizontalGroup(
            panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAlien)
                .addGap(18, 18, 18)
                .addComponent(labelAlien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlienLayout.setVerticalGroup(
            panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAlienLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labelAlien)))
                .addContainerGap())
        );

        panelEquipment.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEquipmentMouseClicked(evt);
            }
        });

        labelEquipment.setText("Hantera Utrustning...");

        imageToolbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/toolbox.png"))); // NOI18N
        imageToolbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageToolboxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelEquipmentLayout = new javax.swing.GroupLayout(panelEquipment);
        panelEquipment.setLayout(panelEquipmentLayout);
        panelEquipmentLayout.setHorizontalGroup(
            panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageToolbox)
                .addGap(18, 18, 18)
                .addComponent(labelEquipment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEquipmentLayout.setVerticalGroup(
            panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageToolbox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEquipmentLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelEquipment)))
                .addContainerGap())
        );

        panelSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSettingsMouseClicked(evt);
            }
        });

        labelSettings.setText("Inställningar...");
        labelSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSettingsMouseClicked(evt);
            }
        });

        imageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/gear.png"))); // NOI18N

        javax.swing.GroupLayout panelSettingsLayout = new javax.swing.GroupLayout(panelSettings);
        panelSettings.setLayout(panelSettingsLayout);
        panelSettingsLayout.setHorizontalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageSettings)
                .addGap(18, 18, 18)
                .addComponent(labelSettings)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        panelSettingsLayout.setVerticalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSettingsLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelSettings)))
                .addContainerGap())
        );

        panelManager.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelManagerMouseClicked(evt);
            }
        });

        labelManager.setText("Områdeschef...");
        labelManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelManagerMouseClicked(evt);
            }
        });

        imageManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/businessman.png"))); // NOI18N

        javax.swing.GroupLayout panelManagerLayout = new javax.swing.GroupLayout(panelManager);
        panelManager.setLayout(panelManagerLayout);
        panelManagerLayout.setHorizontalGroup(
            panelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageManager)
                .addGap(18, 18, 18)
                .addComponent(labelManager)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        panelManagerLayout.setVerticalGroup(
            panelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageManager, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelManagerLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelManager)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelInnerLayout = new javax.swing.GroupLayout(panelInner);
        panelInner.setLayout(panelInnerLayout);
        panelInnerLayout.setHorizontalGroup(
            panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelInnerLayout.setVerticalGroup(
            panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInnerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panelAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/agent-small.png"))); // NOI18N

        labelWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelWelcome.setText("Välkommen ");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo)
                .addGap(12, 12, 12)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelLogo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        setVisible(false);
        MainWindow mainwindow = new MainWindow(idb);
        mainwindow.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void labelSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSettingsMouseClicked
        //TODO
    }//GEN-LAST:event_labelSettingsMouseClicked

    private void panelAlienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAlienMouseClicked
        setVisible(false);
        ManageAlienWindow managealien = new ManageAlienWindow(idb);
        managealien.setVisible(true);
    }//GEN-LAST:event_panelAlienMouseClicked

    private void panelSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSettingsMouseClicked
        PasswordWindow password = new PasswordWindow(idb);
        password.setVisible(true);
    }//GEN-LAST:event_panelSettingsMouseClicked

    private void labelManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelManagerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelManagerMouseClicked

    private void panelManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelManagerMouseClicked
        LocationManager manager = new LocationManager(idb);
        manager.setVisible(true);
    }//GEN-LAST:event_panelManagerMouseClicked

    private void panelEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquipmentMouseClicked
        setVisible(false);
        AgentManageEquipmentWindow agentmanage = new AgentManageEquipmentWindow(idb);
        agentmanage.setVisible(true);
    }//GEN-LAST:event_panelEquipmentMouseClicked

    private void imageToolboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageToolboxMouseClicked
        setVisible(false);
        AgentManageEquipmentWindow agentmanage = new AgentManageEquipmentWindow(idb);
        agentmanage.setVisible(true);
    }//GEN-LAST:event_imageToolboxMouseClicked

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
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel imageAlien;
    private javax.swing.JLabel imageManager;
    private javax.swing.JLabel imageSettings;
    private javax.swing.JLabel imageToolbox;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelAlien;
    private javax.swing.JLabel labelEquipment;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelManager;
    private javax.swing.JLabel labelSettings;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelAlien;
    private javax.swing.JPanel panelEquipment;
    private javax.swing.JPanel panelInner;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelManager;
    private javax.swing.JPanel panelSettings;
    // End of variables declaration//GEN-END:variables
}
