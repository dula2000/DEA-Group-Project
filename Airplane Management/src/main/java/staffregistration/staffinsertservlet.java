package staffregistration;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@jakarta.servlet.annotation.WebServlet("/staffinsertervlet")
public class Grade1InsertServ extends HttpServlet {
    
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		
	
		PrintWriter out = response.getWriter();
		
		String  NAME = request.getParameter("name");
		
		String  EMAIL = request.getParameter("email");
		
		String  NIC = request.getParameter("nic");
		
		String  PASSWORD = request.getParameter("password");
		
		String  REPEATPASSWORD = request.getParameter("repeatpassword");
		
		String  CONTACT = request.getParameter("contact");
		
		String  GRADE = request.getParameter("grade");
	
		String  STATUS = "false";
		
				boolean isTrue;
				
				isTrue = staffBDButil.insertgrade1(NAME, EMAIL, NIC, PASSWORD,REPEATPASSWORD,CONTACT,GRADE,STATUS);
				
				if(isTrue == true) {
					out.println("<script type = 'text/javascript'>");
					out.println("alert('Account Created. Wait for admin approval');");
					out.println("location = 'loginstaff.jsp'");
					out.println("</script>");
				} else {
					RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
					dis.forward(request, response);
				}
		
	approval usss=new approval(NAME, EMAIL, NIC, PASSWORD,REPEATPASSWORD,CONTACT,GRADE,STATUS);
	
	
	HttpSession sss= request.getSession();
	sss.setAttribute("usss", usss);
	
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
   }	

}
