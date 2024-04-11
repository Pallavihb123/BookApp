package com.KIT.BookApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KIT.BookApp.Services.BookService;
import com.KIT.BookApp.entity.BookEntity;

@RestController
public class BookController {
	
	@Autowired  //spring automatically inject objects of bookservice into bookcontroller
	BookService bs;

	
	@GetMapping("/books")//fetch all books from databases
	
	public List<BookEntity> getAllBooks()
	{
		return bs.getAllBooks();
		
	}
	
	@GetMapping("/books/{id}") //fetch the one book details
	
	public BookEntity getById(@PathVariable("id") int i)
	{
		 return bs.getById(i);
	}
	//incoming HTTP request body should be converted to a BookEntity object
	//and passed as an argument to these methods.
	
	//insert one book details into database
	@PostMapping("/books")
	
	public void insertBook(@RequestBody BookEntity b)
	{
		bs.insertBook(b);
	}
	
	//updating the data
	@PutMapping("/books/{id}")
	
	public String updateBook(@RequestBody BookEntity b,int i)
	{
		 return bs.update(i,b);
	}
	
	//deleting data
	@DeleteMapping("/books/{id}")
	
	
	public void deleteBook(@PathVariable("id") int i)
	
	{
		bs.delete(i);
	}
	
	
	
	
}




















































