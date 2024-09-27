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

public class Project extends javax.swing.JFrame {
	DBConnection db = null;
	
	public Project() {
		initComponents();
		
		db = new DBConnection();
		
		jTableProject.setModel(DbUtils.resultSetToTableModel(db.getSQLQuery("SELECT * FROM PROJECT")));
		clientBox.removeAllItems();
		managerBox.removeAllItems();
		
		ResultSet rs = db.getSQLQuery("SELECT CLIENTID FROM CLIENT");
		
		try {
			while (rs.next()) {
				String s = rs.getString("CLIENTID");
				clientBox.addItem(s);
			}
		} catch (SQLException e) {
			
		}
		
		rs = db.getSQLQuery("SELECT EMPLOYEEID FROM EMPLOYEE");
		
		try {
			while (rs.next()) {
				String s = rs.getString("EMPLOYEEID");
				managerBox.addItem(s);
			}
		} catch (SQLException e) {
			
		}
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProject = new javax.swing.JTable();
        xLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        budgetField = new javax.swing.JTextField();
        materialField = new javax.swing.JTextField();
        maintainField = new javax.swing.JTextField();
        startTimeField = new javax.swing.JTextField();
        estimateField = new javax.swing.JTextField();
        statusField = new javax.swing.JTextField();
        totalHourField = new javax.swing.JTextField();
        clientBox = new javax.swing.JComboBox();
        managerBox = new javax.swing.JComboBox();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTableProject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProject.getTableHeader().setReorderingAllowed(false);
        jTableProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProjectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProject);
        if (jTableProject.getColumnModel().getColumnCount() > 0) {
            jTableProject.getColumnModel().getColumn(0).setResizable(false);
            jTableProject.getColumnModel().getColumn(1).setResizable(false);
            jTableProject.getColumnModel().getColumn(2).setResizable(false);
            jTableProject.getColumnModel().getColumn(3).setResizable(false);
        }

        xLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        xLabel.setText("x");

        minLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        minLabel.setText("_");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Project Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Budget:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Material Cost:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Maintainnece Cost:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Start Time:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Estimate Time:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Status:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Total Hour:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Client ID:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Manager:");

        clientBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clientBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBoxActionPerformed(evt);
            }
        });

        managerBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        managerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerBoxActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(minLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn))
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField)
                                .addComponent(budgetField)
                                .addComponent(materialField)
                                .addComponent(maintainField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(startTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estimateField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(totalHourField)
                                .addComponent(clientBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(managerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(resetBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xLabel)
                    .addComponent(minLabel))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(budgetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(materialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(maintainField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(startTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(estimateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(totalHourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(managerBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(editBtn)
                            .addComponent(resetBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String sql = "INSERT INTO PROJECT VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement state = db.con.prepareStatement(sql);
			
			state.setString(1, nameField.getText());
			state.setString(2, budgetField.getText());
			state.setString(3, "0");
			state.setString(4, materialField.getText());
			state.setString(5, maintainField.getText());
			state.setString(6, startTimeField.getText());
			state.setString(7, estimateField.getText());
			state.setString(8, statusField.getText());
			state.setString(9, totalHourField.getText());
			state.setString(10, clientBox.getSelectedItem().toString());
			state.setString(11, managerBox.getSelectedItem().toString());
			
			state.executeUpdate();
			
			jTableProject.setModel(DbUtils.resultSetToTableModel(db.getSQLQuery("SELECT * FROM PROJECT")));
			
			JOptionPane.showMessageDialog(null, "Data Added");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
		if(jTableProject.getSelectedRowCount()==1){
            int row = jTableProject.getSelectedRow();
            String id = jTableProject.getModel().getValueAt(row, 0).toString();
            String sql = "UPDATE PROJECT SET PROJECTNAME=?, BUDGET=?, MATERIALCOST=?, MAINTAINANCECOST=?, STARTDATE=?, ESTIMATEDDATE=?, STATUS=?, TOTALHOUR=?, CLIENTID=?, EMPLOYEEID=? WHERE PROJECTID=?";

            try {
                PreparedStatement ptst = db.con.prepareStatement(sql);
				
                ptst.setString(1, nameField.getText());
				ptst.setString(2, budgetField.getText());
				ptst.setString(3, materialField.getText());
				ptst.setString(4, maintainField.getText());
				ptst.setString(5, startTimeField.getText());
				ptst.setString(6, estimateField.getText());
				ptst.setString(7, statusField.getText());
				ptst.setString(8, totalHourField.getText());
				ptst.setString(9, clientBox.getSelectedItem().toString());
				ptst.setString(10, managerBox.getSelectedItem().toString());
				ptst.setString(11, id);

                ptst.executeUpdate();
				
				jTableProject.setModel(DbUtils.resultSetToTableModel(db.getSQLQuery("SELECT * FROM PROJECT")));
            } catch (SQLException ex) {
                Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Data Edited ");
        }else{
            if(jTableProject.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty");
            }else{
                JOptionPane.showMessageDialog(this, "Please Select A Single Row");
            }
        }
        jTableProject.clearSelection();
    }//GEN-LAST:event_editBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        nameField.setText("");
		budgetField.setText("");
		materialField.setText("");
		maintainField.setText("");
		startTimeField.setText("");
		estimateField.setText("");
		statusField.setText("");
		totalHourField.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jTableProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProjectMouseClicked
        DefaultTableModel model = (DefaultTableModel)jTableProject.getModel();
        String name = model.getValueAt(jTableProject.getSelectedRow(),1).toString();
        String budget = model.getValueAt(jTableProject.getSelectedRow(),2).toString();
        String material = model.getValueAt(jTableProject.getSelectedRow(),4).toString();
        String maintain = model.getValueAt(jTableProject.getSelectedRow(),5).toString();
        String start = model.getValueAt(jTableProject.getSelectedRow(),6).toString();
        String estimate = model.getValueAt(jTableProject.getSelectedRow(),7).toString();
        String status = model.getValueAt(jTableProject.getSelectedRow(),8).toString();
		String total = model.getValueAt(jTableProject.getSelectedRow(),9).toString();
		String client = model.getValueAt(jTableProject.getSelectedRow(),10).toString();
		String manager = model.getValueAt(jTableProject.getSelectedRow(),11).toString();
		
		for (int i = 0; i < clientBox.getItemCount(); i++) {
			if (client.equals(clientBox.getItemAt(i))) {
				clientBox.setSelectedIndex(i);
				break;
			}
		}
		
		for (int i = 0; i < managerBox.getItemCount(); i++) {
			if (manager.equals(managerBox.getItemAt(i))) {
				managerBox.setSelectedIndex(i);
				break;
			}
		}
		
		nameField.setText(name);
		budgetField.setText(budget);
		materialField.setText(material);
		maintainField.setText(maintain);
		startTimeField.setText(start);
		estimateField.setText(estimate);
		statusField.setText(status);
		totalHourField.setText(total);
    }//GEN-LAST:event_jTableProjectMouseClicked

    private void clientBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientBoxActionPerformed

    private void managerBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_managerBoxActionPerformed

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
			java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Project().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField budgetField;
    private javax.swing.JComboBox clientBox;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField estimateField;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProject;
    private javax.swing.JTextField maintainField;
    private javax.swing.JComboBox managerBox;
    private javax.swing.JTextField materialField;
    private javax.swing.JLabel minLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField startTimeField;
    private javax.swing.JTextField statusField;
    private javax.swing.JTextField totalHourField;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables
}
