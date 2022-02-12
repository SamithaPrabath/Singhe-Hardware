
package Inventory;

import static Inventory.Stock.product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Addmoreproducts extends javax.swing.JFrame {

    public Addmoreproducts() {
        initComponents();
        System.out.println(new Stock().product[0]);
        pid.setText(product[0]);
        sid.setText(product[1]);
        pname.setText(product[2]);
        date.setText(product[5]);
        price.setText("0");
        quantity.setText("0");
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
        jLabel7 = new javax.swing.JLabel();
        pid = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add More Products");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 440, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Id       :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 260, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Id        :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, -1));

        sid.setEditable(false);
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 250, 30));

        pname.setEditable(false);
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Prodcut name    :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Date                :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 170, -1));

        pid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 260, 30));

        updatebtn.setBackground(new java.awt.Color(0, 204, 0));
        updatebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Add");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 130, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go to Inventory");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        price.setText("0");
        price.setPreferredSize(new java.awt.Dimension(59, 29));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 242, 27));

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLabel.setText("Price                    :");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 180, -1));

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        quantityLabel.setText("Quantity               :");
        jPanel1.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 210, 20));

        quantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantity.setText("0");
        quantity.setPreferredSize(new java.awt.Dimension(59, 29));
        quantity.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                quantityPropertyChange(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
        });
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 242, 30));

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalLabel.setText("Total Amount        :");
        totalLabel.setPreferredSize(new java.awt.Dimension(186, 22));
        jPanel1.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to add a product?");
        if(!pname.equals("") && !sid.equals("") && !quantity.equals("0") && !price.equals("0")){
            if(input == JOptionPane.YES_OPTION){
                Pattern pattern2 = Pattern.compile("^[0-9]");
                Matcher matcher2 = pattern2.matcher(pname.getText());
                if(!matcher2.find()){
                    int sid1=Integer.valueOf(sid.getText());
                    String pname1=pname.getText();
                    int pr=Integer.valueOf(price.getText());
                    int q1=Integer.valueOf(quantity.getText());
                    int t=Integer.valueOf(amount.getText().substring(4));
                    try {
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                        Statement st=con.createStatement();
                        String query="select quantity from product where product_id="+pid.getText()+";";
                        ResultSet rs1=st.executeQuery(query);
                        rs1.next();
                        int q=q1+Integer.valueOf(rs1.getString("quantity"));
                        query="update product set price="+pr+",quantity="+q+",date=curdate() where product_id="+pid.getText()+";";
                        int rs=st.executeUpdate(query);
                        query="insert into productbill(supplier_id,product_name,date,price,quantity,total) values("+sid1+",'"+pname1+"',now(),"+pr+","+q1+","+t+");";
                        rs=st.executeUpdate(query);
                        JOptionPane.showMessageDialog(this,"Product Added");
                        ProductBill p=new ProductBill();
                        p.setVisible(true);
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(this,"Can't Add Product \n Please Try Again!\n(chek your supplier id)");
                        System.out.println(e.getMessage());
                        price.setText("0");
                        quantity.setText("0");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid product name");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"All Feilds must be required!");
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Stock stock = new Stock();
        this.dispose();
        stock.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        try{
            if(!price.getText().equals("")){
                int t=Integer.valueOf(price.getText())*Integer.valueOf(quantity.getText());
                amount.setText("Rs. "+String.valueOf(t));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Invalid price type");
            price.setText("0");
            amount.setText("Rs. 0.00");
        }
    }//GEN-LAST:event_priceKeyReleased

    private void quantityPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_quantityPropertyChange

    }//GEN-LAST:event_quantityPropertyChange

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
        try{
            if(!quantity.getText().equals("")){
                int t=Integer.valueOf(price.getText())*Integer.valueOf(quantity.getText());
                amount.setText("Rs. "+String.valueOf(t));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Invalid Quantity type");
            quantity.setText("0");
            amount.setText("Rs. 0.00");
        }
    }//GEN-LAST:event_quantityKeyReleased

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField price;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField sid;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
