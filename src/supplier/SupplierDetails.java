
package supplier;

import payment.Payment;
import Inventory.Stock;
import customer.CustomerDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import singheMain.Dashboard;
import singheMain.LogIn;
import singheMain.Reports;


public class SupplierDetails extends javax.swing.JFrame {


    public SupplierDetails() {
        initComponents();
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select curdate() as date;";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            dateLabel.setText(rs.getString("date"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPannel = new javax.swing.JPanel();
        paymentBtn = new javax.swing.JButton();
        cusBtn = new javax.swing.JButton();
        supBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mainPannel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        supName = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        supAddress = new javax.swing.JTextField();
        phoneno = new javax.swing.JLabel();
        supPhoneno = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        generate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnPannel.setBackground(new java.awt.Color(255, 255, 255));
        btnPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentBtn.setBackground(new java.awt.Color(155, 55, 0));
        paymentBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentBtn.setForeground(new java.awt.Color(255, 255, 255));
        paymentBtn.setText("Payment");
        paymentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentBtnMouseClicked(evt);
            }
        });
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });
        btnPannel.add(paymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 265, 72));

        cusBtn.setBackground(new java.awt.Color(155, 55, 0));
        cusBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cusBtn.setForeground(new java.awt.Color(255, 255, 255));
        cusBtn.setText("Customer Details");
        cusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusBtnActionPerformed(evt);
            }
        });
        btnPannel.add(cusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 265, 72));

        supBtn.setBackground(new java.awt.Color(155, 55, 0));
        supBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supBtn.setForeground(new java.awt.Color(255, 255, 255));
        supBtn.setText("Supplier Details");
        supBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtnActionPerformed(evt);
            }
        });
        btnPannel.add(supBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 265, 72));

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
        btnPannel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 265, 72));

        inventoryBtn.setBackground(new java.awt.Color(155, 55, 0));
        inventoryBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        inventoryBtn.setText("Inventory");
        inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtnActionPerformed(evt);
            }
        });
        btnPannel.add(inventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 265, 72));

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        btnPannel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 136, 36));

        jButton1.setBackground(new java.awt.Color(155, 55, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        btnPannel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 265, 72));

        mainPannel2.setBackground(new java.awt.Color(255, 255, 255));
        mainPannel2.setPreferredSize(new java.awt.Dimension(944, 589));
        mainPannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Add Supplier");
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 62, 323, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("Supplier Name           :");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 186, -1));

        supName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supName.setPreferredSize(new java.awt.Dimension(59, 22));
        jPanel1.add(supName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 242, 30));

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        address.setText("Address                    :");
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 190, -1));

        supAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supAddress.setPreferredSize(new java.awt.Dimension(59, 22));
        jPanel1.add(supAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 242, 30));

        phoneno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneno.setText("Phone No                 :");
        phoneno.setPreferredSize(new java.awt.Dimension(186, 22));
        jPanel1.add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        supPhoneno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supPhoneno.setPreferredSize(new java.awt.Dimension(59, 22));
        supPhoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supPhonenoActionPerformed(evt);
            }
        });
        jPanel1.add(supPhoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 242, 30));

        submitbtn.setBackground(new java.awt.Color(0, 204, 0));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 172, 35));

        clearbtn.setBackground(new java.awt.Color(255, 0, 0));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 172, 35));

        viewbtn.setBackground(new java.awt.Color(0, 0, 255));
        viewbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View Supplier Details");
        viewbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 300, 34));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date.setText("Date                        :");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 300, 200, -1));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 240, 30));

        mainPannel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 604, 570));

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kukka_8-removebg-preview.png"))); // NOI18N
        mainPannel2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 250, 98));

        generate.setBackground(new java.awt.Color(0, 0, 255));
        generate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        generate.setForeground(new java.awt.Color(255, 255, 255));
        generate.setText("Genarate Supplier Card");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        mainPannel2.add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 530, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtnMouseClicked
        this.setVisible(false);
        Payment payment=new Payment();
        payment.setVisible(true);
    }//GEN-LAST:event_paymentBtnMouseClicked

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        this.setVisible(false);
        Dashboard dasboard = new Dashboard();
        dasboard.setVisible(true);
    }//GEN-LAST:event_homeBtnMouseClicked

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
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

    private void cusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusBtnActionPerformed
        this.dispose();
        CustomerDetails cusDetails = new CustomerDetails();
        cusDetails.setVisible(true);
    }//GEN-LAST:event_cusBtnActionPerformed

    private void supBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtnActionPerformed
        this.dispose();
        SupplierDetails supDetails = new SupplierDetails();
        supDetails.setVisible(true);
    }//GEN-LAST:event_supBtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        ViewSupplierDetails vs=new ViewSupplierDetails();
        this.dispose();
        vs.setVisible(true);
    }//GEN-LAST:event_viewbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        supAddress.setText("");
        supPhoneno.setText("");
        supName.setText("");
        supAddress.setText("");
        supAddress.setText("");
        supAddress.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void supPhonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supPhonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supPhonenoActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to add a supplier?");
        if(!supName.equals("") && !supAddress.equals("") && !supPhoneno.equals("")){
            try{
                 Pattern pattern = Pattern.compile("^[0]");
                   Pattern pattern1 = Pattern.compile("^[a-zA-Z\\s]");
                    Pattern pattern2 = Pattern.compile("^[0-9]");
                String b=supPhoneno.getText();
                 Matcher matcher = pattern.matcher(b);
                    Matcher matcher1 = pattern1.matcher(supName.getText());
                     Matcher matcher2 = pattern2.matcher(supAddress.getText());
                int a=b.length();
               // System.out.println(a);
                if(input == JOptionPane.YES_OPTION && a==10 && !b.equals("0000000000") && matcher.find() && matcher1.find() && !matcher2.find()){
                    String name=supName.getText();
                    String add=supAddress.getText();
                    String tp=supPhoneno.getText();
                    try {
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                        Statement st=con.createStatement();
                        String q1="select * from supplier where supplier_name='"+name+"';";
                        ResultSet r1=st.executeQuery(q1);
                        if(!r1.next()){
                            String q="select * from supplier where phone_no="+tp+";";
                            ResultSet r=st.executeQuery(q);
                            if(!r.next()){
                                String query="insert into supplier(supplier_name,address,date,phone_no) values('"+name+"','"+add+"',now(),'"+tp+"');";
                                int rs=st.executeUpdate(query);
                                JOptionPane.showMessageDialog(this,"Supplier Added");
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"This Supplier Already Added");

                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this,"This Supplier Already Added");

                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(this,"Can't Add Supplier \n Please Try Again!");
                        supAddress.setText("");
                        supPhoneno.setText("");
                        supName.setText("");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Details");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Invalid Phone Number");
                supPhoneno.setText("");
            }
        }
        else{
             JOptionPane.showMessageDialog(this,"All feilds must be required!");
        }
    
    }//GEN-LAST:event_submitbtnActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        if(!supPhoneno.getText().equals("")){
            int input = JOptionPane.showConfirmDialog(this, "Do you want to make a supplier card?");
            if(input == JOptionPane.YES_OPTION){
                SupplierCard sc =new SupplierCard();
                sc.setVisible(true);
            }
        }
    }//GEN-LAST:event_generateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(new LogIn().role.equals("Owner")){
            Reports r=new Reports();
            this.dispose();
            r.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JPanel btnPannel;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton cusBtn;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton generate;
    private javax.swing.JLabel header;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainPannel2;
    private javax.swing.JLabel name;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JLabel phoneno;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField supAddress;
    private javax.swing.JButton supBtn;
    private javax.swing.JTextField supName;
    private javax.swing.JTextField supPhoneno;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
