
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aviad
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {                
        initComponents();
        jButton_Login.requestFocus();
        this.setLocationRelativeTo(null);
        lbl_U.setVisible(false);
        lbl_P.setVisible(false);
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
        label_U = new javax.swing.JLabel();
        label_P = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        lbl_U = new javax.swing.JLabel();
        lbl_P = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        label_U.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_U.setText("Username:");

        label_P.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_P.setText("Password:");

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Login.setText("Login");
        jButton_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton_LoginFocusGained(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jButton_Cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        lbl_U.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_U.setForeground(new java.awt.Color(255, 0, 51));
        lbl_U.setText("*");

        lbl_P.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_P.setForeground(new java.awt.Color(255, 0, 51));
        lbl_P.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_U)
                            .addComponent(label_P))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_Username)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_U, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_P, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_P)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_P, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_U)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_U, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        lbl_U.setVisible(false);
        lbl_P.setVisible(false);
        int notValid;
        notValid = 0;
        if (jTextField_Username.getText().equals(""))
        {
            lbl_U.setVisible(true);
            notValid=1;
        }
        if (String.valueOf(jPasswordField.getPassword()).equals("")) 
        {
            lbl_P.setVisible(true);
            notValid=1;
        }
        if (notValid==1) return;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM user WHERE username = ? AND password= ?");
            ps.setString(1, jTextField_Username.getText());
            ps.setString(2, String.valueOf(jPasswordField.getPassword()));
            
            ResultSet rs = ps.executeQuery();
        
            if (rs.next())
            {
                MainForm mf = new MainForm();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                //mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                MainForm.lbl_welcome.setText("Welcome "+ jTextField_Username.getText());
                MainForm.lbl_Clients_c.setText("Clients count: "+ Integer.toString(MyFunction.countData("client")));
                MainForm.lbl_Suppliers_c.setText("Suppliers count: "+ Integer.toString(MyFunction.countData("supplier")));
                MainForm.lbl_Products_c.setText("Products count: "+ Integer.toString(MyFunction.countData("product")));
                MainForm.lbl_Orders_c.setText("Orders count: "+ Integer.toString(MyFunction.countData("order")));                
                this.dispose();
            }
            else
            {
                handleError.showErrorMessage(true, "Wrong username or password", null);
                jTextField_Username.setText("");
                jPasswordField.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_LoginFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LoginFocusGained

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JLabel label_P;
    private javax.swing.JLabel label_U;
    private javax.swing.JLabel lbl_P;
    private javax.swing.JLabel lbl_U;
    // End of variables declaration//GEN-END:variables

    private void integertostring() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
