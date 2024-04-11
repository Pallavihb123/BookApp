package com.KIT.BookApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookAppApplication.class, args);
	}

}

//In summary, a Controller manages the flow of data in a web application,
//while a RestController is a specialized type of controller used for APIs to 
//handle requests and responses in a format that's easy for computers to work with.


//In a web application, a Controller is like a traffic officer that directs
//the flow of data. It receives requests from the user's browser, 
//decides what to do with them, and prepares a response.

//A RestController is a specific type of controller in web development,
//usually used in APIs. It's like a special controller that's designed to
//handle requests and send back responses in a format that's easy for computers 
//to understand, like JSON or XML. So, if you're building a web API, you'd use a 
//RestController to handle the requests and responses.

//@Component: This annotation is used to mark a Java class 
//as a Spring component. It tells Spring that this class should
//be managed by the Spring container. In other words, Spring will 
//create an instance of this class and keep it ready to be used in
//other parts of your application.



//@Autowired, you can let Spring automatically inject the UserRepository 
//bean into the UserService class. First, you would annotate the UserRepository 
//interface with @Component to tell Spring that it should manage this interface as a bean: