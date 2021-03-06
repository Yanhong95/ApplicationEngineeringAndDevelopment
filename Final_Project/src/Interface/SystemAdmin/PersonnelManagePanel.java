/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.Administrator;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenchen
 */
public class PersonnelManagePanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private Network network;
    private Enterprise enterprise;
    /**
     * Creates new form PersonnelManagePanel
     */
    public PersonnelManagePanel(EcoSystem system, javax.swing.JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.rightPanel = rightPanel;
        this.network = null;
        this.enterprise = null;
        cbNet.removeAllItems();
        cbEnter.removeAllItems();
        cbNet.addItem(null);
        cbEnter.addItem(null);
        for(Network n : system.getNetworkList()){
            cbNet.addItem(n);
        }
        populateTable(network,enterprise);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbNet = new javax.swing.JComboBox();
        lbNet = new javax.swing.JLabel();
        lbEnter = new javax.swing.JLabel();
        cbEnter = new javax.swing.JComboBox();
        btnSelect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAdmin = new javax.swing.JTable();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbPwd = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        cbNet.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNetActionPerformed(evt);
            }
        });

        lbNet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbNet.setText("Network: ");

        lbEnter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbEnter.setText("Enterprise:");

        cbEnter.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btnSelect.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        tbAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Enterprise", "Network"
            }
        ));
        jScrollPane1.setViewportView(tbAdmin);

        lbName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbName.setText("Username: ");

        lbPwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbPwd.setText("Password: ");

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add New Administrator");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRemove.setText("Remove Administrator");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNet, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNet, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNet)
                    .addComponent(lbEnter)
                    .addComponent(cbEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPwd)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnBack))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        network = (Network)cbNet.getSelectedItem();
        enterprise = (Enterprise)cbEnter.getSelectedItem();
        populateTable(network,enterprise);
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(network==null || enterprise==null){
            JOptionPane.showMessageDialog(null, "Please select network and enterprise!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String uname = txtName.getText();
        if(uname==null || uname.equals("")){
            JOptionPane.showMessageDialog(null, "The Name of admin can not be empty!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        char[] passwordCharArray = txtPwd.getPassword();
        String password = String.valueOf(passwordCharArray);
        if(password==null || password.equals("")){
            JOptionPane.showMessageDialog(null, "The Password of admin can not be empty!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        long id = getGenerateID();
        Administrator admin = new Administrator(id,uname,password);
        admin.setType("administrator");
        admin.setEnterprise(enterprise);
        enterprise.getAdminList().add(admin);
        system.getUserAccountDirectory().getUserAccountList().add(admin);
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Create Admin Successfully\nNew Admin ID is "+id);
        System.out.println(id);
        populateTable(network,enterprise);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbAdmin.getSelectedRow();
        Administrator selectedItem;
        if(selectedRow>=0){
            selectedItem = (Administrator) tbAdmin.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an admin!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Enterprise et = (Enterprise)tbAdmin.getValueAt(selectedRow, 2);
        et.getAdminList().remove(selectedItem);
        system.getUserAccountDirectory().getUserAccountList().remove(selectedItem);
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Remove Admin Successfully");
        populateTable(network,enterprise);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void cbNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNetActionPerformed
        // TODO add your handling code here:
        network = (Network)cbNet.getSelectedItem();
        if(network == null){
            return;
        }
        cbEnter.removeAllItems();
        cbEnter.addItem(null);
        for(Enterprise en : network.getEnterpriseDirectory().getEnterpriseList()){
            cbEnter.addItem(en);
        }
    }//GEN-LAST:event_cbNetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SystemAdminOverviewPanel panel = new SystemAdminOverviewPanel(system,rightPanel);
        rightPanel.add("SystemAdminOverviewPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    public void populateTable(Network net, Enterprise ent){
        DefaultTableModel dtm = (DefaultTableModel) tbAdmin.getModel();
        dtm.setRowCount(0);
        if(net == null || ent == null){
            for(Network nw : system.getNetworkList()){
                for(Enterprise ep : nw.getEnterpriseDirectory().getEnterpriseList()){
                    if(ep.getAdminList().size()>0){
                        for(Administrator ad : ep.getAdminList()){
                            Object row[] = new Object[4];
                            row[0] = ad;
                            row[1] = ad.getUsername();
                            row[2] = ep;
                            row[3] = nw;
                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
        else{
            for(Administrator ad : ent.getAdminList()){
                Object row[] = new Object[4];
                row[0] = ad;
                row[1] = ad.getUsername();
                row[2] = ent;
                row[3] = net;
                dtm.addRow(row);
            }
        }
    }
    
    public static Long getGenerateID(){
        int num = 6;    
        String numStr = "";
        for(int i = 0; i < num; i++){
            numStr += (int)(10*(Math.random()));
        }
         
        Long id = Long.valueOf(numStr);
        return id;
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox cbEnter;
    private javax.swing.JComboBox cbNet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEnter;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNet;
    private javax.swing.JLabel lbPwd;
    private javax.swing.JTable tbAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}
