/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Utils.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author QuanLDM
 */
public class ChangePassword extends javax.swing.JFrame {

    private static String dataconstructor = "";

    /**
     * Creates new form Infor
     */
    public ChangePassword(String data) {
        initComponents();
        setTitle("Quản lí thiết bị trường học");
        this.dataconstructor = data;
        jtf_tk32.setText(dataconstructor);
        jtf_tk32.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_tk32 = new swing.MyTextField();
        jtf_new32 = new swing.MyTextField();
        jtf_cf32 = new swing.MyTextField();
        btn_32 = new swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGradiente1.setColorPrimario(new java.awt.Color(107, 222, 248));
        panelGradiente1.setColorSecundario(new java.awt.Color(8, 103, 123));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Username");
        panelGradiente1.add(jLabel5);
        jLabel5.setBounds(60, 160, 90, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("New Password");
        panelGradiente1.add(jLabel3);
        jLabel3.setBounds(60, 210, 100, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        panelGradiente1.add(jLabel4);
        jLabel4.setBounds(60, 270, 130, 17);

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Đổi mật khẩu");
        panelGradiente1.add(jLabel1);
        jLabel1.setBounds(170, 40, 180, 38);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/previous.png"))); // NOI18N
        jLabel7.setText("Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        panelGradiente1.add(jLabel7);
        jLabel7.setBounds(40, 20, 60, 16);
        panelGradiente1.add(jtf_tk32);
        jtf_tk32.setBounds(230, 160, 190, 27);
        panelGradiente1.add(jtf_new32);
        jtf_new32.setBounds(230, 210, 190, 27);
        panelGradiente1.add(jtf_cf32);
        jtf_cf32.setBounds(230, 260, 190, 27);

        btn_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exchange.png"))); // NOI18N
        btn_32.setText("Cập Nhật");
        btn_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_32ActionPerformed(evt);
            }
        });
        panelGradiente1.add(btn_32);
        btn_32.setBounds(210, 320, 110, 37);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Infor s = new Infor(dataconstructor);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btn_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_32ActionPerformed
        // TODO add your handling code here:
         System.out.println(dataconstructor);
        try {
//            String newpass = jtf_new32.getText();
//            String cfpass = jtf_cf32.getText();
            Connection con = Connect.getConnection();
            String sql = "UPDATE account set matkhau='" + jtf_new32.getText() + "' where taikhoan ='" + dataconstructor + "' ";
            if (jtf_new32.getText().equals(jtf_cf32.getText())) {
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt = con.prepareStatement(sql);
                pstmt.execute();
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");  
                Infor s = new Infor(dataconstructor);
            s.setVisible(true);
            dispose();
                
            } else {
                jtf_cf32.setText(null);
                jtf_new32.setText(null);
                JOptionPane.showMessageDialog(this, "Mời bạn xác nhận lại mật khẩu");
                
            }
            con.close();
          
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_32ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangePassword change = new ChangePassword(dataconstructor);
                change.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonGradient btn_32;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private swing.MyTextField jtf_cf32;
    private swing.MyTextField jtf_new32;
    private swing.MyTextField jtf_tk32;
    private swing.PanelGradiente panelGradiente1;
    // End of variables declaration//GEN-END:variables
}
