package Searches;

import gui.MainMenu;

import java.sql.*;

import Connect.Connect;

public class PrintColumns {

	public Object[][] Print() {

		Object[][] table = null;
		String query = "select * from product";
		String query2 = "select * from product";
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

				for (int j = 1; j < numberOfColumns; j++) {
					Object columnValue = rs.getObject(j);
					table[y][j-1] = columnValue;
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