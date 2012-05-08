package dish;

import gui.MainMenu;

import java.sql.*;
import java.util.ArrayList;

public class printDish {

	Object[][] table = null;

	public Object[][] PrintDish() {

		Object[][] table = null;
		String query = "SELECT chichiu_Itp2.product.name,chichiu_Itp2.recipe_index.dish,chichiu_Itp2.recipe_ingredient.required_amount,chichiu_Itp2.product.ref_nr,chichiu_Itp2.product.type,chichiu_Itp2.product.unit FROM chichiu_Itp2.recipe_ingredient INNER JOIN chichiu_Itp2.product ON chichiu_Itp2.recipe_ingredient.idvara = chichiu_Itp2.product.idVara LEFT JOIN chichiu_Itp2.recipe_index ON chichiu_Itp2.recipe_ingredient.id = chichiu_Itp2.recipe_index.id";
		String query2 = "SELECT chichiu_Itp2.product.name,chichiu_Itp2.recipe_index.dish,chichiu_Itp2.recipe_ingredient.required_amount,chichiu_Itp2.product.ref_nr,chichiu_Itp2.product.type,chichiu_Itp2.product.unit FROM chichiu_Itp2.recipe_ingredient INNER JOIN chichiu_Itp2.product ON chichiu_Itp2.recipe_ingredient.idvara = chichiu_Itp2.product.idVara LEFT JOIN chichiu_Itp2.recipe_index ON chichiu_Itp2.recipe_ingredient.id = chichiu_Itp2.recipe_index.id";
		Statement stmt;
		Statement stmt2;

		try {

			stmt = MainMenu.con.createStatement();
			stmt2 = MainMenu.con.createStatement();

			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println("");

			ResultSet rowcount = stmt2.executeQuery(query2);
			int rc = 0;

			while (rowcount.next()) {
				rc++;

			}

			int y = 0;
			int numberOfColumns = rsmd.getColumnCount();
			table = new Object[rc][numberOfColumns];

			while (rs.next()) {

				for (int j = 1; j <= numberOfColumns; j++) {
					Object columnValue = rs.getObject(j);
					table[y][j - 1] = columnValue;
				}
				y++;
			}

			stmt.close();

		} catch (SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}
		return table;

	}

}
