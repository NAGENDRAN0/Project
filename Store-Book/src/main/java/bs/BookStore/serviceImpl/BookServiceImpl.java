package bs.BookStore.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import bs.BookStore.model.Book;
import bs.BookStore.repository.BookRepository;
import bs.BookStore.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository brepo;
	
	public BookServiceImpl(BookRepository brepo) {
		super();
		this.brepo = brepo;
	}
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return brepo.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return brepo.save(book);
	}

	@Override
	public Book getBookId(Long id) {
		// TODO Auto-generated method stub
		return brepo.findById(id).get();
	}

	@Override
	public void DeleteByID(Long id) {
		// TODO Auto-generated method stub
		brepo.deleteById(id);
	}
	
	

	
}
