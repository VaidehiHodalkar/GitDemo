package Database;
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;

public class jdbcconnection {

	
					
	    	public static void  main(String[] args) throws SQLException {													
	
	    		String dbName = "qadbt";
	    		String dbUserName = "root";
	    		String dbPassword = "Smacking@1309";
	    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8");
	          
	          		//Create Statement Object		
	        	   Statement s= con.createStatement();		
	        	   ResultSet rs = s.executeQuery("select * from employeeinfo");		
	         							
	         		// While Loop to iterate through all data and print results		
					while (rs.next()){
				        		String myName = rs.getString(1);								        
	                            int id = rs.getInt(2);
	                            String Location = rs.getString(1);								        
	                            int age = rs.getInt(2);
	                            System. out.println(myName+"  "+id+""+Location+""+age);		
	                    }		
	      			 // closing DB Connection		
	      			con.close();	
			}
	}

