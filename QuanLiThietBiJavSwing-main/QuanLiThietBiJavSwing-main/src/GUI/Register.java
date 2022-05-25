/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Utils.Connect;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author RAVEN
 */
public class Register extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
    }

    public void register() {
        txtUser_20.grabFocus();
    }

    public void addEventBackLogin(ActionListener event) {
        cmdBackLogin_20.addActionListener(event);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelColor_R1 = new swing.PanelColor_R();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser_20 = new swing.MyTextField();
        txtPass_20 = new swing.MyPassword();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPass1_20 = new swing.MyPassword();
        txtUser1_20 = new swing.MyTextField();
        jLabel5 = new javax.swing.JLabel();
        myButton1_20 = new swing.MyButton();
        cmdBackLogin_20 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        panelColor_R1.setPreferredSize(new java.awt.Dimension(353, 518));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(115, 187, 241));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");

        txtUser_20.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        txtPass_20.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");

        txtPass1_20.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        txtUser1_20.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        myButton1_20.setBackground(new java.awt.Color(8, 103, 123));
        myButton1_20.setForeground(new java.awt.Color(255, 255, 255));
        myButton1_20.setText("Register");
        myButton1_20.setBorderPainted(false);
        myButton1_20.setColor(new java.awt.Color(8, 103, 123));
        myButton1_20.setColorOver(new java.awt.Color(26, 131, 152));
        myButton1_20.setFocusPainted(false);
        myButton1_20.setFocusable(false);
        myButton1_20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        myButton1_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1_20ActionPerformed(evt);
            }
        });

        cmdBackLogin_20.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cmdBackLogin_20.setForeground(new java.awt.Color(255, 255, 255));
        cmdBackLogin_20.setText("Back to Login");
        cmdBackLogin_20.setBorder(null);
        cmdBackLogin_20.setBorderPainted(false);
        cmdBackLogin_20.setContentAreaFilled(false);
        cmdBackLogin_20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmdBackLogin_20.setFocusable(false);
        cmdBackLogin_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackLogin_20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelColor_R1Layout = new javax.swing.GroupLayout(panelColor_R1);
        panelColor_R1.setLayout(panelColor_R1Layout);
        panelColor_R1Layout.setHorizontalGroup(
            panelColor_R1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColor_R1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelColor_R1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColor_R1Layout.createSequentialGroup()
                        .addGroup(panelColor_R1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdBackLogin_20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myButton1_20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser1_20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPass_20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser_20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtPass1_20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelColor_R1Layout.createSequentialGroup()
                                .addGroup(panelColor_R1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))
                    .addGroup(panelColor_R1Layout.createSequentialGroup()
                        .addGroup(panelColor_R1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelColor_R1Layout.setVerticalGroup(
            panelColor_R1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColor_R1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtUser_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPass_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPass1_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtUser1_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(myButton1_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(cmdBackLogin_20)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor_R1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor_R1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBackLogin_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackLogin_20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBackLogin_20ActionPerformed

    private void myButton1_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1_20ActionPerformed
        // TODO add your handling code here:
         StringBuilder sb = new StringBuilder();

        if (txtUser_20.getText().equals("") || txtUser_20.getText().equals("")) {
            sb.append("Mời bạn nhập đầy đủ thông tin");
            JOptionPane.showMessageDialog(this, sb);
        } else {
            try {
                Connection con = Connect.getConnection();
                String sql = "insert into account values(?,?,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, txtUser_20.getText());
                pstmt.setString(2, txtPass_20.getText());
                pstmt.setString(3, txtUser1_20.getText());
                pstmt.setString(4, null);
                pstmt.setString(5, null);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Đăng ký thành công");
                con.close();
                LOGIN s = new LOGIN();
                s.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "User name đã tồn tại");
            }
        }
    }//GEN-LAST:event_myButton1_20ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBackLogin_20;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private swing.MyButton myButton1_20;
    private swing.PanelColor_R panelColor_R1;
    private swing.MyPassword txtPass1_20;
    private swing.MyPassword txtPass_20;
    private swing.MyTextField txtUser1_20;
    private swing.MyTextField txtUser_20;
    // End of variables declaration//GEN-END:variables
}