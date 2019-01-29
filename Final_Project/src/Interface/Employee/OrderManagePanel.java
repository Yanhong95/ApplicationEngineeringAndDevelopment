/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Employee;

import Business.Address.Address;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.Role.Customer;
import Business.UserAccount.User;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenchen
 */
public class OrderManagePanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private Employee employee;
    private SalesOrganization organization;
    private ArrayList<Order> unList;
    /**
     * Creates new form OrderManagePanel
     */
    public OrderManagePanel(EcoSystem system, Employee employee, javax.swing.JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.employee = employee;
        this.organization = (SalesOrganization)employee.getOrg();
        this.rightPanel = rightPanel;
        showInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHistory = new javax.swing.JButton();
        btnShip = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        lbItems = new javax.swing.JLabel();
        cbItems = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lbAddr = new javax.swing.JLabel();
        lbTop = new javax.swing.JLabel();
        txtAddr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrder = new javax.swing.JTable();
        btnDetail = new javax.swing.JButton();

        btnHistory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHistory.setText("History >>");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnShip.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnShip.setText("Ship Order");
        btnShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShipActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        lbID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbID.setText("Order ID: ");

        lbItems.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbItems.setText("Order Items: ");

        cbItems.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbAddr.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbAddr.setText("Order Address: ");

        lbTop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTop.setText("Order in Process");

        txtAddr.setEditable(false);
        txtAddr.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        tbOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Date", "Item Number", "Cost", "Customer", "Status"
            }
        ));
        jScrollPane1.setViewportView(tbOrder);

        btnDetail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDetail.setText("Check Details");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbAddr, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbItems)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbItems, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lbTop, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistory))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnShip, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lbTop, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistory))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetail)
                    .addComponent(btnShip))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbItems)
                    .addComponent(cbItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddr)
                    .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
        FinishedOrderManagePanel panel = new FinishedOrderManagePanel(system,employee,rightPanel);
        rightPanel.add("FinishedOrderManagePanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShipActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbOrder.getSelectedRow();
        Order selectedItem;
        if(selectedRow>=0){
            selectedItem = (Order) tbOrder.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an order!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }

        selectedItem.setStatus("Shipped");
        dB4OUtil.storeSystem(system);
        showInfo();
    }//GEN-LAST:event_btnShipActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbOrder.getSelectedRow();
        Order selectedItem;
        if(selectedRow>=0){
            selectedItem = (Order) tbOrder.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an order!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtID.setText(String.valueOf(selectedItem.getOrderID()));
        cbItems.removeAllItems();
        for(OrderItem oi : selectedItem.getOrderItemList()){
            cbItems.addItem(oi);
        }
        Address ad = selectedItem.getAddress();
        txtAddr.setText(ad.getStreet()+", "+ad.getCity()+", "+ad.getState()+", "+ad.getZip());
    }//GEN-LAST:event_btnDetailActionPerformed

    public void showInfo(){
        unList = new ArrayList<>();
        if(organization.getOrderList().size()<1){
            lbTop.setText("There is no Order in process in "+organization);
            return;
        }
        for(Order o : organization.getOrderList()){
            if(!o.getStatus().equals("Finished")){
                unList.add(o);
            }
        }
        DefaultTableModel dtm = (DefaultTableModel) tbOrder.getModel();
        dtm.setRowCount(0);
        if(unList.size()<1){
            lbTop.setText("There is no Order in process in "+organization);
        }
        else{
            lbTop.setText(unList.size()+" Orders in process");
            for(Order or : unList){
                Object row[] = new Object[5];
                row[0] = or;
                row[1] = or.getOrderItemList().size();
                row[2] = or.getTotalPrice();
                row[3] = or.getCustomerID();
                row[4] = or.getStatus();
                dtm.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnShip;
    private javax.swing.JComboBox cbItems;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAddr;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbItems;
    private javax.swing.JLabel lbTop;
    private javax.swing.JTable tbOrder;
    private javax.swing.JTextField txtAddr;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}