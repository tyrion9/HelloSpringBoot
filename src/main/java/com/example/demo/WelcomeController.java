package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@Value("${welcome.message}")
	private String message;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", message);
		model.put("test", "hay that");
		return "welcome";
	}
}
