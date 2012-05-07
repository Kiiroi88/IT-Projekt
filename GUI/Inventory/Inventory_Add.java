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
		Object Name = table[0][0];
		Object RefNr = table[0][1];
		Object Price = table[0][2];
		Object Type = table[0][3];
		Object Unit = table[0][4];
		Object Amount = table[0][5];
		Object MinAmount = table[0][6];
		if (table != null){
			
			String query = "INSERT INTO product (name, ref_nr, price, type, unit, amount, min_amount) VALUES('" + Name + "', '" + RefNr + "', '" + Price + "', '" + Type + "', '" + Unit + "', '" + Amount + "', '" + MinAmount + "')";

			Statement stmt;

		try {

			stmt = MainMenu.con.createStatement();

			stmt.executeUpdate(query);
			
			stmt.close();

		} catch (SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}
			System.out.println(Name);
			System.out.println(RefNr);
			System.out.println(Price);
			System.out.println(Type);
			System.out.println(Unit);
			System.out.println(Amount);
			System.out.println(MinAmount);
			
		}
	}
}
