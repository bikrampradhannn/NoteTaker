package Bikram.Hibernate;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started....");
		// Create configuration object
		Configuration cfg = new Configuration();
		// Load hibernate.cfg.xml configuration file
		cfg.configure("hibernate.cfg.xml");
		// Build session factory
		SessionFactory factory = cfg.buildSessionFactory();

		// creating StudentClass Object
		Student st = new Student();
		st.setId(101);
		st.setName("JhonSnow");
		st.setCity("Winterfell");
		System.out.println(st);

		// Creating Object for AddressClass
		Address ad = new Address();
		ad.setStreet("Street1");
		ad.setCity("Blr");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("Done");

		// Print to verify factory creation
		System.out.println("SessionFactory created: " + factory);
	}
}
