package com.example.LogViewerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class LogViewerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogViewerAppApplication.class, args);
	}
	

}
