/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi.simpan.pinjam;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author mafia
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class admin extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        config DB = new config();
        DB.config();
        con = DB.con;
        stat = DB.stm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel212 = new javax.swing.JPanel();
        ID_admin = new javax.swing.JTextField();
        sa111 = new javax.swing.JLabel();
        jLabel1111 = new javax.swing.JLabel();
        jLabel3212 = new javax.swing.JLabel();
        pwd_admin = new javax.swing.JPasswordField();
        cancel_admin = new javax.swing.JButton();
        masuk_admin = new javax.swing.JButton();
        jTextField9999 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel212.setBackground(new java.awt.Color(102, 102, 255));
        jPanel212.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel212.setPreferredSize(new java.awt.Dimension(720, 480));

        sa111.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sa111.setText("ID                   :");

        jLabel1111.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1111.setText("from login");

        jLabel3212.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3212.setText("password     :");

        cancel_admin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cancel_admin.setText("cancel");
        cancel_admin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_adminActionPerformed(evt);
            }
        });

        masuk_admin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        masuk_admin.setText("masuk");
        masuk_admin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        masuk_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_adminActionPerformed(evt);
            }
        });

        jTextField9999.setEditable(false);
        jTextField9999.setColumns(2);
        jTextField9999.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField9999.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9999.setText("KOPERASI SIMPAN PINJAM ");

        javax.swing.GroupLayout jPanel212Layout = new javax.swing.GroupLayout(jPanel212);
        jPanel212.setLayout(jPanel212Layout);
        jPanel212Layout.setHorizontalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField9999)
            .addGroup(jPanel212Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel212Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1111))
                    .addGroup(jPanel212Layout.createSequentialGroup()
                        .addComponent(sa111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ID_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel212Layout.createSequentialGroup()
                        .addComponent(jLabel3212)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel212Layout.createSequentialGroup()
                                .addComponent(cancel_admin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(masuk_admin))
                            .addComponent(pwd_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel212Layout.setVerticalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel212Layout.createSequentialGroup()
                .addComponent(jTextField9999, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel1111, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sa111)
                    .addComponent(ID_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3212)
                    .addComponent(pwd_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_admin)
                    .addComponent(masuk_admin))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void masuk_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_adminActionPerformed
    try {
        sql = "SELECT * FROM admin WHERE ID_admin='" + ID_admin.getText() + "' AND pwd_admin='" + pwd_admin.getText() + "'";
        rs = stat.executeQuery(sql);
        if (rs.next()) {
            if (ID_admin.getText().equals(rs.getString("ID_admin")) && pwd_admin.getText().equals(rs.getString("pwd_admin"))) {
                JOptionPane.showMessageDialog(null, "berhasil login");
                Admin2 fu = new Admin2();
                fu.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "username atau password salah");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }

    }//GEN-LAST:event_masuk_adminActionPerformed

    private void cancel_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_adminActionPerformed
        System.exit(1);
    }//GEN-LAST:event_cancel_adminActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_admin;
    private javax.swing.JButton cancel_admin;
    private javax.swing.JLabel jLabel1111;
    private javax.swing.JLabel jLabel3212;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JTextField jTextField9999;
    private javax.swing.JButton masuk_admin;
    private javax.swing.JPasswordField pwd_admin;
    private javax.swing.JLabel sa111;
    // End of variables declaration//GEN-END:variables

    private static class ID_Userivate {

        public ID_Userivate() {
        }
    }
}