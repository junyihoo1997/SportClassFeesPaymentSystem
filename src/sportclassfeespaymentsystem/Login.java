/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportclassfeespaymentsystem;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoo Jun Yi
 */
public class Login extends javax.swing.JFrame {
    public static String name;

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 550));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 130, 58, 16);

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 250, 56, 16);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(670, 250, 112, 20);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(680, 130, 112, 20);

        btnLogin.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(600, 340, 80, 25);

        btnCancel.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(740, 340, 80, 25);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 110, 0, 203);

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(650, 40, 112, 44);

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sport Class Fees Payment System");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 30, 360, 44);

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sportclassfeespaymentsystem/couple.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1180, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        try
{


FileReader input=new FileReader("Login.txt");
BufferedReader output = new BufferedReader(input);
String code;
int flag=0;
while((code=output.readLine())!=null)
{
    
if (code.contains("#")) {
    // Split it.
    String[] parts = code.split("#");


String part1 = parts[1]; 
String part2 = parts[2];
String part3 = parts[3];
String part4 = parts[4];
String part5 = parts[5];
String part6 = parts[6];
String part7 = parts[7];
String part8 = parts[8];
String part9 = parts[9];


String UN = txtUsername.getText();
String Pass = new String(txtPassword.getPassword());
if (UN.equals(part3) && Pass.equals(part4))
{
    flag=1;
    
    if("Customer".equals(part8))
    {
        CustomerMainPage i = new CustomerMainPage();
        i.setVisible(true);
        dispose();
        Login.name= part1;
    }
    else if("Coach".equals(part8)){
    CouchMainPage o = new CouchMainPage();
    o.setVisible(true);
    dispose();
    Login.name= part1;
}
    else if("Staff".equals(part8)){
    StaffMainPage p = new StaffMainPage();
    p.setVisible(true);
    dispose();
    Login.name= part1;
    
}
    break;
}


} 
}
if (flag==0){
    JOptionPane.showMessageDialog(this,"Username and password is not match!","Login Error",JOptionPane.ERROR_MESSAGE);
}
input.close();
}
catch(IOException ioe)
{
	ioe.printStackTrace();	
	System.out.println("Error");
}
        
       
        
    }//GEN-LAST:event_btnLoginActionPerformed

   
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
