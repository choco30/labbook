package com.cg.bms.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.bms.dao.bookDaoimpl;
import com.cg.bms.entity.Book;
import com.cg.bms.exception.bmsexception;
import com.cg.bms.dao.*;
public class bookServiceimpl implements bookService {
    private bookDaoimpl bookdao;
    public bookServiceimpl() {
    	bookdao=new bookDaoimpl();
    }
	public Book add(Book book) throws bmsexception {
		// TODO Auto-generated method stub
		
		if(isValidBook(book))
			bookdao.add(book);
		return book;
	}

	public Book save(Book book) throws bmsexception {
		// TODO Auto-generated method stub
		
	return 	bookdao.save(book) ;
	}

	public boolean deleteById(long bookId) throws bmsexception {
		// TODO Auto-generated method stub
		if(isValidBookId(bookId))
		{	bookdao.deleteById(bookId);
 return true;
		}
		else
		return false;
	}

	public List<Book> getById() throws bmsexception {
		// TODO Auto-generated method stub
		return bookdao.getById();
	}

	public List<Book> getAll() throws bmsexception {
		// TODO Auto-generated method stub
		return bookdao.getAll();
	}
	
	
	
	
	public boolean isValidBook(Book book) throws bmsexception {
		List<String> errorMessages = new ArrayList<String>();
		boolean isValid = true;
		
		if(book != null) {
			if(!isValidBookId(book.getBookID())) {
				isValid = false;
				errorMessages.add("book id cannot be blank and must be a posiitive number");
			}
			if(!isValidTitle(book.getTitle())) {
				isValid = false;
				errorMessages.add("boook title cannot be blank and must be greater than3");
			}
			if(!isValidPrice(book.getPrice())) {
				isValid = false;
				errorMessages.add("price cannot be blank and must be a valid one");
			}
			
			if(!errorMessages.isEmpty()) {
				throw new bmsexception("Invalid book :" + errorMessages);
			}
		}else {
			isValid = false;
			throw new bmsexception("book details are not supplied");
		}
		return isValid;
	}

	private boolean isValidPrice(Double price) {
		// TODO Auto-generated method stub
		if(price>0.0)
			return true;
		return false;
	}

	private boolean isValidTitle(String title) {
		// TODO Auto-generated method stub
		if(title!=null&& title.length()>3)
		return true;
		else return false;
	}

	private boolean isValidBookId(Long bookID) {
		// TODO Auto-generated method stub
		if(bookID!=null&&bookID>0)
		return true;
		else return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
