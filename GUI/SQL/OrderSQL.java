package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderSQL {
	static ArrayList<String> orderList = new ArrayList<String>();

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

	public static ArrayList selectOrder() throws Exception {

		String selectQuery;
		Statement statement;
		ResultSet resultSet;

		selectQuery = "SELECT * FROM Order;";
		statement = con.createStatement();
		resultSet = statement.executeQuery(selectQuery);

		System.out.println("All rows in orderList are: ");

		while (resultSet.next()) {
			orderList.add(resultSet.getString("ID"));
			orderList.add(resultSet.getString("Name"));
			orderList.add(resultSet.getString("RefNr"));
			orderList.add(resultSet.getString("Unit"));
			orderList.add(resultSet.getString("Quantity"));
			orderList.add(resultSet.getString("Amount"));
			orderList.add(resultSet.getString("Price"));
			orderList.add(resultSet.getString("Type"));
			orderList.add(resultSet.getString("Space"));
		}

		System.out.println(orderList);
		return orderList;

	}
}
