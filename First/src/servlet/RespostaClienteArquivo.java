package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RespostaClienteArquivo
 */
@WebServlet("/Arquivo")
public class RespostaClienteArquivo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		OutputStream out = null;
		FileInputStream fis = null;

		try {
			out = response.getOutputStream();
			
			response.setHeader("Content-Disposition", "attachment; filename=TestZip.zip");
			
			response.setContentType("application/zip");
			
			fis = new FileInputStream("/Users/BayardJunior/eclipse/TestZip.zip");
			
			byte[] buffer = new byte[1024];
			int b;
			
			while ((b = fis.read(buffer)) >- 1) {
				out.write(buffer, 0, b);
			}
			
		} finally {
			if (fis != null) {
				fis.close();
			}
			
			if (out != null) {
				out.close();
			}
		}
	}

}
