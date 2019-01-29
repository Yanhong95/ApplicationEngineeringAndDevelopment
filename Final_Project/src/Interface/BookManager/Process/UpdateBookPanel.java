/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.BookManager.Process;

import Business.Book.Book;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yanhongchen
 */
public class UpdateBookPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateBookPanel
     */
    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private Book book;
    public UpdateBookPanel(EcoSystem system, Book b, JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.rightPanel = rightPanel;
        this.book = b;
        bookAuthorTxt.setText(b.getAuthor());
        imagePathLabel.setText(b.getPicture());
        ImageIcon icon= new ImageIcon(b.getPicture());
        icon.setImage(icon.getImage().getScaledInstance(85, 100, Image.SCALE_DEFAULT));
        bookImageLabel.setIcon(icon);
        bookNameTxt.setText(b.getTitle());
        descriptionTextArea.setText(b.getDescription());     
    }
    public  void  copyFile(String  oldPath,  String  newPath)  {  
       try  {   
           int  byteread  =  0;  
           File  oldfile  =  new  File(oldPath);  
           if  (oldfile.exists())  {    
               InputStream  inStream  =  new  FileInputStream(oldPath);   
               FileOutputStream  fs  =  new  FileOutputStream(newPath);  
               byte[]  buffer  =  new  byte[1444];  
               while  (  (byteread  =  inStream.read(buffer))  !=  -1)  {   
                   fs.write(buffer,  0,  byteread);  
               }  
               inStream.close();  
           }  
       }  
       catch  (Exception  e)  {  
           System.out.println("copy error");  
           e.printStackTrace();  
       }  
 
   } 
    public  ArrayList<String> checkImageName(){
        ArrayList<String> files = new ArrayList<String>();
        File file = new File("ItemPictures");
        File[] tempList = file.listFiles();
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i].toString());
            }
        }
        return files;
    }
    
    public void deleteImage(String imagePath){
        try{
            File file = new File(imagePath);
            if(file.delete()){
                System.out.println(file.getName() + " deleted successfully！");
            }else{
                System.out.println("File deletion failed！");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bookNameTxt = new javax.swing.JTextField();
        bookAuthorTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        returnBtn = new javax.swing.JButton();
        updateBookBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        updateImagePathBtn = new javax.swing.JButton();
        bookImageLabel = new javax.swing.JLabel();
        imagePathLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Update Book");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 130, 45));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Book  Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Book  Author:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("Book Description:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 30));

        bookNameTxt.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        bookNameTxt.setDragEnabled(false);
        add(bookNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 310, -1));

        bookAuthorTxt.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        bookAuthorTxt.setDragEnabled(false);
        add(bookAuthorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 310, -1));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setEnabled(false);
        jScrollPane1.setViewportView(descriptionTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 310, 160));

        returnBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        returnBtn.setText("<<Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 160, -1));

        updateBookBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        updateBookBtn.setText("Update Book");
        updateBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookBtnActionPerformed(evt);
            }
        });
        add(updateBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 170, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Book  Image Path:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 130, 30));

        updateImagePathBtn.setText("Update Image Path");
        updateImagePathBtn.setEnabled(false);
        updateImagePathBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateImagePathBtnActionPerformed(evt);
            }
        });
        add(updateImagePathBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 30));

        bookImageLabel.setBackground(new java.awt.Color(102, 102, 102));
        bookImageLabel.setForeground(new java.awt.Color(153, 153, 153));
        bookImageLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Image: "));
        add(bookImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 130));

        imagePathLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imagePathLabel.setText("Please click 'add image path' buttom.");
        add(imagePathLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 200, 30));

        saveBtn.setText("Save Book");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 390, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EnterpriseBookListPanel applicationBookListPanel = (EnterpriseBookListPanel) component;
        applicationBookListPanel.refreshTable();
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_returnBtnActionPerformed

    private void updateBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookBtnActionPerformed
        // TODO add your handling code here:
        bookAuthorTxt.setEnabled(true);
        bookNameTxt.setEnabled(true);
        descriptionTextArea.setEnabled(true);
        updateImagePathBtn.setEnabled(true);
        saveBtn.setEnabled(true);
        updateBookBtn.setEnabled(false);
    }//GEN-LAST:event_updateBookBtnActionPerformed

    private void updateImagePathBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateImagePathBtnActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = chooser.showOpenDialog(null);
        if(i == chooser.APPROVE_OPTION){
            String imagePath = chooser.getSelectedFile().getAbsolutePath();
            String imageName = chooser.getSelectedFile().getName();
            String finalImagePath = "ItemPictures/" + imageName;
            ArrayList<String> imageNameList = checkImageName();
            if(imageNameList.contains(finalImagePath)){
                JOptionPane.showMessageDialog(null, "This image name already exists. Please change the image name and reselect");
                imagePathLabel.setText("Please click 'add image Path' buttom.");
                return;
            }else{
                copyFile(imagePath,finalImagePath);
                imagePathLabel.setText(finalImagePath);
                ImageIcon icon= new ImageIcon(finalImagePath);
                icon.setImage(icon.getImage().getScaledInstance(85, 100, Image.SCALE_DEFAULT));
                bookImageLabel.setIcon(icon);
                deleteImage(book.getPicture());
            }
        }
        else{
        System.out.println("unable to find out");
        }
    }//GEN-LAST:event_updateImagePathBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if(bookAuthorTxt.getText().isEmpty()||bookNameTxt.getText().isEmpty()
            || descriptionTextArea.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Empty content, Please reupdate!");
            return;
        }
         
        book.setAuthor(bookAuthorTxt.getText());
        book.setTitle(bookNameTxt.getText());
        book.setDescription(descriptionTextArea.getText());
        book.setPicture(imagePathLabel.getText());
        JOptionPane.showMessageDialog(null, "Book upgrade success");
        dB4OUtil.storeSystem(system);
        bookAuthorTxt.setEnabled(false);
        bookNameTxt.setEnabled(false);
        descriptionTextArea.setEnabled(false);
        updateImagePathBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        updateBookBtn.setEnabled(true);
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookAuthorTxt;
    private javax.swing.JLabel bookImageLabel;
    private javax.swing.JTextField bookNameTxt;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel imagePathLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBookBtn;
    private javax.swing.JButton updateImagePathBtn;
    // End of variables declaration//GEN-END:variables
}