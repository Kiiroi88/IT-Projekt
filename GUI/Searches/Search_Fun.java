package Searches;

import java.sql.*; 
import java.util.*;

public class Search_Fun 
{
	ArrayList idList = new ArrayList();
	public ArrayList <String> groceryList = new ArrayList<String>();
	ArrayList articleList = new ArrayList();
	ArrayList unitList = new ArrayList();
	ArrayList quantityList = new ArrayList();
	ArrayList amountFRPList = new ArrayList();
	ArrayList priceList = new ArrayList();
	ArrayList typeList = new ArrayList();
	ArrayList storedAtList = new ArrayList ();
	ArrayList testList = new ArrayList ();
	int size = 0;

	// DB connection variable
	protected static Connection con;

	// DB access variables
	private String URL = "jdbc:mysql://184.172.173.42:3306/chichiu_ITProjekt";
	private String driver = "com.mysql.jdbc.Driver";
	private String userID = "chichiu_miob";
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
	
	String searchQuery;
	Statement statement;
	ResultSet resultSet;

	// Method for retreival of information in table stored 
	// in the database (MySQL)
	public ArrayList select () throws Exception
	{

		searchQuery = "SELECT Name FROM Product"; // SQL command to retrieve all the groceries, set into query variable 

		statement = con.createStatement(); // Creation of statement associated with the connection object

		resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

		System.out.println("All groceries from database: ");

		while(resultSet.next())
		{
			groceryList.add(resultSet.getString("Name"));

		}

		System.out.println(groceryList);
		return groceryList;
	}
	public ArrayList selectArticle (ArrayList <String> input) throws Exception
	{

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT RefNr FROM Product WHERE Name='" + keyword +"'";
			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				articleList.add(resultSet.getInt("RefNr"));
			}
		}
		System.out.println("Article information " + articleList);
		return articleList;
	}

	//Several methods for get content from column

	public ArrayList selectID (ArrayList <String> input) throws Exception
	{

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT ID FROM Product WHERE Name='" + keyword +"'";


			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				idList.add(resultSet.getInt("ID"));
			}
		}
		System.out.println("ID information " + idList);
		return idList;
	}

	public ArrayList selectUnit (ArrayList <String> input) throws Exception
	{

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT Unit FROM Product WHERE Name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				unitList.add(resultSet.getString("Unit"));
			}
		}
		System.out.println("Unit information " + unitList);
		return unitList;
	}

	public ArrayList selectQuantity (ArrayList <String> input) throws Exception
	{ 

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT minimum_quantity FROM Product WHERE Name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				quantityList.add(resultSet.getInt("minimum_quantity"));

			}
		}
		System.out.println("Quantity information " + quantityList);
		return quantityList;
	}

	public ArrayList selectFRP (ArrayList <String> input) throws Exception
	{

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT Amount FROM Product WHERE Name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				amountFRPList.add(resultSet.getInt("Amount"));
			}
		}
		System.out.println("Amount FRP information " + amountFRPList);
		return amountFRPList;
	}

	public ArrayList selectPrice (ArrayList <String> input) throws Exception
	{

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT Price FROM Product WHERE Name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				priceList.add(resultSet.getInt("Price"));
			}
		}
		System.out.println("Price information " + priceList);
		return priceList;
	}

	public ArrayList selectType (ArrayList <String> input) throws Exception
	{

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT Type FROM Product WHERE Name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				typeList.add(resultSet.getString("Type"));
			}
		}
		System.out.println("Type information " + typeList);
		return typeList;
	}

	public ArrayList selectStoredAt (ArrayList <String> input) throws Exception
	{

		statement = con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT Space FROM Product WHERE Name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				storedAtList.add(resultSet.getInt("Space"));
			}
		}
		System.out.println("Stored at information " + storedAtList);
		return storedAtList;
	}

	//Creates a table from retrieved columns from database  
	public Object[][] combine (ArrayList input) throws Exception
	{
		selectArticle(input);
		selectID(input);
		selectUnit(input);
		selectQuantity(input);
		selectFRP(input);
		selectPrice(input);
		selectType(input);
		selectStoredAt(input);

		size = input.size();
		int row = size;
		int column = 9;
		Object [][] table = new Object [row][column];

		ArrayList change = null;

		for(int i = 0; i < column; i++){

			if(i == 0)
			{

				change = idList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				}

			}

			if(i == 1)
			{

				change = input;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				} 
			}

			if(i == 2)
			{

				change = articleList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				}
			}

			if(i == 3)
			{

				change = unitList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				}
			}

			if(i == 4)
			{

				change = quantityList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				} 
			}

			if(i == 5)
			{

				change = amountFRPList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				}
			}

			if(i == 6)
			{

				change = priceList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				} 
			}

			if(i == 7)
			{

				change = typeList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				}
			}

			if(i == 8)
			{

				change = storedAtList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				} 
			}

		}

		//Temporary for loop to print the table in the console	
		for (int x = 0; x < size; x++){
			System.out.println();
			for (int y = 0; y < 9; y++) {
				System.out.print(" " + table[x][y]);
				System.out.print(" ");

			}
		}	


		return table;
	}
}

