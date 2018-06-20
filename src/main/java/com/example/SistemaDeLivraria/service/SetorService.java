package com.example.SistemaDeLivraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SistemaDeLivraria.model.AutorLivro;
import com.example.SistemaDeLivraria.model.Setor;
import com.example.SistemaDeLivraria.repository.AutorLivros;
import com.example.SistemaDeLivraria.repository.Setores;

@Service
public class SetorService {
	
	@Autowired
	Setores Autorlivros;
	
	@Transactional
	public void salva(Setor Autorlivro) {
		Autorlivros.save(Autorlivro);
		// fazer outras operações no banco

	}

	public List<Setor> todos() {
		return Autorlivros.findAll();
	}
	
	public List<Setor> todoss(int idevento) {
		return Autorlivros.findAlls(idevento);
	}
	
	public List<Setor> todosss(int idevento) {
		return Autorlivros.findAllss(idevento);
	}
	
	public List<Setor> todosb(int idevento) {
		return Autorlivros.findAllb(idevento);
	}
	
	public List<Setor> todosd(int idevento) {
		return Autorlivros.findAlld(idevento);
	}
	
	public List<Setor> todose(int idevento) {
		return Autorlivros.findAlle(idevento);
	}
	
	public List<Setor> todosf(int idevento) {
		return Autorlivros.findAllf(idevento);
	}
	
	public List<Setor> todosg(int idevento) {
		return Autorlivros.findAllg(idevento);
	}
	
	public List<Setor> todosh(int idevento) {
		return Autorlivros.findAllh(idevento);
	}
	
	public List<Setor> todosi(int idevento) {
		return Autorlivros.findAlli(idevento);
	}
	
	public List<Setor> todosj(int idevento) {
		return Autorlivros.findAllj(idevento);
	}
	
	public List<Setor> todosk(int idevento) {
		return Autorlivros.findAllk(idevento);
	}
	
	public List<Setor> todosl(int idevento) {
		return Autorlivros.findAlll(idevento);
	}
	
	public List<Setor> todosm(int idevento) {
		return Autorlivros.findAllm(idevento);
	}
	
	public List<Setor> todosc(int idevento) {
		return Autorlivros.findAllc(idevento);
	}
	
	public List<Setor> todosFrisa0102(int idevento) {
		return Autorlivros.findFrisa0102(idevento);
	}
	public List<Setor> todosFrisa0305(int idevento) {
		return Autorlivros.findFrisa0305(idevento);
	}
	public List<Setor> todosFrisa0608(int idevento) {
		return Autorlivros.findFrisa0608(idevento);
	}
	public List<Setor> todosFrisa0910(int idevento) {
		return Autorlivros.findFrisa0910(idevento);
	}
	public List<Setor> todosFrisa1112(int idevento) {
		return Autorlivros.findFrisa1112(idevento);
	}
	public List<Setor> todosFrisa1314(int idevento) {
		return Autorlivros.findFrisa1314(idevento);
	}
	public List<Setor> todosFrisa1516(int idevento) {
		return Autorlivros.findFrisa1516(idevento);
	}
	public List<Setor> todosFrisa1718(int idevento) {
		return Autorlivros.findFrisa1718(idevento);
	}
	public List<Setor> todosFrisa1920(int idevento) {
		return Autorlivros.findFrisa1920(idevento);
	}
	public List<Setor> todosFrisa2122(int idevento) {
		return Autorlivros.findFrisa2122(idevento);
	}
	
