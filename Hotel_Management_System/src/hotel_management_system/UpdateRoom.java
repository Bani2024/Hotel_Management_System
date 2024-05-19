/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class UpdateRoom extends javax.swing.JFrame {

    
    public UpdateRoom() {
        initComponents();
         try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?"+ "user=root&password=");

            // Create a statement
            Statement statement = con.createStatement();

            // Execute query to retrieve data
            ResultSet resultSet = statement.executeQuery("SELECT room_no FROM room");

            // Populate the combo box with data from the result set
            while (resultSet.next()) {
                String item = resultSet.getString("room_no");
                room_no.addItem(item);
            }
            
            
            // Close resources
            resultSet.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        update = new javax.swing.JButton();
        status1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cStatus = new javax.swing.JTextField();
        room_Type = new javax.swing.JTextField();
        room_no = new javax.swing.JComboBox<>();
        bed = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        price1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 90, 30));

        refresh.setBackground(new java.awt.Color(0, 0, 0));
        refresh.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 130, 50));

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 130, 50));

        status1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        status1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status1ActionPerformed(evt);
            }
        });
        jPanel1.add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 230, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Cleaning Status");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 23, 40, 40));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Room No.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        cStatus.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel1.add(cStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 230, -1));

        room_Type.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel1.add(room_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, -1));

        room_no.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel1.add(room_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 140, -1));

        bed.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        bed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedActionPerformed(evt);
            }
        });
        jPanel1.add(bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 230, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Room Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        price1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        price1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price1ActionPerformed(evt);
            }
        });
        jPanel1.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 230, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Bed Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rooms.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rn=room_no.getSelectedItem().toString();
        try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?"+ "user=root&password=");

            // Create a statement
            Statement statement = con.createStatement();

            // Execute query to retrieve data
            ResultSet resultSet = statement.executeQuery("SELECT `room_type`,`bed`,`status`,`price` FROM room where room_no='"+rn+"'");

            // Populate the combo box with data from the result set
            while (resultSet.next()) {
                String item1= resultSet.getString("room_type");
                String item2= resultSet.getString("bed");
                String item3= resultSet.getString("status");
                String item4= resultSet.getString("price");
                room_Type.setText(item1);
                bed.setText(item2);
                status1.setText(item3);
                price1.setText(item4);
                
            }
           
            
            // Close resources
            resultSet.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here: String rn=room_no.getText();
       String rn=room_no.getSelectedItem().toString();
       String rt=room_Type.getText();
       String bt=bed.getText();
       String price=price1.getText();
       String status=status1.getText();
       String cS=cStatus.getText();
       
       if(rn.isEmpty() || rt.isEmpty() || bt.isEmpty() || price.isEmpty() || status.isEmpty()|| cS.isEmpty())
       {
       JOptionPane.showMessageDialog(null,"Fill Properly");
       }
      else
       {
       
       try 
        {
            //connection
           Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?" + "user=root&password=");  
           
            //Queries
            String q1="UPDATE room SET room_no='"+rn+"',room_type='"+rt+"',bed='"+bt+"',status='"+status+"',cleaning_status='"+cS+"',price='"+price+"' where room_no='"+rn+"'";
          // UPDATE room SET column1 = 'new_value1', column2 = 'new_value2'WHERE condition_to_select_the_rows_to_update;
            //Prepeared Statement
            PreparedStatement pst1=conn.prepareStatement(q1);
            //Execute(insert/delete/edit)
            pst1.executeUpdate();
            //save changes(commit)
           JOptionPane.showMessageDialog(null,"Successfully Updated");
            //inserted 
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
       }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        ManageDash mdash=new ManageDash();
        mdash.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
           room_no.setSelectedIndex(-1);
           room_Type.setText("");
           bed.setText("");
           status1.setText("");
           cStatus.setText("");
           price1.setText("");
           
    }//GEN-LAST:event_refreshActionPerformed

    private void bedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bedActionPerformed

    private void status1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status1ActionPerformed

    private void price1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bed;
    private javax.swing.JTextField cStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField price1;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField room_Type;
    private javax.swing.JComboBox<String> room_no;
    private javax.swing.JTextField status1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
