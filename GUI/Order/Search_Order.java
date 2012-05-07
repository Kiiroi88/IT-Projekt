package Order;

import gui.MainMenu; 

import java.sql.*; 
import java.util.*;

public class Search_Order
{
	
	ArrayList idList = new ArrayList();
	public ArrayList <String> groceryList = new ArrayList<String>();
	ArrayList refList = new ArrayList();
	ArrayList priceList = new ArrayList();
	ArrayList typeList = new ArrayList();
	ArrayList unitList = new ArrayList();
	ArrayList amountList = new ArrayList();
	ArrayList minAmountList = new ArrayList();
	ArrayList testList = new ArrayList ();
	int size = 0;


	String searchQuery;
	Statement statement;
	ResultSet resultSet;

	// Method for retreival of information in table stored 
	// in the database (MySQL)
	public ArrayList select () throws Exception
	{

		searchQuery = "SELECT name FROM product"; // SQL command to retrieve all the groceries, set into query variable 

		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object

		resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

		//System.out.println("All groceries from database: ");

		while(resultSet.next())
		{
			groceryList.add(resultSet.getString("name"));

		}

		return groceryList;
	}
	
	public ArrayList selectArticle (ArrayList <String> input) throws Exception
	{

		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT ref_nr FROM product WHERE name='" + keyword +"'";
			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				refList.add(resultSet.getInt("ref_nr"));
			}
		}
		//System.out.println("Article information " + refList);
		return refList;
	}

	//Several methods for get content from column

	public ArrayList selectID (ArrayList <String> input) throws Exception
	{

		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT idVara FROM product WHERE name='" + keyword +"'";


			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				idList.add(resultSet.getInt("idVara"));
			}
		}
		//System.out.println("ID information " + idList);
		return idList;
	}

	public ArrayList selectUnit (ArrayList <String> input) throws Exception
	{

		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT unit FROM product WHERE name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				unitList.add(resultSet.getString("unit"));
			}
		}
		//System.out.println("Unit information " + unitList);
		return unitList;
	}

	public ArrayList selectQuantity (ArrayList <String> input) throws Exception
	{ 

		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT min_amount FROM product WHERE name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				minAmountList.add(resultSet.getFloat("min_amount"));

			}
		}
		//System.out.println("Quantity information " + minAmountList);
		return minAmountList;
	}

	public ArrayList selectFRP (ArrayList <String> input) throws Exception
	{

		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT amount FROM product WHERE name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				amountList.add(resultSet.getFloat("amount"));
			}
		}
		//System.out.println("Amount FRP information " + amountList);
		return amountList;
	}

	public ArrayList selectPrice (ArrayList <String> input) throws Exception
	{

		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT price FROM product WHERE name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				priceList.add(resultSet.getInt("price"));
			}
		}
		//System.out.println("Price information " + priceList);
		return priceList;
	}

	public ArrayList selectType (ArrayList <String> input) throws Exception
	{

		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object

		// Loop for article based on matched groceries
		for(int i=0; i < input.size(); i++)
		{
			String keyword = input.get(i);
			searchQuery = "SELECT type FROM product WHERE name='" + keyword +"'";

			resultSet = statement.executeQuery(searchQuery); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				typeList.add(resultSet.getString("type"));
			}
		}
		//System.out.println("Type information " + typeList);
		return typeList;
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
//		selectStoredAt(input);

		size = input.size();
		int row = size;
		int column = 8;
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

				change = refList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				}
			}

			if(i == 3)
			{

				change = priceList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				}
			}

			if(i == 4)
			{

				change = typeList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				} 
			}

			if(i == 5)
			{

				change = unitList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				}
			}

			if(i == 6)
			{

				change = amountList;
				for(int j = 0; j < row; j++)
				{
					table[j][i] = change.get(j);
				} 
			}

		}

		//Temporary for loop to print the table in the console	
//		for (int x = 0; x < size; x++){
//			System.out.println();
//			for (int y = 0; y < 8; y++) {
//				System.out.print(" " + table[x][y]);
//				System.out.print(" ");
//
//			}
//		}	


		return table;
	}
}

