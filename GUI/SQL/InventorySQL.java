package SQL;

import java.sql.*;
import java.util.*;
import javax.swing.*;

public class InventorySQL {

	static ArrayList<String> inventoryList = new ArrayList<String>();

	private String URL = "jdbc:mysql://184.172.173.42:3306/chichiu_ITProjekt";
	private String driver = "com.mysql.jdbc.Driver";
	private String userID = "chichiu_miob";
	private String password = "it12345";

	protected static Connection con;

	public void connect() {
		try {
			// register the driver with DriverManager
			Class.forName(driver);
			// create a connection to the database
			con = DriverManager.getConnection(URL, userID, password);
			System.out.println("Connection established! ");
			// Set the auto commit of the connection to false.
			// An explicit commit will be required in order to accept
			// any changes done to the DB through this connection.
			con.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<String> SelectInventory() throws Exception {

		String inventoryQuery;
		Statement statement;
		ResultSet resultSet;

		inventoryQuery = "SELECT * FROM Product;";
		statement = con.createStatement();
		resultSet = statement.executeQuery(inventoryQuery);

		System.out.println("All rows in inventoryList are: ");

		while (resultSet.next()) {
			inventoryList.add(resultSet.getString("ID"));
			inventoryList.add(resultSet.getString("Name"));
			inventoryList.add(resultSet.getString("RefNr"));
			inventoryList.add(resultSet.getString("Unit"));
			inventoryList.add(resultSet.getString("Quantity"));
			inventoryList.add(resultSet.getString("Amount"));
			inventoryList.add(resultSet.getString("Price"));
			inventoryList.add(resultSet.getString("Type"));
			inventoryList.add(resultSet.getString("Space"));
		}

		System.out.println(inventoryList);
		return inventoryList;

	}

	public static void main(String[] args) {
		InventorySQL test = new InventorySQL();

		System.out.println(test);
	}

}
