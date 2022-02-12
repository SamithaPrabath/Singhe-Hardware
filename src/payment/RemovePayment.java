
package payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemovePayment extends javax.swing.JFrame {

    public RemovePayment() {
        initComponents();
        showData();
    }
    static ArrayList<String> pr=new ArrayList<>();
    static         String row[]=new ViewPayemntDetails().row;

    public void showData(){
        pid.setText(row[0]);
        cusId.setText(row[1]);
        amount.setText(row[2]);
        date.setText(row[3]);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select * from sellProducts where payment_id="+row[0]+";";
            ResultSet rs=st.executeQuery(query);
            
            DefaultTableModel dt =(DefaultTableModel)productTable.getModel();
            String p[]=new String[3];
            while(rs.next()){
                p[0]=rs.getString("pname");
                p[1]=rs.getString("quantity");
                p[2]=rs.getString("price");
                pr.add(p[1]);
                dt.addRow(p);
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
        cusId = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pid = new javax.swing.JLabel();
        removebtn = new javax.swing.JButton();
        goToSupplierBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Or Remove Payment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 440, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customer Name     :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 260, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Payment Id           :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, -1));

        cusId.setEditable(false);
        jPanel1.add(cusId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 250, 30));

        amount.setEditable(false);
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Amount               :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Date                  :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        pid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 260, 30));

        removebtn.setBackground(new java.awt.Color(255, 0, 0));
        removebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removebtn.setForeground(new java.awt.Color(255, 255, 255));
        removebtn.setText("Remove");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });
        jPanel1.add(removebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 150, -1));

        goToSupplierBtn.setBackground(new java.awt.Color(0, 0, 255));
        goToSupplierBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goToSupplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        goToSupplierBtn.setText("Go to Payments Details");
        goToSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToSupplierBtnActionPerformed(evt);
            }
        });
        jPanel1.add(goToSupplierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(productTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 480, 100));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to remove payment?","remove",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input == JOptionPane.YES_OPTION){
            int sid=Integer.valueOf(pid.getText());
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                Statement st=con.createStatement();
                String query="delete from payment where payment_id="+sid+";";
                int r=st.executeUpdate(query);
                
                pid.setText("");
                cusId.setText("");
                amount.setText("");
                date.setText("");
                DefaultTableModel dt =(DefaultTableModel)productTable.getModel();
                for(int i=0;i<dt.getRowCount();i++){
                    query="select product_id,price,sold_quantity,quantity  from product where product_name='"+dt.getValueAt(i,0).toString()+"';";
                    ResultSet rs=st.executeQuery(query);
                    rs.next();
                    int sold=Integer.valueOf(rs.getString("sold_quantity"));
                    int q=Integer.valueOf(rs.getString("quantity"))+Integer.valueOf(dt.getValueAt(i,1).toString());
                    sold -=Integer.valueOf(dt.getValueAt(i,1).toString());              
                    query="update product set sold_quantity="+sold+",quantity="+q+" where product_id="+Integer.valueOf(rs.getString("product_id"))+";";
                    int r1=st.executeUpdate(query);
                    
                    
                }
                JOptionPane.showMessageDialog(this,"Removed");
                dt.setRowCount(0);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Can't Remove \n Please Try Again!");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_removebtnActionPerformed

    private void goToSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToSupplierBtnActionPerformed
        ViewPayemntDetails vs = new ViewPayemntDetails();
        this.dispose();
        vs.setVisible(true);
    }//GEN-LAST:event_goToSupplierBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double tot=0.00;
        DefaultTableModel dt =(DefaultTableModel)productTable.getModel();
        String p=pid.getText();
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            
            for(int i=0;i<dt.getRowCount();i++){
                String query="update sellproducts set quantity="+dt.getValueAt(i,1).toString()+" where payment_id="+p+" and pname='"+dt.getValueAt(i,0).toString() +"';";
                int r=st.executeUpdate(query);
                tot+=Integer.valueOf(dt.getValueAt(i,1).toString())*Double.valueOf(dt.getValueAt(i,2).toString());
                if(Integer.valueOf(pr.get(i))>Integer.valueOf(dt.getValueAt(i,1).toString())){
                    int a= Integer.valueOf(pr.get(i))-Integer.valueOf(dt.getValueAt(i,1).toString());
                    
                    query="select product_id,price,sold_quantity,quantity  from product where product_name='"+dt.getValueAt(i,0).toString()+"';";
                    ResultSet rs=st.executeQuery(query);
                    rs.next();
                    int sold=Integer.valueOf(rs.getString("sold_quantity"));
                    int q=Integer.valueOf(rs.getString("quantity"))+a;
                    sold -=a;              
                    query="update product set sold_quantity="+sold+",quantity="+q+" where product_id="+Integer.valueOf(rs.getString("product_id"))+";";
                    int r1=st.executeUpdate(query);
                }
                else if(Integer.valueOf(pr.get(i))<Integer.valueOf(dt.getValueAt(i,1).toString())){
                    int a= Integer.valueOf(dt.getValueAt(i,1).toString())-Integer.valueOf(pr.get(i));
                    query="select product_id,price,sold_quantity,quantity  from product where product_name='"+dt.getValueAt(i,0).toString()+"';";
                    ResultSet rs=st.executeQuery(query);
                    rs.next();
                    int sold=Integer.valueOf(rs.getString("sold_quantity"));
                    int q=Integer.valueOf(rs.getString("quantity"))-a;
                    sold +=a;              
                    query="update product set sold_quantity="+sold+",quantity="+q+" where product_id="+Integer.valueOf(rs.getString("product_id"))+";";
                    int r1=st.executeUpdate(query);
                }
                
            }
            amount.setText(String.valueOf(tot));
            String query="update payment set ammount="+tot+" where payment_id="+p+" ;";
            int r=st.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"Updated");
            pr.clear();
            try{
            
             
                query="select * from sellProducts where payment_id="+row[0]+";";
                ResultSet rs=st.executeQuery(query);



                while(rs.next()){

                    pr.add(rs.getString("quantity"));

                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
            
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"invalid details");
            System.out.println(e.getMessage());

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField cusId;
    private javax.swing.JLabel date;
    private javax.swing.JButton goToSupplierBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pid;
    private javax.swing.JTable productTable;
    private javax.swing.JButton removebtn;
    // End of variables declaration//GEN-END:variables
}
