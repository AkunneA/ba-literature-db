package com.books.service;

import com.books.model.Book;

public interface BookInterface {

	public Book authorDetect(String Name);
	public Book isbnDetect(String isbn);
}
