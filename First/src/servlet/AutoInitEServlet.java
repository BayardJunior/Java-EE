package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class AutoInitEServlet
 */
@WebServlet(
		urlPatterns = { "/Auto" },
		initParams = { 
				@WebInitParam(name = "adminEmail", value = "Admin@Admin.com")
		})
public class AutoInitEServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String adminEmail;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		String email = config.getInitParameter("adminEmail");
		this.adminEmail = email;
		
		System.out.println("Servlet Carregado! adminEmail = "+ email);
	}

}
