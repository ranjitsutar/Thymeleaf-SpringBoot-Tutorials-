package com.ranjit.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorld {

	   @GetMapping("/hello")
	    public String hello(Model model) {
	        model.addAttribute("message", "Hello World!");
	        return "helloworld";
	    }
	   @GetMapping("/style")
	    public String style() {
	        return "add-css-js-demo";
	    }
	   @GetMapping("/bootstrap")
	    public String bootstrap() {
	        return "add-bootstrap";
	    }
	   
}
