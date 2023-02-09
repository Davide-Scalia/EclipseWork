package gioco;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class pfc
 */
@WebServlet
public class pfc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pfc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("scelta") != null) {
			String sceltaUmano=request.getParameter("scelta");
			String sceltaPc=CartaForbiceSasso.chiediPc();
			String result= CartaForbiceSasso.valuta(sceltaUmano, sceltaPc);
			
			response.getWriter().append(result);
		}	
	}
}
