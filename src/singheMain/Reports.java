
package singheMain;

import supplier.SupplierReport;
import supplier.SupplierDetails;
import payment.PaymentReport;
import payment.Payment;
import Inventory.InventoryReport;
import Inventory.Stock;
import customer.CustomerDetails;
import customer.CustomerReport;

public class Reports extends javax.swing.JFrame {

    public Reports() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPannel = new javax.swing.JPanel();
        role = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPannel3 = new javax.swing.JPanel();
        paymentBtn3 = new javax.swing.JButton();
        cusBtn = new javax.swing.JButton();
        supBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPannel.setBackground(new java.awt.Color(255, 255, 255));
        mainPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        role.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainPannel.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 95, 203, -1));

        jButton2.setBackground(new java.awt.Color(155, 55, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Product Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainPannel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 290, 100));

        jButton3.setBackground(new java.awt.Color(155, 55, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Customers Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        mainPannel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 290, 100));

        jButton4.setBackground(new java.awt.Color(155, 55, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Supplier Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        mainPannel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 290, 100));

        jButton5.setBackground(new java.awt.Color(155, 55, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Payment Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        mainPannel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 290, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Reports");
        mainPannel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPannel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPannel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        this.setVisible(false);
        LogIn login = new LogIn();
        login.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(new LogIn().role.equals("Owner")){
            Reports r=new Reports();
            this.dispose();
            r.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PaymentReport pr=new PaymentReport();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        InventoryReport pr=new InventoryReport();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CustomerReport pr=new CustomerReport();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SupplierReport pr=new SupplierReport();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPannel3;
    private javax.swing.JButton cusBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainPannel;
    private javax.swing.JButton paymentBtn3;
    private javax.swing.JLabel role;
    private javax.swing.JButton supBtn;
    // End of variables declaration//GEN-END:variables
}
