package com.example.Web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class mainController {
	
	@GetMapping("/hello")
	public String frontPage() {
		return "index";
		}

}
