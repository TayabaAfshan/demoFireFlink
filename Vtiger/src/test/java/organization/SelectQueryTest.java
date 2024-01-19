package organization;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SelectQueryTest {

	public static void main(String[] args) throws Throwable {
		Connection conn = null;
		try {//step1:- Register/load to Mysql database
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
		   //step2:- connect to db
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
			//step3:- create the query
			Statement stat = conn.createStatement();
			String query = "select * from employee";
			//step:- execute the query
			ResultSet resultSet = stat.executeQuery(query);
			while (resultSet.next()) {
				String id = resultSet.getString(1);
				System.out.println(id);
				
			}
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		finally 
		{
			conn.close();
		}
		
		//close the db

	}

}