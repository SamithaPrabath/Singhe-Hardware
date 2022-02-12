package payment;

import Inventory.Stock;
import customer.CustomerDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import singheMain.Dashboard;
import singheMain.LogIn;
import singheMain.Reports;
import supplier.SupplierDetails;


public class ViewPayemntDetails extends javax.swing.JFrame {

    
    public ViewPayemntDetails() {
        initComponents();
        showTableContents();
    }
    public static String[] row=new String[5];
    public void showTableContents(){
        DefaultTableModel dt =(DefaultTableModel)paymenttable.getModel();
        
        try {
            String r[]=new String[5];
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select * from payment;";
            ResultSet rs=st.executeQuery(query);
            for(int i=0;rs.next();i++){
                r[0]=rs.getString("payment_id");
                r[1]=rs.getString("cname");
                r[2]=rs.getString("ammount");
                r[3]=rs.getString("date");
                r[4]=rs.getString("products");
               
                dt.addRow(r);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Customer \n Please Try Again!");
            System.out.println(e.getMessage());
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPannel2 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymenttable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cusname = new javax.swing.JTextField();
        serachbtn = new javax.swing.JButton();
        newPaymentBtn = new javax.swing.JButton();
        btnPannel2 = new javax.swing.JPanel();
        paymentBtn2 = new javax.swing.JButton();
        cusBtn2 = new javax.swing.JButton();
        supBtn2 = new javax.swing.JButton();
        homeBtn2 = new javax.swing.JButton();
        inventoryBtn2 = new javax.swing.JButton();
        logout2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPannel2.setBackground(new java.awt.Color(255, 255, 255));
        mainPannel2.setPreferredSize(new java.awt.Dimension(944, 589));
        mainPannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kukka_8-removebg-preview.png"))); // NOI18N
        logo2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        mainPannel2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 240, 100));

        paymenttable.setAutoCreateRowSorter(true);
        paymenttable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paymenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Id", "Customer Name", "Amount", "Date", "Products"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        paymenttable.setRowHeight(30);
        paymenttable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                paymenttableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        paymenttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paymenttableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(paymenttable);

        mainPannel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 900, 460));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Customer Name");
        mainPannel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, -1));

        cusname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cusname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusnameActionPerformed(evt);
            }
        });
        mainPannel2.add(cusname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 300, -1));

        serachbtn.setBackground(new java.awt.Color(0, 0, 255));
        serachbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        serachbtn.setForeground(new java.awt.Color(255, 255, 255));
        serachbtn.setText("Search");
        serachbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachbtnActionPerformed(evt);
            }
        });
        mainPannel2.add(serachbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        newPaymentBtn.setBackground(new java.awt.Color(0, 0, 255));
        newPaymentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newPaymentBtn.setForeground(new java.awt.Color(255, 255, 255));
        newPaymentBtn.setText("Make a New Payment");
        newPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPaymentBtnActionPerformed(evt);
            }
        });
        mainPannel2.add(newPaymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, -1));

        btnPannel2.setBackground(new java.awt.Color(255, 255, 255));
        btnPannel2.setPreferredSize(new java.awt.Dimension(366, 703));

        paymentBtn2.setBackground(new java.awt.Color(155, 55, 0));
        paymentBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentBtn2.setForeground(new java.awt.Color(255, 255, 255));
        paymentBtn2.setText("Payment");
        paymentBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentBtn2MouseClicked(evt);
            }
        });
        paymentBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtn2ActionPerformed(evt);
            }
        });

        cusBtn2.setBackground(new java.awt.Color(155, 55, 0));
        cusBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cusBtn2.setForeground(new java.awt.Color(255, 255, 255));
        cusBtn2.setText("Customer Details");
        cusBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusBtn2ActionPerformed(evt);
            }
        });

        supBtn2.setBackground(new java.awt.Color(155, 55, 0));
        supBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supBtn2.setForeground(new java.awt.Color(255, 255, 255));
        supBtn2.setText("Supplier Details");
        supBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtn2ActionPerformed(evt);
            }
        });

        homeBtn2.setBackground(new java.awt.Color(155, 55, 0));
        homeBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeBtn2.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn2.setText("Home");
        homeBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtn2MouseClicked(evt);
            }
        });
        homeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn2ActionPerformed(evt);
            }
        });

        inventoryBtn2.setBackground(new java.awt.Color(155, 55, 0));
        inventoryBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventoryBtn2.setForeground(new java.awt.Color(255, 255, 255));
        inventoryBtn2.setText("Inventory");
        inventoryBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtn2ActionPerformed(evt);
            }
        });

        logout2.setBackground(new java.awt.Color(255, 0, 0));
        logout2.setForeground(new java.awt.Color(255, 255, 255));
        logout2.setText("Log Out");
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
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

        javax.swing.GroupLayout btnPannel2Layout = new javax.swing.GroupLayout(btnPannel2);
        btnPannel2.setLayout(btnPannel2Layout);
        btnPannel2Layout.setHorizontalGroup(
            btnPannel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPannel2Layout.createSequentialGroup()
                .addGroup(btnPannel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnPannel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(btnPannel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inventoryBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(btnPannel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        btnPannel2Layout.setVerticalGroup(
            btnPannel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPannel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(homeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(paymentBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cusBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(supBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(inventoryBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnPannel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(mainPannel2, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymenttableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_paymenttableAncestorAdded

    }//GEN-LAST:event_paymenttableAncestorAdded

    private void paymenttableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymenttableMousePressed

        for(int i=0;i<5;i++){
            row[i] = (String) paymenttable.getValueAt(paymenttable.getSelectedRow() ,i);
            System.out.println(row[i]);
        }
        this.dispose();
        RemovePayment rp =new RemovePayment();
        rp.setVisible(true);
    }//GEN-LAST:event_paymenttableMousePressed

    private void cusnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusnameActionPerformed

    private void serachbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachbtnActionPerformed
        DefaultTableModel dt =(DefaultTableModel)paymenttable.getModel();
        dt.setRowCount(0);
        String[] row=new String[5];
        String sname=cusname.getText();
        try {
            if(!sname.equals("")){
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                Statement st=con.createStatement();
                String query="select * from payment where cname like '%"+sname+"%';";
                ResultSet rs=st.executeQuery(query);
                for(int i=0;rs.next();i++){
                    row[0]=rs.getString("payment_id");
                    row[1]=rs.getString("cname");
                    row[2]=rs.getString("ammount");
                    row[3]=rs.getString("date");
                    row[4]=rs.getString("products");
                    dt.addRow(row);
                }
            }
            else{
                showTableContents();
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Invalid Supplier Id \n Please Try Again!");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_serachbtnActionPerformed

    private void newPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPaymentBtnActionPerformed
        Payment cd =new Payment();
        this.dispose();
        cd.setVisible(true);
    }//GEN-LAST:event_newPaymentBtnActionPerformed

    private void paymentBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtn2MouseClicked
        this.setVisible(false);
        Payment payment=new Payment();
        payment.setVisible(true);
    }//GEN-LAST:event_paymentBtn2MouseClicked

    private void paymentBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentBtn2ActionPerformed

    private void cusBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusBtn2ActionPerformed
        this.dispose();
        CustomerDetails cusDetails = new CustomerDetails();
        cusDetails.setVisible(true);
    }//GEN-LAST:event_cusBtn2ActionPerformed

    private void supBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtn2ActionPerformed
        this.dispose();
        SupplierDetails supDetails = new SupplierDetails();
        supDetails.setVisible(true);
    }//GEN-LAST:event_supBtn2ActionPerformed

    private void homeBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtn2MouseClicked
        this.setVisible(false);
        Dashboard dasboard = new Dashboard();
        dasboard.setVisible(true);
    }//GEN-LAST:event_homeBtn2MouseClicked

    private void homeBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtn2ActionPerformed

    private void inventoryBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtn2ActionPerformed
        Stock stock = new Stock();
        this.dispose();
        stock.setVisible(true);
    }//GEN-LAST:event_inventoryBtn2ActionPerformed

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to Log out?","log out",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            this.dispose();
            LogIn login=new LogIn();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logout2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(new LogIn().role.equals("Owner")){
            Reports r=new Reports();
            this.dispose();
            r.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPannel2;
    private javax.swing.JButton cusBtn2;
    private javax.swing.JTextField cusname;
    private javax.swing.JButton homeBtn2;
    private javax.swing.JButton inventoryBtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton logout2;
    private javax.swing.JPanel mainPannel2;
    private javax.swing.JButton newPaymentBtn;
    private javax.swing.JButton paymentBtn2;
    private javax.swing.JTable paymenttable;
    private javax.swing.JButton serachbtn;
    private javax.swing.JButton supBtn2;
    // End of variables declaration//GEN-END:variables

}
