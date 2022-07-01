package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSQL {
	
	public static void  main(String[] args) throws SQLException {													
		
		String dbName = "qadbt";
		String dbUserName = "root";
		String dbPassword = "Smacking@1309";
	
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8");
		 //static final String QUERY = "Select * from AGENTS where AGENT_CODE='A009'";
      		//Create Statement Object		
    	   Statement s= con.createStatement();
    	   
    	 //Create Statement Object		
		
    	    s.executeUpdate("Update AGENTS set AGENT_NAME = 'Vaishnavi' where  AGENT_CODE='A009';");	
    	  
  			 // closing DB Connection		
  			con.close();

}
}
