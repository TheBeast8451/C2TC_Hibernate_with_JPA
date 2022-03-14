package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Book;
import com.cg.jpacrud.service.BookService;
import com.cg.jpacrud.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 101*************");
		System.out.println("Book with ID 101:"+service.getBookById(101));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing book written by Walter Isaacson*************");
		for(Book book:service.getAuthorBooks("Walter Isaacson") ) {
			System.out.println(book);
		}
		
		System.out.println("************Listing book on Technology*************");
		for(Book book:service.getBookByTitle("Technology")) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book book:service.getBooksInPriceRange(100, 500) ) {
			System.out.println(book);
		}
		
		
		
		

	}
}
