package br.com.impacta.javaweb.servlets.lab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet(description = "Lab de processamento de parametros enviados pelo usuário", urlPatterns = { "/param-servlet" })
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		
		response.getWriter().append("<html><body><h2>Seu nome é " + nome + "<br>")
							.append("Sua idade é de " + idade + " anos. </h2></body></html>");
	}

}
