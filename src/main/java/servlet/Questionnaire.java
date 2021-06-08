package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bins.Question;
import bins.Reponses;

/**
 * Servlet implementation class Questionnaire
 */
@WebServlet(
		name = "questionnaire",
		urlPatterns = {
				"/questionnaire",
				""
		})

public class Questionnaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Questionnaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Eh jai recu une requete");
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ArrayList<Question> questions = Questionnaire.ininit();
		request.setAttribute("questions", questions);
		
		this.getServletContext().getRequestDispatcher("/jsp/questionnaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static ArrayList<Question> ininit(){
		ArrayList<Question> questions = new ArrayList<Question>();
		String enonce1 = "Quelle heure est'il ?";
		String enonce2 = "Quelle heure est'il dans 1h ?";
		String enonce3 = "Quelle heure est'il dans 2h ?";
		
		Reponses reponse1 = new Reponses("1h", 1, true);
		Reponses reponse2 = new Reponses("2h", 2, false);
		Reponses reponse3 = new Reponses("3h", 3, false);
		Reponses reponse4 = new Reponses("4h", 4, false);
		ArrayList<Reponses> repQ1 = new ArrayList<Reponses>();
		repQ1.add(reponse1);
		repQ1.add(reponse2);
		repQ1.add(reponse3);
		repQ1.add(reponse4);
		
		Reponses reponse11 = new Reponses("1h", 1, false);
		Reponses reponse12 = new Reponses("2h", 2, true);
		Reponses reponse13 = new Reponses("3h", 3, false);
		Reponses reponse14 = new Reponses("4h", 4, false);
		ArrayList<Reponses> repQ2 = new ArrayList<Reponses>();
		repQ2.add(reponse11);
		repQ2.add(reponse12);
		repQ2.add(reponse13);
		repQ2.add(reponse14);
		
		
		Reponses reponse21 = new Reponses("1h", 1, false);
		Reponses reponse22 = new Reponses("2h", 2, false);
		Reponses reponse23 = new Reponses("3h", 3, true);
		Reponses reponse24 = new Reponses("4h", 4, false);
		ArrayList<Reponses> repQ3 = new ArrayList<Reponses>();
		repQ3.add(reponse21);
		repQ3.add(reponse22);
		repQ3.add(reponse23);
		repQ3.add(reponse24);
		
		
		Question question1 = new Question(enonce1,repQ1,1);
		Question question2 = new Question(enonce2,repQ2,3);
		Question question3 = new Question(enonce3,repQ3,1);
		
		questions.add(question1);
		questions.add(question2);
		questions.add(question3);
		
		return questions;
	}
}
