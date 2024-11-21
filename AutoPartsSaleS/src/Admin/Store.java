
package Admin;

import Customer.*;
import Admin.*;
import Customer.FluidsLubricantsShop;
import autopartssalessystem.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Store extends javax.swing.JFrame {

    public Store() {
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        LogoutBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchbar = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        cart = new javax.swing.JButton();
        cart1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        WheelsAndTiresBtn = new javax.swing.JButton();
        AccessoriesBtn = new javax.swing.JButton();
        HornsBtn = new javax.swing.JButton();
        FluidsAndLubricantsBtn = new javax.swing.JButton();
        EngineComponentsBtn = new javax.swing.JButton();
        CustomerBtn = new javax.swing.JButton();

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

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jDesktopPane1.setBackground(new java.awt.Color(168, 119, 9));

        LogoutBtn.setBackground(new java.awt.Color(208, 168, 5));
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

        jDesktopPane1.setLayer(LogoutBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutBtn)
                .addGap(16, 16, 16))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 329, -1, 200));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 329, 170, 200));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 329, 160, 200));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 329, -1, 200));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 329, 160, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Popular Products");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("All Categories");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        searchbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchbar.png"))); // NOI18N
        jPanel7.add(searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, -1, -1));

        SearchBar.setBackground(new java.awt.Color(204, 204, 204));
        SearchBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchBar.setText("    Search....");
        SearchBar.setBorder(null);
        SearchBar.setMargin(new java.awt.Insets(2, 8, 2, 6));
        SearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarActionPerformed(evt);
            }
        });
        jPanel7.add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 410, 40));

        cart.setBackground(new java.awt.Color(223, 169, 4));
        cart.setForeground(new java.awt.Color(255, 204, 0));
        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/information.png"))); // NOI18N
        cart.setBorderPainted(false);
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartActionPerformed(evt);
            }
        });
        jPanel7.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, -1, 40));

        cart1.setBackground(new java.awt.Color(223, 169, 4));
        cart1.setForeground(new java.awt.Color(255, 204, 0));
        cart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cart.png"))); // NOI18N
        cart1.setBorderPainted(false);
        cart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cart1ActionPerformed(evt);
            }
        });
        jPanel7.add(cart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Wheels and Tires");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fluids and Lubricants");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Engine Components");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Accessories");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Horns");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        WheelsAndTiresBtn.setBackground(new java.awt.Color(255, 255, 255));
        WheelsAndTiresBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1.5.png"))); // NOI18N
        WheelsAndTiresBtn.setText("jButton2");
        WheelsAndTiresBtn.setBorder(null);
        WheelsAndTiresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WheelsAndTiresBtnActionPerformed(evt);
            }
        });
        jPanel7.add(WheelsAndTiresBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 170, 180));

        AccessoriesBtn.setBackground(new java.awt.Color(255, 255, 255));
        AccessoriesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1.1.png"))); // NOI18N
        AccessoriesBtn.setText("jButton2");
        AccessoriesBtn.setBorder(null);
        AccessoriesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessoriesBtnActionPerformed(evt);
            }
        });
        jPanel7.add(AccessoriesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 170, 180));

        HornsBtn.setBackground(new java.awt.Color(255, 255, 255));
        HornsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1.2.png"))); // NOI18N
        HornsBtn.setText("jButton2");
        HornsBtn.setBorder(null);
        HornsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HornsBtnActionPerformed(evt);
            }
        });
        jPanel7.add(HornsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 170, 180));

        FluidsAndLubricantsBtn.setBackground(new java.awt.Color(255, 255, 255));
        FluidsAndLubricantsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1.3.png"))); // NOI18N
        FluidsAndLubricantsBtn.setText("jButton2");
        FluidsAndLubricantsBtn.setBorder(null);
        FluidsAndLubricantsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FluidsAndLubricantsBtnActionPerformed(evt);
            }
        });
        jPanel7.add(FluidsAndLubricantsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, 180));

        EngineComponentsBtn.setBackground(new java.awt.Color(255, 255, 255));
        EngineComponentsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1.4.png"))); // NOI18N
        EngineComponentsBtn.setText("jButton2");
        EngineComponentsBtn.setBorder(null);
        EngineComponentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngineComponentsBtnActionPerformed(evt);
            }
        });
        jPanel7.add(EngineComponentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 170, 180));

        CustomerBtn.setBackground(new java.awt.Color(210, 161, 12));
        CustomerBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomerBtn.setForeground(new java.awt.Color(51, 51, 51));
        CustomerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        CustomerBtn.setText("back to main menu");
        CustomerBtn.setBorderPainted(false);
        CustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBtnActionPerformed(evt);
            }
        });
        jPanel7.add(CustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 661));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartActionPerformed

    private void CustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBtnActionPerformed
        // TODO add your handling code here:
        CustomerDashboard customerdashboard = new CustomerDashboard();
        customerdashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerBtnActionPerformed

    private void cart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cart1ActionPerformed

    private void SearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBarActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
    
        if (response == JOptionPane.YES_OPTION) {
            // Terminate the application
            System.exit(0);
    }//GEN-LAST:event_LogoutBtnActionPerformed
}
    private void FluidsAndLubricantsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FluidsAndLubricantsBtnActionPerformed
        // TODO add your handling code here:
        FluidsLubricantsShop fluidslubricantsshop = new FluidsLubricantsShop();
        fluidslubricantsshop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FluidsAndLubricantsBtnActionPerformed

    private void EngineComponentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngineComponentsBtnActionPerformed
        // TODO add your handling code here:
        EngineComponentsShop enginecomponentsshop = new EngineComponentsShop();
        enginecomponentsshop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EngineComponentsBtnActionPerformed

    private void AccessoriesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessoriesBtnActionPerformed
        // TODO add your handling code here:
        AccessoriesShop accessoriesshop = new AccessoriesShop();
        accessoriesshop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AccessoriesBtnActionPerformed

    private void HornsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HornsBtnActionPerformed
        // TODO add your handling code here:
        HornsShop hornsshop = new HornsShop();
        hornsshop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HornsBtnActionPerformed

    private void WheelsAndTiresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WheelsAndTiresBtnActionPerformed
        // TODO add your handling code here:
        WheelsAndTiresShop  wheelsandtiresshop = new WheelsAndTiresShop();
        wheelsandtiresshop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_WheelsAndTiresBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccessoriesBtn;
    private javax.swing.JButton CustomerBtn;
    private javax.swing.JButton EngineComponentsBtn;
    private javax.swing.JButton FluidsAndLubricantsBtn;
    private javax.swing.JButton HornsBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton WheelsAndTiresBtn;
    private javax.swing.JButton cart;
    private javax.swing.JButton cart1;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel searchbar;
    // End of variables declaration//GEN-END:variables

    void setUser(String uname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
