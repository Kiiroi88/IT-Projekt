package testConnection;
import java.sql.*;
  
   public class Connect
   {

     public static void main (String[] args) { 
       try
       {
         // Step 1: Load the JDBC driver. 
         Class.forName("com.mysql.jdbc.Driver"); 
         // Step 2: Establish the connection to the database. 
         String url = "jdbc:mysql://184.172.173.42:3306/chichiu_ITProjekt"; 
         Connection conn = DriverManager.getConnection(url,"chichiu_anroth","it12345");  
         System.out.println("Database connection established");
       }
       catch (Exception e)
       {
         System.err.println("Got an exception! "); 
         System.err.println(e.getMessage()); 
       } 
     } 
   } 
