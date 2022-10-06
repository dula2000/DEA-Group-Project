package staffregistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class staffBDButill {

	
	public static  List <staff> validate(String username,String password) {

	ArrayList<staff> staff = new ArrayList<>();
	
	//create db con
	String url ="jdbc:mysql;//localhost;3306/Airline";
	String user = "root"; 
	String passwd ="";
	
	//validate
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,passwd);
		Statement stat =con.createStatement();
		String sql ="select * from staff where username='"+username+"' and '"+password+"'";
		ResultSet rs = stat.executeQuery(sql);
		
		if(rs.next()) {
			int id =rs.getInt(1);
			String name =rs.getString(2);
			String email =rs.getString(3);
			String nic =rs.getString(4);
			String username1 =rs.getString(5);
			String password1 =rs.getString(6);
			String contact =rs.getString(7);
			String staffstatus =rs.getString(8);
			
			staff s =new staff(id,name,email,nic,username1,password1,contact,staffstatus);
			staff.add(s);
		}
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return staff;
	
	}
	
}
