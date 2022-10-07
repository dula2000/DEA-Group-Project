package Addflight;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@jakarta.servlet.annotation.WebServlet("/FlightInsertServ2")
public class FlightInsertServ2 extends HttpServlet {
    
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		
		
		PrintWriter out = response.getWriter();
		
		Integer FLIGHT_ID = Integer.parseInt(request.getParameter("Fid"));
		
		String  STARTS = request.getParameter("start");
		
		String  END = request.getParameter("end");
		
		String  NO_SEATS = request.getParameter("ns");
		
		String  PILOT = request.getParameter("plt");
			'
				'
				

		//calling insertcustomer() Methode
				boolean isTrue;
				
				isTrue = FlightDBUtil2.insertflights(FLIGHTID,START,END,NO_SEATS,PILOT);
				
				if(isTrue == true) {
					out.println("<script type = 'text/javascript'>");
					out.println("alert('Flight Details Successfully Added');");
					out.println("location = 'flight.jsp'");
					out.println("</script>");
				} else {
					RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
					dis.forward(request, response);
				}
	
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
   }	

}
