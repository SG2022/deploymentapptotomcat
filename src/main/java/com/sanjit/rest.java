package com.sanjit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {
	
	@GetMapping("/")
	public String test()
	{
		
		return "Deployment of second app tp tomacat successful";
	}

}
