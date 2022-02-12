
package customer;

import customer.CustomCard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import singheMain.Dashboard;
import singheMain.LogIn;
import payment.Payment;
import singheMain.Reports;
import Inventory.Stock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import supplier.SupplierDetails;

public class CustomerDetails extends javax.swing.JFrame {

    public CustomerDetails() {
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
        jButton2 = new javax.swing.JButton();
        mainPannel2 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        cusname = new javax.swing.JTextField();
        cusAddress = new javax.swing.JTextField();
        header = new javax.swing.JLabel();
        phoneno = new javax.swing.JLabel();
        cusPhonno = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnPannel.setBackground(new java.awt.Color(255, 255, 255));

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

        jButton2.setBackground(new java.awt.Color(155, 55, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reports");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPannelLayout = new javax.swing.GroupLayout(btnPannel);
        btnPannel.setLayout(btnPannelLayout);
        btnPannelLayout.setHorizontalGroup(
            btnPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPannelLayout.createSequentialGroup()
                .addGroup(btnPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnPannelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(btnPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(btnPannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        btnPannelLayout.setVerticalGroup(
            btnPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPannelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(cusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(supBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        mainPannel2.setBackground(new java.awt.Color(255, 255, 255));
        mainPannel2.setPreferredSize(new java.awt.Dimension(944, 589));
        mainPannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kukka_8-removebg-preview.png"))); // NOI18N
        mainPannel2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 249, 98));

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        address.setText("Address                   :");
        mainPannel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 186, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date.setText("Date                        :");
        mainPannel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, 20));

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Customer Name        :");
        mainPannel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 232, 186, 30));

        cusname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cusname.setPreferredSize(new java.awt.Dimension(59, 22));
        mainPannel2.add(cusname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 242, 30));

        cusAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cusAddress.setPreferredSize(new java.awt.Dimension(59, 22));
        mainPannel2.add(cusAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 242, 30));

        header.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Add Customer");
        mainPannel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 323, -1));

        phoneno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneno.setText("Phone No                 :");
        phoneno.setPreferredSize(new java.awt.Dimension(186, 22));
        mainPannel2.add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        cusPhonno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cusPhonno.setPreferredSize(new java.awt.Dimension(59, 22));
        cusPhonno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusPhonnoActionPerformed(evt);
            }
        });
        mainPannel2.add(cusPhonno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 242, 30));

        submitbtn.setBackground(new java.awt.Color(0, 204, 0));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        mainPannel2.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 172, 35));

        viewBtn.setBackground(new java.awt.Color(0, 0, 255));
        viewBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewBtn.setText("View Customer Details");
        viewBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        mainPannel2.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 300, 34));

        clearBtn.setBackground(new java.awt.Color(255, 0, 0));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        mainPannel2.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 172, 35));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mainPannel2.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 240, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Genarate Customer Card");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPannel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NIC                        :");
        mainPannel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        nic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mainPannel2.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtnMouseClicked
        this.setVisible(false);
        Payment payment=new Payment();
        payment.setVisible(true);
    }//GEN-LAST:event_paymentBtnMouseClicked

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        
    }//GEN-LAST:event_paymentBtnActionPerformed

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

    private void cusPhonnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusPhonnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusPhonnoActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        ViewCustomerDetails vc=new ViewCustomerDetails();
        this.dispose();
        vc.setVisible(true);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
         cusAddress.setText("");
         cusPhonno.setText("");
         cusname.setText("");
         
    }//GEN-LAST:event_clearBtnActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to add a customer?");
         if(!cusname.equals("") && !cusAddress.equals("") && !cusPhonno.equals("")){
            try{
               
                    Pattern pattern = Pattern.compile("^[0][0-9]{9}");
                    Pattern pattern1 = Pattern.compile("^[a-zA-Z\\s]");
                    Pattern pattern2 = Pattern.compile("^[0-9]");
                    Pattern oldpattern=Pattern.compile("^[Pattern0-9]{9}v$");
                    Pattern newpattern=Pattern.compile("^[0-9]{12}$");
                    
                    Matcher oldmatcher=oldpattern.matcher(nic.getText());
                    Matcher newmatcher=newpattern.matcher(nic.getText());
                    if(oldmatcher.find() || newmatcher.find()){

                        String b=cusPhonno.getText();
                        Matcher matcher = pattern.matcher(b);
                        Matcher matcher1 = pattern1.matcher(cusname.getText());
                        Matcher matcher2 = pattern2.matcher(cusAddress.getText());
                        int a=b.length();
                        System.out.println(a);
                        if(input == JOptionPane.YES_OPTION && a==10 && !b.equals("0000000000") && matcher.find() && matcher1.find() && !matcher2.find() ){
                            String name=cusname.getText();
                            String add=cusAddress.getText();
                            String tp=cusPhonno.getText();
                            try {
                                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                                Statement st=con.createStatement();
                                String q="select * from customers where phone_no="+tp+" or nic='"+nic.getText()+"';";
                                ResultSet r=st.executeQuery(q);
                                if(!r.next()){
                                    String query="insert into customers(customer_name,address,date,phone_no,nic) values('"+name+"','"+add+"',now(),'"+tp+"','"+nic.getText()+"');";
                                    int rs=st.executeUpdate(query);
                                    JOptionPane.showMessageDialog(this,"Customer Added");
                                }
                                else{
                                    JOptionPane.showMessageDialog(this,"This Customer Already Added");

                                }


                            }
                            catch(Exception e){
                                JOptionPane.showMessageDialog(this,"Can't Add Customer \n Please Try Again!");
                                System.out.println(e.getMessage());
                                cusAddress.setText("");
                                cusPhonno.setText("");
                                cusname.setText("");
                                nic.setText("");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this,"Invalid Details");
                           
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Invalid Nic");
                         nic.setText("");
                    }
                
            }
             
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Invalid Phone Number");
                System.out.print(e.getMessage());
                cusPhonno.setText("");
            }
         }
        else{
           JOptionPane.showMessageDialog(this,"All feilds must be required!");
        }
       
    }//GEN-LAST:event_submitbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!cusPhonno.getText().equals("")){
            int input = JOptionPane.showConfirmDialog(this, "Do you want make a customercard?");
            if(input == JOptionPane.YES_OPTION){
                CustomCard cc=new CustomCard();
                cc.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(new LogIn().role.equals("Owner")){
            Reports r=new Reports();
            this.dispose();
            r.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JPanel btnPannel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField cusAddress;
    private javax.swing.JButton cusBtn;
    private javax.swing.JTextField cusPhonno;
    private javax.swing.JTextField cusname;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel header;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainPannel2;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nic;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JLabel phoneno;
    private javax.swing.JButton submitbtn;
    private javax.swing.JButton supBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
