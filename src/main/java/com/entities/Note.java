package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {
	@Id
	private int ID;
	private String Title;
	@Column(name = "Content", length = 10000)
	private String Content;
	private Date addeDate;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Date getAddeDate() {
		return addeDate;
	}

	public void setAddeDate(Date addeDate) {
		this.addeDate = addeDate;
	}

	public Note(int ID, String title, String content, Date addeDate) {
		super();
		this.ID = new Random().nextInt(100000);
		this.Title = title;

		this.Content = content;
		this.addeDate = addeDate;
	}

	public Note(String title, String content, Date addeDate) {
		super();
		this.ID = new Random().nextInt(100000);
		Title = title;
		Content = content;
		this.addeDate = addeDate;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

}
