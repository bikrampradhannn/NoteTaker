package One2ManyMapping;

import java.util.ArrayList;
import java.util.List;

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
		q.setQuestion("What ??");

		Answer an = new Answer();
		an.setAnswerId(1);
		an.setAnswer("Nothing!!!");
		an.setQuestion(q); // Set the question for each answer

		Answer an1 = new Answer();
		an1.setAnswerId(2);
		an1.setAnswer("Just checking :)...");
		an1.setQuestion(q); // Set the question for each answer

		Answer an2 = new Answer();
		an2.setAnswerId(3);
		an2.setAnswer("Hope you are doing well...");
		an2.setQuestion(q); // Set the question for each answer

		List<Answer> list = new ArrayList<Answer>();
		list.add(an);
		list.add(an1);
		list.add(an2);

		q.setAnswers(list);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// Save the question and answers
		s.save(q); // Cascade save will also save answers because of cascade = CascadeType.ALL
		
		tx.commit();
		s.close();
	}
}
