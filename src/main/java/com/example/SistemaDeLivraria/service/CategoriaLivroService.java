package com.example.SistemaDeLivraria.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SistemaDeLivraria.model.CategoriaLivro;
import com.example.SistemaDeLivraria.model.DetalhesImagemLivro;
import com.example.SistemaDeLivraria.model.Editora;
import com.example.SistemaDeLivraria.model.Livro;
import com.example.SistemaDeLivraria.repository.CategoriaLivros;
import com.example.SistemaDeLivraria.repository.Livros;

@Service
public class CategoriaLivroService {

	@Autowired
	CategoriaLivros Categorialivros;

	@Transactional
	public CategoriaLivro salva(CategoriaLivro Categorialivro) {
		Categorialivros.save(Categorialivro);
		// fazer outras operações no banco
        System.out.println("RRRRRRRRRRRRR");
		if (houveEdicaoSemFotoSelecionadaNo(Categorialivro)) {
			CategoriaLivro livroAntigo = buscaPor(Categorialivro.getId());
			System.out.println("TTTTTTTTTTTTTTTTT");

			if (livroAntigo.temFotoCapa()) {
				Categorialivro.setDetalhesImagem(livroAntigo.getDetalhesImagem());
				System.out.println("UUUUUUUUUUUUUU");
			}
		}
		System.out.println("asdasdasd");
		return Categorialivros.save(Categorialivro);

	}
	
	private boolean houveEdicaoSemFotoSelecionadaNo(CategoriaLivro Categorialivro) {
		return (Categorialivro != null) && (Categorialivro.getId() != null) && (Categorialivro.getDetalhesImagem() == null);
	}

	public List<CategoriaLivro> todos() {
		return Categorialivros.findAll();
	}

	public CategoriaLivro buscaPor(Integer id) {
		return Categorialivros.findOne(id);
	}

	public void deletarLivro(CategoriaLivro livro) {
		Categorialivros.delete(livro);
	}

	public List<CategoriaLivro> todas() {
		return Categorialivros.findAll();
	}

	@Transactional
	public void excluirPelo(Integer id) {

		CategoriaLivro categoria = this.buscaPor(id);

		if (id != null) {
			Categorialivros.delete(id);
			Categorialivros.flush();
		} else {
			throw new IllegalArgumentException("Informe uma editora válida para exclusão");
		}
	}
	
	private void excluirImagem(DetalhesImagemLivro detalhesImagem) {

		Path path = Paths.get(detalhesImagem.getRealPathComNomeDoArquivo());
		try {
			Files.deleteIfExists(path);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
