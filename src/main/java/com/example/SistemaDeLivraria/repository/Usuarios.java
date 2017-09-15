package com.example.SistemaDeLivraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaDeLivraria.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Integer> {
	
	Usuario findByNome(String nome);
	Usuario findByEmail(String email);

}
