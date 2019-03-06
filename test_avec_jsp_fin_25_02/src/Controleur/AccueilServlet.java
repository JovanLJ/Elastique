package Controleur;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="Accueil", urlPatterns = "/")
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // INSTRUCTIONS CONTROLEUR PRINCIPAL
	    // 1.entre dans le do get
	    //2. affiche dans le console qu'il est dans l'Accueil
	    //3. diriger vers web-inf/index.jsp = formulaire
	    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entrée dans Accueil"); 
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response); // ici je dis qu'au moment de lancement du controlleur, c'est la page index qui va se lancer
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
