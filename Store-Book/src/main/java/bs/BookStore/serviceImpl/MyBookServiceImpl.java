package bs.BookStore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bs.BookStore.model.MyBook;
import bs.BookStore.repository.MybookRepository;
import bs.BookStore.service.MyBookService;

@Service
public class MyBookServiceImpl implements MyBookService {

	@Autowired
	private MybookRepository mbookRepo;
	
	@Override
	public MyBook bookSave(MyBook mybook) {
		// TODO Auto-generated method stub
		return mbookRepo.save(mybook);
	}
	@Override
	public List<MyBook> getAllBooks() { 
		// TODO Auto-generated method stub
		
		return mbookRepo.findAll();
	}
	
	@Override
	public void deleteList(Long id) {
		// TODO Auto-generated method stub
		mbookRepo.deleteById(id);
	}

}
