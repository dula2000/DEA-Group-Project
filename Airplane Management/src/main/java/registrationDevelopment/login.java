package registrationDevelopment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import com.mysql.cj.protocol.Resultset;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		String UserName = request.getParameter("username");
		String Password = request.getParameter("password");
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dea?useSSL=false","root","");
			PreparedStatement ppt = con.prepareStatement("select * from registration where UserName=? and Password=?");
			ppt.setString(1, UserName);
			ppt.setString(2, Password);
			
		ResultSet  rs = ppt.executeQuery();
		if (rs.next()) {
			session.setAttribute("name", rs.getString("UserName"));
			dispatcher = request.getRequestDispatcher("index.jsp");
		}
		else {
			request.setAttribute("status", "failed");
			dispatcher =request.getRequestDispatcher("login.jsp");
		}
			
		dispatcher.forward(request, response);
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		}

}
