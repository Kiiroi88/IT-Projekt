package Inventory;

import gui.MainMenu;

import java.sql.*;
import java.util.ArrayList;

public class Inventory_Add {

	Object[][] table = null;
	Object ID = null;
	Object Name = null;
	Object Refnr = null;
	Object Unit = null;
	Object Quantity = null;
	Object Amount = null;
	Object Price = null;
	Object Type = null;
	
	public Inventory_Add(Object[][] x) {

		Object[][] table = x;
		Object Id = table[0][0];
		Object Name = table[0][1];
		Object Refnr = table[0][2];
		Object Unit = table[0][3];
		Object Quantity = table[0][4];
		Object Amount = table[0][5];
		Object Price = table[0][6];
		Object Type = table[0][7];
		if (table != null){
//		String query = "INSERT INTO product VALUES" + "("+Id+","+Name+"," +Refnr+","+ Unit +"," +Quantity+"," +
//				""+ Amount +","+ Price +","+ Type +")";
//		Statement stmt;
//
//		try {
//
//			stmt = MainMenu.con.createStatement();
//
//			stmt.executeQuery(query);
//			
//			stmt.close();
//
//		} catch (SQLException ex) {
//			System.err.print("SQLException: ");
//			System.err.println(ex.getMessage());
//		}
			System.out.println(Type);
			System.out.println(Id);
//			System.out.println(table);
		}
	}
}
