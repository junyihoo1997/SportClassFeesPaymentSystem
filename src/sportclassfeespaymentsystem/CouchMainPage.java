/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportclassfeespaymentsystem;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import static java.time.temporal.TemporalQueries.localDate;
import java.time.temporal.WeekFields;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoo Jun Yi
 */
public class CouchMainPage extends javax.swing.JFrame {
    /**
     * Creates new form CouchMainPage
     */
    public CouchMainPage() {
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
        btnCheckCO = new javax.swing.JButton();
        btnUploadSport = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnUploadSport1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Coach Main Page");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 59);

        btnCheckCO.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnCheckCO.setText("Check Customer Outstanding");
        btnCheckCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckCOActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckCO);
        btnCheckCO.setBounds(40, 110, 270, 25);

        btnUploadSport.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnUploadSport.setText("Upload Details Of Sports");
        btnUploadSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadSportActionPerformed(evt);
            }
        });
        getContentPane().add(btnUploadSport);
        btnUploadSport.setBounds(40, 200, 270, 25);

        btnLogout.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(630, 390, 90, 50);

        btnUploadSport1.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnUploadSport1.setText("Modify or Delete  Details Of Sports");
        btnUploadSport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadSport1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUploadSport1);
        btnUploadSport1.setBounds(40, 280, 270, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sportclassfeespaymentsystem/Muziek-Beweegt.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckCOActionPerformed
        // TODO add your handling code here:
        CheckCustomerOutstanding a = new CheckCustomerOutstanding();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCheckCOActionPerformed

    private void btnUploadSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadSportActionPerformed
        // TODO add your handling code here:
        UploadDetailsOfSport b = new UploadDetailsOfSport();
        b.setVisible(true);
        dispose();


    }//GEN-LAST:event_btnUploadSportActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int J = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?","Log Out",JOptionPane.YES_NO_OPTION);
        if(J==0){
            Login e = new Login();
            e.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUploadSport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadSport1ActionPerformed
        // TODO add your handling code here:
        ModifySport f = new ModifySport();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUploadSport1ActionPerformed

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
            java.util.logging.Logger.getLogger(CouchMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CouchMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CouchMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CouchMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CouchMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckCO;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUploadSport;
    private javax.swing.JButton btnUploadSport1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
