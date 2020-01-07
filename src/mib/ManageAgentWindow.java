/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import java.awt.Component;
import java.awt.Container;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
        jTextArea1 = new javax.swing.JTextArea();
        txtSearchAgent = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAgentID = new javax.swing.JTextField();
        txtAgentName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnChangeInfoAgent = new javax.swing.JButton();
        cbLocation = new javax.swing.JComboBox<>();
        txtAgentPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        LbLocationMngr = new javax.swing.JLabel();
        CBLocationMngr = new javax.swing.JComboBox<>();
        RBAdmin = new javax.swing.JRadioButton();
        RBOffMngr = new javax.swing.JRadioButton();
        txtRegDate = new javax.swing.JTextField();
        rbFieldagent = new javax.swing.JRadioButton();
        btnSearchAgent = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelWelcome.setText("Välkommen ");

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        txtSearchAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAgentActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Agent ID");

        txtAgentID.setEditable(false);

        jLabel4.setText("Namn");

        jLabel5.setText("Telefon");

        jLabel6.setText("Område");

        btnChangeInfoAgent.setText("Ändra");
        btnChangeInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeInfoAgentActionPerformed(evt);
            }
        });

        jLabel10.setText("Anställningsdatum");

        LbLocationMngr.setText("Områdeschef");

        RBAdmin.setText("Administratör");
        RBAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAdminActionPerformed(evt);
            }
        });

        RBOffMngr.setText("Kontorschef");
        RBOffMngr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBOffMngrActionPerformed(evt);
            }
        });

        rbFieldagent.setText("Fältagent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegDate)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10)
                                .addComponent(txtAgentName)
                                .addComponent(txtAgentID)
                                .addComponent(txtAgentPhone)
                                .addComponent(cbLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChangeInfoAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(LbLocationMngr)
                                .addComponent(CBLocationMngr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(RBAdmin)
                            .addComponent(RBOffMngr)
                            .addComponent(rbFieldagent))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
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
                .addComponent(rbFieldagent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChangeInfoAgent)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        btnSearchAgent.setText("Sök");
        btnSearchAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAgentActionPerformed(evt);
            }
        });

        btnRemove.setText("Ta bort Agent");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonListAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonRegisterNewAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearchAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearchAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemove))))
                        .addContainerGap(126, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelLogo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegisterNewAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(buttonListAgents)
                .addGap(0, 158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        jTextArea1.setText("");
        ArrayList<HashMap<String, String>> agents = new ArrayList<HashMap<String, String>>();

        try {
            String query = "SELECT * FROM AGENT;";

            agents = idb.fetchRows(query);

            for (HashMap<String, String> agent : agents) {
                jTextArea1.append("Agent ID: " + agent.get("AGENT_ID") + "\n");
                jTextArea1.append("Namn: " + agent.get("NAMN") + "\n");
                jTextArea1.append("Telefon: " + agent.get("TELEFON") + "\n");
                jTextArea1.append("Anställningsdatum: " + agent.get("ANSTALLNINGSDATUM") + "\n");
                jTextArea1.append("Administratör: " + agent.get("ADMINISTRATOR") + "\n");
                jTextArea1.append("Område: " + idb.fetchSingle("SELECT BENAMNING FROM OMRADE WHERE OMRADES_ID = (SELECT OMRADE FROM AGENT WHERE AGENT_ID = " + "'" + agent.get("AGENT_ID") + "')" ) + "\n");
                jTextArea1.append("--------------------------------------------------------" + "\n");
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
                if(Off == agentID){
                    RBOffMngr.setSelected(true);
                }
                else{
                    RBOffMngr.setSelected(false);
                }
                ArrayList<String> fields = idb.fetchColumn("SELECT AGENT_ID FROM FALTAGENT");
                for(String field:fields){
                int id = Integer.parseInt(field);
                if(agentID==id){
                rbFieldagent.setSelected(true);
                }   
                }
                
                String LocationQuarry = "SELECT BENAMNING FROM OMRADE JOIN OMRADESCHEF ON OMRADE.OMRADES_ID = OMRADESCHEF.OMRADE JOIN AGENT ON OMRADESCHEF.AGENT_ID = AGENT.AGENT_ID WHERE AGENT.AGENT_ID= " + "'" + agentID + "'";
                String LocationMngr = idb.fetchSingle(LocationQuarry);
                CBLocationMngr.getModel().setSelectedItem(LocationMngr);
                
                String admin = idb.fetchSingle("SELECT ADMINISTRATOR from AGENT where AGENT_ID = " + agentID);
                if(admin.equals("J")){
                    RBAdmin.setSelected(true);
                }
                else{
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
        if (Validation.isNotEmpty(txtAgentID)){
        
        int agentID = Integer.parseInt(txtAgentID.getText());
        int input = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort agenten?","Ta bort agent.." , 2) ;
        if (input == 0){
        try {
            idb.delete("DELETE FROM INNEHAR_FORDON WHERE AGENT_ID =" + "'" + agentID +"'");
            idb.delete("DELETE FROM INNEHAR_UTRUSTNING WHERE AGENT_ID =" + "'" + agentID +"'");
            idb.delete("DELETE FROM AGENT WHERE AGENT_ID =" + "'" + agentID +"'");
            idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID =" + "'" + agentID +"'");
            idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID =" + "'" + agentID +"'");
            if(agentID == Integer.parseInt(idb.fetchSingle("SELECT AGENT_ID FROM KONTORSCHEF"))){
            idb.update("UPDATE KONTORSCHEF SET AGENT_ID = " + 0);
            } 
        JOptionPane.showMessageDialog(null, "Agenten har raderats");    
        }
        catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Agent hittades inte!");
                txtSearchAgent.setText("");
                txtSearchAgent.requestFocus();
            }
        
        
        }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed
    
    private void btnChangeInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoAgentActionPerformed
        if (Validation.isNotEmpty(txtAgentID)){
            
        int agentID = Integer.parseInt(txtAgentID.getText());
        
        int input = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ändra informationen?","Ändra information.." , 2) ;
        if (input == 0){
            String name = txtAgentName.getText();
            String telephone = txtAgentPhone.getText();
            String date = txtRegDate.getText();
            //String officeMn = cbOffMngr.getSelectedItem().toString();
            String admin = "";
            try {
                String Area = idb.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = " + "'" + cbLocation.getSelectedItem().toString() + "'");
                int area = Integer.parseInt(Area);   
                if (RBAdmin.isSelected()){
                admin= "J";
                }
                else{
                admin = "N";
                }
                if (RBOffMngr.isSelected()){
                idb.update("UPDATE KONTORSCHEF SET AGENT_ID = "+ "'" + agentID + "'");
                }
                if (rbFieldagent.isSelected()){
                idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID = " + "'" + agentID + "'" );
                    idb.insert("INSERT INTO FALTAGENT VALUES ('" + agentID + "')");
                }
                else{
                idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID = " + "'" + agentID + "'" );
                }
                
                idb.update("UPDATE AGENT SET NAMN = " + "'" + name + "'" +"WHERE AGENT_ID = " + "'" + agentID + "'" );
                idb.update("UPDATE AGENT SET TELEFON = " + "'" + telephone + "'" +"WHERE AGENT_ID = " + "'" + agentID + "'" );
                idb.update("UPDATE AGENT SET ANSTALLNINGSDATUM = " + "'" + date + "'" +"WHERE AGENT_ID = " + "'" + agentID + "'" );
                idb.update("UPDATE AGENT SET ADMINISTRATOR = " + "'" + admin + "'" +"WHERE AGENT_ID = " + "'" + agentID + "'" );
                idb.update("UPDATE AGENT SET OMRADE = " + "'" + area + "'" +"WHERE AGENT_ID = " + "'" + agentID + "'" );
                
                ArrayList<String> ids = idb.fetchColumn("SELECT AGENT_ID FROM OMRADESCHEF");
                int i = 0;
                String LocMn = CBLocationMngr.getSelectedItem().toString();
                boolean find = false;
                while (i < ids.size() && find == false){
                String id = ids.get(i);
                int ag_id = Integer.parseInt(id);
                
                if (LocMn.equals("Ej chef")){
                idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID = " + "'" + agentID + "'" );
                find = true;
                }
                if(ag_id == agentID){
                    String LocationMn = idb.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING =" + "'" + CBLocationMngr.getSelectedItem().toString() + "'");
                    int locationMn = Integer.parseInt(LocationMn);
                    idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID = " + "'" + agentID + "'" );
                    idb.insert("INSERT INTO OMRADESCHEF VALUES ('" + agentID + "','" + locationMn + "')");
                    find = true;
                }
                else{
                i++;
                }
                }
                if (find == false ){
                    String LocationMn = idb.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING =" + "'" + CBLocationMngr.getSelectedItem().toString() + "'");
                int locationMn = Integer.parseInt(LocationMn);
                    idb.insert("INSERT INTO OMRADESCHEF VALUES ('" + agentID + "','" + locationMn + "')");
                
                }
               //clearAllFields(rootPane); 
               JOptionPane.showMessageDialog(null, "Agenten har uppdaterats");
            }
            catch (Exception e) {
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

    
    
    
    
    private void fillcb() {
        
       //cbLocation.addItem(null);
       CBLocationMngr.addItem("Ej chef");
        String Location = "SELECT BENAMNING FROM OMRADE";
       ArrayList<String> allLocation;
       try {
        allLocation = idb.fetchColumn(Location);
        for (String name:allLocation){
            cbLocation.addItem(name);
            CBLocationMngr.addItem(name);
        }
    } 
       catch (InfException e) {
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
    private javax.swing.JRadioButton RBOffMngr;
    private javax.swing.JButton btnChangeInfoAgent;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearchAgent;
    private javax.swing.JButton buttonListAgents;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonRegisterNewAgent;
    private javax.swing.JComboBox<String> cbLocation;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JRadioButton rbFieldagent;
    private javax.swing.JTextField txtAgentID;
    private javax.swing.JTextField txtAgentName;
    private javax.swing.JTextField txtAgentPhone;
    private javax.swing.JTextField txtRegDate;
    private javax.swing.JTextField txtSearchAgent;
    // End of variables declaration//GEN-END:variables
}