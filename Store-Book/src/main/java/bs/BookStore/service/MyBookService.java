package bs.BookStore.service;


import java.util.List;

import bs.BookStore.model.MyBook;


public interface MyBookService {

	MyBook bookSave(MyBook mybook);
	
	List<MyBook> getAllBooks();
	
	void deleteList(Long id);
}
