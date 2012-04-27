package gui;

import javax.swing.JFrame;

import GUI_COUNTER.Counter;
import Inventory.Inventory;
import Order.Order;
import Order.Order_gui;
import Stock.Stock;

public class testMain extends JFrame {
	public testMain() {
	try {
		getContentPane().add(new Stock());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	pack();
	setVisible(true);
}
	public static void main(String[] args) {
		
		 java.awt.EventQueue.invokeLater(new Runnable() {

	            public void run() {
	                new testMain().setVisible(true);
	            }
	        });
}
}