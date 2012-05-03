/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import Order.printOrder;
import Searches.PrintColumns;

/**
 *
 * @author DELL
 */
public class Inventory extends javax.swing.JPanel {

	Object[][] table = null;
	
    public Inventory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Inventory_Stock = new javax.swing.JTable();
        jButton_Inventory_Ok = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_New_Product = new javax.swing.JTable();
        jButton_Inventory_New_product = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();

        PrintColumns P = new PrintColumns();
		table = P.Print();
		
        jTable_Inventory_Stock.setAutoCreateRowSorter(true);
        jTable_Inventory_Stock.setBackground(new java.awt.Color(255, 255, 255));
        jTable_Inventory_Stock.setModel(new javax.swing.table.DefaultTableModel(
            table,
            new String [] {
                "ID", "Name", "Ref Nr", "Unit", "Quantity", "Amount", "Price", "Type", "Space"
            }
        ));
        jTable_Inventory_Stock.setEditingColumn(0);
        jTable_Inventory_Stock.setEditingRow(0);
        jTable_Inventory_Stock.setRowHeight(20);
        jScrollPane1.setViewportView(jTable_Inventory_Stock);

        jButton_Inventory_Ok.setText("Ok");
        jButton_Inventory_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Inventory_OkActionPerformed(evt);
            }
        });

        jTable_New_Product.setAutoCreateRowSorter(true);
        jTable_New_Product.setBackground(new java.awt.Color(255, 255, 255));
        jTable_New_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Ref Nr", "Unit", "Quantity", "Amount", "Price", "Type"
            }
        ));
        jTable_New_Product.setEditingColumn(0);
        jTable_New_Product.setEditingRow(0);
        jTable_New_Product.setRowHeight(20);
        jScrollPane3.setViewportView(jTable_New_Product);

        jButton_Inventory_New_product.setText("New product");
        jButton_Inventory_New_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Inventory_New_productActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Inventory_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Inventory_New_product))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Inventory_Ok)
                    .addComponent(jButton_Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Inventory_New_product)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Inventory_New_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Inventory_New_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Inventory_New_productActionPerformed

    private void jButton_Inventory_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Inventory_OkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Inventory_OkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Inventory_New_product;
    private javax.swing.JButton jButton_Inventory_Ok;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Inventory_Stock;
    private javax.swing.JTable jTable_New_Product;
    // End of variables declaration//GEN-END:variables
}
