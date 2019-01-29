/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Sales.Process;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.DB4OUtil.DB4OUtil;
import Business.Item.Item;

/**
 *
 * @author yanhongchen
 */
public class UpdateItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBookPanel
     */
    
    private EcoSystem system;
    private JPanel rightPanel;
    private Item item;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public UpdateItemPanel(EcoSystem system, Item i, JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.item = i;
        this.rightPanel = rightPanel;
        BookNameLable.setText(i.getBook().getTitle());
        ItemPriceTxt.setText(String.valueOf(i.getPrice()));
        ItemQuantityTxt.setText(String.valueOf(i.getQuantity()));
        desArea.setText(i.getDescription());
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ItemPriceTxt = new javax.swing.JTextField();
        ItemQuantityTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BookNameLable = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desArea = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Update Item");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 57, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Item Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 175, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Item Description:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 160, -1));

        ItemPriceTxt.setDragEnabled(false);
        ItemPriceTxt.setEnabled(false);
        add(ItemPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 233, 152, -1));

        ItemQuantityTxt.setEnabled(false);
        ItemQuantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemQuantityTxtActionPerformed(evt);
            }
        });
        add(ItemQuantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 174, 152, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Book Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 118, -1, -1));

        BookNameLable.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BookNameLable.setText("<Book Name>");
        add(BookNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 118, -1, -1));

        returnBtn.setText("<<Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 99, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 94, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Item Price:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 234, -1, -1));

        desArea.setColumns(20);
        desArea.setRows(5);
        desArea.setEnabled(false);
        jScrollPane1.setViewportView(desArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ItemQuantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemQuantityTxtActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_ItemQuantityTxtActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BookStoreItemListPanel bookStoreBookListPanel = (BookStoreItemListPanel) component;
        bookStoreBookListPanel.refreshTable();
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_returnBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        desArea.setEnabled(true);
        ItemPriceTxt.setEnabled(true);
        ItemQuantityTxt.setEnabled(true);
        updateBtn.setEnabled(false);
        saveBtn.setEnabled(true);     
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try{
           Double.parseDouble(ItemPriceTxt.getText());  
           Integer.parseInt(ItemQuantityTxt.getText()); 
        }
        catch(NumberFormatException e){    
            JOptionPane.showMessageDialog(null, "The bookPrice and bookQuantity of the item must be number !");  
            return;
        }
        item.setDescription(desArea.getText());
        item.setPrice(Double.valueOf(ItemPriceTxt.getText()));
        item.setQuantity(Integer.valueOf(ItemQuantityTxt.getText()));
        JOptionPane.showMessageDialog(null, "This item  successfully update", "Warning", JOptionPane.INFORMATION_MESSAGE);
        dB4OUtil.storeSystem(system);
        desArea.setEnabled(false);
        ItemPriceTxt.setEnabled(false);
        ItemQuantityTxt.setEnabled(false);
        updateBtn.setEnabled(true);
        saveBtn.setEnabled(false); 
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookNameLable;
    private javax.swing.JTextField ItemPriceTxt;
    private javax.swing.JTextField ItemQuantityTxt;
    private javax.swing.JTextArea desArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}