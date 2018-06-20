package com.example.SistemaDeLivraria.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Setor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String identificacao;
	private int numero;
    private int setor;
    
    @ManyToMany(mappedBy = "setores")
	private List<Livro> livro;
    
    
	public List<Livro> getLivros() {
		return livro;
	}
	public void setLivros(List<Livro> livros) {
		this.livro = livros;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	
	@Override
	public String toString() {
		return this.identificacao;
	}
    
    
	

}
