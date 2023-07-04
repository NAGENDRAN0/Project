package bs.BookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import bs.BookStore.serviceImpl.MyBookServiceImpl;

@Controller
public class MyBookcontroller {

	@Autowired
	private MyBookServiceImpl bookServiceImpl;   
	
	@RequestMapping("/deleteList/{id}")
	public String DeleteList(@PathVariable("id") Long id) {
		bookServiceImpl.deleteList(id);
		return"redirect:/MyBok";
	}
}
