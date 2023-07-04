package bs.BookStore.service;

import java.util.List;

import bs.BookStore.model.Book;

public interface BookService {

	List<Book>getAllBooks();
	
	Book saveBook(Book book);
	
	Book getBookId(Long id);
	
	void DeleteByID(Long id);
}
