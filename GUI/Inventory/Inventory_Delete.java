package Inventory;

import gui.MainMenu;

import java.sql.*;
import java.util.ArrayList;

public class Inventory_Delete {
	
	Object ID = null;
	
	public Inventory_Delete(Object x) {

		ID = x;
		if (ID != null){
			
			String query = "DELETE FROM product WHERE idVara = '"+ID+"'";
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
