package com.example.SistemaDeLivraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SistemaDeLivraria.model.CategoriaLivro;
import com.example.SistemaDeLivraria.repository.CategoriaLivros;
import com.example.SistemaDeLivraria.repository.Livros;

@Controller
public class HomeController {
	@Autowired
	Livros livros;
	@Autowired
	CategoriaLivros categoria;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("livros", livros.findAll());
		modelAndView.addObject("categorialivros", categoria.findAll());
		return modelAndView;
	}

//	@GetMapping("/minhaConta")
//	public ModelAndView minhaConta() {
//		ModelAndView modelAndView = new ModelAndView("/conta-usuario");
//		modelAndView.addObject("usuarios", usuarios.findAll());
//		return modelAndView;
//	}
	/*
	 * @GetMapping("/index2") public ModelAndView home2() { ModelAndView
	 * modelAndView = new ModelAndView("/index2" );
	 * modelAndView.addObject("livros", livros.findAll() ); return modelAndView;
	 * }
	 */

	/*
	 * @GetMapping("/lista") public String list() { return "listagem"; }
	 */

	/*
	 * @GetMapping("/minhaConta") public String minhaConta() { return
	 * "conta-usuario"; }
	 */

}
