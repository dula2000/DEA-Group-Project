package registrationDevelopment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String uname = request.getParameter("name");
	 String umail = request.getParameter("email");
	 String upassword = request.getParameter("pass");
	 String umobile = request.getParameter("contact");
	 RequestDispatcher dispatcher = null;
	 Connection con =null;
	 
	 /*  PrintWriter out = response.getWriter();
	out.print(uname);
	 out.print(umail);
	 out.print(upassword);
	 out.print(umobile);
		*/
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dea?useSSL=false","root","");
		 PreparedStatement pst = con.prepareStatement("insert into registration(UserName,Email,Password,Mobile) values(?,?,?,?)");
		 pst.setString(1, uname);
		 pst.setString(2, umail);
		 pst.setString(3, upassword);
		 pst.setString(4, umobile);
		 
		 int rowCount=pst.executeUpdate();
		 dispatcher = request.getRequestDispatcher("registration.jsp");
		 if(rowCount>0) {
			 request.setAttribute("status", "success");
			 
		 }
		 else {
			 request.setAttribute("status", "failed");
		 }
		 dispatcher.forward(request, response);
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
	     try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	 
	 
		}

}
