package com.cg.bms.entity;

import java.time.LocalDate;

public class Book {
   private Long bookID;
   private String title;
   private Double price;
   private LocalDate publishDate;
   public Book() {}
public Book(Long bookID, String title, Double price, LocalDate publishDate) {
	super();
	this.bookID = bookID;
	this.title = title;
	this.price = price;
	this.publishDate = publishDate;
}
public Long getBookID() {
	return bookID;
}
public void setBookID(Long bookID) {
	this.bookID = bookID;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public LocalDate getPublishDate() {
	return publishDate;
}
public void setPublishDate(LocalDate publishDate) {
	this.publishDate = publishDate;
}
@Override
public String toString() {
	return "Book [bookID=" + bookID + ", title=" + title + ", price=" + price + ", publishDate=" + publishDate + "]";
}
   
   
   
}
