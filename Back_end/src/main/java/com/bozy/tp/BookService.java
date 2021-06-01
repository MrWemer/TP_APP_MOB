package com.bozy.tp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookService {
	static ResultSet rs ;
	static Statement stmt;
	static Connection con;
	
	
	String sqlPort = "3306" ;
	String sqlUsername = "root";
	String sqlPassword ="root";
	
	
	
	
	
	
	
	public BookEntity findByID(int id) {
		BookEntity book = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:"+sqlPort+"/Books",sqlUsername,sqlPassword);  
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from book_tb where id="+id);
		
			if(rs.next())
			book= new BookEntity( rs.getInt(1),rs.getString(2),rs.getString(3) );  
			con.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return book;
	}
	
	public ArrayList<BookEntity> getAll() {
		

		ArrayList<BookEntity> books = new ArrayList<BookEntity>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:"+sqlPort+"/Books",sqlUsername,sqlPassword);   
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from book_tb");
		
		while(rs.next())  
			books.add(  new BookEntity(rs.getInt(1),rs.getString(2),rs.getString(3) ) );  
		con.close();  
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return books;
	
	}
	
	public void addBook(BookEntity book) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:"+sqlPort+"/Books",sqlUsername,sqlPassword);  
			
			con.prepareStatement("INSERT INTO book_tb (title , author) value('"
					+book.getTitle()+"','"+book.getAuther()+"');").executeUpdate();
			
			con.close();
		} catch (SQLException e) {e.printStackTrace();} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void updateBook(BookEntity book) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:"+sqlPort+"/Books",sqlUsername,sqlPassword);  
		
		con.prepareStatement("Update book_tb set title='"+book.getTitle()+"' , author='"
							+book.getAuther()+"' where id="+book.getId()).executeUpdate();
		
		con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	public void deletBook(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:"+sqlPort+"/Books",sqlUsername,sqlPassword);    
		
		con.prepareStatement("delete from book_tb where id="+id).execute();
		
		con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
