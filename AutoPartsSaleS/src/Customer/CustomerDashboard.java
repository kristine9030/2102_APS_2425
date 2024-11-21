
package Customer;

import Admin.*;
import Admin.*;
import autopartssalessystem.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
public class CustomerDashboard extends javax.swing.JFrame {

    public CustomerDashboard() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Storebtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        HelpAndSupportButton = new javax.swing.JButton();
        CartBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        LogoutBtn1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(215, 164, 10));

        Menu.setBackground(new java.awt.Color(201, 163, 9));
        Menu.setForeground(new java.awt.Color(153, 126, 21));
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/burger-bar.png"))); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        LogoutBtn.setBackground(new java.awt.Color(255, 204, 0));
        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(51, 51, 51));
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.setBorderPainted(false);
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(Menu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LogoutBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 828, Short.MAX_VALUE)
                .addComponent(LogoutBtn)
                .addGap(93, 93, 93))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1063, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Air Purifiers");
        jButton1.setBorderPainted(false);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 707, -1, 15));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cart.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 270, 50, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cust.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 133, 140));

        Storebtn.setBackground(new java.awt.Color(204, 153, 0));
        Storebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Storebtn.setForeground(new java.awt.Color(51, 51, 51));
        Storebtn.setText("     Go to Store");
        Storebtn.setBorder(null);
        Storebtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Storebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StorebtnActionPerformed(evt);
            }
        });
        jPanel5.add(Storebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 213, 153, 39));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Help & Support");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 329, 149, 39));

        HelpAndSupportButton.setBackground(new java.awt.Color(102, 102, 102));
        HelpAndSupportButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        HelpAndSupportButton.setForeground(new java.awt.Color(255, 255, 255));
        HelpAndSupportButton.setText("About Us");
        HelpAndSupportButton.setBorderPainted(false);
        HelpAndSupportButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HelpAndSupportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpAndSupportButtonActionPerformed(evt);
            }
        });
        jPanel5.add(HelpAndSupportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 163, 36));

        CartBtn.setBackground(new java.awt.Color(102, 102, 102));
        CartBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CartBtn.setForeground(new java.awt.Color(255, 255, 255));
        CartBtn.setText("    My Cart");
        CartBtn.setBorder(null);
        CartBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartBtnActionPerformed(evt);
            }
        });
        jPanel5.add(CartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 270, 153, 39));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/handshake.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 40, 41));

        LogoutBtn1.setBackground(new java.awt.Color(204, 204, 204));
        LogoutBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutBtn1.setForeground(new java.awt.Color(51, 51, 51));
        LogoutBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        LogoutBtn1.setText("Logout");
        LogoutBtn1.setBorderPainted(false);
        LogoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn1ActionPerformed(evt);
            }
        });
        jPanel5.add(LogoutBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 462, 187, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/information.png"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 41));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CUSTOMER");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/final bg.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 640));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/poster.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Welcome, Customers!");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 450, 43));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 672));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            // Terminate the application
            System.exit(0);
        }
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed

    }//GEN-LAST:event_MenuActionPerformed

    private void CartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartBtnActionPerformed
        // TODO add your handling code here:
        ShoppingCart shoppingcart = new ShoppingCart();
        shoppingcart.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CartBtnActionPerformed

    private void HelpAndSupportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpAndSupportButtonActionPerformed
        // TODO add your handling code here:
        AboutUS aboutus = new AboutUS();
        aboutus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HelpAndSupportButtonActionPerformed

    private void LogoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn1ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            // Terminate the application
            System.exit(0);
        }

    }//GEN-LAST:event_LogoutBtn1ActionPerformed

    private void StorebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StorebtnActionPerformed
        // TODO add your handling code here:
        Store store = new Store();
        store.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_StorebtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CartBtn;
    private javax.swing.JButton HelpAndSupportButton;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton LogoutBtn1;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Storebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    void setUser(String uname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
