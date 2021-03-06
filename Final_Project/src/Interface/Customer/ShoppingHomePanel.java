/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Book.Book;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.BookStoreEnterprise;
import Business.Enterprise.Enterprise;
import Business.Item.Item;
import Business.UserAccount.User;
import java.awt.CardLayout;
import static java.awt.Image.SCALE_DEFAULT;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author chenchen
 */
public class ShoppingHomePanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private User user;
    private BookStoreEnterprise enterprise;
    private ArrayList<Item> list;
    private boolean ifClicked = false;
    /**
     * Creates new form ShoppingHomePanel
     */
    public ShoppingHomePanel(EcoSystem system, BookStoreEnterprise enterprise, User user, javax.swing.JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.enterprise = enterprise;
        this.user = user;
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

        lbSearch = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox();
        txtNameSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lbRecom = new javax.swing.JLabel();
        lbBook2 = new javax.swing.JLabel();
        lbBook3 = new javax.swing.JLabel();
        lbBook4 = new javax.swing.JLabel();
        lbBook5 = new javax.swing.JLabel();
        lbBook6 = new javax.swing.JLabel();
        lbBook1 = new javax.swing.JLabel();
        btnBook2 = new javax.swing.JButton();
        btnBook3 = new javax.swing.JButton();
        btnBook4 = new javax.swing.JButton();
        btnBook5 = new javax.swing.JButton();
        btnBook6 = new javax.swing.JButton();
        btnBook1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lbSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSearch.setText("Searh Books: ");

        cbType.setEditable(true);

        txtNameSearch.setText("Enter Book Name");
        txtNameSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameSearchMouseClicked(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lbRecom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbRecom.setText("Recommend for you, ");

        lbBook2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbBook3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbBook4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbBook5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbBook6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbBook1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBook2.setText("jButton2");
        btnBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook2ActionPerformed(evt);
            }
        });

        btnBook3.setText("jButton2");
        btnBook3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook3ActionPerformed(evt);
            }
        });

        btnBook4.setText("jButton2");
        btnBook4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook4ActionPerformed(evt);
            }
        });

        btnBook5.setText("jButton2");
        btnBook5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook5ActionPerformed(evt);
            }
        });

        btnBook6.setText("jButton2");
        btnBook6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook6ActionPerformed(evt);
            }
        });

        btnBook1.setText("jButton2");
        btnBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook1ActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbBook4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(lbBook1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBook1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbBook6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(108, 108, 108)
                                        .addComponent(lbBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(95, 135, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBook6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 107, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRecom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnBack))
                .addGap(28, 28, 28)
                .addComponent(lbRecom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBook2)
                    .addComponent(btnBook3)
                    .addComponent(btnBook1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBook4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBook5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBook6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBook4)
                    .addComponent(btnBook5)
                    .addComponent(btnBook6))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String txtName = null;
        if(ifClicked){
            txtName = txtNameSearch.getText();
        }
        String type = (String)cbType.getSelectedItem();
        int connum = 0;
        String[] condition = new String[2];
        if((type==null) && (txtName==null||txtName.equals(""))){
            JOptionPane.showMessageDialog(null, "Please enter your Search Conditions!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if((type!=null) && (txtName!=null)&&(!txtName.equals(""))){
            connum = 2;
            condition[0] = type;
            condition[1] = txtName;
        }
        else{
            connum = 1;
            if(type==null){
                condition[0] = null;
                condition[1] = txtName;
            }
            else{
                condition[0] = type;
                condition[1] = null;
            }
        }
        rightPanel.removeAll();
        SearchItemListPanel panel = new SearchItemListPanel(system,enterprise,user,connum,condition,rightPanel);
        rightPanel.add("SearchItemListPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook2ActionPerformed
        // TODO add your handling code here:
        Item m = list.get(1);
        ViewItemPanel panel = new ViewItemPanel(system,enterprise,user,m,rightPanel);
        rightPanel.removeAll();
        rightPanel.add("ViewItemPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnBook2ActionPerformed

    private void btnBook3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook3ActionPerformed
        // TODO add your handling code here:
        Item m = list.get(2);
        ViewItemPanel panel = new ViewItemPanel(system,enterprise,user,m,rightPanel);
        rightPanel.removeAll();
        rightPanel.add("ViewItemPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnBook3ActionPerformed

    private void btnBook4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook4ActionPerformed
        // TODO add your handling code here:
        Item m = list.get(3);
        ViewItemPanel panel = new ViewItemPanel(system,enterprise,user,m,rightPanel);
        rightPanel.removeAll();
        rightPanel.add("ViewItemPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnBook4ActionPerformed

    private void btnBook5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook5ActionPerformed
        // TODO add your handling code here:
        Item m = list.get(4);
        ViewItemPanel panel = new ViewItemPanel(system,enterprise,user,m,rightPanel);
        rightPanel.removeAll();
        rightPanel.add("ViewItemPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnBook5ActionPerformed

    private void btnBook6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook6ActionPerformed
        // TODO add your handling code here:
        Item m = list.get(5);
        ViewItemPanel panel = new ViewItemPanel(system,enterprise,user,m,rightPanel);
        rightPanel.removeAll();
        rightPanel.add("ViewItemPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnBook6ActionPerformed

    private void btnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook1ActionPerformed
        // TODO add your handling code here:
        Item m = list.get(0);
        ViewItemPanel panel = new ViewItemPanel(system,enterprise,user,m,rightPanel);
        rightPanel.removeAll();
        rightPanel.add("ViewItemPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnBook1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.removeAll();
        CustomerHomePanel panel = new CustomerHomePanel(system,user,rightPanel);
        rightPanel.add("CustomerHomePanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameSearchMouseClicked
        // TODO add your handling code here:
        txtNameSearch.setText("");
        ifClicked = true;
    }//GEN-LAST:event_txtNameSearchMouseClicked

    public void showInfo(){
        cbType.removeAllItems();
        cbType.addItem(null);
        cbType.addItem("Fiction");
        cbType.addItem("Nonfiction");
        cbType.addItem("Drama");
        cbType.addItem("Poetry");
        cbType.setEditable(false);
        
        list = enterprise.getItemDirectory().getBookList();
        Collections.sort(list);
        lbRecom.setText("    Recommend for you,  "+user.getUsername()+"   - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        String[] title = new String[6];
        ImageIcon[] icon = new ImageIcon[6];
        for(int i=0;i<6;i++){
            int id = enterprise.getItemDirectory().getBookList().get(i).getBook().getBookID();
            String path = enterprise.getItemDirectory().getBookList().get(i).getPicture();
            icon[i] = new ImageIcon(path);
            icon[i].setImage(icon[i].getImage().getScaledInstance(80, 93, SCALE_DEFAULT));
            for(Book b:system.getBookDirectory().getBookList()){
                if(id == b.getBookID()){
                    title[i] =b.getTitle();
                    break;
                }
            }
        }
        btnBook1.setText(title[0]);
        btnBook2.setText(title[1]);
        btnBook3.setText(title[2]);
        btnBook4.setText(title[3]);
        btnBook5.setText(title[4]);
        btnBook6.setText(title[5]);
        
        lbBook1.setIcon(icon[0]);
        lbBook2.setIcon(icon[1]);
        lbBook3.setIcon(icon[2]);
        lbBook4.setIcon(icon[3]);
        lbBook5.setIcon(icon[4]);
        lbBook6.setIcon(icon[5]);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook1;
    private javax.swing.JButton btnBook2;
    private javax.swing.JButton btnBook3;
    private javax.swing.JButton btnBook4;
    private javax.swing.JButton btnBook5;
    private javax.swing.JButton btnBook6;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cbType;
    private javax.swing.JLabel lbBook1;
    private javax.swing.JLabel lbBook2;
    private javax.swing.JLabel lbBook3;
    private javax.swing.JLabel lbBook4;
    private javax.swing.JLabel lbBook5;
    private javax.swing.JLabel lbBook6;
    private javax.swing.JLabel lbRecom;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JTextField txtNameSearch;
    // End of variables declaration//GEN-END:variables
}
