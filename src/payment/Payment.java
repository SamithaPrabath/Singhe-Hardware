
package payment;

import Inventory.Stock;
import customer.CustomerDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import singheMain.Dashboard;
import singheMain.LogIn;
import singheMain.Reports;
import supplier.SupplierDetails;
import static payment.ViewPayemntDetails.row;

public class Payment extends javax.swing.JFrame {

    public Payment() {
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
        
        itemsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPannel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mainPannel1 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnPannel = new javax.swing.JPanel();
        paymentBtn = new javax.swing.JButton();
        cusBtn = new javax.swing.JButton();
        supBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mainPannel2 = new javax.swing.JPanel();
        viewbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        submitbtn = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        cusId = new javax.swing.JTextField();
        cusIdLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        header = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        items = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        cName = new javax.swing.JTextField();
        customers = new javax.swing.JComboBox<>();
        getTotalBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel12 = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();

        mainPannel.setBackground(new java.awt.Color(255, 255, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jayasinghe");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WellCome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Anuja");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Owner");

        javax.swing.GroupLayout mainPannelLayout = new javax.swing.GroupLayout(mainPannel);
        mainPannel.setLayout(mainPannelLayout);
        mainPannelLayout.setHorizontalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPannelLayout.createSequentialGroup()
                            .addGap(359, 359, 359)
                            .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(mainPannelLayout.createSequentialGroup()
                            .addGap(328, 328, 328)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        mainPannelLayout.setVerticalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPannel1.setBackground(new java.awt.Color(255, 255, 255));

        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Jayasinghe");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WellCome");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Anuja");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Owner");

        javax.swing.GroupLayout mainPannel1Layout = new javax.swing.GroupLayout(mainPannel1);
        mainPannel1.setLayout(mainPannel1Layout);
        mainPannel1Layout.setHorizontalGroup(
            mainPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannel1Layout.createSequentialGroup()
                .addGroup(mainPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPannel1Layout.createSequentialGroup()
                            .addGap(359, 359, 359)
                            .addGroup(mainPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(mainPannel1Layout.createSequentialGroup()
                            .addGap(328, 328, 328)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPannel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        mainPannel1Layout.setVerticalGroup(
            mainPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(49, 49, 49)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(63, 63, 63)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        btnPannel.setBackground(new java.awt.Color(255, 255, 255));
        btnPannel.setPreferredSize(new java.awt.Dimension(366, 703));
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
        btnPannel.add(paymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 140, 265, 72));

        cusBtn.setBackground(new java.awt.Color(155, 55, 0));
        cusBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cusBtn.setForeground(new java.awt.Color(255, 255, 255));
        cusBtn.setText("Customer Details");
        cusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cusBtnMouseClicked(evt);
            }
        });
        btnPannel.add(cusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 250, 265, 72));

        supBtn.setBackground(new java.awt.Color(155, 55, 0));
        supBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supBtn.setForeground(new java.awt.Color(255, 255, 255));
        supBtn.setText("Supplier Details");
        supBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtnActionPerformed(evt);
            }
        });
        btnPannel.add(supBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 265, 72));

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
        btnPannel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 31, 265, 72));

        inventoryBtn.setBackground(new java.awt.Color(155, 55, 0));
        inventoryBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        inventoryBtn.setText("Inventory");
        inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtnActionPerformed(evt);
            }
        });
        btnPannel.add(inventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 265, 72));

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        btnPannel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 136, 36));

        jButton1.setBackground(new java.awt.Color(155, 55, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        btnPannel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 265, 72));

        mainPannel2.setBackground(new java.awt.Color(255, 255, 255));
        mainPannel2.setPreferredSize(new java.awt.Dimension(944, 589));
        mainPannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewbtn.setBackground(new java.awt.Color(0, 0, 255));
        viewbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View Payment Details");
        viewbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        mainPannel2.add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 650, 300, 34));

        clearbtn.setBackground(new java.awt.Color(255, 0, 0));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        mainPannel2.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 172, 35));

        submitbtn.setBackground(new java.awt.Color(0, 204, 0));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        mainPannel2.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 172, 35));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date.setText("Date                       :");
        mainPannel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        cusId.setEditable(false);
        cusId.setPreferredSize(new java.awt.Dimension(59, 22));
        cusId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusIdActionPerformed(evt);
            }
        });
        mainPannel2.add(cusId, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 60, -1));

        cusIdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cusIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cusIdLabel.setText("Customer Id      :");
        mainPannel2.add(cusIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 150, -1));

        amountLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        amountLabel.setText("Amount                  :");
        mainPannel2.add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 180, -1));

        amount.setEditable(false);
        amount.setText("Rs : 0.00");
        amount.setPreferredSize(new java.awt.Dimension(59, 22));
        mainPannel2.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 242, 30));

        header.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Add Payment");
        mainPannel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 323, -1));

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kukka_8-removebg-preview.png"))); // NOI18N
        mainPannel2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 249, 98));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mainPannel2.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 240, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Product Name  :");
        mainPannel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, -1));

        pname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnameKeyReleased(evt);
            }
        });
        mainPannel2.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 170, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Quantity  :");
        mainPannel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 110, -1));

        quantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        mainPannel2.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 70, 30));

        addBtn.setBackground(new java.awt.Color(0, 0, 255));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        mainPannel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, -1, -1));

        items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsActionPerformed(evt);
            }
        });
        mainPannel2.add(items, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 120, 30));

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        itemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itemsTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(itemsTable);

        mainPannel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, 100));

        jLabel11.setText("Customer Name :");
        mainPannel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        cName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNameActionPerformed(evt);
            }
        });
        cName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cNameKeyReleased(evt);
            }
        });
        mainPannel2.add(cName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 120, -1));

        customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersActionPerformed(evt);
            }
        });
        mainPannel2.add(customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 110, -1));

        getTotalBtn.setBackground(new java.awt.Color(0, 204, 0));
        getTotalBtn.setForeground(new java.awt.Color(255, 255, 255));
        getTotalBtn.setText("Get Total");
        getTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getTotalBtnActionPerformed(evt);
            }
        });
        mainPannel2.add(getTotalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        removeBtn.setBackground(new java.awt.Color(255, 0, 0));
        removeBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        mainPannel2.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, -1));
        mainPannel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Payment Amount    :");
        mainPannel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 180, 30));

        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        mainPannel2.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
            .addComponent(btnPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String pr[]=new String[5];
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
        cusDetails.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_cusBtnMouseClicked

    private void supBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtnActionPerformed
        this.dispose();
        SupplierDetails supDetails = new SupplierDetails();
        supDetails.setVisible(true);
    }//GEN-LAST:event_supBtnActionPerformed

    private void inventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtnActionPerformed
         Stock stock = new Stock();
        this.dispose();
        stock.setVisible(true);
    }//GEN-LAST:event_inventoryBtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        ViewPayemntDetails vp=new ViewPayemntDetails();
        this.dispose();
        vp.setVisible(true);
    }//GEN-LAST:event_viewbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        cusId.setText("");
        amount.setText("Rs : 0.00");
        pname.setText("");
        quantity.setText("");
        DefaultTableModel dt =(DefaultTableModel)itemsTable.getModel();
        dt.setRowCount(0);
        customers.removeAllItems();
        items.removeAllItems();
        cName.setText("");
        pay.setText("");
        
    }//GEN-LAST:event_clearbtnActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to make a payment?");
        if(input == JOptionPane.YES_OPTION){
            try{
                
                double b=Double.valueOf(pay.getText());
                double amt=Double.valueOf((amount.getText()).substring(5));
                int cusid=Integer.valueOf(cusId.getText());
                DefaultTableModel dt =(DefaultTableModel)itemsTable.getModel();
                try {
                    String s="";
                    for(int i=0;i<dt.getRowCount();i++){
                        if(i<(dt.getRowCount()-1)){
                          s+=dt.getValueAt(i,0).toString()+",";  
                        }
                        else{
                            s+=dt.getValueAt(i,0).toString();
                        }

                    }
                    if(Double.valueOf(pay.getText())>=amt){
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                        Statement st=con.createStatement();
                        String query="insert into payment(ammount,customer_id,date,products,cname) values("+amt+","+cusid+",curdate(),'"+s+"','"+cName.getText()+"');";
                        int r1=st.executeUpdate(query);               
                        //System.out.println(sold);
                        ResultSet rs;
                        query="select payment_id from payment order by payment_id desc limit 1;";
                        rs=st.executeQuery(query);
                        rs.next();
                        String pid=rs.getString("payment_id");
                        for(int i=0;i<dt.getRowCount();i++){                
                            query="select product_id,price,sold_quantity,quantity  from product where product_name='"+dt.getValueAt(i,0).toString()+"';";
                            rs=st.executeQuery(query);
                            rs.next();
                            int sold=Integer.valueOf(rs.getString("sold_quantity"));
                            int q=Integer.valueOf(rs.getString("quantity"))-Integer.valueOf(dt.getValueAt(i,1).toString());  
                            sold +=Integer.valueOf(dt.getValueAt(i,1).toString());              
                            query="update product set sold_quantity="+sold+" where product_id="+Integer.valueOf(rs.getString("product_id"))+";";
                            int r=st.executeUpdate(query);
                            query="insert into sellProducts(payment_id,quantity,pname,price,date) values("+pid+","+dt.getValueAt(i,1).toString()+",'"+dt.getValueAt(i,0).toString()+"',"+dt.getValueAt(i,2).toString()+",curdate());";
                            r=st.executeUpdate(query);
                        }

                        dt.setRowCount(0);
                        pr[0]=dateLabel.getText();
                        pr[1]=cName.getText();
                        pr[2]=String.valueOf(cusid);
                        pr[3]=String.valueOf(amt);
                        pr[4]=pay.getText();
                        JOptionPane.showMessageDialog(this,"Payment Added");
                        PaymentBill pb=new PaymentBill();

                        pb.setVisible(true);
                    }
                    else{
                      JOptionPane.showMessageDialog(this,"payment Amount less than total amount");  
                    }
                
                

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Can't Add Payment");

                System.out.println(e.getMessage());
                amount.setText("Rs : 0.00");
                cusId.setText("");
            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"All field must be required");
                pay.setText("");
                }
        }
        
    }//GEN-LAST:event_submitbtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel dt =(DefaultTableModel)itemsTable.getModel();
        String p[]=new String[3];
        try{
            int a=Integer.valueOf(quantity.getText());
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                Statement st=con.createStatement();
                String query="select product_id,price,sold_quantity,quantity  from product where product_name='"+pname.getText()+"';";
                ResultSet rs =st.executeQuery(query);
                rs.next();
                
                int sold =Integer.valueOf(quantity.getText())+Integer.valueOf(rs.getString("sold_quantity"));
                p[0]=pname.getText();
                p[1]=quantity.getText();
                p[2]=rs.getString("price");
                if(Integer.valueOf(rs.getString("quantity"))>=sold){

                  dt.addRow(p);

                }

                else{
                    JOptionPane.showMessageDialog(this,"Not enough products in the stock");
                }


            }
            catch(Exception e){
                System.out.println(e.getMessage());
                quantity.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Invalid Qunatity Please Enter Integer Only !");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void pnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnameKeyReleased
        items.removeAllItems();
        try {
            if(!pname.getText().equals("")){
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                Statement st=con.createStatement();
                String query="select product_name from product where product_name like '"+pname.getText()+"%';";
                ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                    items.addItem(rs.getString("product_name"));
                }
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Payment \n Please Try Again!(check your user id Again)");

            System.out.println(e.getMessage());
            amount.setText("Rs : 0.00");
            cusId.setText("");
        }
    }//GEN-LAST:event_pnameKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(new LogIn().role.equals("Owner")){
            Reports r=new Reports();
            this.dispose();
            r.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNameActionPerformed

    private void cNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNameKeyReleased
        customers.removeAllItems();
        try {
            if(!cName.getText().equals("")){
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
                Statement st=con.createStatement();
                String query="select customer_name from customers where customer_name like '"+cName.getText()+"%';";
                ResultSet rs=st.executeQuery(query);
                while(rs.next()){
                    customers.addItem(rs.getString("customer_name"));
                }
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Can't Add Payment");

            System.out.println(e.getMessage());
            amount.setText("Rs : 0.00");
            cusId.setText("");
        }
    }//GEN-LAST:event_cNameKeyReleased

    private void customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersActionPerformed
        cName.setText((String)customers.getSelectedItem());
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singhe_hardware_db","root","");
            Statement st=con.createStatement();
            String query="select customer_id from customers where customer_name='"+cName.getText()+"';";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            cusId.setText(rs.getString("customer_id"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            cusId.setText("");
        }
    }//GEN-LAST:event_customersActionPerformed

    private void itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsActionPerformed
        pname.setText((String)items.getSelectedItem());
    }//GEN-LAST:event_itemsActionPerformed

    private void itemsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTableMousePressed

    }//GEN-LAST:event_itemsTableMousePressed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        DefaultTableModel dt =(DefaultTableModel)itemsTable.getModel();
        if(itemsTable.getSelectedRow() != -1) {
            dt.removeRow(itemsTable.getSelectedRow());
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void getTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getTotalBtnActionPerformed
        double total=0.00;
        DefaultTableModel dt =(DefaultTableModel)itemsTable.getModel();
        try{
            for(int i=0;i<dt.getRowCount();i++){
                total +=Double.valueOf(dt.getValueAt(i,1).toString())*Double.valueOf(dt.getValueAt(i,2).toString());
            }
            amount.setText("Rs : " +total);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Inavlid price or quantity!");
            amount.setText("Rs : 0");
        }
       
    }//GEN-LAST:event_getTotalBtnActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payActionPerformed

    private void cusIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusIdActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JPanel btnPannel;
    private javax.swing.JTextField cName;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton cusBtn;
    private javax.swing.JTextField cusId;
    private javax.swing.JLabel cusIdLabel;
    private javax.swing.JComboBox<String> customers;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton getTotalBtn;
    private javax.swing.JLabel header;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JComboBox<String> items;
    private javax.swing.JTable itemsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainPannel;
    private javax.swing.JPanel mainPannel1;
    private javax.swing.JPanel mainPannel2;
    private javax.swing.JTextField pay;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton submitbtn;
    private javax.swing.JButton supBtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
