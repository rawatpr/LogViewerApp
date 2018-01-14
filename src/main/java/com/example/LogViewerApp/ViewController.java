package com.example.LogViewerApp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan
public class ViewController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("appName","SelectIVR");
		model.addAttribute("logPathUrl", "/usr/local/nglogs/SelectIVR/logs");
		return "index";
	}

}
