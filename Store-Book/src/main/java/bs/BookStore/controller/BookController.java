package bs.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bs.BookStore.model.Book;
import bs.BookStore.model.MyBook;
import bs.BookStore.serviceImpl.BookServiceImpl;
import bs.BookStore.serviceImpl.MyBookServiceImpl;

@Controller
public class BookController {

	@Autowired
	private MyBookServiceImpl mybookserviceimpl;
	
	private BookServiceImpl serviceImpl;

	public BookController(BookServiceImpl serviceimpl) {
		super();
		this.serviceImpl = serviceimpl;
	}

	
	@GetMapping("/")
	public String HomePage() {
		return "Home";
	}

	@GetMapping("/available")
	public String BookAvailable(Model model) {
		model.addAttribute("book", serviceImpl.getAllBooks());
		return "AvailableBooks";
	}

	@GetMapping("/registered")
	public String RegBooks() {
		return "RegisteredBooks";
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b){
		serviceImpl.saveBook(b);
		return "redirect:/available";
	}
	
	@GetMapping("/MyBok") 
	public String Mybook(Model model) {
		List<MyBook>list=mybookserviceimpl.getAllBooks();
		model.addAttribute("book",list);
		return"MyBook";
	}
	
	@RequestMapping("/myList/{id}")
	public String getmyBooks(@PathVariable("id")Long id) {
		Book b=serviceImpl.getBookId(id);
		MyBook myBok=new MyBook(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		mybookserviceimpl.bookSave(myBok);
		return"redirect:/MyBok";
	}
	
	@RequestMapping("/editBook/{id}")
	public String EditBook(@PathVariable("id") Long id, Model model) {
		Book b = serviceImpl.getBookId(id);
		model.addAttribute("book", b);
		return "BookEdit";
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String DeleteBook(@PathVariable("id") Long id) {
		serviceImpl.DeleteByID(id);
		return "redirect:/available";
	}

}
