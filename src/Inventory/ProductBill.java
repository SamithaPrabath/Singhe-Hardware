
package Inventory;

import static Inventory.MonthlyInventoryReport.m;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ProductBill extends javax.swing.JFrame {

    public ProductBill() {
        initComponents();
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select * from productbill order by date desc limit 1;";
            ResultSet rs =st.executeQuery(query);
            rs.next();
            billid.setText(rs.getString("billid"));
            total.setText("Rs : "+rs.getString("total"));
            supid.setText(rs.getString("supplier_id"));
            quantity.setText(rs.getString("quantity"));
            price.setText(rs.getString("price"));
            pname.setText("Rs : "+rs.getString("product_name"));
            date.setText(rs.getString("date"));
            query="select supplier_name from supplier where supplier_id="+Integer.valueOf(rs.getString("supplier_id"))+";";
            rs =st.executeQuery(query);
            rs.next();
            supname.setText(rs.getString("supplier_name"));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't genarate bill \n Please Try Again!\n(chek your supplier id)");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        supid = new javax.swing.JLabel();
        supname = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        billid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kukka_8-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 260, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 120));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(155, 55, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("          37/13/E, Wanaguru road,Hokandara");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 310, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 830, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Total                    :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Date                    :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Supplier Id           :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Supplier Name     :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Product Name     :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Price                    :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Quantity              :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 140, 30));

        total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        total.setText("jLabel10");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 200, 30));

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date.setText("jLabel10");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 200, 30));

        supid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supid.setText("jLabel10");
        jPanel3.add(supid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 200, 30));

        supname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supname.setText("jLabel10");
        jPanel3.add(supname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 200, 30));

        pname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pname.setText("jLabel10");
        jPanel3.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 200, 30));

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.setText("jLabel10");
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 200, 30));

        quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantity.setText("jLabel10");
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 200, 30));

        closeBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel3.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        billid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        billid.setText("jLabel10");
        jPanel3.add(billid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 830, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
         this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_closeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{

            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("date", date.getText());
            hm.put("id", supid.getText());
            hm.put("pname", pname.getText());
            hm.put("sname", supname.getText());
            hm.put("price", price.getText());
            hm.put("quantity", quantity.getText());
            hm.put("total", total.getText());
            
           // JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/Inventory/SingheMonthlyInventoryReport.jasper"));
           JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Moditha punchihewa\\Documents\\NetBeansProjects\\Singhe\\src\\Inventory\\productBill.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billid;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel price;
    private javax.swing.JLabel quantity;
    private javax.swing.JLabel supid;
    private javax.swing.JLabel supname;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
