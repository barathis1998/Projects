/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Doctor.Doctor;
import Hospital.Hospital;
import Hospital.HospitalDirectory;
import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BARATHI
 */
public class SystemAdminHospital extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminHospital
     */HospitalDirectory hd;
    public SystemAdminHospital() {
        initComponents();
        setDefaultCloseOperation(AddVitals.DISPOSE_ON_CLOSE);
        hd=new HospitalDirectory();
        hd.getDbHospitalDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        txtAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "City", "Community", "Object"
            }
        ));
        jScrollPane1.setViewportView(tblHospital);

        txtAdd.setBackground(new java.awt.Color(102, 102, 102));
        txtAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAdd.setForeground(new java.awt.Color(255, 255, 255));
        txtAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add (3).png"))); // NOI18N
        txtAdd.setText("Add Hospital");
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        jButton2.setText("Edit Hospital");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtDelete.setBackground(new java.awt.Color(102, 102, 102));
        txtDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDelete.setForeground(new java.awt.Color(255, 255, 255));
        txtDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete (2).png"))); // NOI18N
        txtDelete.setText("Delete Hospital");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAdd)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(txtDelete)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, txtAdd, txtDelete});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdd)
                    .addComponent(jButton2)
                    .addComponent(txtDelete)
                    .addComponent(jButton1))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, txtAdd, txtDelete});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        PopulateTable();
    }//GEN-LAST:event_formWindowOpened

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
        //int selectedRowIndex = tblHospital.getSelectedRow();
         //DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        //Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 4);
        AddHospital ah=new AddHospital(hd);
        ah.setVisible(true);
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
         int res=JOptionPane.showConfirmDialog(this, "Do you want to delete this Hospital Entry?", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res==JOptionPane.YES_OPTION)
        {
             // TODO add your handling code here:
             int selectedRowIndex = tblHospital.getSelectedRow();
             
             if(selectedRowIndex<0)
             {
                 JOptionPane.showMessageDialog(this, "Select a Hospital to delete it.");
                 return;
             }
             else
             {
             DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
             Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 4);
             
             hd.deleteHospital(selectedHospital);
             
             JOptionPane.showMessageDialog(this, "Selected Hospital was deleted.");
             }
        }
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospital.getSelectedRow();
        if (selectedRowIndex<0)
        {
             JOptionPane.showMessageDialog(this, "Select a Hospital to edit it.");
        }
        else
        {
            
        
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 4);
        EditHospital eh=new EditHospital(selectedHospital);
        eh.setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         try {
             // TODO add your handling code here:
             Connection con=SQLConnection.dbconnector();
             String sql="delete from Hospital";
             PreparedStatement ps=con.prepareStatement(sql);
             ps.executeUpdate();
             ps.close();
             for(Hospital h:hd.getHospitalDirectory())
             {
             String sql1="insert into Hospital (HospitalName,Address,City,Community) values('"+h.getName()+"','"+h.getAddress()+"','"+h.getCity()+"','"+h.getCommunity()+"');";
             PreparedStatement ps1=con.prepareStatement(sql1);
             ps1.executeUpdate();
             ps1.close();
             }
         } catch (SQLException ex) {
             Logger.getLogger(SystemAdminHospital.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PopulateTable();
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
            java.util.logging.Logger.getLogger(SystemAdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospital;
    private javax.swing.JButton txtAdd;
    private javax.swing.JButton txtDelete;
    // End of variables declaration//GEN-END:variables
 public void PopulateTable()
    {
        
        DefaultTableModel model=(DefaultTableModel) tblHospital.getModel();
        model.setRowCount(0);
        for(Hospital h: hd.getHospitalDirectory())
        {
            System.out.print(h.getName());
             Object[] row=new Object[9];
             row[0]=h.getName();
             row[1]=h.getAddress();
             row[2]=h.getCity();
             row[3]=h.getCommunity();
             row[4]=h;
             model.addRow(row);
        }
}
}
