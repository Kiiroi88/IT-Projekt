package Connect;

import gui.MainMenu;

import java.sql.*;

public class Connect {

	
	public void Connect() {

		String url = "jdbc:mysql://184.172.173.42:3306/chichiu_ITProjekt";
		

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			
			MainMenu.con = DriverManager.getConnection(url, "chichiu_anroth", "it12345");

		} catch (SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}
		;

	}

}
