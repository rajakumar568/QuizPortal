/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examinationPortal;

import com.mysql.cj.xdevapi.Expression;
import com.sun.jdi.connect.spi.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KING
 */
public class studentLogin extends javax.swing.JFrame {

    /**
     * Creates new form studentLogin
     */
    java.sql.Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public studentLogin() {
        initComponents();
        Connect();
        SimpleDateFormat df = new SimpleDateFormat();
        Date date = new Date();
        jLabel9.setText(df.format(date));
    }

    public void Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/onlineexaminatinoportal", "root", "");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select count(id) from question");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addNewQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        rno = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        emailid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 0, 51));
        setLocation(new java.awt.Point(80, 60));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setText("Fill up the form");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 6, 319, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Date: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 26, 64, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("jLabel8");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 26, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, 1370, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NAME : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 142, 168, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("REGISTRATION NO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 207, 168, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("GENDER");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 262, 168, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("CONTACT NUMBER");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("EMAIL ID");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 1126, 168, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("MOTHER's NAME");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 1266, 168, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("FATHER's NAME");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 1196, 168, -1));

        nm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        getContentPane().add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 139, 443, -1));

        rno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(rno, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 201, 443, -1));

        contact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 443, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 1123, 443, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 1193, 443, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 1263, 443, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/save.png"))); // NOI18N
        jButton1.setText("SAVE & EXIT");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 1300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("EMAIL ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 168, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("FATHER'S NAME");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 168, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("MOTHER'S NAME");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 168, -1));

        emailid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailidActionPerformed(evt);
            }
        });
        getContentPane().add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 443, -1));

        fname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 443, -1));

        mname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 443, -1));

        sex.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "TRANS" }));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 440, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/Back.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/Close.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/save.png"))); // NOI18N
        jButton4.setText("SAVE & EXIT");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

    private void emailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailidActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new indexPage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Exit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String name = nm.getText();
            String regno = rno.getText();
            String gender = (String)sex.getSelectedItem();
            String contactno = contact.getText();
            String email = emailid.getText();
            String fathersname = fname.getText();
            String mothersname = mname.getText();
            try{
//                Connection con=ConnectionProvider.getCon();
                ps=con.prepareStatement("insert into studentdetail values(?,?,?,?,?,?,?)");
                ps.setString(1, name);
                 ps.setString(2, regno);
                   ps.setString(3, gender);
                 ps.setString(4, contactno);
                ps.setString(5, email);
                ps.setString(6, fathersname);
                ps.setString(7, mothersname);
//                ps.executeQuery()
                ps.executeUpdate();
//                JFrame jf=new JFrame();
//                jf.setAlwaysOnTop(true);
//                JOptionPane.showMessageDialog(jf, "Successfully Updated");
                setVisible(false);
                new instructionStudent(regno).setVisible(true);
                
            } catch (HeadlessException | SecurityException | SQLException e) {
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
            
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
//       String id = qid.getText();
//            String question = jTextField1.getText();
//            String option1 = jTextField2.getText();
//            String option2 = jTextField3.getText();
//            String option3 = jTextField4.getText();
//            String option4 = jTextField5.getText();
//            String answer = jTextField6.getText();
//            try{
////                Connection con=ConnectionProvider.getCon();
//                ps=con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
//                ps.setString(1, id);
//                 ps.setString(2, question);
//                   ps.setString(3, option1);
//                 ps.setString(4, option2);
//                ps.setString(5, option3);
//                ps.setString(6, option4);
//                ps.setString(7, answer);
////                ps.executeQuery()
//                ps.executeUpdate();
//                JFrame jf=new JFrame();
//                jf.setAlwaysOnTop(true);
//                JOptionPane.showMessageDialog(jf, "Successfully Updated");
//                setVisible(false);
//                new addNewQuestion().setVisible(true);
//            } catch (HeadlessException | SecurityException | SQLException e) {
//            JFrame jf=new JFrame();
//            jf.setAlwaysOnTop(true);
//            JOptionPane.showMessageDialog(jf,e);
//            
//        }
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JTextField emailid;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField rno;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}
