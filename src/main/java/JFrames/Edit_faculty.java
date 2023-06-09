/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrames;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author divya
 */
public class Edit_faculty extends javax.swing.JFrame {

    String f ;
    public Edit_faculty() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtqualification = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcoursecode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtsoy = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtposition = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtsubject = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtdepartment = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtexperience = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        txtdate = new javax.swing.JTextField();
        txtjoindate = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtpic = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtbusno = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setIcon(new javax.swing.ImageIcon("C:\\Users\\divya\\Downloads\\myicons\\icons8-home-page-100.png")); // NOI18N
        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        jPanel3.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 70));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("               Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel8.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 70));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 170, 70));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Edit Faculty");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 120));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Faculty Name ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 130, 20));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 180, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 130, 20));

        txtcno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, 20));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 130, 20));
        jPanel1.add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("State");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 130, 20));
        jPanel1.add(txtstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 130, 20));
        jPanel1.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Of Birth");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 130, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qualification");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 130, 20));
        jPanel1.add(txtqualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 180, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Course Code");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 130, 20));
        jPanel1.add(txtcoursecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 180, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sem / Year");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 130, 20));
        jPanel1.add(txtsoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 180, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Join Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 130, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 130, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Position");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 130, 20));
        jPanel1.add(txtposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 180, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Subject");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 130, 20));
        jPanel1.add(txtsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 180, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Salary");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 130, 20));
        jPanel1.add(txtsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 180, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Department");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 130, 20));
        jPanel1.add(txtdepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 180, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Experience");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 130, 20));
        jPanel1.add(txtexperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 180, -1));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 180, -1));

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 180, -1));
        jPanel1.add(txtjoindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 180, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("picture");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 130, 20));
        jPanel1.add(txtpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 180, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("bus Number");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 130, 20));
        jPanel1.add(txtbusno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 180, -1));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("             Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        jPanel9.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 190, 40));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("             Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        jPanel4.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, 190, 40));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("              Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        jPanel5.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 890, 720));

        setSize(new java.awt.Dimension(904, 851));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        home h = new home();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        Color clr = new Color(0,55,55);
        jPanel3.setBackground(clr);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Color clr = new Color(0,102,102);
    }//GEN-LAST:event_HomeMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login_Panel lp = new Login_Panel();
        lp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        Color clr = new Color(0,55,55);
        jPanel8.setBackground(clr);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        Color clr = new Color(0,102,102);
        jPanel8.setBackground(clr);
    }//GEN-LAST:event_logoutMouseExited

    private void txtcnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnoActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedata?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            String name = txtname.getText();
            String cno=txtcno.getText();
            String email = txtemail.getText();
            String city = txtcity.getText();
            String state = txtstate.getText();
            String gender = txtgender.getText();
            String date = txtdate.getText();
            String qualification = txtqualification.getText();
            String coursecode = txtcoursecode.getText();
            String soy = txtsoy.getText();
            String subject = txtsubject.getText();
            String position = txtposition.getText();
            String password = txtpassword.getText();
            String jdate = txtjoindate.getText();
            String salary = txtsalary.getText();
            String department = txtdepartment.getText();
            String experience = txtexperience.getText();
            String busno = txtbusno.getText();
            String fid =f;
            Statement smt = con.createStatement();
            smt.executeUpdate( "update faculties set fname = '"+name+"', state = '"+state+"', city = '"+city+"', emailid = '"+email+"', cno = '"+cno+"', qualification = '"+qualification+"', experience = '"+experience+"', gender = '"+gender+"', coursecode = '"+coursecode+"', yearorsem = '"+soy+"', subject = '"+subject+"', position = '"+position+"', password = '"+password+"', salary = '"+salary+"', Department = '"+department+"', birthdate = '"+date+"', joindate = '"+jdate+"', busno = '"+busno+"' where fid = '"+fid+"';");
            JOptionPane.showMessageDialog(this, "Faculty details updated sucessfully.");
            txtemail.setText("");
            txtname.setText("");
            txtcity.setText("");
            txtcno.setText("");
            txtstate.setText("");
            txtgender.setText("");
            txtdate.setText("");
            txtqualification.setText("");
            txtcoursecode.setText("");
            txtsoy.setText("");
            txtsubject.setText("");
            txtposition.setText("");
            txtpassword.setText("");
            txtjoindate.setText("");
            txtsalary.setText("");
            txtdepartment.setText("");
            txtbusno.setText("");
            txtexperience.setText("");
            con.close();
            smt.close();

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        Color clr = new Color(0,102,102);
        jPanel9.setBackground(clr);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        Color clr = new Color(0,153,153);
         jPanel9.setBackground(clr);
    }//GEN-LAST:event_updateMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
            Color clr = new Color(0,102,102);
        jPanel4.setBackground(clr);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        Color clr = new Color(0,153,153);
         jPanel4.setBackground(clr);
    }//GEN-LAST:event_searchMouseExited

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
            f = JOptionPane.showInputDialog(this,"Enter Faculty ID.");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedata?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            PreparedStatement pst ;
            ResultSet rst;
            pst = con.prepareStatement("select * from faculties where fid=?");
            pst.setString(1,f);
            rst = pst.executeQuery();
            if(rst.next())
            {
                txtname.setText(rst.getString(2));
                txtstate.setText(rst.getString(3));
                txtcity.setText(rst.getString(4));
                txtemail.setText(rst.getString(5));
                txtcno.setText(rst.getString(6));
                txtqualification.setText(rst.getString(7));
                txtexperience.setText(rst.getString(8));
                txtgender.setText(rst.getString(9));
                //txtpic.setText(rst.getString(10));
                txtsoy.setText(rst.getString(11));
                txtsubject.setText(rst.getString(12));
                txtposition.setText(rst.getString(13));
                txtpassword.setText(rst.getString(14));
                txtsalary.setText(rst.getString(15));
                txtdepartment.setText(rst.getString(16));
                txtdate.setText(rst.getString(17));
                txtjoindate.setText(rst.getString(18));
                txtbusno.setText(rst.getString(19));
                txtcoursecode.setText(rst.getString(20));
                }
       } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Edit_faculty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
         Color clr = new Color(0,102,102);
        jPanel5.setBackground(clr);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        Color clr = new Color(0,153,153);
         jPanel5.setBackground(clr);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
         try {
             String f = JOptionPane.showInputDialog(this,"Enter Faculty ID.");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedata?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            Statement smt = con.createStatement();
             String quary = "select fid from faculties where fid= '"+f+"';";
            ResultSet rs = smt.executeQuery(quary);
            if(rs.next())
            {
                 try
                {
                  smt.executeUpdate("delete from faculties where fid ='"+f+"';");                                                                                                                                                                                                                                                                                                                                  
                  JOptionPane.showMessageDialog(this, "Faculties details deleted sucessfully.");
            con.close();
            smt.close();
                }
                catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
   }
         else{
     JOptionPane.showMessageDialog(this, "Please enter a Faculty ID ");
            }
          } 
          catch (ClassNotFoundException ex) {
            Logger.getLogger(course.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(course.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteMouseClicked

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
            java.util.logging.Logger.getLogger(Edit_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_faculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel search;
    private javax.swing.JTextField txtbusno;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcno;
    private javax.swing.JTextField txtcoursecode;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdepartment;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtexperience;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtjoindate;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtpic;
    private javax.swing.JTextField txtposition;
    private javax.swing.JTextField txtqualification;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txtsoy;
    private javax.swing.JTextField txtstate;
    private javax.swing.JTextField txtsubject;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
