package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.bms.entity.*;
import com.cg.bms.exception.bmsexception;
import com.cg.bms.service.bookService;
import com.cg.bms.service.*;

public class uii {
	public static final bookService bookservice = new bookServiceimpl();
	private static Scanner obj = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		boolean result = true;
		while (result) {
			System.out.println("Enter the choice you want");
			System.out.println("1.Add a New Book.");
			System.out.println("2.Modify The Price of The Book.");
			System.out.println("3.Deleting a Book");
			System.out.println("4.List All The Books.");
			System.out.println("5.List out all Costly Books.");
			char a = obj.next().charAt(0);
			switch (a) {
			case '1':
				add();
				break;
			case '2':
				modify();
				break;
			case '3':
				try {
					delete();
				} catch (bmsexception e) {
					e.printStackTrace();
					
				}
				break;
			case '4':
				try {
					list();
				} catch (bmsexception e) {
					e.printStackTrace();
					
				}
				break;
			case '5':
				try {
					listexpens();
				} catch (bmsexception e) {
					e.printStackTrace();
					
				}
				break;
			}
			System.out.println("Want To Continue----Y-----N");
			char choice = obj.next().charAt(0);
			result = choice == 'y' ? true : false;

		}
	}

	private static void listexpens()throws bmsexception {
		// TODO Auto-generated method stub
                    bookservice.getAll();
	}

	private static void list() throws bmsexception{
		// TODO Auto-generated method stub
		 bookservice.getById();

	}

	private static void delete() throws bmsexception {
		// TODO Auto-generated method stub
		System.out.println("enter id to delete");
	boolean f=	bookservice.deleteById(obj.nextLong());
   if(f)
	   System.out.print("deleted");

	}

	private static void modify() {
		// TODO Auto-generated method stub
		Book book = new Book();
		System.out.println("Enter Book ID");
		book.setBookID(obj.nextLong());
		System.out.println("Enter Title");
		book.setTitle(obj.next());
		System.out.println("Enter Price");
		book.setPrice(obj.nextDouble());
		System.out.println("Enter date of publish");
		book.setPublishDate(LocalDate.parse(obj.next()));
		try {
			bookservice.add(book);
			System.out.println("contact added");
		} catch (bmsexception excep) {
			System.out.println(excep.getMessage());
		}

	}

	

	private static void add() {
		// TODO Auto-generated method stub
		Book book = new Book();
		System.out.println("Enter Book ID");
		book.setBookID(obj.nextLong());
		System.out.println("Enter Title");
		book.setTitle(obj.next());
		System.out.println("Enter Price");
		book.setPrice(obj.nextDouble());
		System.out.println("Enter date of publish");
		book.setPublishDate(LocalDate.parse(obj.next()));
		try {
			bookservice.add(book);
			System.out.println("contact added");
		} catch (bmsexception excep) {
			System.out.println(excep.getMessage());
		}

	}

}
