package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class HomeController {

	@RequestMapping("/clara") 
	 public @ResponseBody String greetingClara() { 
	  return "Hello, Clara!"; 
	 }
	@RequestMapping("/teste") 
	 public @ResponseBody String testing() { 
	  return "Estou fazendo um teste"; 
	 }
	@RequestMapping("/original")
	public @ResponseBody String fromOriginalCopy() {
	    return "Essa alteração veio da cópia original!";
	}
    @RequestMapping("/paralelo")
    public @ResponseBody String paralelo() {
        return "Trabalhando em paralelo!";
    }
}