/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportclassfeespaymentsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Hoo Jun Yi
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblReenter = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecord = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRecord1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1312, 627));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnBack.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(1133, 494, 80, 25);

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel5.setText("Password :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(860, 260, 56, 16);

        lblUsername.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblUsername);
        lblUsername.setBounds(930, 170, 211, 16);

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel6.setText("Address :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(870, 330, 48, 16);

        lblGender.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblGender);
        lblGender.setBounds(921, 232, 201, 16);

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel7.setText("Role :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(881, 205, 30, 16);

        lblRole.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblRole);
        lblRole.setBounds(921, 205, 201, 16);

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel8.setText("Contact Number :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(820, 370, 93, 16);

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel2.setText("First Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(853, 61, 62, 16);

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel11.setText("Re-enter Password :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(810, 290, 104, 16);

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(853, 114, 59, 16);

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel9.setText("Gender :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(867, 232, 44, 16);

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel4.setText("Username :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(860, 170, 58, 16);

        lblFirstName.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblFirstName);
        lblFirstName.setBounds(921, 61, 201, 16);

        lblLastName.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblLastName);
        lblLastName.setBounds(921, 114, 201, 16);

        lblPassword.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblPassword);
        lblPassword.setBounds(930, 260, 211, 16);

        lblReenter.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblReenter);
        lblReenter.setBounds(930, 290, 211, 16);

        lblAddress.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblAddress);
        lblAddress.setBounds(920, 330, 310, 16);

        lblContactNumber.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblContactNumber);
        lblContactNumber.setBounds(920, 370, 215, 16);

        tblRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "First Name", "Last Name", "Username", "Password", "Re-Enter Password", "Address", "Contact Number", "Role", "Gender", "Email Address "
            }
        ));
        tblRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRecord);
        if (tblRecord.getColumnModel().getColumnCount() > 0) {
            tblRecord.getColumnModel().getColumn(0).setMinWidth(0);
            tblRecord.getColumnModel().getColumn(0).setMaxWidth(0);
            tblRecord.getColumnModel().getColumn(5).setMinWidth(0);
            tblRecord.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jTabbedPane1.addTab("Customer", jScrollPane1);

        tblRecord1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "First Name", "Last Name", "Username", "Password", "Re-Enter Password", "Address", "Contact Number", "Role", "Gender", "Email Address"
            }
        ));
        tblRecord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecord1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRecord1);
        if (tblRecord1.getColumnModel().getColumnCount() > 0) {
            tblRecord1.getColumnModel().getColumn(0).setMinWidth(0);
            tblRecord1.getColumnModel().getColumn(0).setMaxWidth(0);
            tblRecord1.getColumnModel().getColumn(5).setMinWidth(0);
            tblRecord1.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jTabbedPane1.addTab("Coach", jScrollPane2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(23, 84, 738, 331);

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel10.setText("Email Address :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(830, 400, 79, 16);

        lblEmailAddress.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblEmailAddress);
        lblEmailAddress.setBounds(920, 400, 229, 16);

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel12.setText("View Customer & Coach Profile Page");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(23, 11, 567, 44);

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sportclassfeespaymentsystem/Best-Green-Backgrounds.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1240, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        StaffMainPage a = new StaffMainPage();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecordMouseClicked
        // TODO add your handling code here:
        int index = tblRecord.getSelectedRow();
        TableModel model = tblRecord.getModel();

        lblUsername.setText(model.getValueAt(index,3).toString());
        lblFirstName.setText(model.getValueAt(index,1).toString());
        lblLastName.setText(model.getValueAt(index,2).toString());
        lblPassword.setText(model.getValueAt(index,4).toString());
        lblReenter.setText(model.getValueAt(index,5).toString());
        lblAddress.setText(model.getValueAt(index,6).toString());
        lblRole.setText(model.getValueAt(index,8).toString());
lblEmailAddress.setText(model.getValueAt(index,10).toString());
        lblGender.setText(model.getValueAt(index,9).toString());
        lblContactNumber.setText(model.getValueAt(index,7).toString());

    }//GEN-LAST:event_tblRecordMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)tblRecord.getModel();
    String line;
    
BufferedReader reader;
    try{       

        reader = new BufferedReader(new FileReader("Login.txt"));
        while((line = reader.readLine()) != null) 
        {
            if (line.contains("Customer")) {
    // Split it.
   
    tableModel.addRow(line.split("#")); 

           
        }
        }
        reader.close();
     }
    
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "Error");
e.printStackTrace();

    }
     DefaultTableModel tableModel2 = (DefaultTableModel)tblRecord1.getModel();
    String line2;
    
BufferedReader reader2;
    try{       

        reader2 = new BufferedReader(new FileReader("Login.txt"));
        while((line2 = reader2.readLine()) != null) 
        {
            if (line2.contains("Coach")) {
    // Split it.
   
    tableModel2.addRow(line2.split("#")); 

           
        }
        }
        reader2.close();
     }
    
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "Error");
e.printStackTrace();

    }
    }//GEN-LAST:event_formWindowOpened

    private void tblRecord1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecord1MouseClicked
        // TODO add your handling code here:
        int index = tblRecord1.getSelectedRow();
        TableModel model = tblRecord1.getModel();

        lblUsername.setText(model.getValueAt(index,3).toString());
        lblFirstName.setText(model.getValueAt(index,1).toString());
        lblLastName.setText(model.getValueAt(index,2).toString());
        lblPassword.setText(model.getValueAt(index,4).toString());
        lblReenter.setText(model.getValueAt(index,5).toString());
        lblAddress.setText(model.getValueAt(index,6).toString());
        lblRole.setText(model.getValueAt(index,8).toString());
lblEmailAddress.setText(model.getValueAt(index,10).toString());
        lblGender.setText(model.getValueAt(index,9).toString());
        lblContactNumber.setText(model.getValueAt(index,7).toString());

    }//GEN-LAST:event_tblRecord1MouseClicked

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblReenter;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblRecord;
    private javax.swing.JTable tblRecord1;
    // End of variables declaration//GEN-END:variables
}