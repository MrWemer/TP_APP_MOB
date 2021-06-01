package com.bozy.tp;

public class BookEntity {

	
	

	private int id;
	private String title ;
	private String auther;
	
	
	

	public BookEntity(int id, String title, String auther) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
	}



	public BookEntity(String title, String auther) {
		super();
		this.title = title;
		this.auther = auther;
	}
	
	
	
	public int  getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", title=" + title + ", auther=" + auther + "]";
	}
}
