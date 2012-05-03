package gui;

import java.util.ArrayList;
import java.sql.*;

import Connect.Connect;
import GUI_COUNTER.Counter;
import GUI_LOG_IN.GUI_LOG_IN;
import Inventory.Inventory;
import Order.Order_gui;
import Searches.Search_Fun;
import Searches.Search_Gui;
import Searches.Searcher;
import Stock.Stock;

public class MainMenu extends javax.swing.JFrame {

	public static Connection con;

	public MainMenu() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		

		filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
		jButton_Stock = new javax.swing.JButton();
		jButton_Order = new javax.swing.JButton();
		jButton_Inventory = new javax.swing.JButton();
		jButton_Counter = new javax.swing.JButton();
		jButton_Dish = new javax.swing.JButton();
		jButton_Login = new javax.swing.JButton();
		jButton_Checklist = new javax.swing.JButton();
		jLabel_Bild = new javax.swing.JLabel();
		jLabel_Hazz = new javax.swing.JLabel();
		jButton_Search = new javax.swing.JButton();
		jTextField_Search = new javax.swing.JTextField();
		jPanel_Main = new javax.swing.JPanel();
		Panel = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(102, 0, 102));
		setMaximizedBounds(new java.awt.Rectangle(0, 0, 1024, 600));
		setMinimumSize(new java.awt.Dimension(1024, 600));
		setPreferredSize(new java.awt.Dimension(1024, 600));

		jButton_Stock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton_Stock.setText("Stock");
		jButton_Stock.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_StockActionPerformed(evt);
			}
		});

		jButton_Order.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton_Order.setText("Order");
		jButton_Order.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_OrderActionPerformed(evt);
			}
		});

		jButton_Inventory.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton_Inventory.setText("Inventory");
		jButton_Inventory.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_InventoryActionPerformed(evt);
			}
		});
		

		jButton_Counter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton_Counter.setText("Counter");
		jButton_Counter.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_CounterActionPerformed(evt);
			}
		});

		jButton_Dish.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton_Dish.setText("Dish");

		jButton_Login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton_Login.setText("Log in");
		jButton_Login.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_LoginActionPerformed(evt);
			}
		});

		jLabel_Bild.setIcon(new javax.swing.JLabel() {
			public javax.swing.Icon getIcon() {
				try {
					return new javax.swing.ImageIcon(
							new java.net.URL("http://dl.dropbox.com/u/70362887/Logo.jpg")
							);
				} catch (java.net.MalformedURLException e) {
				}
				return null;
			}
		}.getIcon());

		jLabel_Hazz.setIcon(new javax.swing.JLabel() {
			public javax.swing.Icon getIcon() {
				try {
					return new javax.swing.ImageIcon(
							new java.net.URL("http://dl.dropbox.com/u/70362887/preview.jpg")
							);
				} catch (java.net.MalformedURLException e) {
				}
				return null;
			}
		}.getIcon());
		jLabel_Hazz.setText("jLabel3");

		jButton_Search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton_Search.setText("Search");
		jButton_Search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton_SearchActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel_MainLayout = new javax.swing.GroupLayout(jPanel_Main);
		jPanel_Main.setLayout(jPanel_MainLayout);
		jPanel_MainLayout.setHorizontalGroup(
				jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 789, Short.MAX_VALUE)
				.addComponent(Panel)
				);
		jPanel_MainLayout.setVerticalGroup(
				jPanel_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 390, Short.MAX_VALUE)
				.addComponent(Panel)
				);
		
		jButton_Checklist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_Checklist.setText("Checklist");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel_Bild, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Dish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Counter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Checklist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Search)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel_Hazz, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jPanel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel_Bild)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addComponent(jLabel_Hazz, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Stock)
                                .addGap(8, 8, 8)
                                .addComponent(jButton_Checklist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Inventory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Order)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Counter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Dish)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Search)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        
		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton_OrderActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			Panel.removeAll();
			Order_gui o = new Order_gui(null);
			Panel.add(o);
			Panel.setVisible(true);
			o.setVisible(true);
			this.invalidate();
			this.validate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new GUI_LOG_IN().setVisible(true);

			}

		});	

		
	}//GEN-LAST:event_jButton_LoginActionPerformed

	private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
		// Search button 

		if (evt.getSource() == jButton_Search )
		{

			String searchWord = jTextField_Search.getText();
			Search_Fun search_fun2 = new Search_Fun();
			Searcher searcher2 = new Searcher();
			try {

				search_fun2.select();
			} catch (Exception e) {

				e.printStackTrace();
			}

			ArrayList <String> temp2 = searcher2.searchThrough(search_fun2.groceryList, searchWord);
			Object [][] guiTable2 = null;
			try 
			{
				guiTable2 = search_fun2.combine(temp2);
				Search_Gui s = new Search_Gui(guiTable2);
				Panel.removeAll();
				Panel.add(s);
				Panel.setVisible(true);
				s.setVisible(true);
				this.invalidate();
				this.validate();
			} 
			catch (Exception e) 
			{ 
				e.printStackTrace();
			}
		}
		}

	private void jButton_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StockActionPerformed

		try {
			Stock s = new Stock();
			Panel.removeAll();
			Panel.add(s);
			Panel.setVisible(true);
			s.setVisible(true);
			this.invalidate();
			this.validate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

	private void jButton_CounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CounterActionPerformed
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new Counter().setVisible(true);

			}
		});
		
	}//GEN-LAST:event_jButton_CounterActionPerformed

	private void jButton_InventoryActionPerformed(java.awt.event.ActionEvent evt) {
		
		try {
			Inventory i = new Inventory();
			Panel.removeAll();
			Panel.add(i);
			Panel.setVisible(true);
			i.setVisible(true);
			this.invalidate();
			this.validate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) throws Exception { // DM - throws exception       


		Connect c = new Connect();
		c.Connect();

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new MainMenu().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.Box.Filler filler1;
	private javax.swing.JButton jButton_Counter;
	private javax.swing.JButton jButton_Dish;
	private javax.swing.JButton jButton_Inventory;
	private javax.swing.JButton jButton_Login;
	private javax.swing.JButton jButton_Order;
	private javax.swing.JButton jButton_Checklist;
	private static javax.swing.JButton jButton_Search; // DM - lägg till static
	private javax.swing.JButton jButton_Stock;
	private javax.swing.JLabel jLabel_Bild;
	private javax.swing.JLabel jLabel_Hazz;
	private static javax.swing.JPanel jPanel_Main;
	public static javax.swing.JPanel Panel;
	private static javax.swing.JTextField jTextField_Search; // DM - lägg till static
	// End of variables declaration//GEN-END:variables

}