	public List<Setor> todosCamarote0103(int idevento) {
		return Autorlivros.findCamarote0103(idevento);
	}
	public List<Setor> todosCamarote0405(int idevento) {
		return Autorlivros.findCamarote0405(idevento);
	}
	public List<Setor> todosCamarote0607(int idevento) {
		return Autorlivros.findCamarote0607(idevento);
	}
	public List<Setor> todosCamarote0809(int idevento) {
		return Autorlivros.findCamarote0809(idevento);
	}
	public List<Setor> todosCamarote1011(int idevento) {
		return Autorlivros.findCamarote1011(idevento);
	}
	public List<Setor> todosCamarote1213(int idevento) {
		return Autorlivros.findCamarote1213(idevento);
	}
	public List<Setor> todosCamarote1415(int idevento) {
		return Autorlivros.findCamarote1415(idevento);
	}
	public List<Setor> todosCamarote1617(int idevento) {
		return Autorlivros.findCamarote1617(idevento);
	}
	public List<Setor> todosCamarote1819(int idevento) {
		return Autorlivros.findCamarote1819(idevento);
	}
	public List<Setor> todosCamarote20ECortesias(int idevento) {
		return Autorlivros.findCamarote20ECortesias(idevento);
	}
	
	public List<Setor> todosBalcao0102(int idevento) {
		return Autorlivros.findBalcao0102(idevento);
	}
	public List<Setor> todosBalcao0304(int idevento) {
		return Autorlivros.findBalcao0304(idevento);
	}
	public List<Setor> todosBalcao0506(int idevento) {
		return Autorlivros.findBalcao0506(idevento);
	}
	public List<Setor> todosBalcao0708(int idevento) {
		return Autorlivros.findBalcao0708(idevento);
	}
	public List<Setor> todosBalcao0910(int idevento) {
		return Autorlivros.findBalcao0910(idevento);
	}
	public List<Setor> todosBalcao1112(int idevento) {
		return Autorlivros.findBalcao1112(idevento);
	}
	public List<Setor> todosBalcao1314(int idevento) {
		return Autorlivros.findBalcao1516(idevento);
	}
	public List<Setor> todosBalcao1516(int idevento) {
		return Autorlivros.findBalcao1516(idevento);
	}
	public List<Setor> todosBalcao1718(int idevento) {
		return Autorlivros.findBalcao1718(idevento);
	}
	public List<Setor> todosBalcao1920(int idevento) {
		return Autorlivros.findBalcao1920(idevento);
	}
	public List<Setor> todosBalcao2122(int idevento) {
		return Autorlivros.findBalcao2122(idevento);
	}
	
	
	public List<Setor> todosGaleria0102(int idevento) {
		return Autorlivros.findGaleria0102(idevento);
	}
	public List<Setor> todosGaleria0304(int idevento) {
		return Autorlivros.findGaleria0304(idevento);
	}
	public List<Setor> todosGaleria0506(int idevento) {
		return Autorlivros.findGaleria0506(idevento);
	}
	public List<Setor> todosGaleria0708(int idevento) {
		return Autorlivros.findGaleria0708(idevento);
	}
	public List<Setor> todosGaleria0910(int idevento) {
		return Autorlivros.findGaleria0910(idevento);
	}
	public List<Setor> todosGaleria1112(int idevento) {
		return Autorlivros.findGaleria1112(idevento);
	}
	public List<Setor> todosGaleria1314(int idevento) {
		return Autorlivros.findGaleria1516(idevento);
	}
	public List<Setor> todosGaleria1516(int idevento) {
		return Autorlivros.findGaleria1516(idevento);
	}
	public List<Setor> todosGaleria1718(int idevento) {
		return Autorlivros.findGaleria1718(idevento);
	}
	public List<Setor> todosGaleria1920(int idevento) {
		return Autorlivros.findGaleria1920(idevento);
	}
	public List<Setor> todosGaleria2122(int idevento) {
		return Autorlivros.findGaleria2122(idevento);
	}
	
	
	

	public Setor buscaPor(Integer id) {
		return Autorlivros.findOne(id);
	}

	public void deletarLivro(Setor livro) {
		Autorlivros.delete(livro);
	}

	public List<Setor> todas() {
//		Autorlivros.findBySetores(Integer id);
		return Autorlivros.findAll();
	}

	@Transactional
	public void excluirPelo(Integer id) {

		Setor autor = this.buscaPor(id);

		if (id != null) {
			Autorlivros.delete(id);
			Autorlivros.flush();
		} else {
			throw new IllegalArgumentException("Informe uma editora válida para exclusão");
		}
	}

}
