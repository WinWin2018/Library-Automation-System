
import User.Academician;
import User.Student;
import User.User;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
        panel_stu.setVisible(false);
        panel_aca.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tfSurname = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        panel_aca = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_workingUni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_graduationYear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbCreate = new javax.swing.JButton();
        rd_student = new javax.swing.JRadioButton();
        rd_academician = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_stu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_university = new javax.swing.JTextField();
        tf_department = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        bt_back = new javax.swing.JButton();
        gendercombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tfSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 47, 93, -1));
        jPanel1.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 13, 93, -1));
        jPanel1.add(tfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 80, 93, -1));

        panel_aca.setBackground(new java.awt.Color(153, 102, 0));
        panel_aca.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Working University:");

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Graduation Year:");

        javax.swing.GroupLayout panel_acaLayout = new javax.swing.GroupLayout(panel_aca);
        panel_aca.setLayout(panel_acaLayout);
        panel_acaLayout.setHorizontalGroup(
            panel_acaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_acaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel_acaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(panel_acaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_workingUni)
                    .addComponent(tf_graduationYear, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panel_acaLayout.setVerticalGroup(
            panel_acaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_acaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_acaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_workingUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_acaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_graduationYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_aca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, 100));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 78, 82, 24));

        jbCreate.setBackground(new java.awt.Color(255, 255, 255));
        jbCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbCreate.setForeground(new java.awt.Color(51, 0, 51));
        jbCreate.setText("CREATE");
        jbCreate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateActionPerformed(evt);
            }
        });
        jPanel1.add(jbCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 245, 171, 58));

        rd_student.setBackground(new java.awt.Color(102, 0, 102));
        buttonGroup1.add(rd_student);
        rd_student.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rd_student.setForeground(new java.awt.Color(255, 255, 255));
        rd_student.setText("Student ");
        rd_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_studentActionPerformed(evt);
            }
        });
        jPanel1.add(rd_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 23, -1, -1));

        rd_academician.setBackground(new java.awt.Color(102, 0, 102));
        buttonGroup1.add(rd_academician);
        rd_academician.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rd_academician.setForeground(new java.awt.Color(255, 255, 255));
        rd_academician.setText("Academician");
        rd_academician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_academicianActionPerformed(evt);
            }
        });
        jPanel1.add(rd_academician, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 123, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 82, 22));

        panel_stu.setBackground(new java.awt.Color(153, 102, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("University:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Department:");

        javax.swing.GroupLayout panel_stuLayout = new javax.swing.GroupLayout(panel_stu);
        panel_stu.setLayout(panel_stuLayout);
        panel_stuLayout.setHorizontalGroup(
            panel_stuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_stuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel_stuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(panel_stuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_university)
                    .addComponent(tf_department, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panel_stuLayout.setVerticalGroup(
            panel_stuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_stuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_stuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_university, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_stuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_department, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_stu, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 56, 367, 120));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Surname:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 45, 82, 24));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 148, 82, 24));
        jPanel1.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 152, 93, -1));

        bt_back.setBackground(new java.awt.Color(255, 255, 255));
        bt_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(51, 0, 51));
        bt_back.setText("Back");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });
        jPanel1.add(bt_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 30));

        gendercombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gendercombo.setForeground(new java.awt.Color(102, 0, 102));
        gendercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female ", "Male", "Other" }));
        gendercombo.setSelectedIndex(-1);
        gendercombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendercomboActionPerformed(evt);
            }
        });
        jPanel1.add(gendercombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 115, 93, 29));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ab05346be26055336b96d308c4a81f90.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateActionPerformed
        // TODO add your handling code here:
       String name = tfName.getText();
        String surname = tfSurname.getText();
        String age= tfAge.getText();
        int age2=Integer.parseInt(age);
        String gender = gendercombo.getItemAt(0);
        String password= String.valueOf(tfPassword.getPassword());
        
        if (rd_student.isSelected()) {
            
           String university = tf_university.getText();
           String department = tf_department.getText();
           
           
           
           User stu = new Student(university, department, name, surname, age2, gender, password);
           ConnectionDB con= new ConnectionDB();
           con.addUser(stu);
           
           User.users.add(stu);
           JOptionPane.showMessageDialog(this, stu.getId());
                   
           this.setVisible(false);
           Login login=new Login();
           login.setVisible(true);
           
        }
        
        if (rd_academician.isSelected()) {
            
           String workingUni = tf_workingUni.getText();
           String graduation = tf_graduationYear.getText();
           int graduation2 = Integer.parseInt(graduation);
           
           User aca = new Academician(workingUni, graduation2, name, surname, age2, gender, password);
           User.users.add(aca);
               
           JOptionPane.showMessageDialog(this, aca.getId());
           
           
           this.setVisible(false);
           Login login=new Login();
           login.setVisible(true);
           
        }
        
       
    }//GEN-LAST:event_jbCreateActionPerformed

    private void rd_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_studentActionPerformed
        rd_student.setSelected(true);
        rd_academician.setSelected(false);
        panel_stu.setVisible(true);
        panel_aca.setVisible(false);
        
        
    }//GEN-LAST:event_rd_studentActionPerformed

    private void rd_academicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_academicianActionPerformed
        rd_student.setSelected(false);
        rd_academician.setSelected(true);
        panel_aca.setVisible(true);
        panel_stu.setVisible(false);
              
    }//GEN-LAST:event_rd_academicianActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
  this.setVisible(false);
  new Login().setVisible(true);
    }//GEN-LAST:event_bt_backActionPerformed

    private void gendercomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendercomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendercomboActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> gendercombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCreate;
    private javax.swing.JPanel panel_aca;
    private javax.swing.JPanel panel_stu;
    private javax.swing.JRadioButton rd_academician;
    private javax.swing.JRadioButton rd_student;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JTextField tf_department;
    private javax.swing.JTextField tf_graduationYear;
    private javax.swing.JTextField tf_university;
    private javax.swing.JTextField tf_workingUni;
    // End of variables declaration//GEN-END:variables
}
