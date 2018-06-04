package com.example.SistemaDeLivraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SistemaDeLivraria.model.Editora;
import com.example.SistemaDeLivraria.model.Livro;
import com.example.SistemaDeLivraria.model.Role;
import com.example.SistemaDeLivraria.model.Usuario;
import com.example.SistemaDeLivraria.repository.Roles;
import com.example.SistemaDeLivraria.repository.Usuarios;

@Controller
public class UsuarioController {

	@Autowired
	private Usuarios usuarios;
	@Autowired
	Roles rolesService;
	
//	@GetMapping("/minhaConta")
//	public ModelAndView minhaConta() {
//		ModelAndView modelAndView = new ModelAndView("/conta-usuario");
//		modelAndView.addObject("usuarios", usuarios.findAll());
//		return modelAndView;
//	}
	
	@ModelAttribute("roles")
	public List<Role> todasEditoras() {
		return rolesService.findAll();
	}
	
	@GetMapping("/minhaConta")
	public String form(Model model, Usuario usuario) {
		model.addAttribute("usuario", usuario);
		return "conta-usuario";
	}

	@PostMapping("/usuario/salvar")
	public ModelAndView salvar(Usuario usuario) {
		// salvar no banco
		usuarios.save(usuario);

		ModelAndView modelAndView = new ModelAndView("conta-usuario");
		modelAndView.addObject("mensagem_sucesso", "Usuário cadastrado com sucesso!");

		return modelAndView;
	}

}
