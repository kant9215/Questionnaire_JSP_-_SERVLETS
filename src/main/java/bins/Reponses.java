package bins;

public class Reponses {

	private String reponse;
	private int num;
	private boolean correct;
	public Reponses(String reponse, int num, boolean correct) {
		super();
		this.reponse = reponse;
		this.num = num;
		this.correct = correct;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	
	
	
	
}
