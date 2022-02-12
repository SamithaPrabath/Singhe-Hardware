
package Inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class UpdateProduct extends javax.swing.JFrame {

  
    public UpdateProduct() {
        initComponents();
        String product[]=new Stock().product;
        System.out.println(new Stock().product[0]);
        pid.setText(product[0]);
        sid.setText(product[1]);
        pname.setText(product[2]);
        price.setText(product[4]);
        date.setText(product[5]);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pid = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        removebtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Or Remove Product");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 440, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Id       :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 260, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Id        :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, -1));

        sid.setEditable(false);
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 250, 30));

        pname.setEditable(false);
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Prodcut name    :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, -1));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Price                :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Date                :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        pid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 260, 30));

        updatebtn.setBackground(new java.awt.Color(0, 204, 0));
        updatebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 130, -1));

        removebtn.setBackground(new java.awt.Color(255, 0, 0));
        removebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removebtn.setForeground(new java.awt.Color(255, 255, 255));
        removebtn.setText("Remove");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });
        jPanel1.add(removebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 150, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go to Inventory");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add more Products");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to Update Product?");
        if(input == JOptionPane.YES_OPTION){
            int prid=Integer.valueOf(pid.getText());
            int suid =Integer.valueOf(sid.getText());
            String name=pname.getText();
            
            
            try {
                double pr=Double.valueOf(price.getText());
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                Statement st=con.createStatement();
                String query="update product set supplier_id="+suid+",product_name='"+name+"',price="+pr+" where product_id="+prid+";";
                int rs=st.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Updated");

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Invalid Price");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to remove product?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            int prid=Integer.valueOf(pid.getText());
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                Statement st=con.createStatement();
                String query="delete from product where product_id="+prid+";";
                int rs=st.executeUpdate(query);
                query="delete from sellproducts where pname='"+pname.getText()+"';";
                rs=st.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Removed");
                pid.setText("");
                sid.setText("");
                pname.setText("");
                price.setText("");
                date.setText("");
                

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Can't Remove \n Please Try Again!");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_removebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Stock stock = new Stock();
        this.dispose();
        stock.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Addmoreproducts ap=new Addmoreproducts();
        this.dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField price;
    private javax.swing.JButton removebtn;
    private javax.swing.JTextField sid;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
