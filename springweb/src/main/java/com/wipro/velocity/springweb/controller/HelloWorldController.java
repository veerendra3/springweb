package com.wipro.velocity.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/raj")
	public String showHello()
	{
	    return "helloWorld";  //returns view name
	}

	/* Work Flow of Spring MVC Application
	 * 
	 *   Client --> Request(index.jsp) --> FrontController(Web.xml) 
	 *       -->Controller(HelloWorldController) ---> response(helloWorld.jsp) 
	 * 
	 */
		

}
