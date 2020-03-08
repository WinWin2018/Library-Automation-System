
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
public class DeleteBook extends javax.swing.JFrame {

    /**
     * Creates new form DeleteBook
     */
    public DeleteBook() {
        initComponents();
         int index = 0;
       
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        
        model1.setRowCount(0);
      
        while (BookAction.book.size() > index) {
           model1.addRow(new Object[]{BookAction.book.get(index).getBookId(),
               BookAction.book.get(index).getBookName(),BookAction.book.get(index).getAuthor(),
               BookAction.book.get(index).getPublisher(),BookAction.book.get(index).getYearOfPublication()}); 
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
        table1 = new javax.swing.JTable();
        label_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        bt_delete = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        bt_refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table1.setForeground(new java.awt.Color(102, 0, 102));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book Id", "Book Name", "Author", "Publisher", "Year of Publication"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 460, 99));

        label_id.setBackground(new java.awt.Color(255, 255, 255));
        label_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_id.setForeground(new java.awt.Color(255, 255, 255));
        label_id.setText("Search Id:");
        jPanel1.add(label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 90, -1));

        bt_delete.setBackground(new java.awt.Color(255, 255, 255));
        bt_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_delete.setForeground(new java.awt.Color(102, 0, 102));
        bt_delete.setText("Delete");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(bt_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 90, -1));

        bt_back.setBackground(new java.awt.Color(255, 255, 255));
        bt_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(102, 0, 102));
        bt_back.setText("Back");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });
        jPanel1.add(bt_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 306, -1, -1));

        message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 227, 202, 43));

        bt_refresh.setBackground(new java.awt.Color(255, 255, 255));
        bt_refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_refresh.setForeground(new java.awt.Color(102, 0, 102));
        bt_refresh.setText("Refresh Books");
        bt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(bt_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 171, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/310_country_hse_lib_00lo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        String id = tf_id.getText();
        BookAction book= new BookAction();
        BookAction.book.remove(book.searchBook(Integer.parseInt(id)));
        message.setText("The book is deleted!!");
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_refreshActionPerformed
          int index = 0;
       
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        
        model1.setRowCount(0);
      
        while (BookAction.book.size() > index) {
           model1.addRow(new Object[]{BookAction.book.get(index).getBookId(),
               BookAction.book.get(index).getBookName(),BookAction.book.get(index).getAuthor(),
               BookAction.book.get(index).getPublisher(),BookAction.book.get(index).getYearOfPublication()}); 
           index++;
        }
        message.setText(" ");
    }//GEN-LAST:event_bt_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel message;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tf_id;
    // End of variables declaration//GEN-END:variables
}
