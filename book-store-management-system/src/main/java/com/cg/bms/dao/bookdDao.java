package com.cg.bms.dao;

import java.util.List;

import com.cg.bms.entity.Book;
import com.cg.bms.exception.bmsexception;

public interface bookdDao {
	Book add(Book book) throws bmsexception;
	Book save(Book book) throws bmsexception;
	boolean deleteById(long bookID) throws bmsexception;
	List<Book> getById() throws bmsexception;
	List<Book> getAll() throws bmsexception;

	public static final String INSERT_book = "INSERT INTO books  VALUES (?,?,?,?)";
	public static final String UPDATE_book= "UPDATE books SET title = ?, publishdate = ?,Where bid = ?,where price=?";
	public static final String DELETE_book = "DELETE FROM books WHERE bid = ?";
	public static final String GET_book_BY_ID = "SELECT bid, title, publishdate FROM books WHERE price > ?";
	public static final String GET_ALL_book = "SELECT bid,title,publishdate, FROM books";
}
