
package payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentBill extends javax.swing.JFrame {

    public PaymentBill() {
        initComponents();
        showDetails();
    }
    void showDetails(){
        String p[]=new Payment().pr;
        date.setText(p[0]);
        cname.setText(p[1]);
        cid.setText(p[2]);
        total.setText(p[3]);
        balance.setText(String.valueOf(Double.valueOf(p[4])-Double.valueOf(p[3])));
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select payment_id from payment order by payment_id desc limit 1;";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            String pid=rs.getString("payment_id");
            query="select * from sellProducts where payment_id="+pid+";";
            rs=st.executeQuery(query);
            String p1[]=new String[3];
            DefaultTableModel dt =(DefaultTableModel)product.getModel();
           
            while(rs.next()){
                p1[0]=rs.getString("pname");
                p1[1]=rs.getString("quantity");
                p1[2]=rs.getString("price");
                dt.addRow(p1);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product = new javax.swing.JTable();
        cid = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kukka_8-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 240, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 120));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(155, 55, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("          37/13/E, Wanaguru road,Hokandara");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 320, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 830, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Customer ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 110, -1));

        jLabel4.setText("Date");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 110, 10));

        jLabel5.setText("Customer Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 110, -1));

        product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(product);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 410, 120));

        cid.setEditable(false);
        jPanel3.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 210, -1));

        date.setEditable(false);
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 210, -1));

        cname.setEditable(false);
        jPanel3.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 210, -1));

        jLabel6.setText("Total");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 90, -1));

        total.setEditable(false);
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 210, 20));

        jLabel7.setText("Balance ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 70, -1));

        balance.setEditable(false);
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        jPanel3.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 210, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 830, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balance;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable product;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
