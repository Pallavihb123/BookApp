package com.KIT.BookApp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.KIT.BookApp.entity.BookEntity;
import com.KIT.BookApp.repo.BookRepo;

@Component
public class BookService 
{
	@Autowired
	BookRepo br;
	public List<BookEntity> getAllBooks()
	{
		List<BookEntity> list =(List<BookEntity>) br.findAll();
		return list;
	}
	public BookEntity getById(int i) 
	{
		BookEntity b = br.findById(i);
		return b;
		
	}
	public String insertBook(BookEntity b) 
	{
		 br.save(b);
		 return "Book Inserted";
		
	}
	public String update(int i, BookEntity b) 
	{
		BookEntity b1 = br.findById(i);
		b1.setBname(b.getBname());
		b1.setBauthor(b.getBauthor());
		br.save(b1);
		return "Data inserted";
	}
	public String delete(int i) 
	{
		br.deleteById(i);
		
		return "Data deleted";
		
	}
	
}
