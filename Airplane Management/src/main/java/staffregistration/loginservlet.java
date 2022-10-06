package staffregistration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//import javax.servlet.RequestDispatcher;


public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
		
		List<staff> staffDetails = staffBDButill.validate(username, password);
		request.setAttribute(password, staffDetails);
		
		}
		catch (Exception e){
			e.printStackTrace();
			
		}
		
		RequestDispatcher dis = (RequestDispatcher) request.getRequestDispatcher("SD1User.jsp");
		dis.forward(request, response);
	}

}
