package com.frotas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

	@Controller 
	public class HomeController {
		
		/*qual mapeamento dele*/ @GetMapping("/")
		public String home() {
			return "/home";
			
		}
		
	

}
