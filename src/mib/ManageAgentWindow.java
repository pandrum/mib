/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.*;

/**
 *
 * @author HH
 */
public class ManageAgentWindow extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form agentWindow
     */
    public ManageAgentWindow(InfDB idb) {
        initComponents();
        this.idb = idb;
        fillcb();
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
        labelWelcome = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JButton();
        buttonRegisterNewAgent = new javax.swing.JButton();
        buttonListAgents = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMain = new javax.swing.JTextArea();
        panelSide = new javax.swing.JPanel();
        btnChangeInfoAgent = new javax.swing.JButton();
        panelSideInner = new javax.swing.JPanel();
        cbLocation = new javax.swing.JComboBox<>();
        RBFieldAgent = new javax.swing.JRadioButton();
        txtAgentName = new javax.swing.JTextField();
        txtAgentPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRegDate = new javax.swing.JTextField();
        RBOffMngr = new javax.swing.JRadioButton();
        txtAgentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CBLocationMngr = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RBAdmin = new javax.swing.JRadioButton();
        LbLocationMngr = new javax.swing.JLabel();
        panelSearch = new javax.swing.JPanel();
        btnSearchAgent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearchAgent = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelWelcome.setText("Välkommen ");
        labelWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/agent.png"))); // NOI18N

        buttonLogout.setText("Tillbaka");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        buttonRegisterNewAgent.setText("Registrera ny Agent...");
        buttonRegisterNewAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterNewAgentActionPerformed(evt);
            }
        });

        buttonListAgents.setText("Lista alla Agenter");
        buttonListAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListAgentsActionPerformed(evt);
            }
        });

        txtAreaMain.setColumns(20);
        txtAreaMain.setRows(5);
        jScrollPane1.setViewportView(txtAreaMain);

        panelSide.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnChangeInfoAgent.setText("Ändra");
        btnChangeInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeInfoAgentActionPerformed(evt);
            }
        });

        panelSideInner.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        RBFieldAgent.setText("Fältagent");
        RBFieldAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBFieldAgentActionPerformed(evt);
            }
        });

        jLabel4.setText("Namn");

        RBOffMngr.setText("Kontorschef");
        RBOffMngr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBOffMngrActionPerformed(evt);
            }
        });

        txtAgentID.setEditable(false);

        jLabel3.setText("Agent ID");

        jLabel6.setText("Område");

        jLabel5.setText("Telefon");

        jLabel10.setText("Anställningsdatum");

        RBAdmin.setText("Administratör");
        RBAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAdminActionPerformed(evt);
            }
        });

        LbLocationMngr.setText("Områdeschef");

        javax.swing.GroupLayout panelSideInnerLayout = new javax.swing.GroupLayout(panelSideInner);
        panelSideInner.setLayout(panelSideInnerLayout);
        panelSideInnerLayout.setHorizontalGroup(
            panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegDate)
                    .addComponent(txtAgentPhone)
                    .addGroup(panelSideInnerLayout.createSequentialGroup()
                        .addGroup(panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(LbLocationMngr)
                            .addComponent(RBAdmin)
                            .addComponent(RBOffMngr)
                            .addComponent(RBFieldAgent))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtAgentName)
                    .addComponent(txtAgentID)
                    .addComponent(cbLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBLocationMngr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSideInnerLayout.setVerticalGroup(
            panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LbLocationMngr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBLocationMngr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(RBOffMngr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBFieldAgent)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSearchAgent.setText("Sök");
        btnSearchAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAgentActionPerformed(evt);
            }
        });

        jLabel1.setText("Sök Agent");

        txtSearchAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchAgent)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(txtSearchAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchAgent)
                .addContainerGap())
        );

        btnRemove.setText("Ta bort Agent");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSideLayout = new javax.swing.GroupLayout(panelSide);
        panelSide.setLayout(panelSideLayout);
        panelSideLayout.setHorizontalGroup(
            panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSideInner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelSideLayout.createSequentialGroup()
                        .addComponent(btnChangeInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSideLayout.setVerticalGroup(
            panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(panelSideInner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangeInfoAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRegisterNewAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonListAgents)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(labelLogo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonListAgents, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addComponent(panelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(buttonRegisterNewAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emptyInputs() {
        txtAreaMain.setText("");
        txtSearchAgent.setText("");
        txtAgentID.setText("");
        txtAgentName.setText("");
        txtRegDate.setText("");
        txtAgentPhone.setText("");
        cbLocation.setSelectedIndex(-1);
        CBLocationMngr.setSelectedIndex(-1);
        RBAdmin.setSelected(false);
        RBOffMngr.setSelected(false);
        RBAdmin.setSelected(false);
        RBFieldAgent.setSelected(false);
    }

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        setVisible(false);
        AdminWindow adminwindow = new AdminWindow(idb);
        adminwindow.setVisible(true);
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonRegisterNewAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterNewAgentActionPerformed
        NewAgentWindow newagent = new NewAgentWindow(idb);
        newagent.setVisible(true);
    }//GEN-LAST:event_buttonRegisterNewAgentActionPerformed

    private void buttonListAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListAgentsActionPerformed
        txtAreaMain.setText("");
        ArrayList<HashMap<String, String>> agents = new ArrayList<HashMap<String, String>>();

        try {
            String query = "SELECT * FROM AGENT;";

            agents = idb.fetchRows(query);

            for (HashMap<String, String> agent : agents) {
                txtAreaMain.append("Agent ID: " + agent.get("AGENT_ID") + "\n");
                txtAreaMain.append("Namn: " + agent.get("NAMN") + "\n");
                txtAreaMain.append("Telefon: " + agent.get("TELEFON") + "\n");
                txtAreaMain.append("Anställningsdatum: " + agent.get("ANSTALLNINGSDATUM") + "\n");
                txtAreaMain.append("Administratör: " + agent.get("ADMINISTRATOR") + "\n");
                txtAreaMain.append("Område: " + idb.fetchSingle("SELECT BENAMNING FROM OMRADE WHERE OMRADES_ID = (SELECT OMRADE FROM AGENT WHERE AGENT_ID = " + "'" + agent.get("AGENT_ID") + "')") + "\n");
                txtAreaMain.append("--------------------------------------------------------" + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!" + e);
        }
    }//GEN-LAST:event_buttonListAgentsActionPerformed

    private void txtSearchAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchAgentActionPerformed

    }//GEN-LAST:event_txtSearchAgentActionPerformed

    private void btnSearchAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAgentActionPerformed
        if (Validation.isNotEmpty(txtSearchAgent)) {

            String searchAgent = txtSearchAgent.getText();

            try {
                //Hämtar ID
                String agent = idb.fetchSingle("SELECT AGENT_ID FROM AGENT WHERE NAMN = " + "'" + searchAgent + "'");
                txtAgentID.setText(agent);
                int agentID = Integer.parseInt(agent);

                //Hämtar Namn
                String agentName = idb.fetchSingle("SELECT NAMN FROM AGENT WHERE AGENT_ID = " + "'" + agentID + "'");
                txtAgentName.setText(agentName);

                //Hämtar Anstdatum
                String agentHireDate = idb.fetchSingle("SELECT ANSTALLNINGSDATUM FROM AGENT WHERE AGENT_ID = " + "'" + agentID + "'");
                txtRegDate.setText(agentHireDate);

                //Hämtar Telefon
                String agentPhone = idb.fetchSingle("SELECT TELEFON FROM AGENT WHERE AGENT_ID = " + "'" + agentID + "'");
                txtAgentPhone.setText(agentPhone);

                //Hämtar Plats
                String agentLocation = idb.fetchSingle("SELECT BENAMNING FROM OMRADE WHERE OMRADES_ID = (SELECT OMRADE FROM AGENT WHERE AGENT_ID = " + "'" + agentID + "')");
                cbLocation.getModel().setSelectedItem(agentLocation);

                //String OfficeQuarry = "SELECT KONTORSBETECKNING FROM KONTORSCHEF JOIN AGENT ON KONTORSCHEF.AGENT_ID = AGENT.AGENT_ID WHERE AGENT.AGENT_ID= " + "'" + agentID + "'";
                String OfficeMngr = idb.fetchSingle("SELECT AGENT_ID FROM KONTORSCHEF");
                int Off = Integer.parseInt(OfficeMngr);
                if (Off == agentID) {
                    RBOffMngr.setSelected(true);
                } else {
                    RBOffMngr.setSelected(false);
                }
                ArrayList<String> fields = idb.fetchColumn("SELECT AGENT_ID FROM FALTAGENT");
                for (String field : fields) {
                    int id = Integer.parseInt(field);
                    if (agentID == id) {
                        RBFieldAgent.setSelected(true);
                    }
                }

                String LocationQuarry = "SELECT BENAMNING FROM OMRADE JOIN OMRADESCHEF ON OMRADE.OMRADES_ID = OMRADESCHEF.OMRADE JOIN AGENT ON OMRADESCHEF.AGENT_ID = AGENT.AGENT_ID WHERE AGENT.AGENT_ID= " + "'" + agentID + "'";
                String LocationMngr = idb.fetchSingle(LocationQuarry);
                CBLocationMngr.getModel().setSelectedItem(LocationMngr);

                String admin = idb.fetchSingle("SELECT ADMINISTRATOR from AGENT where AGENT_ID = " + agentID);
                if (admin.equals("J")) {
                    RBAdmin.setSelected(true);
                } else {
                    RBAdmin.setSelected(false);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Agent hittades inte!");
                txtSearchAgent.setText("");
                txtSearchAgent.requestFocus();
            }

        }

    }//GEN-LAST:event_btnSearchAgentActionPerformed

    private void RBAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBAdminActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (Validation.isNotEmpty(txtAgentID)) {

            int agentID = Integer.parseInt(txtAgentID.getText());
            int input = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort agenten?", "Ta bort agent..", 2);
            if (input == 0) {
                try {
                    idb.delete("DELETE FROM INNEHAR_FORDON WHERE AGENT_ID =" + "'" + agentID + "'");
                    idb.delete("DELETE FROM INNEHAR_UTRUSTNING WHERE AGENT_ID =" + "'" + agentID + "'");
                    idb.delete("DELETE FROM AGENT WHERE AGENT_ID =" + "'" + agentID + "'");
                    idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID =" + "'" + agentID + "'");
                    idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID =" + "'" + agentID + "'");
                    if (agentID == Integer.parseInt(idb.fetchSingle("SELECT AGENT_ID FROM KONTORSCHEF"))) {
                        idb.update("UPDATE KONTORSCHEF SET AGENT_ID = " + 0);
                    }
                    JOptionPane.showMessageDialog(null, "Agenten har raderats");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Agent hittades inte!");
                    txtSearchAgent.setText("");
                    txtSearchAgent.requestFocus();
                }

            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnChangeInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoAgentActionPerformed
        if (Validation.isNotEmpty(txtAgentID)) {

            int agentID = Integer.parseInt(txtAgentID.getText());

            int input = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ändra informationen?", "Ändra information..", 2);
            if (input == 0) {
                String name = txtAgentName.getText();
                String telephone = txtAgentPhone.getText();
                String date = txtRegDate.getText();
                //String officeMn = cbOffMngr.getSelectedItem().toString();
                String admin = "";
                try {
                    String Area = idb.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = " + "'" + cbLocation.getSelectedItem().toString() + "'");
                    int area = Integer.parseInt(Area);
                    if (RBAdmin.isSelected()) {
                        admin = "J";
                    } else {
                        admin = "N";
                    }
                    if (RBOffMngr.isSelected()) {
                        idb.update("UPDATE KONTORSCHEF SET AGENT_ID = " + "'" + agentID + "'");
                    }
                    if (RBFieldAgent.isSelected()) {
                        idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID = " + "'" + agentID + "'");
                        idb.insert("INSERT INTO FALTAGENT VALUES ('" + agentID + "')");
                    } else {
                        idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID = " + "'" + agentID + "'");
                    }

                    idb.update("UPDATE AGENT SET NAMN = " + "'" + name + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");
                    idb.update("UPDATE AGENT SET TELEFON = " + "'" + telephone + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");
                    idb.update("UPDATE AGENT SET ANSTALLNINGSDATUM = " + "'" + date + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");
                    idb.update("UPDATE AGENT SET ADMINISTRATOR = " + "'" + admin + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");
                    idb.update("UPDATE AGENT SET OMRADE = " + "'" + area + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");

                    ArrayList<String> ids = idb.fetchColumn("SELECT AGENT_ID FROM OMRADESCHEF");
                    int i = 0;
                    String LocMn = CBLocationMngr.getSelectedItem().toString();
                    boolean find = false;
                    while (i < ids.size() && find == false) {
                        String id = ids.get(i);
                        int ag_id = Integer.parseInt(id);

                        if (LocMn.equals("Ej chef")) {
                            idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID = " + "'" + agentID + "'");
                            find = true;
                        }
                        if (ag_id == agentID) {
                            String LocationMn = idb.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING =" + "'" + CBLocationMngr.getSelectedItem().toString() + "'");
                            int locationMn = Integer.parseInt(LocationMn);
                            idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID = " + "'" + agentID + "'");
                            idb.insert("INSERT INTO OMRADESCHEF VALUES ('" + agentID + "','" + locationMn + "')");
                            find = true;
                        } else {
                            i++;
                        }
                    }
                    if (find == false) {
                        String LocationMn = idb.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING =" + "'" + CBLocationMngr.getSelectedItem().toString() + "'");
                        int locationMn = Integer.parseInt(LocationMn);
                        idb.insert("INSERT INTO OMRADESCHEF VALUES ('" + agentID + "','" + locationMn + "')");

                    }
                    JOptionPane.showMessageDialog(null, "Agenten har uppdaterats");
                    emptyInputs();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Agent hittades inte!");
                    txtSearchAgent.setText("");
                    txtSearchAgent.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_btnChangeInfoAgentActionPerformed

    private void RBOffMngrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBOffMngrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBOffMngrActionPerformed

    private void RBFieldAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBFieldAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBFieldAgentActionPerformed

    private void fillcb() {

        //cbLocation.addItem(null);
        CBLocationMngr.addItem("Ej chef");
        String Location = "SELECT BENAMNING FROM OMRADE";
        ArrayList<String> allLocation;
        try {
            allLocation = idb.fetchColumn(Location);
            for (String name : allLocation) {
                cbLocation.addItem(name);
                CBLocationMngr.addItem(name);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!" + e);
        }
        cbLocation.setSelectedIndex(-1);
        //CBLocationMngr.setSelectedIndex(-1);

        /* //cbOffMngr.addItem(null);
        String fraga = "SELECT KONTORSBETECKNING FROM KONTORSCHEF";
       ArrayList<String> allOffice;
       try {
        allOffice = idb.fetchColumn(fraga);
        for (String name:allOffice){
            cbOffMngr.addItem(name);
        }
    }
       catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!" + e);
    }
    cbOffMngr.setSelectedIndex(-1 */
    }

    public void clearAllFields(Container container) {

        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setText("");
            } else if (c instanceof Container) {
                clearAllFields((Container) c);
            }
        }
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
    private javax.swing.JComboBox<String> CBLocationMngr;
    private javax.swing.JLabel LbLocationMngr;
    private javax.swing.JRadioButton RBAdmin;
    private javax.swing.JRadioButton RBFieldAgent;
    private javax.swing.JRadioButton RBOffMngr;
    private javax.swing.JButton btnChangeInfoAgent;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearchAgent;
    private javax.swing.JButton buttonListAgents;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonRegisterNewAgent;
    private javax.swing.JComboBox<String> cbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JPanel panelSide;
    private javax.swing.JPanel panelSideInner;
    private javax.swing.JTextField txtAgentID;
    private javax.swing.JTextField txtAgentName;
    private javax.swing.JTextField txtAgentPhone;
    private javax.swing.JTextArea txtAreaMain;
    private javax.swing.JTextField txtRegDate;
    private javax.swing.JTextField txtSearchAgent;
    // End of variables declaration//GEN-END:variables
}
