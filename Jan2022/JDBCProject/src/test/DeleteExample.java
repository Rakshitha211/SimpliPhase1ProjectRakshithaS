package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");  
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "rakshitha211");
		
		
		Statement stm=con.createStatement();
		
		 stm.executeUpdate("delete from eproduct where name='SmartPhone'");
		 
		 
		 ResultSet result= stm.executeQuery("Select * from eproduct");
		 
		 while(result.next()) {
				
				
			 System.out.println(result.getString("ID"));
				System.out.println(result.getString("name"));
				System.out.println(result.getString("price"));
			}
			
			con.close();
	}

}
