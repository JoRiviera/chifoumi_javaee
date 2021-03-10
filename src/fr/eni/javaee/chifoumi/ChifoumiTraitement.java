package fr.eni.javaee.chifoumi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ChifoumiGame
 */
@WebServlet("/game/*")
public class ChifoumiTraitement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String coupJoueur = request.getParameter("move");

		if(coupJoueur != null) {
			String coupServeur = ChifoumiGame.coupAleatoire();
			int resultatPartie = ChifoumiGame.gagnant(coupJoueur,coupServeur);
			String attributResultat = "";
			String gif = "";
			switch(resultatPartie) {
				case ChifoumiGame.WIN:
					attributResultat = "Vous avez <strong>gagné</strong>!";
					gif="<iframe src=\"https://giphy.com/embed/cQNRp4QA8z7B6\" width=\"480\" height=\"357\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/reasons-should-cQNRp4QA8z7B6\">via GIPHY</a></p>";
					break;
				case ChifoumiGame.LOOSE:
					attributResultat = "Vous avez <strong>perdu</strong>...";
					gif="<iframe src=\"https://giphy.com/embed/d2W7eZX5z62ziqdi\" width=\"480\" height=\"240\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/starwars-d2W7eZX5z62ziqdi\">via GIPHY</a></p>";
					break;
				case ChifoumiGame.DRAW:
					attributResultat = "<strong>Egalité</strong>.";
					gif="<iframe src=\"https://giphy.com/embed/26ufkv6PUIzb2ZQre\" width=\"480\" height=\"270\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/southparkgifs-26ufkv6PUIzb2ZQre\">via GIPHY</a></p>";
					break;
				default:
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Erreur de traitement de la partie.");
					break;
			}
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/resultat.jsp");
			request.setAttribute("resultat", attributResultat);
			request.setAttribute("gif", gif);
			request.setAttribute("coupJoueur", coupJoueur.toUpperCase());
			request.setAttribute("coupServeur", coupServeur.toUpperCase());
			rd.forward(request, response);
			
		} else {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Erreur de réception à l'entrée du joueur.");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
