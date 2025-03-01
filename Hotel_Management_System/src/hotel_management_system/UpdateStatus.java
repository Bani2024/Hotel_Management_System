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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class UpdateStatus extends javax.swing.JFrame {

    /**
     * Creates new form UpdateStatus
     */
    public UpdateStatus() {
        initComponents();
         checkIn.setEditable(false);
        checkOut.setEditable(false);
        SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal= Calendar.getInstance();
        checkOut.setText(myFormat.format(cal.getTime()));
         try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?"+ "user=root&password=");

            // Create a statement
            Statement statement = con.createStatement();

            // Execute query to retrieve data
            ResultSet resultSet = statement.executeQuery("SELECT room_no FROM room where status='Occupied'");

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        room_no = new javax.swing.JComboBox<>();
        Search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        checkOut = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        checkIn = new javax.swing.JTextField();
        deposit = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        day = new javax.swing.JTextField();
        camount = new javax.swing.JTextField();
        tamount = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cal = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 32, 40, 40));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Room No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        room_no.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(room_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 122, 280, 40));

        Search.setBackground(new java.awt.Color(0, 0, 0));
        Search.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 100, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Check In Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Price per day");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Total Days spent ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Check Out date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Deposit Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Collect Amount");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 800, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setText("Total Amount");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 800, -1, -1));

        checkOut.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 390, 40));

        name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 390, 40));

        number.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 390, 40));

        checkIn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(checkIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 390, 40));

        deposit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 390, 40));

        address.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 390, 40));

        day.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, 390, 40));

        camount.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(camount, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 792, 330, 40));

        tamount.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(tamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 790, 390, 40));

        price.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 390, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Checkout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 900, 120, 50));

        cal.setBackground(new java.awt.Color(0, 0, 0));
        cal.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cal.setForeground(new java.awt.Color(255, 255, 255));
        cal.setText("Calculate");
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });
        getContentPane().add(cal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 790, 120, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 900, 120, 50));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel13.setText("Check Out Details");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkOut.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
         String rn=room_no.getSelectedItem().toString();
          try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?"+ "user=root&password=");

            // Create a statement
            Statement statement = con.createStatement();

            // Execute query to retrieve data
            ResultSet resultSet = statement.executeQuery("SELECT `name`,`number`,`address`,`checkIn_date`,`price`,`Deposit` FROM customer where room_no='"+rn+"'");

            // Populate the combo box with data from the result set
            while (resultSet.next()) {
                String item1= resultSet.getString("name");
                String item2= resultSet.getString("number");
                String item3= resultSet.getString("address");
                String item4= resultSet.getString("checkIn_date");
                String item5= resultSet.getString("price");
                String item6= resultSet.getString("Deposit");
                name.setText(item1);
                number.setText(item2);
                address.setText(item3);
                checkIn.setText(item4);
                price.setText(item5);
                deposit.setText(item6);
                
            }
           
            
            // Close resources
            resultSet.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_SearchActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        name.setText("");
        number.setText("");
        address.setText("");
        price.setText("");
        deposit.setText("");
        day.setText("");
        tamount.setText("");
        camount.setText("");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         
       
   String rn=room_no.getSelectedItem().toString();
       
       try
        {
            //connection
           Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?" + "user=root&password="); 
           

            //Queries
            String q1="Delete from customer where room_no='"+rn+"'";
            //Prepeared Statement
              String q2 = "update room set status= 'Available' where room_no = '"+rn+"'";
            PreparedStatement pst1=conn.prepareStatement(q1);
              PreparedStatement pst2=conn.prepareStatement(q2);
            //Execute(insert/delete/edit)
            pst1.executeUpdate();
             pst2.executeUpdate();
            //save changes(commit)
            JOptionPane.showMessageDialog(null,"Deleted");
            //inserted 
           
        }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null,e);      
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        ManageDash mdash=new ManageDash();
        mdash.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
        // TODO add your handling code here:
        String day1=day.getText();
        String price1=price.getText();
        String depo=deposit.getText();
       if(day1.isEmpty()||price1.isEmpty()||depo.isEmpty()){
            JOptionPane.showMessageDialog(null,"Fill Properly");
       }
       else{
         try {
    int day2 = Integer.parseInt(day1);
    double price2 = Double.parseDouble(price1);
    double depo1 = Double.parseDouble(depo);
    double total=(day2*price2);
    double due=(total-depo1);
    
    String totalString = String.valueOf(total);
    String dueString = String.valueOf(due);
    tamount.setText(totalString);
    camount.setText(dueString);
    // Proceed with further operations
} catch (NumberFormatException e) {
    // Handle the case where parsing fails
     JOptionPane.showMessageDialog(null,e);
}
       }
    }//GEN-LAST:event_calActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JTextField address;
    private javax.swing.JButton cal;
    private javax.swing.JTextField camount;
    private javax.swing.JTextField checkIn;
    private javax.swing.JTextField checkOut;
    private javax.swing.JTextField day;
    private javax.swing.JTextField deposit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> room_no;
    private javax.swing.JTextField tamount;
    // End of variables declaration//GEN-END:variables
}
