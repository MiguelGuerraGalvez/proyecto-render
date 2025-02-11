package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnuncioController {
	
	@GetMapping("/nuevoAnuncio")
	public String nuevoAnuncio() {
		return "redirect:/nuevoAnuncio.html";
	}
	
	@GetMapping("/anuncio")
	public String anuncio(@RequestParam(name="nombre", required=true, defaultValue="") String nombre, @RequestParam(name="asunto", required=true, defaultValue="") String asunto, @RequestParam(name="comentario", required=true, defaultValue="") String comentario, Model model) {
		model.addAttribute("nombre", nombre);
		model.addAttribute("asunto", asunto);
		model.addAttribute("comentario", comentario);
		return "anuncio";
	}
}
