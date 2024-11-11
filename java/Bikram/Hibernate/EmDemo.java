package Bikram.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/Bikram/Hibernate/hibernate.cfg.xml");
		SessionFactory fac = cfg.buildSessionFactory();

		Student st1 = new Student();
		st1.setId(111);
		st1.setName("Bikram");
		st1.setCity("BAM");

		Certificate cr = new Certificate();
		cr.setCourse("Android");
		cr.setDuration("3Months");
		st1.setCerti(cr);

		Student st2 = new Student();
		st2.setId(222);
		st2.setName("Ankita");
		st2.setCity("BAM");

		Certificate cr1 = new Certificate();
		cr1.setCourse("Web");
		cr1.setDuration("6Months");
		st2.setCerti(cr1);

		Session s = fac.openSession();
		Transaction tx = s.beginTransaction();

		s.save(st1);
		s.save(st2);
		tx.commit();

		fac.close();
	}

}
