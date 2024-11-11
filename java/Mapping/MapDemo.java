package Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Question 1 with Answer 1
		Question q = new Question();
		q.setQuestionID(1);
		q.setQuestion("What is java?");

		Answer an = new Answer();
		an.setAnswerId(1);
		an.setAnswer("Java is a programming language.");
		q.setAnswer(an); // Set answer for q

		// Question 2 with Answer 2
		Question q1 = new Question();
		q1.setQuestionID(2);
		q1.setQuestion("What is API?");

		Answer an1 = new Answer();
		an1.setAnswerId(2);
		an1.setAnswer("Application Programming Interface.");
		q1.setAnswer(an1); // Set answer for q1

		// Question 3 with Answer 3
		Question q2 = new Question();
		q2.setQuestionID(3);
		q2.setQuestion("Name??");

		Answer an2 = new Answer();
		an2.setAnswerId(3);
		an2.setAnswer("Bikram Pradhan");
		q2.setAnswer(an2); // Set answer for q

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// Save the questions and answers
		s.save(q);
		s.save(an);
		s.save(q1);
		s.save(an1);
		s.save(q2);
		s.save(an2);

		tx.commit();

		s.close();
		factory.close();
	}
}
