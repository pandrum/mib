/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.*;

/**
 *
 * @author HH
 */
public class AgentManageEquipmentWindow extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form agentWindow
     */
    public AgentManageEquipmentWindow(InfDB idb) {
        initComponents();
        this.idb = idb;
        txtEqInfo.setVisible(false);
        labelEqInfo.setVisible(false);
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

        jProgressBar1 = new javax.swing.JProgressBar();
        labelWelcome = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRegNewEquipment = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        txtAreaMain = new javax.swing.JTextArea();
        panelSide = new javax.swing.JPanel();
        panelSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        labelEquipment = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        panelSideInner = new javax.swing.JPanel();
        labelType = new javax.swing.JLabel();
        labelEqInfo = new javax.swing.JLabel();
        txtEquipmentID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        labelDate = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        labelAgent = new javax.swing.JLabel();
        cbAgent = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JTextField();
        txtEqInfo = new javax.swing.JTextField();
        labelEquipmentID = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        panelBottom = new javax.swing.JPanel();
        labelTypeBottom = new javax.swing.JLabel();
        cbTypeBottom = new javax.swing.JComboBox<>();
        btnListEquipment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelWelcome.setText("Välkommen ");

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/agent-small.png"))); // NOI18N

        btnBack.setText("Tillbaka");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRegNewEquipment.setText("Registrera ny Utrustning...");
        btnRegNewEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegNewEquipmentActionPerformed(evt);
            }
        });

        txtAreaMain.setColumns(20);
        txtAreaMain.setEditable(false);
        txtAreaMain.setRows(5);
        scrollPane.setViewportView(txtAreaMain);

        panelSide.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        labelEquipment.setText("Sök Utrustning");

        btnSearch.setText("Sök");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSearchLayout.createSequentialGroup()
                        .addComponent(labelEquipment)
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEquipment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelSideInner.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelType.setText("Typ");

        labelEqInfo.setText("Kaliber");

        txtEquipmentID.setEditable(false);

        txtName.setEditable(false);

        labelDate.setText("Utkvitterings Datum");

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapen", "Kommunikation", "Teknik" }));
        cbType.setSelectedIndex(-1);
        cbType.setToolTipText("");
        cbType.setEnabled(false);
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeActionPerformed(evt);
            }
        });

        labelAgent.setText("Utlånad till Agent");

        cbAgent.setEnabled(false);

        txtDate.setEditable(false);

        txtEqInfo.setEditable(false);
        txtEqInfo.setActionCommand("null");

        labelEquipmentID.setText("Utrustnings ID");

        labelName.setText("Benämning");

        javax.swing.GroupLayout panelSideInnerLayout = new javax.swing.GroupLayout(panelSideInner);
        panelSideInner.setLayout(panelSideInnerLayout);
        panelSideInnerLayout.setHorizontalGroup(
            panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideInnerLayout.createSequentialGroup()
                .addGroup(panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSideInnerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEquipmentID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelType, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelSideInnerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelSideInnerLayout.createSequentialGroup()
                                .addGroup(panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDate)
                                    .addComponent(labelAgent)
                                    .addComponent(labelEqInfo)
                                    .addComponent(labelName))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelSideInnerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtEqInfo))
                    .addGroup(panelSideInnerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDate))
                    .addGroup(panelSideInnerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtName))
                    .addGroup(panelSideInnerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtEquipmentID)))
                .addContainerGap())
        );
        panelSideInnerLayout.setVerticalGroup(
            panelSideInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEquipmentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEquipmentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEqInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEqInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSideLayout = new javax.swing.GroupLayout(panelSide);
        panelSide.setLayout(panelSideLayout);
        panelSideLayout.setHorizontalGroup(
            panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelSideInner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSideLayout.setVerticalGroup(
            panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelSideInner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        panelBottom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTypeBottom.setText("Typ");

        cbTypeBottom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapen", "Kommunikation", "Teknik" }));
        cbTypeBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeBottomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBottomLayout = new javax.swing.GroupLayout(panelBottom);
        panelBottom.setLayout(panelBottomLayout);
        panelBottomLayout.setHorizontalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTypeBottom)
                    .addComponent(cbTypeBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        panelBottomLayout.setVerticalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTypeBottom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTypeBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnListEquipment.setText("Lista all Utrustning");
        btnListEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListEquipmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(labelLogo)
                        .addGap(6, 6, 6)
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegNewEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListEquipment)
                    .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelLogo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListEquipment)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegNewEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emptyInputs() {
        txtAreaMain.setText("");
        txtSearch.setText("");
        txtEquipmentID.setText("");
        txtName.setText("");
        txtDate.setText("");
        txtEqInfo.setText("");
        cbType.setSelectedIndex(-1);
        cbAgent.setSelectedIndex(-1);
        cbTypeBottom.setSelectedIndex(-1);
    }

    private void fillCbs() {

        //Hämtar och fyllar i alla Agenter i samtliga comboboxes.
        cbAgent.addItem("Ej utlånad");
        String queryAgent = "SELECT Namn FROM AGENT;";
        ArrayList<String> names = new ArrayList<>();
        try {
            names = idb.fetchColumn(queryAgent);

            for (String name : names) {
                cbAgent.addItem(name);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }
        cbAgent.setSelectedIndex(-1);
        cbType.setSelectedIndex(-1);
        cbTypeBottom.setSelectedIndex(-1);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        AdminWindow adminwindow = new AdminWindow(idb);
        adminwindow.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnListEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListEquipmentActionPerformed
        txtAreaMain.setText("");
        ArrayList<HashMap<String, String>> equipments = new ArrayList<HashMap<String, String>>();
        ArrayList<String> datesID;
        try {
            String query = "SELECT * FROM UTRUSTNING;";

            equipments = idb.fetchRows(query);
            datesID = idb.fetchColumn("SELECT UTRUSTNINGS_ID FROM INNEHAR_UTRUSTNING");

            for (HashMap<String, String> equipment : equipments) {
                txtAreaMain.append("Utrustnings ID: " + equipment.get("UTRUSTNINGS_ID") + "\n");
                txtAreaMain.append("Namn: " + equipment.get("BENAMNING") + "\n");
                for (int i = 0; i < datesID.size(); i++) {
                    int id = Integer.parseInt(datesID.get(i));
                    int ids = Integer.parseInt(equipment.get("UTRUSTNINGS_ID"));
                    if (id == ids) {
                        txtAreaMain.append("Utkvitterings Datum: " + idb.fetchSingle("SELECT UTKVITTERINGSDATUM FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID = " + "'" + ids + "'") + "\n");
                        txtAreaMain.append("Utlånad till: " + idb.fetchSingle("SELECT NAMN FROM AGENT WHERE AGENT_ID = (SELECT AGENT_ID FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID = " + "'" + ids + "')") + "\n");
                    }
                }
                txtAreaMain.append("--------------------------------------------------------" + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!" + e);
        }
    }//GEN-LAST:event_btnListEquipmentActionPerformed

    private void cbTypeBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeBottomActionPerformed
        txtAreaMain.setText("");

        try {
            String cbChoice = cbTypeBottom.getSelectedItem().toString();
            String query = "SELECT * FROM UTRUSTNING WHERE UTRUSTNINGS_ID IN (SELECT UTRUSTNINGS_ID FROM " + cbChoice + ");";
            ArrayList<HashMap<String, String>> equipments = idb.fetchRows(query);
            ArrayList<String> datesID = idb.fetchColumn("SELECT UTRUSTNINGS_ID FROM INNEHAR_UTRUSTNING");

            for (HashMap<String, String> equipment : equipments) {
                txtAreaMain.append("Utrustnings ID: " + equipment.get("UTRUSTNINGS_ID") + "\n");
                txtAreaMain.append("Namn: " + equipment.get("BENAMNING") + "\n");
                for (int i = 0; i < datesID.size(); i++) {
                    int id = Integer.parseInt(datesID.get(i));
                    int ids = Integer.parseInt(equipment.get("UTRUSTNINGS_ID"));
                    if (id == ids) {
                        txtAreaMain.append("Utkvitterings Datum: " + idb.fetchSingle("SELECT UTKVITTERINGSDATUM FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID = " + "'" + ids + "'") + "\n");
                        txtAreaMain.append("Utlånad till: " + idb.fetchSingle("SELECT NAMN FROM AGENT WHERE AGENT_ID = (SELECT AGENT_ID FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID = " + "'" + ids + "')") + "\n");
                    }
                }
                txtAreaMain.append("--------------------------------------------------------" + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!" + e);
        } catch (java.lang.NullPointerException e) {
            //txtAreaMain.setText("");
            //txtAreaMain.setText("Inga aliens hittades!");
        }
    }//GEN-LAST:event_cbTypeBottomActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (Validation.isNotEmpty(txtSearch)) {

            String searchEquipment = txtSearch.getText();

            try {
                //Hämtar ID
                String equipmentid = idb.fetchSingle("SELECT UTRUSTNINGS_ID FROM UTRUSTNING WHERE BENAMNING = " + "'" + searchEquipment + "'");
                txtEquipmentID.setText(equipmentid);
                int equipmentID = Integer.parseInt(equipmentid);

                //Hämtar Namn
                String name = idb.fetchSingle("SELECT BENAMNING FROM UTRUSTNING WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "'");
                txtName.setText(name);

                //Hämtar Kvittdatum
                String kvittDate = idb.fetchSingle("SELECT UTKVITTERINGSDATUM FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "'");
                txtDate.setText(kvittDate);

                //Hämtar Plats
                String location = idb.fetchSingle("SELECT BENAMNING FROM PLATS WHERE PLATS_ID = (SELECT PLATS FROM ALIEN WHERE ALIEN_ID = " + "'" + equipmentID + "')");
                cbType.setSelectedItem(location);

                //Hämtar Typ
                String vapen = idb.fetchSingle("SELECT UTRUSTNINGS_ID FROM VAPEN WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "'");
                String kaliber = idb.fetchSingle("SELECT KALIBER FROM VAPEN WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "'");
                String kommunikation = idb.fetchSingle("SELECT UTRUSTNINGS_ID FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "'");
                String overforingsteknik = idb.fetchSingle("SELECT OVERFORINGSTEKNIK FROM KOMMUNIKATION WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "'");
                String teknik = idb.fetchSingle("SELECT UTRUSTNINGS_ID FROM TEKNIK WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "'");
                String kraftkalla = idb.fetchSingle("SELECT KRAFTKALLA FROM TEKNIK WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "'");

                if (vapen != null) {
                    cbType.setSelectedItem("Vapen");
                    txtEqInfo.setText(kaliber);
                } else if (kommunikation != null) {
                    cbType.setSelectedItem("Kommunikation");
                    txtEqInfo.setText(overforingsteknik);
                } else if (teknik != null) {
                    cbType.setSelectedItem("Teknik");
                    txtEqInfo.setText(kraftkalla);
                }

                //Hämtar Agent
                String agent = idb.fetchSingle("SELECT NAMN FROM AGENT WHERE AGENT_ID = (SELECT AGENT_ID FROM INNEHAR_UTRUSTNING WHERE UTRUSTNINGS_ID = " + "'" + equipmentID + "')");
                cbAgent.setSelectedItem(agent);
                if (agent != null) {
                    cbAgent.setSelectedItem(agent);
                } else {
                    cbAgent.setSelectedItem("Ej utlånad");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Utrustningen hittades inte!");
                txtSearch.setText("");
                txtSearch.requestFocus();
            }

        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRegNewEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegNewEquipmentActionPerformed
        NewEquipmentWindow newequipment = new NewEquipmentWindow(idb);
        newequipment.setVisible(true);
    }//GEN-LAST:event_btnRegNewEquipmentActionPerformed

    private void cbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeActionPerformed
        try {
            String choice = cbType.getSelectedItem().toString();
            if (choice.equals("Vapen")) {
                txtEqInfo.setVisible(true);
                labelEqInfo.setVisible(true);
                labelEqInfo.setText("Kaliber");
                txtEqInfo.setText("");
            } else if (choice.equals("Kommunikation")) {
                txtEqInfo.setVisible(true);
                labelEqInfo.setVisible(true);
                labelEqInfo.setText("Typ av överföringsteknik");
                txtEqInfo.setText("");
            } else if (choice.equals("Teknik")) {
                txtEqInfo.setVisible(true);
                labelEqInfo.setVisible(true);
                labelEqInfo.setText("Typ av kraftkälla");
                txtEqInfo.setText("");
            }
        } catch (NullPointerException e) {
            //
        }
    }//GEN-LAST:event_cbTypeActionPerformed

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
            java.util.logging.Logger.getLogger(AgentWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnListEquipment;
    private javax.swing.JButton btnRegNewEquipment;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbAgent;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JComboBox<String> cbTypeBottom;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelAgent;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelEqInfo;
    private javax.swing.JLabel labelEquipment;
    private javax.swing.JLabel labelEquipmentID;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelTypeBottom;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JPanel panelSide;
    private javax.swing.JPanel panelSideInner;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea txtAreaMain;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEqInfo;
    private javax.swing.JTextField txtEquipmentID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
