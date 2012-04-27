package SQL;

import java.sql.*;
import java.util.*;


public class StockSQL {
	
	static ArrayList <String> StockList = new ArrayList<String>();
	
	private String URL = "jdbc:mysql://184.172.173.42:3306/chichiu_ITProjekt";
	private String driver = "com.mysql.jdbc.Driver";
	private String userID = "chichiu_miob";
	private String password = "it12345";
	
	protected static Connection con;
	
	
	
	public void connect()
	{
		try
		{
			// register the driver with DriverManager
			Class.forName(driver);
			//create a connection to the database
			con = DriverManager.getConnection(URL, userID, password);
			System.out.println("Connection established! ");
			// Set the auto commit of the connection to false.
			// An explicit commit will be required in order to accept
			// any changes done to the DB through this connection.
			con.setAutoCommit(false);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static ArrayList SelectStock() throws Exception{

		String stockQuery;
		Statement statement;
		ResultSet resultSet;
		
		stockQuery = "SELECT * FROM Product;";
		statement = con.createStatement();
		resultSet = statement.executeQuery(stockQuery);
		
		System.out.println("All rows in stockList are: ");
		
		while (resultSet.next()){
			StockList.add(resultSet.getString("ID"));
			StockList.add(resultSet.getString("Name"));
			StockList.add(resultSet.getString("RefNr"));
			StockList.add(resultSet.getString("Unit"));
			StockList.add(resultSet.getString("Quantity"));
			StockList.add(resultSet.getString("Amount"));
			StockList.add(resultSet.getString("Price"));
			StockList.add(resultSet.getString("Type"));
			StockList.add(resultSet.getString("Space"));
		}
		
		System.out.println(StockList);
		return StockList;
		
	}

}
