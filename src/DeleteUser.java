
import Books.BookAction;
import User.User;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cartec
 */
public class DeleteUser extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUser
     */
    public DeleteUser() {
        initComponents();
          int index = 0;
       
        DefaultTableModel model2 = (DefaultTableModel)table_user.getModel();
        
        model2.setRowCount(0);
      
        while (User.users.size() > index) {
           model2.addRow(new Object[]{User.users.get(index).getId(),
               User.users.get(index).getName(),User.users.get(index).getSurname(),
               User.users.get(index).getGender()}); 
           index++;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        bt_refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        bt_delete = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_user.setForeground(new java.awt.Color(102, 0, 102));
        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User Id", "User Name", "User Surname", "User Gender"
            }
        ));
        jScrollPane1.setViewportView(table_user);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 450, 93));

        bt_refresh.setBackground(new java.awt.Color(255, 255, 255));
        bt_refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_refresh.setForeground(new java.awt.Color(102, 0, 102));
        bt_refresh.setText("Refresh Users");
        bt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(bt_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search User: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 111, -1));

        bt_delete.setBackground(new java.awt.Color(255, 255, 255));
        bt_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_delete.setForeground(new java.awt.Color(102, 0, 102));
        bt_delete.setText("Delete User");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(bt_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        bt_back.setBackground(new java.awt.Color(255, 255, 255));
        bt_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(102, 0, 102));
        bt_back.setText("Back");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });
        jPanel1.add(bt_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 166, 47));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/310_country_hse_lib_00lo.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_refreshActionPerformed
         int index = 0;
       
        DefaultTableModel model2 = (DefaultTableModel)table_user.getModel();
        
        model2.setRowCount(0);
      
        while (User.users.size() > index) {
           model2.addRow(new Object[]{User.users.get(index).getId(),
               User.users.get(index).getName(),User.users.get(index).getSurname(),
               User.users.get(index).getGender()}); 
           index++;
        }
         message.setText(" ");
    }//GEN-LAST:event_bt_refreshActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        String id= tf_id.getText();
       User.users.remove(User.searchUser(Integer.parseInt(id)));
        message.setText("The user is deleted!!");
    }//GEN-LAST:event_bt_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message;
    private javax.swing.JTable table_user;
    private javax.swing.JTextField tf_id;
    // End of variables declaration//GEN-END:variables
}
