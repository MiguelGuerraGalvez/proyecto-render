package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnouncementController {
	@GetMapping("/noticeBoard")
	public String noticeBoard() {
		return "noticeBoard";
	}
	
	@GetMapping("/new")
	public String anuncio() {
		return "new";
	}
	
	@GetMapping("/insert")
	public String insert(@RequestParam(name="name", required=true, defaultValue="") String name, @RequestParam(name="subject", required=true, defaultValue="") String subject, @RequestParam(name="comment", required=true, defaultValue="") String comment, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("subject", subject);
		model.addAttribute("comment", comment);
		return "insert";
	}
	
	@GetMapping("/show")
	public String show(@RequestParam(name="announcement", required=true, defaultValue="") String announcement, Model model) {
		model.addAttribute("announcement", announcement);
		return "show";
	}
}
