package com.example.LogViewerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LogViewerApp.config.AppConfig;

@RestController
public class MainController {
	@Autowired
	AppConfig appConfig = null;

	@RequestMapping("/Hello")
	public String sayHello() {
		System.out.println(this.appConfig.getValue("app.helloMessage"));
		return this.appConfig.getValue("app.helloMessage");
	}
}
