package Sales;
import gui.MainMenu;
import java.util.*;
import java.sql.*;

public class GetOrder {

	int choice = 0;
	int temp = 0;
	float temp2;

	public ArrayList<Integer> groceriesInRec = new ArrayList<Integer>();
	public ArrayList<Float> amountOfGrocery = new ArrayList<Float>();
	public ArrayList<Float> amountInDatabase = new ArrayList<Float>();
	public ArrayList<Float> amountToUpdate = new ArrayList<Float>();

	public GetOrder(int idOfRec)
	{
		choice = idOfRec;

	}

	String query;
	Statement statement;
	ResultSet resultSet;



	public void reduceAmount () throws Exception
	{

		query = "SELECT idvara FROM recipe_ingredient WHERE id= '" + choice +"'"; 
		statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object
		resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable


		while(resultSet.next())
		{
			groceriesInRec.add(resultSet.getInt("idvara"));
		}

		//System.out.println(groceriesInRec);

		//Put in list the amount of for idvara for recipe from database 
		for(int i = 0; i < groceriesInRec.size(); i++)
		{	
			temp = (Integer) groceriesInRec.get(i);

			query = "SELECT required_amount FROM recipe_ingredient WHERE idvara= '" + temp +"'"; 
			statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object
			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			
			while(resultSet.next())
			{
				amountOfGrocery.add(resultSet.getFloat("required_amount"));
			}
			

		}

		//System.out.println(amountOfGrocery);

		//Put in list the amount of for each grocery from database 
		for(int i = 0; i < groceriesInRec.size(); i++)
		{	

			temp = (Integer) groceriesInRec.get(i);
			query = "SELECT amount FROM product WHERE idVara= '" + temp +"'"; 
			statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object
			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				amountInDatabase.add(resultSet.getFloat("amount"));
			}

		}


		//Reduce the amount from database
		float result = 0;

		for(int i = 0; i < groceriesInRec.size(); i++)
		{

			result = amountInDatabase.get(i) - amountOfGrocery.get(i);
			amountToUpdate.add(result);

		}

		//To update the database
			for(int i = 0; i < groceriesInRec.size(); i++)
			{
				{	
					temp = groceriesInRec.get(i);
					temp2 = amountToUpdate.get(i);
					query = "UPDATE product SET amount=" + temp2 + "WHERE idVara= '" + temp +"'"; 
					statement = MainMenu.con.createStatement();
					statement.executeUpdate(query);
				}
			}
	}
}
