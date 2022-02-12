
package supplier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UpdateSupplier extends javax.swing.JFrame {

    static String sid="";
    public UpdateSupplier() {
        initComponents();
        String supplier[]=new ViewSupplierDetails().supplier;
        System.out.println(new ViewSupplierDetails().supplier[0]);
        id.setText(supplier[0]);
        sid=id.getText();
        sname.setText(supplier[1]);
        address.setText(supplier[2]);
        tpno.setText(supplier[3]);
        date.setText(supplier[4]);
        String row[]=new String[2];
        try{
            DefaultTableModel dt=(DefaultTableModel)productTable.getModel();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select product_name,quantity from product where supplier_id="+supplier[0]+";";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                row[0]=rs.getString("product_name");
                row[1]=rs.getString("quantity");
                dt.addRow(row);
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
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tpno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        removebtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Or Remove Supplier");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 440, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Name      :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 260, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Supplier Id           :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, -1));

        sname.setEditable(false);
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 250, 30));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Supplier Address   :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, -1));
        jPanel1.add(tpno, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Phone No            :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Date                  :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 260, 30));

        updatebtn.setBackground(new java.awt.Color(0, 204, 0));
        updatebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 130, -1));

        removebtn.setBackground(new java.awt.Color(255, 0, 0));
        removebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removebtn.setForeground(new java.awt.Color(255, 255, 255));
        removebtn.setText("Remove");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });
        jPanel1.add(removebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 150, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go to Supplier Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Added Products");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 180, -1));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 480, 150));

        jButton2.setText("Genrate Supplier Card");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to update a supplier?");
        if(input == JOptionPane.YES_OPTION){
             Pattern pattern = Pattern.compile("^[0]");
                    Pattern pattern1 = Pattern.compile("^[a-zA-Z\\s]");
                     Pattern pattern2 = Pattern.compile("^[0-9]");
                     
                     

            String b=tpno.getText();
            Matcher matcher = pattern.matcher(b);
           int a=b.length();
            Matcher matcher2 = pattern2.matcher(address.getText());
            if(a==10 && !b.equals("0000000000") && matcher.find() && !matcher2.find()){
                int sid=Integer.valueOf(id.getText());
                String add =address.getText();
                String name=sname.getText();
                String tp=tpno.getText();
                try {
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                    Statement st=con.createStatement();
                    String query="update supplier set supplier_name='"+name+"',address='"+add+"',phone_no='"+tp+"' where supplier_id="+sid+";";
                    int rs=st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Updated");

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Can't Update \n Please Try Again!");
                    System.out.println(e.getMessage());
                }
            }
            else{
                 JOptionPane.showMessageDialog(this,"Invalid details");
            }
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to remove Supplier?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            int sid=Integer.valueOf(id.getText());
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                Statement st=con.createStatement();
                String query="delete from supplier where supplier_id="+sid+";";
                int rs=st.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Removed");
                id.setText("");
                sname.setText("");
                address.setText("");
                tpno.setText("");
                date.setText("");

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Can't Remove \n Please Try Again!");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_removebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ViewSupplierDetails vs = new ViewSupplierDetails();
        this.dispose();
        vs.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SupplierCart2 s2=new SupplierCart2();
        s2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel date;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    private javax.swing.JButton removebtn;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField tpno;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
