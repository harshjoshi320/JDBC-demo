package FlightPackage;

import FlightMasterPackage.FlightMasterR;
import java.sql.*;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * ----Flight Booking System--------- Developed by - Harsh Joshi Bhavya Giri
 * Goswami
 */
/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 *
 */
public class MainForm extends javax.swing.JFrame {

    public MainForm() { // Constructor for MainForm class
        initComponents();// Method to populate the frame with the objects
        ImageIcon icon = new ImageIcon(getClass().getResource("AWT-Plane.png"));// Gets image from the source package
        setIconImage(icon.getImage());// Sets the image as icon for this form
        dispUser.setToolTipText("Welcome " + UserGlobal.userName);//Displays welecome when mouse enters the boundaries the this label
        MasterF.setVisible(false);//hides the master record btn 
        MasterF.setEnabled(false);//disables the master record btn 
        if (UserGlobal.dev == true) {//Checks if the user is dev/Admin or not 
            MasterF.setVisible(true);//Gives access to flight master records
            MasterF.setEnabled(true);
        }


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        UserDCMD = new javax.swing.JButton();
        BookCMD = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ScheduleTable = new javax.swing.JTable();
        BHistCMD = new javax.swing.JButton();
        dispUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UStatus = new javax.swing.JLabel();
        MasterF = new javax.swing.JButton();
        DayCMB = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Booking System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLayeredPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/Passenger-airplane-DesktopA.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(0, new java.awt.Color(14, 103, 215), new java.awt.Color(5, 37, 64)));
        jLabel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel2.setBounds(0, 0, 920, 600);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        UserDCMD.setBackground(new java.awt.Color(0, 0, 0));
        UserDCMD.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        UserDCMD.setForeground(new java.awt.Color(255, 255, 255));
        UserDCMD.setText("User Details");
        UserDCMD.setToolTipText("Change user details");
        UserDCMD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserDCMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserDCMDActionPerformed(evt);
            }
        });
        UserDCMD.setBounds(10, 10, 150, 30);
        jLayeredPane2.add(UserDCMD, javax.swing.JLayeredPane.PALETTE_LAYER);

        BookCMD.setBackground(new java.awt.Color(0, 0, 0));
        BookCMD.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        BookCMD.setForeground(new java.awt.Color(255, 255, 255));
        BookCMD.setText("Book A Ticket");
        BookCMD.setToolTipText("Book A Ticket");
        BookCMD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookCMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookCMDActionPerformed(evt);
            }
        });
        BookCMD.setBounds(170, 10, 150, 30);
        jLayeredPane2.add(BookCMD, javax.swing.JLayeredPane.PALETTE_LAYER);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(205, 0, 50));
        jButton3.setText("X");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(860, 10, 50, 30);
        jLayeredPane2.add(jButton3, javax.swing.JLayeredPane.PALETTE_LAYER);

        jButton4.setBackground(new java.awt.Color(195, 186, 186));
        jButton4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 220, 90));
        jButton4.setText("Log Out");
        jButton4.setToolTipText("Log out");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(690, 10, 150, 30);
        jLayeredPane2.add(jButton4, javax.swing.JLayeredPane.PALETTE_LAYER);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        ScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight id", "Airline", "From", "To", "Departure Time ", "Arrival Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScheduleTable.setToolTipText("Filght schedule");
        ScheduleTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ScheduleTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScheduleTable.setRowHeight(20);
        ScheduleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ScheduleTable);
        ScheduleTable.getColumnModel().getColumn(0).setResizable(false);
        ScheduleTable.getColumnModel().getColumn(1).setResizable(false);
        ScheduleTable.getColumnModel().getColumn(2).setResizable(false);
        ScheduleTable.getColumnModel().getColumn(3).setResizable(false);
        ScheduleTable.getColumnModel().getColumn(4).setResizable(false);
        ScheduleTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        ScheduleTable.getColumnModel().getColumn(5).setResizable(false);

        jScrollPane1.setBounds(380, 150, 530, 200);
        jLayeredPane2.add(jScrollPane1, javax.swing.JLayeredPane.PALETTE_LAYER);

        BHistCMD.setBackground(new java.awt.Color(0, 0, 0));
        BHistCMD.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        BHistCMD.setForeground(new java.awt.Color(255, 255, 255));
        BHistCMD.setText("Booking History");
        BHistCMD.setToolTipText("See your last transactions");
        BHistCMD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BHistCMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHistCMDActionPerformed(evt);
            }
        });
        BHistCMD.setBounds(330, 10, 150, 30);
        jLayeredPane2.add(BHistCMD, javax.swing.JLayeredPane.PALETTE_LAYER);

        dispUser.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 14)); // NOI18N
        dispUser.setForeground(new java.awt.Color(84, 255, 0));
        dispUser.setBounds(20, 60, 220, 30);
        jLayeredPane2.add(dispUser, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight Schedule");
        jLabel1.setBounds(390, 110, 200, 40);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.PALETTE_LAYER);

        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 223, 235));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("- Developed By ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 223, 235));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Bhavya Giri Goswami ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 223, 235));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Harsh Joshi ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.setBounds(680, 500, 230, 90);
        jLayeredPane2.add(jPanel1, javax.swing.JLayeredPane.PALETTE_LAYER);

        jSeparator1.setBackground(new java.awt.Color(149, 60, 60));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator1.setBounds(0, 45, 921, 5);
        jLayeredPane2.add(jSeparator1, javax.swing.JLayeredPane.DRAG_LAYER);

        UStatus.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 14)); // NOI18N
        UStatus.setForeground(new java.awt.Color(84, 255, 0));
        UStatus.setBounds(20, 100, 190, 30);
        jLayeredPane2.add(UStatus, javax.swing.JLayeredPane.PALETTE_LAYER);

        MasterF.setBackground(new java.awt.Color(0, 0, 0));
        MasterF.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        MasterF.setForeground(new java.awt.Color(241, 97, 19));
        MasterF.setText("Flight Master");
        MasterF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MasterF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterFActionPerformed(evt);
            }
        });
        MasterF.setBounds(490, 10, 150, 30);
        jLayeredPane2.add(MasterF, javax.swing.JLayeredPane.PALETTE_LAYER);

        DayCMB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sunday", "Monday", "Tuesday", "Wednusday", "Thursday", "Friday", "Saturday", "-All-" }));
        DayCMB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DayCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DayCMBItemStateChanged(evt);
            }
        });
        DayCMB.setBounds(750, 120, 150, 20);
        jLayeredPane2.add(DayCMB, javax.swing.JLayeredPane.PALETTE_LAYER);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(105, 155, 244));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setLabelFor(DayCMB);
        jLabel6.setText("Select Day >>");
        jLabel6.setBounds(630, 120, 110, 20);
        jLayeredPane2.add(jLabel6, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Statement connect() throws ClassNotFoundException, SQLException {//Connection Method

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_book", "root", "ipqwe320");
        Statement stmt = con.createStatement();
        return stmt;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //For logging out 
        int n = JOptionPane.showConfirmDialog(this, "Do you want to Log Out?", "Log Out", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            UserGlobal.userID = null;
            UserGlobal.userName = "";
            UserGlobal.userPass = "";
            UserGlobal.userAddr = "";
            UserGlobal.userPhone = null;
            UserGlobal.userCity = "";
            UserGlobal.dev = false;
            new LoginForm().setVisible(true);
            this.dispose();
        } else if (n == 1) {
            return;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Calendar calendar = Calendar.getInstance();// Getting new calender instance, Calender is an abstract class
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));// Setting time zone 
        calendar.setTimeInMillis(System.currentTimeMillis());// Setting time of calender
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);// Getting week day

        switch (dayOfWeek) {// switch case for setting week day in the day combo box
            case Calendar.SUNDAY:
                DayCMB.setSelectedIndex(0);
                break;
            case Calendar.MONDAY:
                DayCMB.setSelectedIndex(1);
                break;
            case Calendar.TUESDAY:
                DayCMB.setSelectedIndex(2);
                break;
            case Calendar.WEDNESDAY:
                DayCMB.setSelectedIndex(3);
                break;
            case Calendar.THURSDAY:
                DayCMB.setSelectedIndex(4);
                break;
            case Calendar.FRIDAY:
                DayCMB.setSelectedIndex(5);
                break;
            case Calendar.SATURDAY:
                DayCMB.setSelectedIndex(6);
                break;
        }
        String dayNo = "";
        // Setting value of week day no. to dayNo to get the corresponding flight schedule
        if (DayCMB.getSelectedItem() == "Monday") {
            dayNo = "1";
        } else if (DayCMB.getSelectedItem() == "Tuesday") {
            dayNo = "2";
        } else if (DayCMB.getSelectedItem() == "Wednusday") {
            dayNo = "3";
        } else if (DayCMB.getSelectedItem() == "Thursday") {
            dayNo = "4";
        } else if (DayCMB.getSelectedItem() == "Friday") {
            dayNo = "5";
        } else if (DayCMB.getSelectedItem() == "Saturday") {
            dayNo = "6";
        } else if (DayCMB.getSelectedItem() == "Sunday") {
            dayNo = "7";
        } else if (DayCMB.getSelectedItem() == "-All-") {
            dayNo = "";
        }
        dispUser.setText("--Welcome " + UserGlobal.userName + "--");//Displays username

        DefaultTableModel scheduleModel = (DefaultTableModel) ScheduleTable.getModel();
        scheduleModel.setRowCount(0);// Clearing the table
        try {

            String CmdSql = "select * from flights where flight_day like '%" + dayNo + "%' ;";// Query as a string type
            ResultSet rs = connect().executeQuery(CmdSql);// Executing the above query
            while (rs.next()) {// if resultset has one or more rows rs.next() returns true else false*/ 
                //Extracting field values from the resultset 
                String flightId = rs.getString("flight_id");
                String Airline = rs.getString("airline");
                String From = rs.getString("from_f");
                String To = rs.getString("to_f");
                String Dtime = rs.getTime("dep_time").toString();
                String Atime = rs.getTime("arr_time").toString();
                scheduleModel.addRow(new Object[]{flightId, Airline, From, To, Dtime, Atime});// Adding row one by one
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void UserDCMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserDCMDActionPerformed

        try {
//Refreshing the values of the variables in UserGlobal class containing the details of the current user
            String CmdSql = "select * from users where user_name = '" + UserGlobal.userName + "';";
            ResultSet rs = connect().executeQuery(CmdSql);
            rs.next();
            UserGlobal.userID = rs.getInt("idno");
            UserGlobal.userName = rs.getString("user_name");
            UserGlobal.userPass = rs.getString("password");
            UserGlobal.userAddr = rs.getString("address");
            UserGlobal.userPhone = rs.getString("phone_no");
            UserGlobal.userCity = rs.getString("city");
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        new userSettings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UserDCMDActionPerformed

    private void BookCMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookCMDActionPerformed
        new Booking().setVisible(true);//Opening new booking frame
        this.setVisible(false);
    }//GEN-LAST:event_BookCMDActionPerformed

    private void BHistCMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHistCMDActionPerformed
        new BookingHistory().setVisible(true);// Opening new booking history frame
        this.setVisible(false);
    }//GEN-LAST:event_BHistCMDActionPerformed

    private void MasterFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterFActionPerformed
        new FlightMasterR().setVisible(true);//Opening new flight master records frame 
        this.setVisible(false);
    }//GEN-LAST:event_MasterFActionPerformed

    private void DayCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DayCMBItemStateChanged
        DefaultTableModel scheduleModel = (DefaultTableModel) ScheduleTable.getModel();
        scheduleModel.setRowCount(0);// Clearing the table
        String dayNo = "";
        //Setting week day no. to dayNo to get the flight schedule
        if (DayCMB.getSelectedItem() == "Monday") {
            dayNo = "1";
        } else if (DayCMB.getSelectedItem() == "Tuesday") {
            dayNo = "2";
        } else if (DayCMB.getSelectedItem() == "Wednusday") {
            dayNo = "3";
        } else if (DayCMB.getSelectedItem() == "Thursday") {
            dayNo = "4";
        } else if (DayCMB.getSelectedItem() == "Friday") {
            dayNo = "5";
        } else if (DayCMB.getSelectedItem() == "Saturday") {
            dayNo = "6";
        } else if (DayCMB.getSelectedItem() == "Sunday") {
            dayNo = "7";
        } else if (DayCMB.getSelectedItem() == "-All-") {
            dayNo = "";
        }
        try {
            String CmdSql = "select * from flights where flight_day like '%" + dayNo + "%' ;";
            ResultSet rs = connect().executeQuery(CmdSql);
            while (rs.next()) {
                String flightId = rs.getString("flight_id");
                String Airline = rs.getString("airline");
                String From = rs.getString("from_f");
                String To = rs.getString("to_f");
                String Dtime = rs.getTime("dep_time").toString();
                String Atime = rs.getTime("arr_time").toString();
                scheduleModel.addRow(new Object[]{flightId, Airline, From, To, Dtime, Atime});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_DayCMBItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHistCMD;
    private javax.swing.JButton BookCMD;
    private javax.swing.JComboBox DayCMB;
    private javax.swing.JButton MasterF;
    private javax.swing.JTable ScheduleTable;
    private javax.swing.JLabel UStatus;
    private javax.swing.JButton UserDCMD;
    private javax.swing.JLabel dispUser;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
