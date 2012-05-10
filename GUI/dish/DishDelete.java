package dish;

import gui.MainMenu;

import java.sql.*;
import java.util.ArrayList;

public class DishDelete {

	Object ID = null;
	Object dish = null;

	public DishDelete(Object x) throws SQLException {

		dish = x;
		if (dish != null) {
			
			Statement stmt;
			Statement stmt2;
			ResultSet rs;

			String query = "SELECT id FROM recipe_index WHERE dish = '" + dish
					+ "'";
			stmt = MainMenu.con.createStatement();
			stmt2 = MainMenu.con.createStatement();
			
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				ID = rs.getObject("id");
			}

			String query2 = "DELETE FROM recipe_ingredient WHERE id = '" + ID
					+ "'";

			stmt2.executeUpdate(query2);

			stmt.close();
			stmt2.close();

		}
	}
}