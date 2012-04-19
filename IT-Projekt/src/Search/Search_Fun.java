package Search;

import java.sql.*;
import java.util.*;

public class Search_Fun {

	ArrayList idList = new ArrayList();
	ArrayList <String> groceryList = new ArrayList<String>();
	ArrayList articleList = new ArrayList();
	ArrayList unitList = new ArrayList();
	ArrayList quantityList = new ArrayList();
	ArrayList amountFRPList = new ArrayList();
	ArrayList priceList = new ArrayList();
	ArrayList typeList = new ArrayList();
	ArrayList storedAtList = new ArrayList ();

	// DB connection variable
	protected static Connection con;

	// DB access variables
	private String URL = "jdbc:mysql://184.172.173.42:3306/chichiu_ITProjekt";
	private String driver = "com.mysql.jdbc.Driver";
	private String userID = "chichiu_anroth";
	private String password = "it12345";

	// method for establishing a DB connection
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

	// Method for retreival of information in table stored 
	// in the database (MySQL)
	public void select () throws Exception
	{
		String query;
		Statement statement;
		ResultSet resultSet;

		query = "SELECT Varunamn FROM Vara"; // SQL command to retrieve all the groceries, set into query variable 

		statement = con.createStatement(); // Creation of statement associated with the connection object

		resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

		System.out.println("All groceries from database: ");

		while(resultSet.next())
		{
			groceryList.add(resultSet.getString("Varunamn"));

		}

		System.out.println(groceryList);

	}

	public void selectArticle (ArrayList <String> input) throws Exception
	{
		String query;
		Statement statement;
		ResultSet resultSet;

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			query = "SELECT Artikelnummer FROM Vara WHERE Varunamn='" + keyword +"'";


			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				articleList.add(resultSet.getInt("Artikelnummer"));

			}

		}
		System.out.println("Article information " + articleList);

	}

	public void selectID (ArrayList <String> input) throws Exception
	{
		String query;
		Statement statement;
		ResultSet resultSet;

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			query = "SELECT ID FROM Vara WHERE Varunamn='" + keyword +"'";


			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				idList.add(resultSet.getInt("ID"));

			}

		}
		System.out.println("ID information " + idList);

	}

	public void selectUnit (ArrayList <String> input) throws Exception
	{
		String query;
		Statement statement;
		ResultSet resultSet;

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			query = "SELECT Enhet FROM Vara WHERE Varunamn='" + keyword +"'";


			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				unitList.add(resultSet.getInt("Enhet"));

			}

		}
		System.out.println("Unit information " + unitList);

	}

	public void selectQuantity (ArrayList <String> input) throws Exception

	{
		String query;
		Statement statement;
		ResultSet resultSet;

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			query = "SELECT Kvantitet FROM Vara WHERE Varunamn='" + keyword +"'";


			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				quantityList.add(resultSet.getInt("Kvantitet"));

			}

		}
		System.out.println("Quantity information " + quantityList);

	}

	public void selectFRP (ArrayList <String> input) throws Exception
	{
		String query;
		Statement statement;
		ResultSet resultSet;

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			query = "SELECT AntalFRP FROM Vara WHERE Varunamn='" + keyword +"'";


			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				amountFRPList.add(resultSet.getInt("AntalFRP"));

			}

		}
		System.out.println("Amount FRP information " + amountFRPList);

	}
	
	public void selectPrice (ArrayList <String> input) throws Exception
	{
		String query;
		Statement statement;
		ResultSet resultSet;

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			query = "SELECT Pris FROM Vara WHERE Varunamn='" + keyword +"'";


			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				priceList.add(resultSet.getInt("Pris"));

			}

		}
		System.out.println("Price information " + priceList);
	}

	public void selectType (ArrayList <String> input) throws Exception
	{
		String query;
		Statement statement;
		ResultSet resultSet;

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			query = "SELECT Varutyp FROM Vara WHERE Varunamn='" + keyword +"'";


			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				typeList.add(resultSet.getString("Varutyp"));

			}

		}
		System.out.println("Type information " + typeList);

	}

	public void selectStoredAt (ArrayList <String> input) throws Exception
	{
		String query;
		Statement statement;
		ResultSet resultSet;

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			query = "SELECT PlatsID FROM Vara WHERE Varunamn='" + keyword +"'";


			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				storedAtList.add(resultSet.getInt("PlatsID"));

			}

		}
		System.out.println("Stored at information " + storedAtList);

	}

}

