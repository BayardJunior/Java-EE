package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Cart;
import entity.Product;
import sun.util.resources.cldr.rn.CalendarData_rn_BI;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/Add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Product product = Product.getProductById(id);
		
		HttpSession session = request.getSession();
		
		Cart cart = (Cart) request.getAttribute("cart");
		
		if (cart== null) {
			cart = new Cart();
			session.setAttribute("cart", cart);
		}
		
		cart.add(product);
		
		request.getRequestDispatcher("/List").forward(request, response);
		
	}

}
