package Inventory;

import gui.MainMenu;

import java.sql.*;
import java.util.ArrayList;

public class Inventory_Change {

	Object ID = null;
	Object value = null;
	Object column = null;
	
	public Inventory_Change(Object x, Object y, Object z ) {

		Object ID = x;
		Object value = y;
		Object column = z;
		
		if (column.equals("Name")){
			column = "name";			
		}
		if (column.equals("Ref Nr")){
			column = "ref_nr";			
		}
		if (column.equals("Price")){
			column = "price";			
		}
		if (column.equals("Type")){
			column = "type";			
		}
		if (column.equals("Unit")){
			column = "unit";			
		}
		if (column.equals("Amount")){
			column = "amount";			
		}
		if (column.equals("Min Amount")){
			column = "min_amount";			
		}
		
		if (ID != null){
			
			String query = "UPDATE product SET "+column+" = '"+value+"' WHERE idVara = '"+ ID+"'";
			Statement stmt;

		try {

			stmt = MainMenu.con.createStatement();

			stmt.executeUpdate(query);
			
			stmt.close();

		} catch (SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}	
		}
	}
}

