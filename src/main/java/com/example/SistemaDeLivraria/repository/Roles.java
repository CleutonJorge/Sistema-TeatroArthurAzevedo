package com.example.SistemaDeLivraria.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SistemaDeLivraria.model.Livro;
import com.example.SistemaDeLivraria.model.Role;

public interface Roles extends JpaRepository<Role, Serializable> {

}
