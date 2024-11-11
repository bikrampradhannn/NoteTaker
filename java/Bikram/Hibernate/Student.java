package Bikram.Hibernate;

import javax.persistence.Entity;

@Entity
public class Student {
	@javax.persistence.Id
	private int Id;
	private String Name;
	private String City;
	private Certificate certi;

	public Student(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.Id + " " + this.Name + " " + this.City;

	}

}
