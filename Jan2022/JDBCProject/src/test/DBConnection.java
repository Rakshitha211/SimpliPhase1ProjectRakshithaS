package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class DBConnection {

	
		
		
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "rakshitha211");
			
			java.sql.Statement stm = con.createStatement();
			
			ResultSet result = stm.executeQuery("select * from eproduct");
			
			while(result.next()) {
				
				System.out.println(result.getString("ID"));
				
				System.out.println(result.getString("name"));
			}
			
			con.close();

		

	}

}
