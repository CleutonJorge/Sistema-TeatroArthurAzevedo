package com.example.SistemaDeLivraria.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaDeLivraria.model.DetalhesImagemLivro;
import com.example.SistemaDeLivraria.model.Livro;

public interface Imagens extends JpaRepository<DetalhesImagemLivro, Serializable> {

}
