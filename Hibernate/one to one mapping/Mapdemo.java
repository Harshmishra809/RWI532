package Hibernate.pro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibenate.cfg.xml");
		SessionFactory  factory = cfg.buildSessionFactory();
		factory.close();
		//creating question
		Question q1 = new Question();
		q1.setQuestionid(1212);
		q1.setQuestion("What is java");
		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("Java is programming language");
		q1.setAnswer(answer);
		
		//creating question
				Question q2 = new Question();
				q1.setQuestionid(242);
				q1.setQuestion("What is collection");
				Answer answer1 = new Answer();
				answer.setAnswerId(344);
				answer.setAnswer("ApI to work with objects");
				q2.setAnswer(answer1);
		
		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q2);
		s.save(q1);
		tx.commit();
		s.close();
		factory.close();
		
	}

}
