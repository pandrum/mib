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
public class MainWindow extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;

    /**
     * Creates new form mainWindow
     */
    public MainWindow(InfDB idb) {
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

        panelMain = new javax.swing.JPanel();
        imageBanner = new javax.swing.JLabel();
        panelBottom = new javax.swing.JPanel();
        txtAlienPassword = new javax.swing.JPasswordField();
        textFieldAgentPassword = new javax.swing.JPasswordField();
        buttonAgentLogin = new javax.swing.JButton();
        labelAgentPassword = new javax.swing.JLabel();
        textFieldAgentUsername = new javax.swing.JTextField();
        labelAlienName = new javax.swing.JLabel();
        btnAlienLogin = new javax.swing.JButton();
        labelAgentName = new javax.swing.JLabel();
        labelAlienPassword = new javax.swing.JLabel();
        txtAlienName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Men In Black Database");

        panelMain.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        imageBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/mib.png"))); // NOI18N

        panelBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtAlienPassword.setMinimumSize(new java.awt.Dimension(15, 24));

        textFieldAgentPassword.setMinimumSize(new java.awt.Dimension(15, 24));

        buttonAgentLogin.setText("Logga in");
        buttonAgentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgentLoginActionPerformed(evt);
            }
        });

        labelAgentPassword.setText("Lösenord");

        labelAlienName.setText("Användarnamn");

        btnAlienLogin.setText("Logga in");
        btnAlienLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlienLoginActionPerformed(evt);
            }
        });

        labelAgentName.setText("Användarnamn");

        labelAlienPassword.setText("Lösenord");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/agent-small.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/alien-small.png"))); // NOI18N

        javax.swing.GroupLayout panelBottomLayout = new javax.swing.GroupLayout(panelBottom);
        panelBottom.setLayout(panelBottomLayout);
        panelBottomLayout.setHorizontalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAgentPassword)
                    .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textFieldAgentPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(textFieldAgentUsername))
                    .addComponent(buttonAgentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAgentName)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlienPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlienLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlienPassword)
                    .addComponent(txtAlienName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAlienName)
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelBottomLayout.setVerticalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBottomLayout.createSequentialGroup()
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4))
                            .addGroup(panelBottomLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAgentName)
                            .addComponent(labelAlienName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldAgentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlienName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAgentPassword)
                            .addComponent(labelAlienPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldAgentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlienPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAgentLogin)
                            .addComponent(btnAlienLogin, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(imageBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(imageBanner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgentLoginActionPerformed

        //Hämtar användarnamn och lösenord som användare matar in.
        String userNameInput = textFieldAgentUsername.getText();
        String passWordInput = textFieldAgentPassword.getText();

        //Kollar så att textfält för agent är ifyllt samt att användarnamn är en siffra.
        if (Validation.isNotEmpty(textFieldAgentPassword, textFieldAgentUsername) && Validation.isInteger(textFieldAgentUsername)) {

            try {
                //Hämtar in användarnamn (agent_ID) från databasen.
                String username = idb.fetchSingle("SELECT AGENT_ID from AGENT where AGENT_ID = " + userNameInput);
                //Hämtar in lösenord från databasen.

                String password = idb.fetchSingle("SELECT LOSENORD from AGENT where AGENT_ID = " + userNameInput);
                //Hämtar in om användare är admin från databasen.
                String admin = idb.fetchSingle("SELECT ADMINISTRATOR from AGENT where AGENT_ID = " + userNameInput);
                //Kollar om användarnamn och lösenord från databasen stämmer överens med det användare matat in SAMT om användare är admin.
                if (userNameInput.equals(username) && passWordInput.equals(password) && admin.equals("J")) {
                    //Sparar användarens ID till ett fält som sedan kan användas av andra klasser för att hitta "ID" på vem som är inloggad.
                    id = username;
                    setVisible(false);
                    //Öppnar ny admin ruta.
                    AdminWindow adminWindow = new AdminWindow(idb);
                    adminWindow.setVisible(true);
                } // Om användare skriver in rätt användarnamn OCH rätt lösenord.
                else if (userNameInput.equals(username) && passWordInput.equals(password)) {
                    //Sparar användarens ID till ett fält som sedan kan användas av andra klasser för att hitta "ID" på vem som är inloggad.
                    id = username;
                    setVisible(false);
                    //Öppnar ny agent (icke-admin) ruta.
                    AgentWindow agentWindow = new AgentWindow(idb);
                    agentWindow.setVisible(true);

                } else {
                    //Om fel användarnamn eller lösenord.
                    JOptionPane.showMessageDialog(null, "Fel lösenord eller användarnamn!");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
            }
        }
    }//GEN-LAST:event_buttonAgentLoginActionPerformed

    private void btnAlienLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlienLoginActionPerformed

        //Hämtar användarnamn och lösenord som användare matar in.
        String userNameInput = txtAlienName.getText();
        String passWordInput = txtAlienPassword.getText();

        //Kollar så att textfält för alien är ifyllt samt att användarnamn är en siffra.
        if (Validation.isNotEmpty(txtAlienName, txtAlienPassword) && Validation.isInteger(txtAlienName)) {

            try {
                //Hämtar in användarnamn (alien_ID) från databasen.
                String username = idb.fetchSingle("SELECT ALIEN_ID from ALIEN where ALIEN_ID = " + userNameInput);
                //Hämtar in lösenord från databasen.
                String password = idb.fetchSingle("SELECT LOSENORD from ALIEN where ALIEN_ID = " + userNameInput);

                // Om användare skriver in rätt användarnamn OCH rätt lösenord. (Matchar med databasen)
                if (userNameInput.equals(username) && passWordInput.equals(password)) {
                    id = username;
                    setVisible(false);
                    //Öppna ny alien ruta.
                    AlienWindow alienwindow = new AlienWindow(idb);
                    alienwindow.setVisible(true);

                } else {
                    //Om fel användarnamn eller lösenord.
                    JOptionPane.showMessageDialog(null, "Fel lösenord eller användarnamn!");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
            }
        }
    }//GEN-LAST:event_btnAlienLoginActionPerformed

    //Metod som andra klasser kan använda för att hitta "ID" på inloggad användare.
    public static String getId() {
        return id;
    }

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlienLogin;
    private javax.swing.JButton buttonAgentLogin;
    private javax.swing.JLabel imageBanner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAgentName;
    private javax.swing.JLabel labelAgentPassword;
    private javax.swing.JLabel labelAlienName;
    private javax.swing.JLabel labelAlienPassword;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPasswordField textFieldAgentPassword;
    private javax.swing.JTextField textFieldAgentUsername;
    private javax.swing.JTextField txtAlienName;
    private javax.swing.JPasswordField txtAlienPassword;
    // End of variables declaration//GEN-END:variables
}
