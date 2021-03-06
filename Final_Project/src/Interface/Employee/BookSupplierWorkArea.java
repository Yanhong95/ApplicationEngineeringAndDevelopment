/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Employee;

import Business.EcoSystem;
import Business.Employee.Employee;
import Interface.Sales.Process.AddItemPanel;
import Interface.Sales.Process.BookStoreItemListPanel;
import Interface.Sales.Process.BookStoreSecondHandItemListPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chenchen
 */
public class BookSupplierWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form BookSupplierWorkArea
     */
    private javax.swing.JPanel rightPanel;
    private EcoSystem system;
    private Employee employee;
    public BookSupplierWorkArea(EcoSystem system, Employee employee, JPanel rightPanel) {
        initComponents();
        this.employee=employee;
        this.system=system;
        this.rightPanel=rightPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        btnInventory = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Love Read Application System");
        lbTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnInventory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnInventory.setText("New items Inventory Management");
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOrder.setText("Order Directory Management");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("SecondHand Items Directory Management");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                        .addComponent(btnInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        // TODO add your handling code here:BookStoreItemListPanel
        BookStoreItemListPanel panel = new BookStoreItemListPanel(system,employee,rightPanel);
        rightPanel.add("BookStoreItemListPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
        
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        OrderManagePanel panel = new OrderManagePanel(system,employee,rightPanel);
        rightPanel.add("OrderManagePanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BookStoreSecondHandItemListPanel panel = new BookStoreSecondHandItemListPanel(system,employee,rightPanel);
        rightPanel.add("BookStoreSecondHandItemListPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
