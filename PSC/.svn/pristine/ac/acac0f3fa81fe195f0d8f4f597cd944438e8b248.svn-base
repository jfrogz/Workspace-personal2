package com.xpd.web.psc.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xpd.model.Person;
import com.xpd.service.PersonService;

@Controller
@RequestMapping("/")
public class HelloController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private PersonService personService;
	

	@GetMapping
    public String welcome(ModelMap model) {
		LOGGER.debug( "HelloController::welcome" );
        model.addAttribute("greeting", "Hello World from Spring 4 MVC with GetMapping");
        return "home";
    }

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
    public String admin(ModelMap model) {
		LOGGER.debug( "HelloController::admin" );
        return "admin.admin";
    }
	
	@GetMapping("/products")
	@PreAuthorize("isAuthenticated()")
    public String products(ModelMap model) {
		LOGGER.debug( "HelloController::products" );
        return "products";
    }

	@GetMapping("/contactus")
	@PreAuthorize("isAuthenticated()")
    public String contactus(ModelMap model) {
		LOGGER.debug( "HelloController::contactus" );
        return "contactus";
    }

 
    @GetMapping("/hello/{id}")
    public String sayHello( ModelMap model, @PathVariable Long id ) {
    	LOGGER.debug( "HelloController::sayHello" );
		Person person = personService.findById(id);
		model.addAttribute("greeting", "Hello friend " + person.getName() + "!!! with GetMapping");
        return "home";
    }
	
}
