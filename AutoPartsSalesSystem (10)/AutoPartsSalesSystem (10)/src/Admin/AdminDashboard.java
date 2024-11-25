package Admin;

import autopartssalessystem.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.SQLException;
import java.text.NumberFormat;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class AdminDashboard extends javax.swing.JFrame {
    
    private int adminID;
    
    public void showBarChart(JPanel panelLineChart) {
       // Database connection parameters
    String url = "jdbc:mysql://localhost:3306/autopartssales_db";
    String user = "root";
    String password = "";

    // Create dataset for the graph
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
     double maxTotalSales = Double.MIN_VALUE; // Initialize to the smallest possible value


    // Fetch data from the database and populate the dataset
    try (Connection conn = DriverManager.getConnection(url, user, password)) {
        String sql = "SELECT DATE(dateTimestamp) AS saleDate, SUM(subtotal) AS totalSales " +
                     "FROM payment GROUP BY saleDate ORDER BY saleDate";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            // Populate the dataset with daily sales data
            while (rs.next()) {
                String saleDate = rs.getString("saleDate");
                double totalSales = rs.getDouble("totalSales");
                dataset.setValue(totalSales, "Daily Sales", saleDate);

                // Log the data for debugging purposes
                System.out.println("Date: " + saleDate + ", Total Sales: " + totalSales);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return; // Exit if there's an error
    }
// Check if the dataset is empty
if (dataset.getColumnCount() == 0) {
    System.out.println("No data available to display in the chart.");
    return;
}

// Create the bar chart
JFreeChart barChart = ChartFactory.createBarChart(
        "Daily Sales Contribution",   // Chart title
        "Date",                       // X-axis label
        "Amount",                     // Y-axis label
        dataset,                      // Dataset
        PlotOrientation.VERTICAL,     // Plot orientation
        false,                        // Include legend
        true,                         // Tooltips
        false                         // URLs
);

// Customize the plot
CategoryPlot barCategoryPlot = barChart.getCategoryPlot();
barCategoryPlot.setBackgroundPaint(Color.white);

// Customize the bar renderer
BarRenderer barRenderer = (BarRenderer) barCategoryPlot.getRenderer();
barRenderer.setSeriesPaint(0, new Color(204, 0, 51)); // Set the bar color

// Calculate the upper bound for the Y-axis range
double upperBound = Math.max(maxTotalSales + 100, 500);

// Set the Y-axis range to 0-upperBound and tick unit to 100
NumberAxis yAxis = (NumberAxis) barCategoryPlot.getRangeAxis();
yAxis.setRange(0, upperBound); // Set the range from 0 to the calculated upper bound
yAxis.setTickUnit(new NumberTickUnit(100)); // Set tick unit to 100 for increments

// Customize the Y-axis label format to display amounts
yAxis.setNumberFormatOverride(NumberFormat.getCurrencyInstance()); // Display amounts with currency symbol

// Display the chart in the panel
ChartPanel barChartPanel = new ChartPanel(barChart);
panelLineChart.removeAll();
panelLineChart.setLayout(new BorderLayout());
panelLineChart.add(barChartPanel, BorderLayout.CENTER);
panelLineChart.validate();
}
    
            public void displayMostBoughtProducts() {
                DefaultPieDataset pieDataset = new DefaultPieDataset();

                try {
                    // Step 1: Establish a connection to the database
                    String url = "jdbc:mysql://localhost:3306/autopartssales_db"; // Replace with your database name
                    String user = "root"; // Replace with your database username
                    String password = ""; // Replace with your database password
                    Connection connection = DriverManager.getConnection(url, user, password);

                    // Step 2: Query to get the ordered products from the payment table
                    String query = "SELECT productName, SUM(quantity) AS totalQuantity " +
                                   "FROM payment " + // Changed to 'payment' table
                                   "GROUP BY productName " +
                                   "ORDER BY totalQuantity DESC " +
                                   "LIMIT 5"; // Modify limit based on how many top products you want
                    PreparedStatement preparedStatement = connection.prepareStatement(query);

                    // Step 3: Execute the query
                    ResultSet resultSet = preparedStatement.executeQuery();

                    // Step 4: Add data to the dataset
                    while (resultSet.next()) {
                        String productName = resultSet.getString("productName");
                        int totalQuantity = resultSet.getInt("totalQuantity");
                        pieDataset.setValue(productName, totalQuantity);
                    }

                    // Close resources
                    resultSet.close();
                    preparedStatement.close();
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // Step 5: Create the chart
                JFreeChart pieChart = ChartFactory.createPieChart(
                    "Top Ordered Products", // Title
                    pieDataset,            // Dataset
                    true,                  // Show legend
                    true,                  // Use tooltips
                    false                  // Show URLs
                );

                PiePlot piePlot = (PiePlot) pieChart.getPlot();

                // Step 6: Customize the chart colors with an elegant palette
                piePlot.setBackgroundPaint(Color.white);
                Color[] colors = {
                    new Color(70, 130, 180), // Steel Blue
                    new Color(100, 149, 237), // Cornflower Blue
                    new Color(60, 179, 113), // Medium Sea Green
                    new Color(255, 99, 71), // Tomato
                    new Color(255, 215, 0) // Gold
                };

        int colorIndex = 0;
        for (Object key : pieDataset.getKeys()) {
            piePlot.setSectionPaint((Comparable) key, colors[colorIndex % colors.length]);
            colorIndex++;
        }

        // Step 7: Display the chart in a panel
        ChartPanel pieChartPanel = new ChartPanel(pieChart);
        panelBarChart.removeAll();
        panelBarChart.add(pieChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
}

    
    public AdminDashboard(int adminID) {
        this.adminID = adminID;
        initComponents();
        fetchTotalProducts();
        fetchTotalOrders();
        nonactive();
        displayMostBoughtProducts();
        showBarChart( panelLineChart);
       
        
      
    
        
    }

 
     public void nonactive() {
   
            //sbar.setVisible(false);
           // sbar.setEnabled(false);

            menu.setVisible(true);
            menu.setEnabled(true);
        
   }

    public void active() {

                //sbar.setVisible(true);
               // sbar.setEnabled(true);

                menu.setVisible(false);
                menu.setEnabled(false);
    }
  
    private AdminDashboard() {
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
        menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        totalordersTextField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        totalproductsTextField2 = new javax.swing.JTextField();
        totalproductsTextField3 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        totalproductsTextField4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        panelLineChart = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        totalproductsTextField = new javax.swing.JTextField();
        panelBarChart = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        jDesktopPane1.setBackground(new java.awt.Color(204, 153, 0));

        menu.setBackground(new java.awt.Color(201, 163, 9));
        menu.setForeground(new java.awt.Color(153, 126, 21));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/burger-bar.png"))); // NOI18N
        menu.setBorder(null);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Black and Orange Modern Car Automotive Logo.png"))); // NOI18N

        jDesktopPane1.setLayer(menu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(827, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(menu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1131, 60));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Air Purifiers");
        jButton1.setBorderPainted(false);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 851, -1, 15));

        jPanel7.setBackground(new java.awt.Color(204, 102, 0));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("NO. OF ORDERS");

        totalordersTextField.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        totalordersTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalordersTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0), 4));
        totalordersTextField.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        totalordersTextField.setSelectionColor(new java.awt.Color(255, 255, 255));
        totalordersTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalordersTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(totalordersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalordersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 180, 120));

        jPanel8.setBackground(new java.awt.Color(102, 0, 51));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TOTAL SALES");

        totalproductsTextField2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        totalproductsTextField2.setForeground(new java.awt.Color(0, 0, 0));
        totalproductsTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalproductsTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 51), 4));
        totalproductsTextField2.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        totalproductsTextField2.setSelectionColor(new java.awt.Color(255, 255, 255));
        totalproductsTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalproductsTextField2ActionPerformed(evt);
            }
        });

        totalproductsTextField3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        totalproductsTextField3.setForeground(new java.awt.Color(0, 0, 0));
        totalproductsTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalproductsTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 51), 4));
        totalproductsTextField3.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        totalproductsTextField3.setSelectionColor(new java.awt.Color(255, 255, 255));
        totalproductsTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalproductsTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(totalproductsTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(totalproductsTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalproductsTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalproductsTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 180, -1));

        jPanel9.setBackground(new java.awt.Color(102, 0, 51));

        totalproductsTextField4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        totalproductsTextField4.setForeground(new java.awt.Color(0, 0, 0));
        totalproductsTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalproductsTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 51), 4));
        totalproductsTextField4.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        totalproductsTextField4.setSelectionColor(new java.awt.Color(255, 255, 255));
        totalproductsTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalproductsTextField4ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TOTAL SALES");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalproductsTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(totalproductsTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 180, -1));

        panelLineChart.setLayout(new java.awt.BorderLayout());
        jPanel2.add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 460, 360));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TOTAL PRODUCTS");

        totalproductsTextField.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        totalproductsTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalproductsTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));
        totalproductsTextField.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        totalproductsTextField.setSelectionColor(new java.awt.Color(255, 255, 255));
        totalproductsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalproductsTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalproductsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalproductsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 180, 120));

        panelBarChart.setLayout(new java.awt.BorderLayout());
        jPanel2.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 400, 330));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backgroundyellow.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-13, 0, 1150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalproductsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalproductsTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_totalproductsTextFieldActionPerformed

    private void totalordersTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalordersTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalordersTextFieldActionPerformed

    private void totalproductsTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalproductsTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalproductsTextField2ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        active();
    }//GEN-LAST:event_menuActionPerformed

    private void totalproductsTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalproductsTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalproductsTextField3ActionPerformed

    private void totalproductsTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalproductsTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalproductsTextField4ActionPerformed

    private void fetchTotalProducts() {
        // TODO add your handling code here:
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Step 1: Establish a database connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "");

            // Step 2: Create and execute the SQL query
            String sql = "SELECT COUNT(*) AS TotalProducts FROM products;"; // Replace 'inventory' with your actual table name
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            // Step 3: Get the result and set it to the text field
            if (rs.next()) {
                int totalProducts = rs.getInt("TotalProducts");
                totalproductsTextField.setText(String.valueOf(totalProducts));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching total products: " + e.getMessage());
        } finally {
            // Step 4: Close resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void fetchTotalOrders() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Step 1: Establish a database connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/autopartssales_db", "root", "");

            // Step 2: Create and execute the SQL query
            String sql = "SELECT COUNT(*) AS TotalOrders FROM orders;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            // Step 3: Get the result and set it to the text field
            if (rs.next()) {
                int totalOrders = rs.getInt("TotalOrders");
                totalordersTextField.setText(String.valueOf(totalOrders)); // Ensure this is the correct text field name
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching total orders: " + e.getMessage());
        } finally {
            // Step 4: Close resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton menu;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JTextField totalordersTextField;
    private javax.swing.JTextField totalproductsTextField;
    private javax.swing.JTextField totalproductsTextField2;
    private javax.swing.JTextField totalproductsTextField3;
    private javax.swing.JTextField totalproductsTextField4;
    // End of variables declaration//GEN-END:variables

    void setUser(String uname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
