
package customer;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import singheMain.Dashboard;
import singheMain.LogIn;
import payment.Payment;
import singheMain.Reports;
import Inventory.Stock;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import supplier.SupplierDetails;


public class DailyCustomerReport extends javax.swing.JFrame {

 
    public DailyCustomerReport() {
        initComponents();
        showTableContent();
    }

    void showTableContent(){
        DefaultTableModel dt =(DefaultTableModel)customerTable.getModel();
        String p[]=new String[5];
        Date d=new Date();
        date.setDate(d);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            
            String query="select * from customers where date(date)=date(curdate());";
            ResultSet rs =st.executeQuery(query);
            while(rs.next()){
                p[0]=rs.getString("customer_id");
                p[1]=rs.getString("customer_name");
                p[2]=rs.getString("address");
                p[3]=rs.getString("phone_no");
                p[4]=rs.getString("date");
                
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
        customerTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
                .addGap(28, 28, 28)
                .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(btnPannel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Daily Customer Report");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Customer Name", "Phone No", "Address", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 880, 420));

        jLabel2.setText("Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 660, -1, 30));

        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateMousePressed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 190, 30));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 204, 0));
        jButton4.setText("Print Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 930, 720));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CustomerReport cr =new CustomerReport();
        this.dispose();
        cr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMousePressed
        
    }//GEN-LAST:event_dateMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel dt =(DefaultTableModel)customerTable.getModel();
        dt.setRowCount(0);
        Date d=date.getDate();
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        String dat = dcn.format(date.getDate());
        String p[]=new String[5];
        try{            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select * from customers where date(date)='"+dat+"';";
            ResultSet rs =st.executeQuery(query);
            while(rs.next()){
                p[0]=rs.getString("customer_id");
                p[1]=rs.getString("customer_name");
                p[2]=rs.getString("address");
                p[3]=rs.getString("phone_no");
                p[4]=rs.getString("date");
                dt.addRow(p);
            }                        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            Date d=date.getDate();
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String dat = dcn.format(date.getDate());
            System.out.println(dat);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("date", dat);
            //JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/customer/SingheDailyCustomerReport.jasper"));
            JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Moditha punchihewa\\Documents\\NetBeansProjects\\Singhe\\src\\reports\\SingheDailyCustomerReport.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPannel3;
    private javax.swing.JButton cusBtn;
    private javax.swing.JTable customerTable;
    private com.toedter.calendar.JDateChooser date;
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
    private javax.swing.JButton paymentBtn3;
    private javax.swing.JButton supBtn;
    // End of variables declaration//GEN-END:variables
}
