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


public class CheckIn extends javax.swing.JFrame {

    public CheckIn() {
        initComponents();
        room1.setEditable(false);
        bed.setEditable(false);
        price.setEditable(false);
         cdate.setEditable(false);
        SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal= Calendar.getInstance();
        cdate.setText(myFormat.format(cal.getTime()));
        try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?"+ "user=root&password=");

            // Create a statement
            Statement statement = con.createStatement();

            // Execute query to retrieve data
            ResultSet resultSet = statement.executeQuery("SELECT room_no FROM room where status='available'");

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

        gender = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        room_no = new javax.swing.JComboBox<>();
        price = new javax.swing.JTextField();
        cdate = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        IdType = new javax.swing.JComboBox<>();
        number = new javax.swing.JTextField();
        country = new javax.swing.JComboBox<>();
        IdNo = new javax.swing.JTextField();
        o = new javax.swing.JRadioButton();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        room1 = new javax.swing.JComboBox<>();
        bed = new javax.swing.JComboBox<>();
        address1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        deposit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("ID No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("ID Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Country");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Room Type");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, -1, -1));

        room_no.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(room_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 150, 40));

        price.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 280, 40));

        cdate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(cdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 830, 280, 40));

        name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 280, 40));

        IdType.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        IdType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voter card", "Pan card", "Aadhar card", "Passport" }));
        getContentPane().add(IdType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 280, 40));

        number.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 280, 40));

        country.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "Others" }));
        getContentPane().add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 280, 40));

        IdNo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(IdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 280, 40));

        gender.add(o);
        o.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        o.setText("Others");
        getContentPane().add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));

        gender.add(m);
        m.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        m.setText("Male");
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, -1, -1));

        gender.add(f);
        f.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        f.setText("Female");
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setText("Check In date");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 840, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 820, 150, 50));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Check In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 820, 150, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 25, 50, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setText("bed");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Price Per Day");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setText("Room No.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        room1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(room1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 280, 40));

        bed.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 280, 40));

        address1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        address1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address1ActionPerformed(evt);
            }
        });
        getContentPane().add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 690, 280, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Select ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 120, 40));

        deposit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 760, 280, 40));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel15.setText("Deposit Amount");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 770, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 920));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

//        this.setVisible(false);
//        ManageDash mdash=new ManageDash();
//        mdash.setVisible(true)
           IdType.setSelectedIndex(-1);
           IdNo.setText("");
           name.setText("");
           number.setText("");
           country.setSelectedIndex(-1);
           price.setText("");
           gender.clearSelection();
           room_no.setSelectedIndex(-1);
           address1.setText("");
           deposit.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String rn=room_no.getSelectedItem().toString();
        String rt=room1.getSelectedItem().toString();
        String b=bed.getSelectedItem().toString();
        String p=price.getText();
        String it=IdType.getSelectedItem().toString();
        String in=IdNo.getText();
        String nm=name.getText();
        String num=number.getText();
        String c=country.getSelectedItem().toString();
        String gender="";        // TODO add your handling code here:
       if(m.isSelected())
        {
            gender="M";
        }
        else if(f.isSelected())
        {
            gender="F";
        }
        else if(f.isSelected())
        {
            gender="F";
        }
        String add=address1.getText();
        String depo=deposit.getText();
       
       
        
        
       
       if(it.isEmpty() || in.isEmpty() || nm.isEmpty() ||c.isEmpty() || add.isEmpty() || gender.isEmpty()||num.isEmpty()||rt.isEmpty()||b.isEmpty()||p.isEmpty()||depo.isEmpty())
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
           
           String q11="select *  from customer where id_no='"+in+"'";
           PreparedStatement pst = conn.prepareStatement(q11);
           ResultSet rs11 = pst.executeQuery();
           if(rs11.next())
           {
               JOptionPane.showMessageDialog(null,"Already exist");
           }
           else
           {
            //Queries
            String q1="INSERT INTO customer(id_type,id_no,name,number,room_no,roomtype,bed,price,Deposit,address,nationality,gender) VALUES ('"+it+"','"+in+"','"+nm+"','"+num+"','"+rn+"','"+rt+"','"+b+"','"+p+"','"+depo+"','"+add+"','"+c+"','"+gender+"')";
            //Prepeared Statement
              String q2 = "update room set status= 'Occupied' where room_no = '"+rn+"'";
            PreparedStatement pst1=conn.prepareStatement(q1);
              PreparedStatement pst2=conn.prepareStatement(q2);
            //Execute(insert/delete/edit)
            pst1.executeUpdate();
             pst2.executeUpdate();
            //save changes(commit)
            JOptionPane.showMessageDialog(null,"Inserted");
            //inserted 
           }
        }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null,e);      
        }
       }       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ManageDash mdash=new ManageDash();
        mdash.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void address1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            String rn=room_no.getSelectedItem().toString();
          try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db?"+ "user=root&password=");

            // Create a statement
            Statement statement = con.createStatement();

            // Execute query to retrieve data
            ResultSet resultSet = statement.executeQuery("SELECT `room_type`,`bed`,`price` FROM room where room_no='"+rn+"'");

            // Populate the combo box with data from the result set
            while (resultSet.next()) {
                String item1= resultSet.getString("room_type");
                String item2= resultSet.getString("bed");
                
                String item4= resultSet.getString("price");
                room1.addItem(item1);
                bed.addItem(item2);
                price.setText(item4);
                
                
            }
           
            
            // Close resources
            resultSet.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdNo;
    private javax.swing.JComboBox<String> IdType;
    private javax.swing.JTextField address1;
    private javax.swing.JComboBox<String> bed;
    private javax.swing.JTextField cdate;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JTextField deposit;
    private javax.swing.JRadioButton f;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JRadioButton o;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> room1;
    private javax.swing.JComboBox<String> room_no;
    // End of variables declaration//GEN-END:variables
}
