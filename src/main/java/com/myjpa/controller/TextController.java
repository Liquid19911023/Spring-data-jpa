package com.myjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myjpa.entity.Book;
import com.myjpa.repository.BookRepository;

@Controller
public class TextController {

	  @Autowired
	  private BookRepository bookRepository;
	    
	  @RequestMapping(value="/bookadd")
	  public ModelAndView saveEn(ModelAndView mv){
		  Book obj = new Book();
		  obj.setName("feili");
		  Book b = bookRepository.save(obj);
		  mv.setViewName("/index");
		  mv.addObject("title","book添加成功，永健大 S B!");
		  return mv;
	  }
}
