package Hibernate.pro;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Answer {
	@Id
	@Column(name="answer_id")
	private int answerId;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	private  String answer;
	
	
	

}
