package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Properties;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/Save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String key = request.getParameter("key");
		String value = request.getParameter("value");
			
		Properties.save(key, value);
		
		response.sendRedirect("/JS/List");
	}

}
