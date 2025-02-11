package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnlaceController {
	
	@GetMapping("/enlaces")
	public String enlaces() {
	    return "redirect:/enlaces.html";
	}
	
	@GetMapping("/numeroEnlace")
	public String numeroEnlace(@RequestParam(name="nenlace", required=false, defaultValue="") String nenlace, Model model) {
		model.addAttribute("nenlace", nenlace);
		return "numeroEnlace";
	}
}
