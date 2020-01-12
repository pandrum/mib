/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import oru.inf.*;

/**
 *
 * @author sbf
 */
public class AdminWindow extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form agentWindow
     */
    public AdminWindow(InfDB idb) {
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
        panelAgent = new javax.swing.JPanel();
        labelAgent = new javax.swing.JLabel();
        imageAgent = new javax.swing.JLabel();
        panelEquipment = new javax.swing.JPanel();
        labelEquipment = new javax.swing.JLabel();
        imageEquipment = new javax.swing.JLabel();
        panelSettings = new javax.swing.JPanel();
        labelSettings = new javax.swing.JLabel();
        imageSettings = new javax.swing.JLabel();
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
        panelAlien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAlienMouseClicked(evt);
            }
        });

        imageAlien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/alien.png"))); // NOI18N
        imageAlien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAlienMouseClicked(evt);
            }
        });

        labelAlien.setText("Hantera Alien...");

        javax.swing.GroupLayout panelAlienLayout = new javax.swing.GroupLayout(panelAlien);
        panelAlien.setLayout(panelAlienLayout);
        panelAlienLayout.setHorizontalGroup(
            panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAlien)
                .addGap(23, 23, 23)
                .addComponent(labelAlien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlienLayout.setVerticalGroup(
            panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlienLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelAlien))
                    .addComponent(imageAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelAgent.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAgentMouseClicked(evt);
            }
        });

        labelAgent.setText("Hantera Agent...");

        imageAgent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/spy.png"))); // NOI18N
        imageAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAgentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAgentLayout = new javax.swing.GroupLayout(panelAgent);
        panelAgent.setLayout(panelAgentLayout);
        panelAgentLayout.setHorizontalGroup(
            panelAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAgent)
                .addGap(23, 23, 23)
                .addComponent(labelAgent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAgentLayout.setVerticalGroup(
            panelAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgentLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelAgent))
                    .addComponent(imageAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelEquipment.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEquipmentMouseClicked(evt);
            }
        });

        labelEquipment.setText("Hantera Utrustning...");

        imageEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/toolbox.png"))); // NOI18N
        imageEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageEquipmentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelEquipmentLayout = new javax.swing.GroupLayout(panelEquipment);
        panelEquipment.setLayout(panelEquipmentLayout);
        panelEquipmentLayout.setHorizontalGroup(
            panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageEquipment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEquipment)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        panelEquipmentLayout.setVerticalGroup(
            panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEquipmentLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
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

        imageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/gear.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSettingsLayout.setVerticalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingsLayout.createSequentialGroup()
                .addGroup(panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSettingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSettingsLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelSettings)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelInnerLayout = new javax.swing.GroupLayout(panelInner);
        panelInner.setLayout(panelInnerLayout);
        panelInnerLayout.setHorizontalGroup(
            panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAgent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEquipment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSettings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelInnerLayout.setVerticalGroup(
            panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelInner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelLogo))
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnLogout))
                    .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        setVisible(false);
        MainWindow mainwindow = new MainWindow(idb);
        mainwindow.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void imageSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageSettingsMouseClicked
        AgentPasswordWindow password = new AgentPasswordWindow(idb);
        password.setVisible(true);
    }//GEN-LAST:event_imageSettingsMouseClicked

    private void imageAlienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAlienMouseClicked
        setVisible(false);
        ManageAlienWindow managealien = new ManageAlienWindow(idb);
        managealien.setVisible(true);
    }//GEN-LAST:event_imageAlienMouseClicked

    private void imageAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAgentMouseClicked
        setVisible(false);
        ManageAgentWindow manageagent = new ManageAgentWindow(idb);
        manageagent.setVisible(true);
    }//GEN-LAST:event_imageAgentMouseClicked

    private void panelAlienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAlienMouseClicked
        setVisible(false);
        AdminManageAlienWindow adminmanagealien = new AdminManageAlienWindow(idb);
        adminmanagealien.setVisible(true);
    }//GEN-LAST:event_panelAlienMouseClicked

    private void panelAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgentMouseClicked
        setVisible(false);
        ManageAgentWindow manageagent = new ManageAgentWindow(idb);
        manageagent.setVisible(true);
    }//GEN-LAST:event_panelAgentMouseClicked

    private void imageEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageEquipmentMouseClicked
        setVisible(false);
        ManageEquipmentWindow equipment = new ManageEquipmentWindow(idb);
        equipment.setVisible(true);    }//GEN-LAST:event_imageEquipmentMouseClicked

    private void panelEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquipmentMouseClicked
        setVisible(false);
        ManageEquipmentWindow equipment = new ManageEquipmentWindow(idb);
        equipment.setVisible(true);    }//GEN-LAST:event_panelEquipmentMouseClicked

    private void panelSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSettingsMouseClicked
        AgentPasswordWindow password = new AgentPasswordWindow(idb);
        password.setVisible(true);
    }//GEN-LAST:event_panelSettingsMouseClicked

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
    private javax.swing.JLabel imageAgent;
    private javax.swing.JLabel imageAlien;
    private javax.swing.JLabel imageEquipment;
    private javax.swing.JLabel imageSettings;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelAgent;
    private javax.swing.JLabel labelAlien;
    private javax.swing.JLabel labelEquipment;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSettings;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelAgent;
    private javax.swing.JPanel panelAlien;
    private javax.swing.JPanel panelEquipment;
    private javax.swing.JPanel panelInner;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelSettings;
    // End of variables declaration//GEN-END:variables
}
