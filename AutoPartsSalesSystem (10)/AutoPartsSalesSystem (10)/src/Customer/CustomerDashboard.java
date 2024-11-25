
package Customer;


import Admin.AboutUS;
import autopartssalessystem.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.SQLException;
public class CustomerDashboard extends javax.swing.JFrame {
    
    private int customerID;
    

    public CustomerDashboard(int customerID) {
    this.customerID = customerID;
        initComponents();
    }

    private CustomerDashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLabel2 = new javax.swing.JLabel();
        Menu1 = new javax.swing.JButton();
        cart1 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        aboutus = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        shopwithus = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        CustomerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Black and Orange Modern Car Automotive Logo.png"))); // NOI18N

        Menu1.setBackground(new java.awt.Color(201, 163, 9));
        Menu1.setForeground(new java.awt.Color(204, 153, 0));
        Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/burger-bar.png"))); // NOI18N
        Menu1.setBorder(null);
        Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1ActionPerformed(evt);
            }
        });

        cart1.setBackground(new java.awt.Color(223, 169, 4));
        cart1.setForeground(new java.awt.Color(255, 204, 0));
        cart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cart.png"))); // NOI18N
        cart1.setBorderPainted(false);
        cart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cart1ActionPerformed(evt);
            }
        });

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(102, 102, 102));
        searchField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchbar.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Menu1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cart1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(searchField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(searchButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(cart1)
                .addGap(104, 104, 104))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton))
                    .addComponent(cart1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1063, 50));

        aboutus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aboutus.setForeground(new java.awt.Color(204, 204, 204));
        aboutus.setText("About ");
        aboutus.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutusMouseClicked(evt);
            }
        });
        jPanel2.add(aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        home.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(204, 204, 204));
        home.setText("Home ");
        home.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, -1, -1));

        shopwithus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        shopwithus.setForeground(new java.awt.Color(204, 204, 204));
        shopwithus.setText("Shop with us");
        shopwithus.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        shopwithus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopwithusMouseClicked(evt);
            }
        });
        jPanel2.add(shopwithus, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Air Purifiers");
        jButton1.setBorderPainted(false);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 707, -1, 15));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Home.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 720, 270));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Category");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(502, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 540));

        ProductsTable.setBackground(new java.awt.Color(204, 204, 204));
        ProductsTable.setForeground(new java.awt.Color(0, 0, 0));
        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Stocks", "Price", "Category", "Description"
            }
        ));
        ProductsTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        ProductsTable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(ProductsTable);

        jScrollPane4.setViewportView(jScrollPane2);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 660, 170));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("All Products");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        CustomerBtn.setBackground(new java.awt.Color(210, 161, 12));
        CustomerBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerBtn.setForeground(new java.awt.Color(0, 0, 0));
        CustomerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/left-arrow.png"))); // NOI18N
        CustomerBtn.setText("back");
        CustomerBtn.setBorderPainted(false);
        CustomerBtn.setDisplayedMnemonicIndex(0);
        CustomerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CustomerBtn.setIconTextGap(0);
        CustomerBtn.setMargin(new java.awt.Insets(2, 5, 3, 8));
        CustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backgroundyellow.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, 20, -1, -1));

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

    private void Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1ActionPerformed
       // toggleState(); // Toggle between the two states
    }//GEN-LAST:event_Menu1ActionPerformed

    private void cart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cart1ActionPerformed
        Cart1 cart = new Cart1(this.customerID);
        cart.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_cart1ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { // Trigger search on pressing Enter
            String searchQuery = searchField.getText().trim();
            if (searchQuery.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a search term.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                // Establish a connection to the database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "");

                // SQL query to search for items
                String sql = "SELECT * FROM products WHERE ProductName LIKE ? OR Category LIKE ? OR Brand LIKE ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, "%" + searchQuery + "%");
                pst.setString(2, "%" + searchQuery + "%");
                pst.setString(3, "%" + searchQuery + "%");

                // Execute the query
                ResultSet rs = pst.executeQuery();

                // Get the table model
                DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
                model.setRowCount(0); // Clear existing rows in the table

                // Populate the table with the search results
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getString("Category"),
                        rs.getDouble("Price"),
                        rs.getInt("Stock"),
                        rs.getString("Description"),
                        rs.getString("Brand")
                    });
                }

                // Close connections
                rs.close();
                pst.close();
                conn.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error while searching: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchQuery = searchField.getText().trim();
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a search term.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "");

            // SQL query to search for items
            String sql = "SELECT * FROM products WHERE ProductName LIKE ? OR Category LIKE ? OR Brand LIKE ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + searchQuery + "%");
            pst.setString(2, "%" + searchQuery + "%");
            pst.setString(3, "%" + searchQuery + "%");

            // Execute the query
            ResultSet rs = pst.executeQuery();

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
            model.setRowCount(0); // Clear existing rows in the table

            // Populate the table with the search results
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("ProductID"),
                    rs.getString("ProductName"),
                    rs.getString("Category"),
                    rs.getDouble("Price"),
                    rs.getInt("Stock"),
                    rs.getString("Description"),
                    rs.getString("Brand")
                });
            }

            // Close connections
            rs.close();
            pst.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error while searching: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void CustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBtnActionPerformed
        // TODO add your handling code here:
        CustomerDashboard customerdashboard = new CustomerDashboard(this.customerID);
        customerdashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerBtnActionPerformed

    private void shopwithusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopwithusMouseClicked
        EngineComponentsShop engine = new EngineComponentsShop(this.customerID);
        engine.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_shopwithusMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        CustomerDashboard customerdashboard = new CustomerDashboard(this.customerID);
        customerdashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void aboutusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseClicked
        AboutUS about = new AboutUS(this.customerID);
        about.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aboutusMouseClicked

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


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerBtn;
    private javax.swing.JButton Menu1;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JLabel aboutus;
    private javax.swing.JButton cart1;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel shopwithus;
    // End of variables declaration//GEN-END:variables

    void setUser(String uname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}