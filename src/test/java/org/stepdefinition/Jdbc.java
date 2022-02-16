package org.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
	public static void main(String[] args) {
		Connection con =null;
		try{
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","database");
			    String query = "select * from studetails";
			    PreparedStatement p = con.prepareStatement(query);
			    ResultSet r = p.executeQuery();
			    while(r.next()){
			         int sid = r.getInt("sid");
			         System.out.println(sid);
				 String sname =r.getString("sname");
				 System.out.println(sname);
			    }
			}
			catch(ClassNotFoundException  e){
				e.printStackTrace();
				
			}
		  catch(SQLException   e) {
			  e.printStackTrace();
		  }

			finally{
			      try{
			           con.close();
			        }
			  	 catch(SQLException e){
			  		 e.printStackTrace();
				}
			}
	}
	

}
