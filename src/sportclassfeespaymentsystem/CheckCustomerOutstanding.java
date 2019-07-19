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
public class CheckCustomerOutstanding extends javax.swing.JFrame {

    /**
     * Creates new form CheckCustomerOutstanding
     */
    public CheckCustomerOutstanding() {
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
        btnBack = new javax.swing.JButton();
        lblCharges = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSport = new javax.swing.JTable();
        lblCN = new javax.swing.JLabel();
        lblSportName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCoachName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblExpiredDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1304, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel1.setText("Check Customer Outstanding");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 11, 480, 44);

        btnBack.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(1160, 460, 90, 40);

        lblCharges.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblCharges);
        lblCharges.setBounds(140, 490, 103, 16);

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel6.setText("Sport Charges :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 490, 80, 16);

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel4.setText("Customer Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(39, 431, 90, 16);

        lblStatus.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        getContentPane().add(lblStatus);
        lblStatus.setBounds(580, 410, 464, 58);

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel10.setText("Status :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 420, 121, 44);

        tblSport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Coach Name", "Customer Name", "Sport Name", "Sport Charges", "Day Of The Week", "Time", "Week Date", "Status", "Expired Date"
            }
        ));
        tblSport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSportMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSport);
        if (tblSport.getColumnModel().getColumnCount() > 0) {
            tblSport.getColumnModel().getColumn(0).setMinWidth(0);
            tblSport.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(19, 84, 1154, 303);

        lblCN.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblCN);
        lblCN.setBounds(135, 431, 103, 16);

        lblSportName.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblSportName);
        lblSportName.setBounds(130, 520, 103, 16);

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel5.setText("Sport Name :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 520, 69, 16);

        lblCoachName.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        getContentPane().add(lblCoachName);
        lblCoachName.setBounds(150, 460, 103, 16);

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel7.setText("Coach Name :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 460, 71, 16);

        lblExpiredDate.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        getContentPane().add(lblExpiredDate);
        lblExpiredDate.setBounds(610, 470, 464, 58);

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel11.setText("Exipred Date :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(370, 480, 220, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sportclassfeespaymentsystem/Best-Green-Backgrounds.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -56, 1330, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CouchMainPage a = new CouchMainPage();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblSportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSportMouseClicked
        // TODO add your handling code here:
        int index = tblSport.getSelectedRow();
        TableModel model = tblSport.getModel();
lblCoachName.setText(model.getValueAt(index,1).toString());
        lblSportName.setText(model.getValueAt(index,3).toString());
        lblCharges.setText(model.getValueAt(index,4).toString());
        lblCN.setText(model.getValueAt(index,2).toString());
        lblStatus.setText(model.getValueAt(index,8).toString());
lblExpiredDate.setText(model.getValueAt(index,9).toString());
    }//GEN-LAST:event_tblSportMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)tblSport.getModel();
    String line;
    
BufferedReader reader;
    try{       

        reader = new BufferedReader(new FileReader("Customer.txt"));
        while((line = reader.readLine()) != null) 
        {
           if (line.contains(Login.name)) {
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
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CheckCustomerOutstanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckCustomerOutstanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckCustomerOutstanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckCustomerOutstanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckCustomerOutstanding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCN;
    private javax.swing.JLabel lblCharges;
    private javax.swing.JLabel lblCoachName;
    private javax.swing.JLabel lblExpiredDate;
    private javax.swing.JLabel lblSportName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblSport;
    // End of variables declaration//GEN-END:variables
}
