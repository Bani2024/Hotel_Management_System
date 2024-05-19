/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        job = new javax.swing.JComboBox<>();
        idType = new javax.swing.JComboBox<>();
        number = new javax.swing.JTextField();
        idNo = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 140, 50));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("ID No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Job role");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 140, 50));

        job.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        job.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Receptionist", "Room Service", "House Keeper", "Chef", "Front Office Manager", "Floor Supervisors", "Food and Beverage Manager" }));
        getContentPane().add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 210, -1));

        idType.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        idType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voter card", "Aadhar card", "Pan card", "Passport" }));
        getContentPane().add(idType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 210, -1));

        number.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 210, -1));

        idNo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(idNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 210, -1));

        name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, -1));

        age.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 210, -1));

        salary.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 210, -1));

        gender.add(male);
        male.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        gender.add(female);
        female.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        female.setText("Female");
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("ID Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 19, 40, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empolyee.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         idType.setSelectedIndex(-1);
           idNo.setText("");
           name.setText("");
           number.setText("");
           job.setSelectedIndex(-1);
           age.setText("");
           gender.clearSelection();
           salary.setText("");
           

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          String it=idType.getSelectedItem().toString();
        String in=idNo.getText();
        String nm=name.getText();
        String age1=age.getText();
        String gender="";        // TODO add your handling code here:
       if(male.isSelected())
        {
            gender="M";
        }
        else if(female.isSelected())
        {
            gender="F";
        } 
       String jr=job.getSelectedItem().toString();
        String s=salary.getText();
        String num=number.getText();
       
       if(it.isEmpty() || in.isEmpty() || nm.isEmpty() || age1.isEmpty() || gender.isEmpty()||jr.isEmpty()||s.isEmpty()||num.isEmpty())
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
           
           String q11="select *  from employee where id_no='"+in+"'";
           PreparedStatement pst = conn.prepareStatement(q11);
           ResultSet rs11 = pst.executeQuery();
           if(rs11.next())
           {
               JOptionPane.showMessageDialog(null,"Already exist");
           }
           else
           {
            //Queries
            String q1="INSERT INTO employee(id_type,id_no,name,age,number,gender,job_role,salary) VALUES ('"+it+"','"+in+"','"+nm+"','"+age1+"','"+num+"','"+gender+"','"+jr+"','"+s+"')";
            //Prepeared Statement
            PreparedStatement pst1=conn.prepareStatement(q1);
            //Execute(insert/delete/edit)
            pst1.executeUpdate();
            //save changes(commit)
            JOptionPane.showMessageDialog(null,"Inserted");
            //inserted 
           }
        }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null,"Something Went Wrong");      
        }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminDash dash=new AdminDash();
        dash.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JTextField idNo;
    private javax.swing.JComboBox<String> idType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> job;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JTextField salary;
    // End of variables declaration//GEN-END:variables
}
