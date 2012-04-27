package Searches;

import gui.MainMenu;

import java.sql.*;

import Connect.Connect;

public class PrintColumns {

	public String[][] Print() {

		String[][] table = null;
//		String url = "jdbc:mysql://184.172.173.42:3306/chichiu_ITProjekt";
//		Connection con;
		String query = "select * from Product";
		String query2 = "select * from Product";
		Statement stmt;
		Statement stmt2;
		

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//
//		} catch (java.lang.ClassNotFoundException e) {
//			System.err.print("ClassNotFoundException: ");
//			System.err.println(e.getMessage());
//		}

		try {
//			con = DriverManager.getConnection(url, "chichiu_anroth", "it12345");
		
			
			stmt = MainMenu.con.createStatement();
			stmt2 = MainMenu.con.createStatement();

			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();

			// PrintColumnTypes.printColTypes(rsmd);
			System.out.println("");

			ResultSet rowcount = stmt2.executeQuery(query2);
			int rc = 0;

			while (rowcount.next()) {
				rc++;

			}

			int y = 0;
			int numberOfColumns = rsmd.getColumnCount();
			table = new String[rc][numberOfColumns];

			while (rs.next()) {
				
				for (int j = 1; j < numberOfColumns; j++) {
					String columnValue = rs.getString(j);
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

// class PrintColumnTypes {
//
// public static void printColTypes(ResultSetMetaData rsmd)
// throws SQLException {
// int columns = rsmd.getColumnCount();
// for (int i = 1; i <= columns; i++) {
// int jdbcType = rsmd.getColumnType(i);
// String name = rsmd.getColumnTypeName(i);
// System.out.print("Column " + i + " is JDBC type " + jdbcType);
// System.out.println(", which the DBMS calls " + name);
//
// }
// }
//
// }

