package bins;

import java.util.ArrayList;

public class Question {

	private String enonce;
	private ArrayList<Reponses> reponses;
	private int	numero;
	
	public Question(String enonce, ArrayList<Reponses> reponses, int numero) {
		super();
		this.enonce = enonce;
		this.reponses = reponses;
		this.numero = numero;
	}

	public String getEnonce() {
		return enonce;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	

	public ArrayList<Reponses> getReponses() {
		return reponses;
	}

	public void setReponses(ArrayList<Reponses> reponses) {
		this.reponses = reponses;
	}

	public int getCorrect() {
		return numero;
	}

	public void setCorrect(int numero) {
		this.numero = numero;
	}
	
	
	
}
