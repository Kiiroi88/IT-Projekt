package Delivery;
import gui.*;

import java.util.*;
import java.sql.*;

public class Delivered 
{

	int temp;
	double temp2;
	double result = 0;
	public ArrayList<Object> deliveredID = new ArrayList <Object> ();
	public ArrayList <Object> amountOfDeliveredID = new ArrayList<Object>();
	public ArrayList <Object> amountInDatabase = new ArrayList<Object>();
	public ArrayList <Object> amountToUpdate = new ArrayList<Object>();
	
	String query;
	Statement statement;
	ResultSet resultSet;
	

	public void addAmount (ArrayList<Object> addID, ArrayList<Object> addAmount) throws SQLException
	{
		deliveredID = addID;
		amountOfDeliveredID = addAmount;
		
		for(int i = 0; i < deliveredID.size(); i++)
		{	

			temp = (Integer) deliveredID.get(i);
			query = "SELECT amount FROM product WHERE idVara= '" + temp +"'"; 
			statement = MainMenu.con.createStatement(); // Creation of statement associated with the connection object
			resultSet = statement.executeQuery(query); // Execute the SQL statement that is saved in the query variable

			while(resultSet.next())
			{
				amountInDatabase.add(resultSet.getDouble("amount"));
			}

		}
		
		
		for(int i = 0; i < deliveredID.size(); i++)
		{
			
			double amDel = (Double)amountOfDeliveredID.get(i);
			double amDat = (Double)amountInDatabase.get(i);
			result = amDel + amDat;
			amountToUpdate.add(result);

		}

		for(int i = 0; i < deliveredID.size(); i++)
		{
			{	
				temp = (Integer)deliveredID.get(i);
				temp2 = (Double)amountToUpdate.get(i);
				query = "UPDATE product SET amount=" + temp2 + "WHERE idVara= '" + temp +"'"; 
				statement = MainMenu.con.createStatement();
				statement.executeUpdate(query);
			}
		}
	}
}