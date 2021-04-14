package com.cg.bms.service;

import com.cg.bms.exception.bmsexception;

import java.util.List;

import com.cg.bms.entity.*;

public interface bookService {

	Book add(Book book) throws bmsexception;
	Book save(Book book) throws bmsexception;
	boolean deleteById(long bookId) throws bmsexception;
	List<Book> getById() throws bmsexception;
	List<Book> getAll() throws bmsexception;
}
