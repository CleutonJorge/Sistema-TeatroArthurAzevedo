package com.example.SistemaDeLivraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SistemaDeLivraria.model.Usuario;
import com.example.SistemaDeLivraria.repository.Usuarios;

@Service
public class SegurancaUsuarioService implements UserDetailsService {
	
	@Autowired
	private Usuarios usuarios;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarios.findByNome(username);
		
		if(usuario == null ) {
			throw new UsernameNotFoundException("Usuário não cadastrado" );
		}
		
		return usuario;
	}

	
}
