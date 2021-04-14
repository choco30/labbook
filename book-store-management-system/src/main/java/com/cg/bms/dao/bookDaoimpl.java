package com.cg.bms.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cg.bms.entity.Book;
import com.cg.bms.util.*;
import com.cg.bms.exception.bmsexception;
import com.cg.bms.util.FactoryConnection;

public class bookDaoimpl implements bookdDao{

	public Book add(Book book) throws bmsexception{
		if (book != null) {
			try(Connection con = FactoryConnection.getConnection();
				PreparedStatement pst = con.prepareStatement(INSERT_book);){
	            pst.setLong(1, book.getBookID());
			    pst.setString(2, book.getTitle());
			    pst.setDate(3, Date.valueOf(book.getPublishDate()));
			    pst.setDouble(4,  book.getPrice());
			    pst.executeUpdate();
			} catch(SQLException excep) {
				throw new bmsexception("book could not be saved");
			}
	}
		return book;
		
	}

	


	public Book save(Book book) throws bmsexception {
		// TODO Auto-generated method stub
		if (book != null) {
			try(Connection con = FactoryConnection.getConnection();
				PreparedStatement pst = con.prepareStatement(UPDATE_book);){
	            pst.setLong(1, book.getBookID());
			    pst.setString(2, book.getTitle());
			    pst.setDate(3, Date.valueOf(book.getPublishDate()));
			    pst.setDouble(4,  book.getPrice());
			    pst.executeUpdate();
			} catch(SQLException excep) {
				throw new bmsexception("book could not be saved");
			}
	}
		return book;
	}


	

	
	public List<Book> getById() throws bmsexception {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		try(Connection con = FactoryConnection.getConnection();
				PreparedStatement pst = con.prepareStatement(GET_book_BY_ID);){
	           
			    
			    ResultSet rs = pst.executeQuery();
			    while(rs.next()) {
			    	Book book = new Book();
			    	book.setBookID(rs.getLong(1));
			    	book.setTitle(rs.getString(2));
			    	book.setPublishDate(rs.getDate(3).toLocalDate());
			    	book.setPrice(rs.getDouble(4));
			    	
			    }
			    
			    if(books.isEmpty())
			    	books = null;
			    
			} catch(SQLException excep) {
				throw new bmsexception("book could not be retrieved");
			}
		
		return books;
	}
	

	
	public List<Book> getAll() throws bmsexception {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		try(Connection con = FactoryConnection.getConnection();
				PreparedStatement pst = con.prepareStatement(GET_ALL_book);){
	           
			    
			    ResultSet rs = pst.executeQuery();
			    while(rs.next()) {
			    	Book book = new Book();
			    	book.setBookID(rs.getLong(1));
			    	book.setTitle(rs.getString(2));
			    	book.setPublishDate(rs.getDate(3).toLocalDate());
			    	book.setPrice(rs.getDouble(4));
			    	
			    }
			    
			    if(books.isEmpty())
			    	books = null;
			    
			} catch(SQLException excep) {
				throw new bmsexception("book could not be retrieved");
			}
		
		return books;
	}




	
	public boolean deleteById(long bookID) throws bmsexception {
		// TODO Auto-generated method stub
		boolean isDeleted = false;
		try(Connection con = FactoryConnection.getConnection();
				PreparedStatement pst = con.prepareStatement(DELETE_book);){
	           
			    pst.setLong(1, bookID);
			    int rowCount = pst.executeUpdate();
			    isDeleted = rowCount > 0 ;
			} catch(SQLException excep) {
				throw new bmsexception("Contact could not be deleted");
			}
		return isDeleted;
	}




	




	}




	




	


