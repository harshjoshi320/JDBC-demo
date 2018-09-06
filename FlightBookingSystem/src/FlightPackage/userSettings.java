package FlightPackage;


import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
public class userSettings extends javax.swing.JFrame {

    /**
     * Creates new form userSettings
     */
    public userSettings() {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("AWT-Plane.png"));
        setIconImage(icon.getImage());
        SaveChg.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        userN = new javax.swing.JLabel();
        userP = new javax.swing.JLabel();
        userAdd = new javax.swing.JLabel();
        userC = new javax.swing.JLabel();
        userPh = new javax.swing.JLabel();
        editUname = new javax.swing.JTextField();
        editUcity = new javax.swing.JTextField();
        editUadd = new javax.swing.JTextArea();
        SaveChg = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        editPass = new javax.swing.JPasswordField();
        editUphone = new javax.swing.JFormattedTextField();
        DetailsChg = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Settings");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(1, java.awt.Color.gray, java.awt.Color.lightGray, null, null)));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/808530-free-blue-wallpaper.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        jLabel1.setBounds(0, 0, 520, 560);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/AWT-Plane.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setBounds(0, 0, 520, 560);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.PALETTE_LAYER);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);

        userN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userN.setText("Current User Name");

        userP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userP.setText("Current Password");

        userAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userAdd.setText("Current Address");

        userC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userC.setText("Current city");

        userPh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userPh.setText("Current phone number");

        editUname.setEditable(false);
        editUname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        editUcity.setEditable(false);
        editUcity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        editUadd.setColumns(20);
        editUadd.setEditable(false);
        editUadd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editUadd.setRows(5);
        editUadd.setBorder(editUname.getBorder());

        SaveChg.setBackground(new java.awt.Color(186, 200, 200));
        SaveChg.setText("Save changes");
        SaveChg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveChgActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(186, 200, 200));
        BackBtn.setText("↩ Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        editPass.setEditable(false);

        editUphone.setEditable(false);
        editUphone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));
        editUphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                editUphoneFocusLost(evt);
            }
        });
        editUphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editUphoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editUphoneKeyTyped(evt);
            }
        });

        DetailsChg.setBackground(new java.awt.Color(186, 200, 200));
        DetailsChg.setText("Change Details");
        DetailsChg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsChgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(userN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(userAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(userP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editUadd, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(editPass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(editUname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(userPh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(editUphone))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(userC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(editUcity, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(SaveChg)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetailsChg)
                            .addComponent(BackBtn))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(editPass, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUadd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userPh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(editUphone, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUcity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(DetailsChg)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveChg)
                    .addComponent(BackBtn))
                .addGap(106, 106, 106))
        );

        jPanel1.setBounds(30, 50, 460, 460);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.MODAL_LAYER);

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel8.setText("USER DETAILS");
        jLabel8.setBounds(30, 10, 310, 30);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.MODAL_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Statement connect() throws ClassNotFoundException, SQLException {//Connection Method

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_book", "root", "ipqwe320");
        Statement stmt = con.createStatement();
        return stmt;
    }
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        this.requestFocus();
        editUname.setText(UserGlobal.userName);
        editPass.setText(UserGlobal.userPass);
        editUadd.setText(UserGlobal.userAddr);
        editUphone.setText(UserGlobal.userPhone);
        editUcity.setText(UserGlobal.userCity);
    }//GEN-LAST:event_formWindowOpened

    private void SaveChgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChgActionPerformed
        // TODO add your handling code here:
        String newPass = new String(editPass.getPassword());
        String newAdd = editUadd.getText();
        String newPhone = editUphone.getText();
        String newCity = editUcity.getText();
        if (newPass.equals("") || newAdd.equals("") || newPhone.equals("") || newCity.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all details to proceed further.", "Incomplete Details", JOptionPane.WARNING_MESSAGE);
        } else {
            try {

                String CmdSql = "update users set password ='" + newPass + "' ,address = '" + newAdd + "', phone_no = " + newPhone + " ,city = '" + newCity + "' where idno = " + UserGlobal.userID + " and user_name = '" + UserGlobal.userName + "'";

                int rs = connect().executeUpdate(CmdSql);

                if (rs != 0) {
                    JOptionPane.showMessageDialog(this, "User details changed succesfully.", "User Details Changed", JOptionPane.INFORMATION_MESSAGE);
                    new MainForm().setFocusable(true);
                    userP.setText("Current Password");
                    userAdd.setText("Current Address");
                    userC.setText("Current city");
                    userPh.setText("Current phone number");
                    DetailsChg.setVisible(true);
                    SaveChg.setVisible(false);
                }



            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_SaveChgActionPerformed

    private void editUphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editUphoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_editUphoneKeyTyped

    private void editUphoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editUphoneKeyReleased
        // TODO add your handling code here:

        String Phoneno = editUphone.getText();
        CharSequence digits = "0123456789";
        int LIndex = Phoneno.lastIndexOf(Phoneno);
        try {
            String Lchar = Phoneno.substring(LIndex);
            if (!Lchar.contains(digits)) {
                Phoneno.replace(Phoneno.substring(LIndex), "");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_editUphoneKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new MainForm().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void DetailsChgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsChgActionPerformed
        // TODO add your handling code here:
        SaveChg.setVisible(true);
        editPass.setEditable(true);
        editUadd.setEditable(true);
        editUcity.setEditable(true);
        editUphone.setEditable(true);
        userP.setText("New Password");
        userAdd.setText("New Address");
        userC.setText("City");
        userPh.setText("New Phone number");
        DetailsChg.setVisible(false);


    }//GEN-LAST:event_DetailsChgActionPerformed

    private void editUphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editUphoneFocusLost
        // TODO add your handling code here:
        if (editUphone.getText().length() != 10) {
            editUphone.setText("");
            JOptionPane.showMessageDialog(this, "Invalid Phone number");

        }
    }//GEN-LAST:event_editUphoneFocusLost

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
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new userSettings().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DetailsChg;
    private javax.swing.JButton SaveChg;
    private javax.swing.JPasswordField editPass;
    private javax.swing.JTextArea editUadd;
    private javax.swing.JTextField editUcity;
    private javax.swing.JTextField editUname;
    private javax.swing.JFormattedTextField editUphone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel userAdd;
    private javax.swing.JLabel userC;
    private javax.swing.JLabel userN;
    private javax.swing.JLabel userP;
    private javax.swing.JLabel userPh;
    // End of variables declaration//GEN-END:variables
}
