package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RespostaCliente
 */
@WebServlet("/Resposta")
public class RespostaClienteTexto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = null;
		
		try{
			out = response.getWriter();
			response.setContentType("text/html");
			
			out.println("<HTML>");
			out.println("<HEAD>");
			out.println("<meta http-equiv=\"Content-Type\"content=\"text/htm; charset=ISO-8859-1\">");
			
			out.println("</HEAD>");
			out.println("<BODY>");
			out.println("<H1> Título da Página!</H1>");
			out.println("<STRONG> Este é um texto em negrito!</SRONG>");
			out.println("</BODY></HTML>");
			
			
		}finally{
			if (out != null) {
				out.close();
			}
		}
		
	}

}
