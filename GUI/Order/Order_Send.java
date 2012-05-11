package Order;

import java.sql.*;

import gui.MainMenu;

public class Order_Send {

	public Order_Send(Object ID, Object amount) throws SQLException {
	
		
		Statement stmt;
		String query;
		
		stmt = MainMenu.con.createStatement();
		query = "INSERT INTO order_product (idVara, amount) VALUES (" + ID + ", " + amount + ")";
		stmt.executeUpdate(query);
		
		stmt.close();
		
	}

}
