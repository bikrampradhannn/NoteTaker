package Bikram.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {

		// get(),load()
		Configuration cfg = new Configuration();
		cfg.configure("com/Bikram/Hibernate/hibernate.cfg.xml");
		SessionFactory fac = cfg.buildSessionFactory();
		Session session = fac.openSession();

		// get()-Student:101
		Student student = (Student) session.get(Student.class, 101);

		// Student student = (Student) session.load(Student.class, 101);
		System.out.println(student);

		Address add = (Address) session.get(Address.class, 1);
		System.out.println(add.getCity());

		session.clear();
		fac.close();
	}

}
