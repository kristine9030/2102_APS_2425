
package Admin;

import autopartssalessystem.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ManageProduct extends javax.swing.JFrame {
    
    private int adminID;
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;
    private String imgPath = null;


    public ManageProduct(int adminID) {
        this.adminID = adminID;
        initComponents();
        DisplayItems();
        nonactive();
       
    }

    private ManageProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
  
    public void nonactive() {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            sbar.setVisible(false);
            sbar.setEnabled(false);

            menu.setVisible(true);
            menu.setEnabled(true);
        }
    });
}

public void active() {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            sbar.setVisible(true);
            sbar.setEnabled(true);

            menu.setVisible(false);
            menu.setEnabled(false);
        }
    });
}

public void toggleState() {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            if (sbar.isVisible()) {
                nonactive(); // Return to the panel without sbar
            } else {
                active(); // Show the sbar and manageproductpanel
            }
        }
    });
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        manageproductpanel = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        LogoutBtn = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        AdminBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        PQuantityTb = new javax.swing.JTextField();
        PPriceTb = new javax.swing.JTextField();
        PCategoriesCb = new javax.swing.JComboBox<>();
        PNameTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionTB = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        BrandTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        BrandTb1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        DiscountTxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backgroundyellow.png"))); // NOI18N
        jLabel20.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageproductpanel.setBackground(new java.awt.Color(255, 255, 255));
        manageproductpanel.setForeground(new java.awt.Color(255, 255, 255));
        manageproductpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(221, 168, 7));

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

        menu.setBackground(new java.awt.Color(201, 163, 9));
        menu.setForeground(new java.awt.Color(153, 126, 21));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/burger-bar.png"))); // NOI18N
        menu.setBorder(null);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(LogoutBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(menu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 993, Short.MAX_VALUE)
                .addComponent(LogoutBtn)
                .addGap(21, 21, 21))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(menu))
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        manageproductpanel.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE PRODUCT ITEMS");
        manageproductpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 58, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stocks");
        manageproductpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 170, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");
        manageproductpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 236, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categories");
        manageproductpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 300, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Description");
        manageproductpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 366, 80, -1));

        AddBtn.setBackground(new java.awt.Color(51, 51, 51));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        manageproductpanel.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 599, 84, -1));

        AdminBtn.setBackground(new java.awt.Color(210, 161, 12));
        AdminBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AdminBtn.setForeground(new java.awt.Color(0, 0, 0));
        AdminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/left-arrow.png"))); // NOI18N
        AdminBtn.setText("back");
        AdminBtn.setBorderPainted(false);
        AdminBtn.setDisplayedMnemonicIndex(0);
        AdminBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        AdminBtn.setIconTextGap(0);
        AdminBtn.setMargin(new java.awt.Insets(2, 5, 3, 8));
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });
        manageproductpanel.add(AdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 640, 90, -1));

        DeleteBtn.setBackground(new java.awt.Color(51, 51, 51));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        manageproductpanel.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 599, 85, -1));

        EditBtn.setBackground(new java.awt.Color(51, 51, 51));
        EditBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        manageproductpanel.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 599, 85, -1));

        PQuantityTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PQuantityTbActionPerformed(evt);
            }
        });
        manageproductpanel.add(PQuantityTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 196, 78, -1));

        PPriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPriceTbActionPerformed(evt);
            }
        });
        manageproductpanel.add(PPriceTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 262, 78, -1));

        PCategoriesCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Fluids & Lubricants", "Engine Components", "Accessories", "Horns", "Wheels and Tires" }));
        PCategoriesCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCategoriesCbActionPerformed(evt);
            }
        });
        manageproductpanel.add(PCategoriesCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 326, 151, -1));

        PNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNameTbLbActionPerformed(evt);
            }
        });
        manageproductpanel.add(PNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 136, 287, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item Stocks");
        manageproductpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Stocks", "Price", "Categories", "Description"
            }
        ));
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductsTable);

        manageproductpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 130, 750, 440));

        DescriptionTB.setColumns(20);
        DescriptionTB.setRows(5);
        jScrollPane2.setViewportView(DescriptionTB);

        manageproductpanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 398, 276, 178));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Brand");
        manageproductpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 170, 80, -1));

        BrandTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandTbActionPerformed(evt);
            }
        });
        manageproductpanel.add(BrandTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 196, 126, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name");
        manageproductpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 57, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cars Parts (12).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        manageproductpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 540, 200));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Brand");
        manageproductpanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 170, 80, -1));

        BrandTb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandTb1ActionPerformed(evt);
            }
        });
        manageproductpanel.add(BrandTb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 196, 126, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Discount");
        manageproductpanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 80, -1));

        DiscountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountTxtActionPerformed(evt);
            }
        });
        manageproductpanel.add(DiscountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 126, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backgroundyellow.png"))); // NOI18N
        jLabel21.setText("jLabel1");
        manageproductpanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageproductpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageproductpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
             Login login = new Login();
            login.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed
    }
    private void PQuantityTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PQuantityTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PQuantityTbActionPerformed

    private void PPriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPriceTbActionPerformed

    private void PCategoriesCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCategoriesCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCategoriesCbActionPerformed

    private void PNameTbLbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNameTbLbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNameTbLbActionPerformed

    
    private void DisplayItems(){

        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT ProductID, ProductName, Brand, Price, Stock, Description, Category FROM products");
            ProductsTable.setModel(DbUtils.resultSetToTableModel(Rs));  // Make sure the table is updated correctly
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying items: " + e.getMessage());
        }
    }
    
    private void Clear (){
      
        // Clear text fields
        PNameTb.setText("");
        PQuantityTb.setText("");
        PPriceTb.setText("");

        // Clear brand field (e.g., dropdown or text box)
        if (BrandTb != null) {
            BrandTb.setText(""); // Reset dropdown to default value
        }

      

    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
 

        try {
            // Establish connection with the correct database
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "");

            // Adjusted query to match your new table and column names
            String query = "INSERT INTO products (ProductName, Stock, Price, Category, Brand, Description) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = Con.prepareStatement(query);

            // Set values to the query
            pst.setString(1, PNameTb.getText());
            pst.setInt(2, Integer.parseInt(PQuantityTb.getText()));
            pst.setDouble(3, Double.parseDouble(PPriceTb.getText()));
            pst.setString(4, PCategoriesCb.getSelectedItem().toString());
            pst.setString(5, BrandTb.getText());
            pst.setString(6, DescriptionTB.getText());

            // Execute the update
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product Added Successfully!");
            DisplayItems(); // Refresh the table
            Clear(); // Clear input fields
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Adding Product: " + e.getMessage());
        
    }


    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed
    
    int Key = 0;
    private void ProductsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
        int MyIndex = ProductsTable.getSelectedRow();

        if (MyIndex != -1) {
            // Update the column indices based on the new query (7 columns in total)
            Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());  // ProductID (column 0)
            PNameTb.setText(model.getValueAt(MyIndex, 1).toString());        // ProductName (column 1)
            BrandTb.setText(model.getValueAt(MyIndex, 2).toString());        // Brand (column 2)
            PPriceTb.setText(model.getValueAt(MyIndex, 3).toString());       // Price (column 3)
            PQuantityTb.setText(model.getValueAt(MyIndex, 4).toString());    // Stock (column 4)
            DescriptionTB.setText(model.getValueAt(MyIndex, 5).toString());  // Description (column 5)
            PCategoriesCb.setSelectedItem(model.getValueAt(MyIndex, 6).toString());  // Category (column 6)
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first.");
        }
   

    }//GEN-LAST:event_ProductsTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
   
        String productName = PNameTb.getText();  // Get the product name to delete

        if (productName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a Product Name to Delete!");
            return;
        }

        try {
            // Establish connection with the correct database
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "");

            // Adjusted query to delete by product name from the correct table
            String query = "DELETE FROM products WHERE ProductName = ?";
            PreparedStatement pst = Con.prepareStatement(query);
            pst.setString(1, productName);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully!");
                DisplayItems(); // Refresh the table
                Clear(); // Clear input fields
            } else {
                JOptionPane.showMessageDialog(this, "Product not found!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Deleting Product: " + e.getMessage());
        }
    


    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
                                                         
    try {
        // Validate Quantity (should be an integer)
        String quantityText = PQuantityTb.getText().trim();
        int quantity = 0;
        if (quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity cannot be empty!");
            return; // Exit the method if the input is empty
        }

        try {
            quantity = Integer.parseInt(quantityText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Quantity! Please enter a valid number.");
            return; // Exit the method if the input is not valid
        }

        // Validate Price (should be a double)
        String priceText = PPriceTb.getText().trim();
        double price = 0.0;
        if (priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Price cannot be empty!");
            return; // Exit the method if the input is empty
        }

        try {
            price = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Price! Please enter a valid number.");
            return; // Exit the method if the input is not valid
        }

        // Prepare SQL update query
        String UpdateQuery = "UPDATE products SET ProductName=?, Stock=?, Price=?, Category=?, Brand=?, Description=? WHERE ProductID=?";
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "");
        PreparedStatement Pu = Con.prepareStatement(UpdateQuery);

        // Set values for the query
        Pu.setString(1, PNameTb.getText());
        Pu.setInt(2, quantity); // Validated quantity
        Pu.setDouble(3, price); // Validated price
        Pu.setString(4, PCategoriesCb.getSelectedItem().toString());
        Pu.setString(5, BrandTb.getText());
        Pu.setString(6, DescriptionTB.getText());
        Pu.setInt(7, Key); // Assuming Key holds the ProductID

        int rowsUpdated = Pu.executeUpdate();
        
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Product Updated Successfully!");
            DisplayItems(); // Refresh the table
        } else {
            JOptionPane.showMessageDialog(this, "Error: Missing information or invalid ProductID");
        }
        
        Pu.close();
        Con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
   
    }

    }//GEN-LAST:event_EditBtnMouseClicked

    private void BrandTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandTbActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
     
        toggleState(); // Toggle between the two states
    }//GEN-LAST:event_menuActionPerformed

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        // TODO add your handling code here:
        AdminDashboard admindashboard = new AdminDashboard(this.adminID);
        admindashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AdminBtnActionPerformed

    private void BrandTb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandTb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandTb1ActionPerformed

    private void DiscountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscountTxtActionPerformed

   
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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AdminBtn;
    private javax.swing.JTextField BrandTb;
    private javax.swing.JTextField BrandTb1;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextArea DescriptionTB;
    private javax.swing.JTextField DiscountTxt;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JComboBox<String> PCategoriesCb;
    private javax.swing.JTextField PNameTb;
    private javax.swing.JTextField PPriceTb;
    private javax.swing.JTextField PQuantityTb;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel manageproductpanel;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables


}
