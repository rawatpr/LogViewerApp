package com.example.LogViewerApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{

	@RequestMapping("/Hello")
	public String sayHello()
	{
		return "Hello Dana Paola!!!";
	}
}
