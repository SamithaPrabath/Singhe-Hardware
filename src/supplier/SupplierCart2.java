
package supplier;

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
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class SupplierCart2 extends javax.swing.JFrame {


    public SupplierCart2() {
        initComponents();
        String id=new UpdateSupplier().sid;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select * from supplier where supplier_id="+id+";";
            ResultSet rs =st.executeQuery(query);
            rs.next();
            date.setText(rs.getString("date"));
            supaddress.setText(rs.getString("address"));
            supid.setText(rs.getString("supplier_id"));
            supname.setText(rs.getString("supplier_name"));
            tpno.setText(rs.getString("phone_no"));
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this,"Can't genarate card \n Please Try Again!\n(chek your supplier id)");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        supid = new javax.swing.JLabel();
        supname = new javax.swing.JLabel();
        supaddress = new javax.swing.JLabel();
        tpno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Date                    :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Supplier Id           :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Supplier Name     :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Supplier Address  :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Phone No            :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 140, 30));

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date.setText("jLabel10");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 200, 30));

        supid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supid.setText("jLabel10");
        jPanel3.add(supid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 200, 30));

        supname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supname.setText("jLabel10");
        jPanel3.add(supname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 200, 30));

        supaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supaddress.setText("jLabel10");
        jPanel3.add(supaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 200, 30));

        tpno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tpno.setText("jLabel10");
        jPanel3.add(tpno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 200, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 560, 350));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(155, 55, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("          37/13/E, Wanaguru road,Hokandara");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 300, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 560, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kukka_8-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 260, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{

            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            HashMap<String,Object> hm=new HashMap<>();
            hm.put("date", date.getText());
            hm.put("id", supid.getText());
            hm.put("name", supname.getText());
            hm.put("address", supaddress.getText());
            hm.put("tpNo", tpno.getText());
            
            
           //JasperReport jr= (JasperReport)JRLoader.loadObject(getClass().getResourceAsStream("/supplier/SupplierCard.jasper"));
           JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\Moditha punchihewa\\Documents\\NetBeansProjects\\Singhe\\src\\supplier\\SupplierCard.jrxml");
            JasperPrint jp=JasperFillManager.fillReport(jr, hm,con);
            JasperViewer.viewReport(jp,false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel supaddress;
    private javax.swing.JLabel supid;
    private javax.swing.JLabel supname;
    private javax.swing.JLabel tpno;
    // End of variables declaration//GEN-END:variables
}
