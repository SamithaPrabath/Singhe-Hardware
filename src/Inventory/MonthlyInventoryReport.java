
package Inventory;

import customer.CustomerDetails;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import singheMain.Dashboard;
import singheMain.LogIn;
import payment.Payment;
import singheMain.Reports;
import supplier.SupplierDetails;

public class MonthlyInventoryReport extends javax.swing.JFrame {

 
    public MonthlyInventoryReport() {
        initComponents();
        showTableContent();
    }
    static int m=0;
    void showTableContent(){
        DefaultTableModel dt =(DefaultTableModel)monthlyProduct.getModel();
        String p[]=new String[5];
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select month(curdate()) as month;";
            ResultSet rs =st.executeQuery(query);
            rs.next();
            m=Integer.valueOf(rs.getString("month"));
            System.out.println(m);
            switch(m){
                case(1):
                    month.setSelectedItem("January");
                    break;
                case(2):
                    month.setSelectedItem("February");
                    break;
                case(3):
                    month.setSelectedItem("March");
                    break;
                case(4):
                    month.setSelectedItem("April");
                    break;
                case(5):
                    month.setSelectedItem("May");
                    break;
                case(6):
                    month.setSelectedItem("June");
                    break;
                case(7):
                    month.setSelectedItem("July");
                    break;
                case(8):
                    month.setSelectedItem("August");
                    break;
                case(9):
                    month.setSelectedItem("September");
                    break;
                case(10):
                    month.setSelectedItem("Octomber");
                    break;
                case(11):
                    month.setSelectedItem("November");
                    break;
                case(12):
                    month.setSelectedItem("December");
                    break;
            }
            Statement st1=con.createStatement();
             query="select pname,sum(quantity)as quantity,date from sellProducts where month(date)=month(curdate()) group by pname;";
             rs =st.executeQuery(query);
            while(rs.next()){
                
                p[1]=rs.getString("pname");
                p[3]=rs.getString("quantity");
                p[4]=rs.getString("date");
                query="select product_id,supplier_id from product where product_name='"+p[1]+"';";
                ResultSet rs1 =st1.executeQuery(query);
                rs1.next();
                p[0]=rs1.getString("product_id");
                p[2]=rs1.getString("supplier_id");
                dt.addRow(p);
            }

            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPannel3 = new javax.swing.JPanel();
        paymentBtn3 = new javax.swing.JButton();
        cusBtn = new javax.swing.JButton();
        supBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        monthlyProduct = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        month = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPannel3.setBackground(new java.awt.Color(255, 255, 255));

        paymentBtn3.setBackground(new java.awt.Color(155, 55, 0));
        paymentBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentBtn3.setForeground(new java.awt.Color(255, 255, 255));
        paymentBtn3.setText("Payment");
        paymentBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentBtn3MouseClicked(evt);
            }
        });
        paymentBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtn3ActionPerformed(evt);
            }
        });

        cusBtn.setBackground(new java.awt.Color(155, 55, 0));
        cusBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cusBtn.setForeground(new java.awt.Color(255, 255, 255));
        cusBtn.setText("Customer Details");
        cusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cusBtnMouseClicked(evt);
            }
        });

        supBtn.setBackground(new java.awt.Color(155, 55, 0));
        supBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supBtn.setForeground(new java.awt.Color(255, 255, 255));
        supBtn.setText("Supplier Details");
        supBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(155, 55, 0));
        homeBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        inventoryBtn.setBackground(new java.awt.Color(155, 55, 0));
        inventoryBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        inventoryBtn.setText("Inventory");
        inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtnActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(155, 55, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPannel3Layout = new javax.swing.GroupLayout(btnPannel3);
        btnPannel3.setLayout(btnPannel3Layout);
        btnPannel3Layout.setHorizontalGroup(
            btnPannel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPannel3Layout.createSequentialGroup()
                .addGroup(btnPannel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnPannel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(btnPannel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(btnPannel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        btnPannel3Layout.setVerticalGroup(
            btnPannel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPannel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(paymentBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(supBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(btnPannel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Monthly Inventory Report");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        monthlyProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "SupplierId", "Monthly Sold"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(monthlyProduct);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 880, 420));

        jLabel2.setText("Month");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 660, -1, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel1.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 30));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Genarate Chart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setText("Print Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 930, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtn3MouseClicked
        this.setVisible(false);
        Payment payment=new Payment();
        payment.setVisible(true);
    }//GEN-LAST:event_paymentBtn3MouseClicked

    private void paymentBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentBtn3ActionPerformed

    private void cusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cusBtnMouseClicked
        this.dispose();
        CustomerDetails cusDetails = new CustomerDetails();
        cusDetails.setVisible(true);
    }//GEN-LAST:event_cusBtnMouseClicked

    private void supBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtnActionPerformed
        this.dispose();
        SupplierDetails supDetails = new SupplierDetails();
        supDetails.setVisible(true);
    }//GEN-LAST:event_supBtnActionPerformed

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked

    }//GEN-LAST:event_homeBtnMouseClicked

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed

        this.setVisible(false);
        Dashboard dasboard = new Dashboard();
        dasboard.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void inventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtnActionPerformed
        Stock stock = new Stock();
        this.dispose();
        stock.setVisible(true);
    }//GEN-LAST:event_inventoryBtnActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to Log out?","log out",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            this.dispose();
            LogIn login=new LogIn();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(new LogIn().role.equals("Owner")){
            Reports r=new Reports();
            this.dispose();
            r.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        InventoryReport cr =new InventoryReport();
        this.dispose();
        cr.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed

        
        switch((String)month.getSelectedItem()){
            case("January"):
            m=1;
            break;
            case("February"):
            m=2;
            break;
            case("March"):
            m=3;
            break;
            case("April"):
            m=4;
            break;
            case("May"):
            m=5;
            break;
            case("June"):
            m=6;
            break;
            case("July"):
            m=7;
            break;
            case("August"):
            m=8;
            break;
            case("September"):
            m=9;
            break;
            case("Octomber"):
            m=10;
            break;
            case("November"):
            m=11;
            break;
            case("December"):
            m=12;
            break;
        }

        DefaultTableModel dt =(DefaultTableModel)monthlyProduct.getModel();
        dt.setRowCount(0);
        
        String p[]=new String[5];
        try{
           
                

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            String query="select pname,sum(quantity)as quantity,date from sellProducts where month(date)="+m+" group by pname;";
            ResultSet rs =st.executeQuery(query);
            while(rs.next()){

                p[1]=rs.getString("pname");
                p[3]=rs.getString("quantity");
                p[4]=rs.getString("date");
                query="select product_id,supplier_id from product where product_name='"+p[1]+"';";
                ResultSet rs1 =st1.executeQuery(query);
                rs1.next();
                p[0]=rs1.getString("product_id");
                p[2]=rs1.getString("supplier_id");
                dt.addRow(p);
            }
           
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_monthActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       for(int i=0;i<monthlyProduct.getRowCount();i++){

            String pname=(String) monthlyProduct.getValueAt(i ,1);
            int count=Integer.valueOf((String) monthlyProduct.getValueAt(i ,3));
            dataset.setValue(count, "Sold Quantity", pname);

        }

        JFreeChart chart = ChartFactory.createBarChart("Monthly Inventory - "+month.getSelectedItem(), "Date","Solod Quantity", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);

        ChartFrame frame = new ChartFrame("Bar Chart Report",chart);
        frame.setVisible(true);
        frame.setSize(650,550);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{

            System.out.println(m);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("month", String.valueOf(m));
           // JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/Inventory/SingheMonthlyInventoryReport.jasper"));
           JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Moditha punchihewa\\Documents\\NetBeansProjects\\Singhe\\src\\reports\\SingheMonthlyInventoryReport.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPannel3;
    private javax.swing.JButton cusBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTable monthlyProduct;
    private javax.swing.JButton paymentBtn3;
    private javax.swing.JButton supBtn;
    // End of variables declaration//GEN-END:variables
}
