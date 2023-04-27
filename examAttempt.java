/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examinationPortal;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class examAttempt extends javax.swing.JFrame {


    public examAttempt() {
        initComponents();
        Connect();

        loadQuestion();

    }


    int answercheck = 0;
    int marks = 0;
    String cor = null;
    String answer = null;
    Statement stat;

    public boolean answerCheck() {
        String answerAnswer = "";
        if (jRadioButton1.isSelected()) {
            answerAnswer = jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
            answerAnswer = jRadioButton2.getText();
        } else if (jRadioButton3.isSelected()) {
            answerAnswer = jRadioButton3.getText();
        } else {
            answerAnswer = jRadioButton4.getText();
        }
        if (answerAnswer.equals(cor) && (answer == null || !answer.equals(cor))) {
            marks = marks + 1;
            txtmarks.setText(String.valueOF(marks));
        } else if (!answerAnswer.equals(cor) && (answer != null)) {
            if (marks > 0) {
                marks = marks - 1;
            }
            txtmarks.setText(String.valueof(marks));
        }
        //use of update answer
        if (!answerAnswer.equals("")) {

            try {
                String query = "Update question SET givenanswer=? WHERE question = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, answerAnswer);
                pst.setString(2, jLabel3.getText());
                pst.execute();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return true;

        }
        return false;
    }

    private void NullAllGivenAnswers() {
        try {
            String query = "UPDATE question SET givenanswer = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, null);
            pst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private boolean AlreadyAnswered() {
        try {
            String query = "SELECT givenanswer FROM questiom WHERE question = '" + jLabel7.getText() + "'";
            stat = con.prepareStatement(query);

            ResultSet res = stat.executeQuery(query);

            while (rs.next()) {
                answer = res.getString("givenanswer");

                if (answer == null) {
                    return false;
                }
                break;
            }

            if (r1.getText().equals(answer)) {

                r1.setSelected(true);
            } else if (r2.getText().equals(answer)) {

                r2.setSelected(true);
            } else if (r3.getText().equals(answer)) {

                r2.setSelected(true);
            } else if (r4.getText().equals(answer)) {

                r2.setSelected(true);
            }

        } catch (SQLException ex) {
            System.out.println("Exception Caught");
            ex.printStackTrace();
        }
        return true;
    }

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/onlineexaminatinoportal", "root", "");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addNewQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadQuestion() {
        String query = "select * from question";
        Statement stat = null;
        try {
            stat = con.createStatement();
            rs = stat.executeQuery(query);
            while (rs.next()) {
                jLabel7.setText(rs.getString(1));
                jLabel3.setText(rs.getString(2));
                jRadioButton1.setText(rs.getString(3));
                jRadioButton2.setText(rs.getString(4));
                jRadioButton3.setText(rs.getString(5));
                jRadioButton4.setText(rs.getString(6));
//                jLabel3.setText(rs.getString(7));
                cor = rs.getString(7);

                //for one row only
                break;

            }

        } catch (SQLException ex) {
            Logger.getLogger(examAttempt.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtmarks = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(20, 80));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/index admin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("WELCOME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 18, 249, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 1365, -1));

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jRadioButton3.setText("jRadioButton3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jRadioButton4.setText("jRadioButton4");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Question : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addComponent(jRadioButton1)
                .addGap(43, 43, 43)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jRadioButton3)
                .addGap(33, 33, 33)
                .addComponent(jRadioButton4)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 490));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Question no: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/Next.png"))); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 680, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Marks :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 100, -1));

        txtmarks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtmarks.setForeground(new java.awt.Color(255, 0, 51));
        txtmarks.setText("marks");
        getContentPane().add(txtmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 132, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Q No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 96, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examinationPortal/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(answerCheck()){
            
           
            try{
                if(rs.next()){
                jLabel3.setText(rs.getString("question"));
                jRadioButton1.setText(rs.getString(3));
                jRadioButton2.setText(rs.getString(4));
                jRadioButton3.setText(rs.getString(5));
                jRadioButton4.setText(rs.getString(6));
                
                cor=rs.getString(7);
                if(AlreadyAnswered()){
                    buttonGroup1.clearSelection();
                }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Record Saved");
                }
                
            }catch(HeadlessException | SQLException e){
                e.printStackTrace();
            }
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(examAttempt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examAttempt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examAttempt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examAttempt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examAttempt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtmarks;
    // End of variables declaration//GEN-END:variables
}
