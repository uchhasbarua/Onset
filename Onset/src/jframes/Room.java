/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import onset.DBConnection;

/**
 *
 * @author Sumitro Uchhash
 */
public class Room extends javax.swing.JFrame {

    DBConnection db;
    
    
    
    public  Room() {
        initComponents();
		
		db = new DBConnection();
		RoomTable.setModel(DbUtils.resultSetToTableModel(db.getSQLQuery("SELECT * FROM ROOM")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RoomNotxt = new javax.swing.JTextField();
        HourlyCosttxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IfFreetxt = new javax.swing.JTextField();
        Deletebtn = new javax.swing.JButton();
        Addbtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PCTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("ROOMS");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        RoomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room id", "room number", "is free", "hour cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RoomTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Room Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Hourly Cost");

        RoomNotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNotxtActionPerformed(evt);
            }
        });

        HourlyCosttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HourlyCosttxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("If Free");

        IfFreetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IfFreetxtActionPerformed(evt);
            }
        });

        Deletebtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Addbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("View Pc's");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        PCTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PC ID", "PC No", "If free", "Room id", "Hour cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PCTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Deletebtn))
                    .addComponent(HourlyCosttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IfFreetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(UpdateBtn)
                        .addGap(47, 47, 47)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoomNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HourlyCosttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IfFreetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Addbtn)
                            .addComponent(Deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateBtn)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomNotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNotxtActionPerformed

    private void IfFreetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IfFreetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IfFreetxtActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        
        
         DefaultTableModel d1= (DefaultTableModel)RoomTable.getModel();
        int SelectIndex=RoomTable.getSelectedRow();
        
        String RoomId = d1.getValueAt(SelectIndex, 0).toString();
        String sql="delete from ROOM where ROOMID ="+RoomId+"";
        
        try {
            PreparedStatement ptst = db.con.prepareStatement(sql);
           int k= ptst.executeUpdate();
           if(k==1)
           {
                JOptionPane.showMessageDialog(this, "record deleted");
           
           RoomTable.setModel(DbUtils.resultSetToTableModel(db.getSQLQuery("SELECT * FROM ROOM")));
           }
           else{
              JOptionPane.showMessageDialog(this, "record failed delete");
           }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(this, "rooms contains pc,move the pc's to another room before deleting");
            //Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void HourlyCosttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HourlyCosttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HourlyCosttxtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void RoomTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomTableMouseClicked

        
        
        
        
        //show pcs in the room
         DefaultTableModel d1= (DefaultTableModel)RoomTable.getModel();
        int SelectIndex=RoomTable.getSelectedRow();
        
        
        
        int RoomId = (int) d1.getValueAt(SelectIndex, 0);
        db=new DBConnection();
       String sql ="Select * from PC Where ROOMID="+RoomId+"";
       
        RoomNotxt.setText(d1.getValueAt(SelectIndex, 1).toString());
         HourlyCosttxt.setText(d1.getValueAt(SelectIndex, 3).toString());
          IfFreetxt.setText(d1.getValueAt(SelectIndex, 2).toString());
       
       
        ResultSet rs= db.getSQLQuery(sql);
        PCTable.setModel(DbUtils.resultSetToTableModel(rs));
        
        //show pcs in the room
        
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_RoomTableMouseClicked

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        try {
            // TODO add your handling code here:
            String RoomNo= RoomNotxt.getText();
            String HourlyCost= HourlyCosttxt.getText();
            String IfFree= IfFreetxt.getText();
            
            String sql="insert into ROOM(ROOMNUMBER,ISFREE,HOURCOST) values (?,?,?)";
            
            
            
            PreparedStatement ptst = db.con.prepareStatement(sql);
            ptst.setString(1, RoomNo);
            ptst.setString(2, IfFree);
            ptst.setString(3, HourlyCost);
            
            int k= ptst.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this, "record added");
                RoomNotxt.setText("");
                HourlyCosttxt.setText("");
                IfFreetxt.setText("");
                
		RoomTable.setModel(DbUtils.resultSetToTableModel(db.getSQLQuery("SELECT * FROM ROOM")));
                

                
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "record failed to add");
                
            }
            
            
            
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        
        
        
      
    }//GEN-LAST:event_AddbtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        
        
            
         DefaultTableModel d1= (DefaultTableModel)RoomTable.getModel();
        int SelectIndex=RoomTable.getSelectedRow();
        String RoomId = d1.getValueAt(SelectIndex, 0).toString();
      String RoomNo= RoomNotxt.getText();
      String HourlyCost= HourlyCosttxt.getText();
      String IfFree= IfFreetxt.getText();
        
        
        String sql="update ROOM  set ROOMNUMBER =? , HOURCOST =? , ISFREE =? WHERE ROOMID=?";
        
        try {
            PreparedStatement ptst = db.con.prepareStatement(sql);
           
            ptst.setString(1,RoomNo );
            ptst.setString(2, HourlyCost);
             ptst.setString(3, IfFree);
             ptst.setString(4, RoomId);
            
            
            
            int k= ptst.executeUpdate();
            
            if(k==1)
            {
                JOptionPane.showMessageDialog(this, "record updated");
                RoomNotxt.setText("");
                HourlyCosttxt.setText("");
                IfFreetxt.setText("");
                
		RoomTable.setModel(DbUtils.resultSetToTableModel(db.getSQLQuery("SELECT * FROM ROOM")));
                

                
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "record failed to update");
                
            }
        } catch (SQLException ex) {
             
           Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField HourlyCosttxt;
    private javax.swing.JTextField IfFreetxt;
    private javax.swing.JTable PCTable;
    private javax.swing.JTextField RoomNotxt;
    private javax.swing.JTable RoomTable;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
