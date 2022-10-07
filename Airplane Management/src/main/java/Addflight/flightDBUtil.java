package Addflights;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.DBConnect;

public class FlightDBUtil {
	
	private static boolean isSuccess = false;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static Boolean insertflights(  int FLIGHTID, String START, String END, String NO_SEATS, String PILOT) {
		
		
		//Create Database Connection
		try {
			con = DBConnect.getConnection();
		    stmt = con.createStatement();
			String  sql = "insert into flight values ('"+FLIGHTID+"','"+START+"','"+END+"','"+NO_SEATS+"','"+PILOT+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	



}
