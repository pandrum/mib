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

        btnLogout = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        panelInner = new javax.swing.JPanel();
        panelManager = new javax.swing.JPanel();
        labelManager = new javax.swing.JLabel();
        imageManager = new javax.swing.JLabel();
        panelSettings = new javax.swing.JPanel();
        labelSettings = new javax.swing.JLabel();
        imageSettings = new javax.swing.JLabel();
        imageLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogout.setText("Logga ut");

        panelMain.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelWelcome.setText("Välkommen ");

        panelInner.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        panelManager.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelManagerMouseClicked(evt);
            }
        });

        labelManager.setText("Min Områdeschef");

        imageManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/businessman.png"))); // NOI18N
        imageManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageManagerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelManagerLayout = new javax.swing.GroupLayout(panelManager);
        panelManager.setLayout(panelManagerLayout);
        panelManagerLayout.setHorizontalGroup(
            panelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelManager)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        panelManagerLayout.setVerticalGroup(
            panelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageManager, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManagerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelManager)
                .addGap(40, 40, 40))
        );

        panelSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSettingsMouseClicked(evt);
            }
        });

        labelSettings.setText("Inställningar");

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

        javax.swing.GroupLayout panelInnerLayout = new javax.swing.GroupLayout(panelInner);
        panelInner.setLayout(panelInnerLayout);
        panelInnerLayout.setHorizontalGroup(
            panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelInnerLayout.setVerticalGroup(
            panelInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelManager, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        imageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/agent-small.png"))); // NOI18N

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panelInner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imageSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageSettingsMouseClicked
        AlienPasswordWindow alienpassword = new AlienPasswordWindow(idb);
        alienpassword.setVisible(true);
    }//GEN-LAST:event_imageSettingsMouseClicked

    private void panelSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSettingsMouseClicked
        AlienPasswordWindow alienpassword = new AlienPasswordWindow(idb);
        alienpassword.setVisible(true);
    }//GEN-LAST:event_panelSettingsMouseClicked

    private void panelManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelManagerMouseClicked
        AlienLocationManagerWindow alienmanager = new AlienLocationManagerWindow(idb);
        alienmanager.setVisible(true);
    }//GEN-LAST:event_panelManagerMouseClicked

    private void imageManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageManagerMouseClicked
        AlienLocationManagerWindow alienmanager = new AlienLocationManagerWindow(idb);
        alienmanager.setVisible(true);
    }//GEN-LAST:event_imageManagerMouseClicked

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
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JLabel imageManager;
    private javax.swing.JLabel imageSettings;
    private javax.swing.JLabel labelManager;
    private javax.swing.JLabel labelSettings;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelInner;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelManager;
    private javax.swing.JPanel panelSettings;
    // End of variables declaration//GEN-END:variables
}
