package com.fahrul.springgooglecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WishController {
	
	@GetMapping("/spring")
	public String greeting(@RequestParam("name") String name,Model model) {
		String message = "Hi " + name + " Welcome to Istimiwir";
		model.addAttribute("message",message);
		return "home";
	}

}
