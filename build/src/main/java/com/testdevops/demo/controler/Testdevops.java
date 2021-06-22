package com.testdevops.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Testdevops {
	@GetMapping("/test")
	
	public String holaMundo() {
		
		return "Hola Mundo";
		
	}

}
