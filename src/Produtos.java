

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Produtos
 */
@WebServlet("/Produtos")
public class Produtos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Produtos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String prod = request.getParameter("produto");
		String aux = request.getParameter("quantidade");
		int qtd = Integer.parseInt(aux);
		aux  = request.getParameter("preco");
		double preco = Double.parseDouble(aux);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<p>" + prod + " - " + (qtd*preco) + "</p>");
		out.println("</body></html>");
		out.close();
		
	}

}
