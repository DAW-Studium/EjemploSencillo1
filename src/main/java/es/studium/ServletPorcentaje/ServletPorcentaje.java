package es.studium.ServletPorcentaje;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPorcentaje
 */
@WebServlet("/ServletPorcentaje")
public class ServletPorcentaje extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPorcentaje() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Indicamos idioma
				request.setCharacterEncoding("UTF-8"); 
				//Optenemos los parametros
				float numero=Float.parseFloat(request.getParameter("numero"));
				float porcentaje=Float.parseFloat(request.getParameter("porcentaje"));
				//Preparamos resultado y lo mandamos
				request.setAttribute("resultado", (numero*porcentaje)/100);
				// Redirigimos a index.jsp
				ServletContext servletContext = getServletContext();
				RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/index.jsp"); 
				//Enviamos el request y response
				requestDispatcher.forward(request, response); 
	}

}
