/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliners;

import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yanhongchen
 */
public class AgencyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AgencyWorkAreaJPanel
     */
    JPanel userProcessContainer;
    AirlinerDirectory airlinerDirectory;
    public AgencyWorkAreaJPanel(JPanel userProcessContainer, AirlinerDirectory airlinerDirectory) {
         initComponents();
         this.airlinerDirectory=airlinerDirectory;
         this.userProcessContainer=userProcessContainer;
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageAirlinerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAirlinerBtn.setText("Manage       Airliner");
        manageAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerBtnActionPerformed(evt);
            }
        });
        add(manageAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 135, 255, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Travel Agency Manage Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 76, -1, 28));
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerBtnActionPerformed
        // TODO add your handling code here:
        ManageAirlinerJPanel majp = new ManageAirlinerJPanel(userProcessContainer,airlinerDirectory);
        userProcessContainer.add(" ManageAirlinerJPanel",majp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageAirlinerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}