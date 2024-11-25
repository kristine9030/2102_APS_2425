package Customer;

import Admin.*;
import autopartssalessystem.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;

public class EngineComponentsShop extends javax.swing.JFrame {

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    private int customerID;

    public EngineComponentsShop(int customerID) {
        this.customerID = customerID;
        initComponents();
        DisplayItems();
    }

    private EngineComponentsShop() {
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
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        mainpanel = new javax.swing.JPanel();
        desktopPanel = new javax.swing.JDesktopPane();
        LogoutBtn = new javax.swing.JButton();
        quantityTextField = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        ProductIDTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CustomerBtn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        leftarrowbtn = new javax.swing.JButton();
        rightbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addtocartbtn = new javax.swing.JButton();
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

        jButton1.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainpanel.setBackground(new java.awt.Color(51, 51, 51));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktopPanel.setBackground(new java.awt.Color(221, 168, 7));

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

        desktopPanel.setLayer(LogoutBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPanelLayout.createSequentialGroup()
                .addContainerGap(808, Short.MAX_VALUE)
                .addComponent(LogoutBtn)
                .addGap(16, 16, 16))
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(348, 348, 348))
        );

        mainpanel.add(desktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 30));
        mainpanel.add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 550, 80, 30));

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(102, 102, 102));
        searchField.setText("   Search...");
        searchField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        mainpanel.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 419, 30));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchbar.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        mainpanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Engine Components");
        mainpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        ProductsTable.setBackground(new java.awt.Color(51, 51, 51));
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
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductsTable);

        jScrollPane1.setViewportView(jScrollPane2);

        mainpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 870, 250));

        ProductIDTextField.setBackground(new java.awt.Color(102, 102, 102));
        mainpanel.add(ProductIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 110, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainpanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 80, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ProductID: ");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, 30));

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
        mainpanel.add(CustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Quantity");
        mainpanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, -1, 30));

        leftarrowbtn.setBackground(new java.awt.Color(51, 51, 51));
        leftarrowbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/left-arrow.png"))); // NOI18N
        leftarrowbtn.setBorder(null);
        leftarrowbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftarrowbtnActionPerformed(evt);
            }
        });
        mainpanel.add(leftarrowbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 30, 30));

        rightbtn.setBackground(new java.awt.Color(255, 255, 255));
        rightbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next (1).png"))); // NOI18N
        rightbtn.setBorder(null);
        rightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightbtnActionPerformed(evt);
            }
        });
        mainpanel.add(rightbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        mainpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -30, -1, -1));

        addtocartbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addtocartbtn.setText("Add to Cart");
        addtocartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartbtnActionPerformed(evt);
            }
        });
        mainpanel.add(addtocartbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cars Parts (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        mainpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, 20, -1, 780));

        getContentPane().add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 661));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            // Terminate the application
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed
    }
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchQuery = searchField.getText().trim();
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a search term.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "your_password");

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

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBtnActionPerformed
        // TODO add your handling code here:
        CustomerDashboard customerdashboard = new CustomerDashboard(this.customerID);
        customerdashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerBtnActionPerformed

    private void leftarrowbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftarrowbtnActionPerformed
        // TODO add your handling code here:
        FluidsLubricantsShop fluidlubricantsshop = new FluidsLubricantsShop(this.customerID);
        fluidlubricantsshop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_leftarrowbtnActionPerformed

    private void rightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightbtnActionPerformed
        // TODO add your handling code here:
        AccessoriesShop accessoriesshop = new AccessoriesShop(this.customerID);
        accessoriesshop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rightbtnActionPerformed

    private void ProductsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseClicked
        // Retrieve the model and selected row index
        DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
        int MyIndex = ProductsTable.getSelectedRow();

        int Key = 0;
        if (MyIndex != -1) {
            // Populate the fields with the selected row's data
            Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());  // ProductID (column 0)
            ProductIDTextField.setText(model.getValueAt(MyIndex, 0).toString()); // Set ProductID in the text field

        } else {
            // Show an error message if no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row first.");
        }
    }//GEN-LAST:event_ProductsTableMouseClicked

    private void addtocartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartbtnActionPerformed
        // Database connection variables
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Assuming customerID is available in the loggedInCustomerId variable
            int loggedInCustomerId = this.customerID; // Replace with actual customer ID from your login system

            // Establish connection to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "your_password");

            // Start transaction to ensure data integrity
            conn.setAutoCommit(false);

            // Fetch input values
            String productId = ProductIDTextField.getText().trim();
            int quantity = Integer.parseInt(quantityTextField.getText().trim());

            if (productId.isEmpty() || quantity <= 0) {
                JOptionPane.showMessageDialog(this, "Please provide valid product ID and quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Query to fetch product details from the database
            String fetchProductQuery = "SELECT ProductName, Price, Stock FROM products WHERE ProductID = ?";
            pst = conn.prepareStatement(fetchProductQuery);
            pst.setString(1, productId);
            rs = pst.executeQuery();

            if (rs.next()) {
                String productName = rs.getString("ProductName");
                double price = rs.getDouble("Price");
                int currentStock = rs.getInt("Stock");

                // Check if enough stock is available
                if (currentStock >= quantity) {
                    // Calculate total price
                    double totalPrice = price * quantity;

                    // Insert the selected item into the shopping cart (order list)
                    String insertOrderQuery = "INSERT INTO orders (productID, productName, quantity, price, totalPrice, orderDate, customerID, status) "
                            + "VALUES (?, ?, ?, ?, ?, CURRENT_TIMESTAMP(), ?, 'Pending')";
                    pst = conn.prepareStatement(insertOrderQuery);
                    pst.setInt(1, Integer.parseInt(productId));
                    pst.setString(2, productName);
                    pst.setInt(3, quantity);
                    pst.setDouble(4, price);
                    pst.setDouble(5, totalPrice);
                    pst.setInt(6, loggedInCustomerId);  // Insert the customerID here
                    pst.executeUpdate();

                    // Update the stock in the products table
                    String updateStockQuery = "UPDATE products SET Stock = ? WHERE ProductID = ?";
                    pst = conn.prepareStatement(updateStockQuery);
                    pst.setInt(1, currentStock - quantity);
                    pst.setInt(2, Integer.parseInt(productId));
                    pst.executeUpdate();

                    // Commit transaction
                    conn.commit();

                    // Notify user about successful order
                    JOptionPane.showMessageDialog(this, "Item added to cart successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient stock available!", "Stock Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Product not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | NumberFormatException ex) {
            // Rollback transaction if an error occurs
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException rollbackEx) {
                    JOptionPane.showMessageDialog(this, "Rollback failed: " + rollbackEx.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close resources to prevent memory leaks
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error closing connection: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addtocartbtnActionPerformed

    private void DisplayItems() {

        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "your_password");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM products WHERE Category = 'Engine Components'");

            ProductsTable.setModel(DbUtils.resultSetToTableModel(Rs));  // Make sure the table is updated correctly
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying items: " + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(EngineComponentsShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EngineComponentsShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EngineComponentsShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EngineComponentsShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EngineComponentsShop().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JTextField ProductIDTextField;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JButton addtocartbtn;
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton leftarrowbtn;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton rightbtn;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables

}
