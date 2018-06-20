package com.example.SistemaDeLivraria.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.SistemaDeLivraria.model.Livro;
import com.example.SistemaDeLivraria.model.Setor;
import com.example.SistemaDeLivraria.repository.Livros;
import com.example.SistemaDeLivraria.service.AutorLivroService;
import com.example.SistemaDeLivraria.service.CategoriaLivroService;
import com.example.SistemaDeLivraria.service.EditoraService;
import com.example.SistemaDeLivraria.service.LivroService;
import com.example.SistemaDeLivraria.service.SetorService;
import com.example.SistemaDeLivraria.model.Editora;
import com.example.SistemaDeLivraria.controller.RelatorioController;
import com.example.SistemaDeLivraria.controller.util.ArquivoUpload;
import com.example.SistemaDeLivraria.model.AutorLivro;
import com.example.SistemaDeLivraria.model.CategoriaLivro;
import com.example.SistemaDeLivraria.model.DetalhesImagemLivro;

@Controller
@RequestMapping("/livro")
public class LivroController {
	
	private static final Log LOG = LogFactory.getLog(RelatorioController.class );

	// @Autowired
	// Livros livros;
	@Autowired
	CategoriaLivroService CategorialivroService;
	
	

	@Autowired
	AutorLivroService AutorlivroService;

	@Autowired
	EditoraService editoraService;

	@Autowired
	LivroService livroService;
	
	@Autowired
	SetorService setorService;

	// @GetMapping("/form")
	// public String form(Model model) {
	// Livro livro = new Livro();
	// model.addAttribute("categorialivros", CategorialivroService.todos() );
	// model.addAttribute("editoras", editoraService.todos() );
	// model.addAttribute("livro", livro);
	// return "livro/cadastro-livro";
	// }

	@GetMapping("/form")
	public String form(Model model, Livro livro) {
		model.addAttribute("livro", livro);
		return "livro/ingressos_create";
	}

	@ModelAttribute("editoras")
	public List<Editora> todasEditoras() {
		return editoraService.todas();
	}

//	static int valorid;
	
	@GetMapping("{id}")
	public ModelAndView edicao(@PathVariable Integer id, Livro livro) {
		System.out.println("----------de-------------pppp--------");

		//model.addAttribute("livro", livro);
		Livro evento = livroService.buscaPor(id.longValue());
		System.out.println("----------de-------------pppp--------"+evento.getCategorias().get(0).getId());
		//livro.getCategorias().get(0).getId();
		CategoriaLivro categorialivro = CategorialivroService.buscaPor(evento.getCategorias().get(0).getId());

		ModelAndView modelAndView = new ModelAndView("livro/ingressos_altered");
		modelAndView.addObject("categorialivro", categorialivro);
		modelAndView.addObject("livro", evento);
		//modelAndView.addObject("livro", livro);
        modelAndView.addObject("todosSetores", setorService.todoss(id));
		
		modelAndView.addObject("todosSetores", setorService.todoss(id));
		modelAndView.addObject("todosSetoress", setorService.todosss(id));
		modelAndView.addObject("todosSetoresb", setorService.todosb(id));
		modelAndView.addObject("todosSetoresc", setorService.todosc(id));
		modelAndView.addObject("todosSetoresd", setorService.todosd(id));
		modelAndView.addObject("todosSetorese", setorService.todose(id));
		modelAndView.addObject("todosSetoresf", setorService.todosf(id));
		modelAndView.addObject("todosSetoresg", setorService.todosg(id));
		modelAndView.addObject("todosSetoresh", setorService.todosh(id));
		modelAndView.addObject("todosSetoresi", setorService.todosi(id));
		modelAndView.addObject("todosSetoresj", setorService.todosj(id));
		modelAndView.addObject("todosSetoresk", setorService.todosk(id));
		modelAndView.addObject("todosSetoresl", setorService.todosl(id));
		modelAndView.addObject("todosSetoresm", setorService.todosm(id));
		modelAndView.addObject("todosSetoreFrisa0102", setorService.todosFrisa0102(id));
		modelAndView.addObject("todosSetoreFrisa0305", setorService.todosFrisa0305(id));
		modelAndView.addObject("todosSetoreFrisa0608", setorService.todosFrisa0608(id));
		modelAndView.addObject("todosSetoreFrisa0910", setorService.todosFrisa0910(id));
		modelAndView.addObject("todosSetoreFrisa1112", setorService.todosFrisa1112(id));
		modelAndView.addObject("todosSetoreFrisa1314", setorService.todosFrisa1314(id));
		modelAndView.addObject("todosSetoreFrisa1516", setorService.todosFrisa1516(id));
		modelAndView.addObject("todosSetoreFrisa1718", setorService.todosFrisa1718(id));
		modelAndView.addObject("todosSetoreFrisa1920", setorService.todosFrisa1920(id));
		modelAndView.addObject("todosSetoreFrisa2122", setorService.todosFrisa2122(id));
		
		modelAndView.addObject("todosSetoresCamarote0103", setorService.todosCamarote0103(id));
		modelAndView.addObject("todosSetoresCamarote0405", setorService.todosCamarote0405(id));
		modelAndView.addObject("todosSetoresCamarote0607", setorService.todosCamarote0607(id));
		modelAndView.addObject("todosSetoresCamarote0809", setorService.todosCamarote0809(id));
		modelAndView.addObject("todosSetoresCamarote1011", setorService.todosCamarote1011(id));
		modelAndView.addObject("todosSetoresCamarote1213", setorService.todosCamarote1213(id));
		modelAndView.addObject("todosSetoresCamarote1415", setorService.todosCamarote1415(id));
		modelAndView.addObject("todosSetoresCamarote1617", setorService.todosCamarote1617(id));
		modelAndView.addObject("todosSetoresCamarote1819", setorService.todosCamarote1819(id));
		modelAndView.addObject("todosSetoresCamarote20ECortesias", setorService.todosCamarote20ECortesias(id));
		
		modelAndView.addObject("todosSetoresBalcao0102", setorService.todosBalcao0102(id));
		modelAndView.addObject("todosSetoresBalcao0304", setorService.todosBalcao0304(id));
		modelAndView.addObject("todosSetoresBalcao0506", setorService.todosBalcao0506(id));
		modelAndView.addObject("todosSetoresBalcao0708", setorService.todosBalcao0708(id));
		modelAndView.addObject("todosSetoresBalcao0910", setorService.todosBalcao0910(id));
		modelAndView.addObject("todosSetoresBalcao1112", setorService.todosBalcao1112(id));
		modelAndView.addObject("todosSetoresBalcao1314", setorService.todosBalcao1314(id));
		modelAndView.addObject("todosSetoresBalcao1516", setorService.todosBalcao1516(id));
		modelAndView.addObject("todosSetoresBalcao1718", setorService.todosBalcao1718(id));
		modelAndView.addObject("todosSetoresBalcao1920", setorService.todosBalcao1920(id));
		modelAndView.addObject("todosSetoresBalcao2122", setorService.todosBalcao2122(id));
		
		modelAndView.addObject("todosSetoresGaleria0102", setorService.todosGaleria0102(id));
		modelAndView.addObject("todosSetoresGaleria0304", setorService.todosGaleria0304(id));
		modelAndView.addObject("todosSetoresGaleria0506", setorService.todosGaleria0506(id));
		modelAndView.addObject("todosSetoresGaleria0708", setorService.todosGaleria0708(id));
		modelAndView.addObject("todosSetoresGaleria0910", setorService.todosGaleria0910(id));
		modelAndView.addObject("todosSetoresGaleria1112", setorService.todosGaleria1112(id));
		modelAndView.addObject("todosSetoresGaleria1314", setorService.todosGaleria1314(id));
		modelAndView.addObject("todosSetoresGaleria1516", setorService.todosGaleria1516(id));
		modelAndView.addObject("todosSetoresGaleria1718", setorService.todosGaleria1718(id));
		modelAndView.addObject("todosSetoresGaleria1920", setorService.todosGaleria1920(id));
		modelAndView.addObject("todosSetoresGaleria2122", setorService.todosGaleria2122(id));


		return modelAndView;

	}
	
	@GetMapping("ingressos/{id}")
	public ModelAndView edicao3(@PathVariable Integer id, Livro livro) {
		//model.addAttribute("livro", livro);
		//Livro livro = livroService.buscaPor(id);
		String cleuton = "cleuton";
//		valorid = id;
		System.out.println("-------------------------------"+id);
		CategoriaLivro categorialivro = CategorialivroService.buscaPor(id);

		ModelAndView modelAndView = new ModelAndView("livro/ingressos_create");
		modelAndView.addObject("categorialivro", categorialivro);
		modelAndView.addObject("todosSetores", setorService.todoss(id));
		
		modelAndView.addObject("todosSetores", setorService.todoss(id));
		modelAndView.addObject("todosSetoress", setorService.todosss(id));
		modelAndView.addObject("todosSetoresb", setorService.todosb(id));
		modelAndView.addObject("todosSetoresc", setorService.todosc(id));
		modelAndView.addObject("todosSetoresd", setorService.todosd(id));
		modelAndView.addObject("todosSetorese", setorService.todose(id));
		modelAndView.addObject("todosSetoresf", setorService.todosf(id));
		modelAndView.addObject("todosSetoresg", setorService.todosg(id));
		modelAndView.addObject("todosSetoresh", setorService.todosh(id));
		modelAndView.addObject("todosSetoresi", setorService.todosi(id));
		modelAndView.addObject("todosSetoresj", setorService.todosj(id));
		modelAndView.addObject("todosSetoresk", setorService.todosk(id));
		modelAndView.addObject("todosSetoresl", setorService.todosl(id));
		modelAndView.addObject("todosSetoresm", setorService.todosm(id));
		modelAndView.addObject("todosSetoreFrisa0102", setorService.todosFrisa0102(id));
		modelAndView.addObject("todosSetoreFrisa0305", setorService.todosFrisa0305(id));
		modelAndView.addObject("todosSetoreFrisa0608", setorService.todosFrisa0608(id));
		modelAndView.addObject("todosSetoreFrisa0910", setorService.todosFrisa0910(id));
		modelAndView.addObject("todosSetoreFrisa1112", setorService.todosFrisa1112(id));
		modelAndView.addObject("todosSetoreFrisa1314", setorService.todosFrisa1314(id));
		modelAndView.addObject("todosSetoreFrisa1516", setorService.todosFrisa1516(id));
		modelAndView.addObject("todosSetoreFrisa1718", setorService.todosFrisa1718(id));
		modelAndView.addObject("todosSetoreFrisa1920", setorService.todosFrisa1920(id));
		modelAndView.addObject("todosSetoreFrisa2122", setorService.todosFrisa2122(id));
		
		modelAndView.addObject("todosSetoresCamarote0103", setorService.todosCamarote0103(id));
		modelAndView.addObject("todosSetoresCamarote0405", setorService.todosCamarote0405(id));
		modelAndView.addObject("todosSetoresCamarote0607", setorService.todosCamarote0607(id));
		modelAndView.addObject("todosSetoresCamarote0809", setorService.todosCamarote0809(id));
		modelAndView.addObject("todosSetoresCamarote1011", setorService.todosCamarote1011(id));
		modelAndView.addObject("todosSetoresCamarote1213", setorService.todosCamarote1213(id));
		modelAndView.addObject("todosSetoresCamarote1415", setorService.todosCamarote1415(id));
		modelAndView.addObject("todosSetoresCamarote1617", setorService.todosCamarote1617(id));
		modelAndView.addObject("todosSetoresCamarote1819", setorService.todosCamarote1819(id));
		modelAndView.addObject("todosSetoresCamarote20ECortesias", setorService.todosCamarote20ECortesias(id));
		
		modelAndView.addObject("todosSetoresBalcao0102", setorService.todosBalcao0102(id));
		modelAndView.addObject("todosSetoresBalcao0304", setorService.todosBalcao0304(id));
		modelAndView.addObject("todosSetoresBalcao0506", setorService.todosBalcao0506(id));
		modelAndView.addObject("todosSetoresBalcao0708", setorService.todosBalcao0708(id));
		modelAndView.addObject("todosSetoresBalcao0910", setorService.todosBalcao0910(id));
		modelAndView.addObject("todosSetoresBalcao1112", setorService.todosBalcao1112(id));
		modelAndView.addObject("todosSetoresBalcao1314", setorService.todosBalcao1314(id));
		modelAndView.addObject("todosSetoresBalcao1516", setorService.todosBalcao1516(id));
		modelAndView.addObject("todosSetoresBalcao1718", setorService.todosBalcao1718(id));
		modelAndView.addObject("todosSetoresBalcao1920", setorService.todosBalcao1920(id));
		modelAndView.addObject("todosSetoresBalcao2122", setorService.todosBalcao2122(id));
		
		modelAndView.addObject("todosSetoresGaleria0102", setorService.todosGaleria0102(id));
		modelAndView.addObject("todosSetoresGaleria0304", setorService.todosGaleria0304(id));
		modelAndView.addObject("todosSetoresGaleria0506", setorService.todosGaleria0506(id));
		modelAndView.addObject("todosSetoresGaleria0708", setorService.todosGaleria0708(id));
		modelAndView.addObject("todosSetoresGaleria0910", setorService.todosGaleria0910(id));
		modelAndView.addObject("todosSetoresGaleria1112", setorService.todosGaleria1112(id));
		modelAndView.addObject("todosSetoresGaleria1314", setorService.todosGaleria1314(id));
		modelAndView.addObject("todosSetoresGaleria1516", setorService.todosGaleria1516(id));
		modelAndView.addObject("todosSetoresGaleria1718", setorService.todosGaleria1718(id));
		modelAndView.addObject("todosSetoresGaleria1920", setorService.todosGaleria1920(id));
		modelAndView.addObject("todosSetoresGaleria2122", setorService.todosGaleria2122(id));
//		todosAutoress();
		
		return modelAndView;

	}
		
	
	@ModelAttribute("todosAutores")
	public List<AutorLivro> todosAutores() {
		return AutorlivroService.todas();
	}
	
//	@ModelAttribute("todosSetores")
//	public List<Setor> todosAutoress() {
//		return setorService.todoss(valorid);
//	}
	
//	@ModelAttribute("todosSetoresb")
//	public List<Setor> todosAutoressb() {
//		return setorService.todosb(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresc")
//	public List<Setor> todosAutoressc() {
//		return setorService.todosc(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresd")
//	public List<Setor> todosAutoressd() {
//		return setorService.todosd(valorid);
//	}
//	
//	@ModelAttribute("todosSetorese")
//	public List<Setor> todosAutoresse() {
//		return setorService.todose(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresf")
//	public List<Setor> todosAutoressf() {
//		return setorService.todosf(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresg")
//	public List<Setor> todosAutoressg() {
//		return setorService.todosg(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresh")
//	public List<Setor> todosAutoressh() {
//		return setorService.todosh(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresi")
//	public List<Setor> todosAutoressi() {
//		return setorService.todosi(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresj")
//	public List<Setor> todosAutoressj() {
//		return setorService.todosj(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresk")
//	public List<Setor> todosAutoressk() {
//		return setorService.todosk(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresl")
//	public List<Setor> todosAutoressl() {
//		return setorService.todosl(valorid);
//	}
//	
//	@ModelAttribute("todosSetoresm")
//	public List<Setor> todosAutoressm() {
//		return setorService.todosm(valorid);
//	}

	/*
	 * @PostMapping("/adiciona") public String salva(Livro livro,
	 * RedirectAttributes redirect) {
	 * 
	 * String rota = livro.ehNovo() ? "redirect:/livro/form" :
	 * "redirect:/livro/pesquisa";
	 * 
	 * livros.save(livro);
	 * 
	 * redirect.addFlashAttribute("mensagem_sucesso",
	 * "O livro foi salvo com Sucesso" ); return rota; }
	 */
	// @PostMapping("/salva")
	// public String salva(@Validated Livro livro,
	// Errors validacao,
	// Model model,
	// /*Long categoriaId,*/
	// Long editoraId,
	// RedirectAttributes redirect,
	// MultipartFile imagemDoLivro,
	// HttpServletRequest request ) {
	//
	// //System.out.println("######## Imagem do Livro : " +
	// foto.getOriginalFilename() );
	// System.out.println("asdasdasd");
	// //deve ser editado
	// if (validacao.hasErrors() ) {
	// model.addAttribute("categorialivros", CategorialivroService.todos() );
	// model.addAttribute("editoras", editoraService.todos() );
	// model.addAttribute("livro", livro);
	// System.out.println("asdasdasd");
	// return "livro/cadastro-livro";
	// //return modelAndView;
	// }
	// System.out.println("asdasdasd");
	// //modo de salvar imagem do livro antigo
	//// if ( foiSelecionadaA(imagemDoLivro )) {
	//// SalvaArquivoNoServidor salvaArquivo = new SalvaArquivoNoServidor();
	//// String fotoPath = salvaArquivo.salvaImagem("imagens/img-livros" ,
	// imagemDoLivro, request);
	//// livro.setFotoPath(fotoPath);
	////
	//// }
	// System.out.println("asdasdasd");
	// if ( foiSelecionadaA(imagemDoLivro )) {
	// ArquivoUpload arquivoUpload = new ArquivoUpload(imagemDoLivro);
	//
	// arquivoUpload.salvaImagem("imagens/img-livros", livro.getId(), request );
	//
	// DetalhesImagemLivro imagemLivro =
	// arquivoUpload.criaDetalhesImagemLivro();
	//
	// livro.setDetalhesImagem(imagemLivro);
	//
	// }
	//
	// System.out.println("asdasdasd ttttt " +editoraId);
	// livroService.salva(livro, /*categoriaId,*/ editoraId);
	// System.out.println("asdasdasd");
	//
	// redirect.addFlashAttribute("mensagem_sucesso", "O livro foi Salvo com
	// Sucesso" );
	// String rota = livro.ehNovo() ? "redirect:/livro/form" :
	// "redirect:/livro/pesquisa";
	//
	// return rota;
	// }

	@PostMapping("/salva")
	public ModelAndView salva(@Validated Livro livro, Errors validacao, RedirectAttributes redirect,
			MultipartFile imagemDoLivro, HttpServletRequest request, Long detalhesImagem3) {
		System.out.println("junio ="+detalhesImagem3);
		if (validacao.hasErrors()) {
			//return "livro/ingressos/{id}";
			return edicao3(livro.getCategorias().get(0).getId(), livro);
		}
        
		livro = livroService.salva(livro);

		if (foiSelecionadaA(imagemDoLivro)) {
			ArquivoUpload arquivoUpload = new ArquivoUpload(imagemDoLivro);

			arquivoUpload.salvaImagem("imagens/img-livros", livro.getId(), request);

			DetalhesImagemLivro imagemLivro = arquivoUpload.criaDetalhesImagemLivro();

			livro.setDetalhesImagem(imagemLivro);

		}
		System.out.println("junio ="+detalhesImagem3);
		if(detalhesImagem3 != null){
		DetalhesImagemLivro imagemLivro  = livroService.buscaPorImg(detalhesImagem3);
		livro.setDetalhesImagem(imagemLivro);
		}
		
		livroService.salva(livro);
		LOG.info("Método salva() -- Livro " + livro.getTitulo() );

		redirect.addFlashAttribute("mensagem_sucesso", "Venda Realizada com Sucesso");
		String rota = livro.ehNovo() ? "redirect:/livro/form" : "redirect:/livro/pesquisa";

		//return rota;
		return pesquisa();
	}

	/*
	 * private String salvaImagem(String baseFolder, MultipartFile arquivo,
	 * HttpServletRequest request) {
	 * 
	 * try { // obtem o caminho completo (real) no servidor. String realPath =
	 * request.getServletContext().getRealPath("/" + baseFolder );
	 * 
	 * String path = realPath + "/" + arquivo.getOriginalFilename() ;
	 * 
	 * System.out.println(path );
	 * 
	 * // transfere o arquivo para o servidor arquivo.transferTo( new File(path)
	 * );
	 * 
	 * // retorna o endereço relativo return baseFolder + "/" +
	 * arquivo.getOriginalFilename();
	 * 
	 * } catch (IllegalStateException | IOException e ) {
	 * 
	 * throw new RuntimeException(e ); }
	 * 
	 * }
	 */

	private boolean foiSelecionadaA(MultipartFile imagem) {
		return (imagem != null) && (!imagem.isEmpty());
	}

	@RequestMapping("/deleta{id}")
	public String deletar(@PathVariable Long id) {
		// Livro livro = livros.findOne(id );
		// livros.delete(livro);
		Livro livro = livroService.buscaPor(id);
		livroService.deletarLivro(livro);
		return "redirect:/livro/pesquisa";
	}

	// @PostMapping("/remove")
	// public ModelAndView remove(@ModelAttribute("id") Long livroId,
	// RedirectAttributes redirect) {
	// System.out.println("Deu certo");
	// Livro livro = livroService.buscaPor(livroId);
	// livroService.deletarLivro(livro);
	// redirect.addFlashAttribute("mensagem_sucesso", "O Livro foi Removido com
	// Sucesso" );
	//
	// return this.pesquisa();
	//
	//
	// }
	//
	// @PostMapping("/removeLista")
	// @ResponseBody
	// public String removeLivros(@RequestBody ArrayList<Long> listaLivroId) {
	//
	// System.out.println("%%%%%%%%%%%%%%%%%%%% Lista de Livros : " +
	// listaLivroId);
	//
	// listaLivroId.forEach( id -> livroService.excluirPelo(id) );
	//
	// return "livros excluídos com sucesso";
	//
	// }

	@PostMapping("/remove")
	public ModelAndView remove(@ModelAttribute("id") Long livroId, RedirectAttributes redirect) {
		System.out.println("LLLLLLLLLLL--------------------------------------");
		livroService.excluirPelo(livroId);
		redirect.addFlashAttribute("mensagem_sucesso", "A Venda foi Removida com sucesso");

		return this.pesquisa();

	}

	@PostMapping("/removeLista")
	@ResponseBody
	public String removeLivros(@RequestBody ArrayList<Long> listaLivroId) {

		System.out.println("%%%%%%%%%%%%%%%%%%%% Lista de Livros : " + listaLivroId);

		listaLivroId.forEach(id -> livroService.excluirPelo(id));

		return "Vendas excluídas com sucesso";

	}

	@ModelAttribute("todasCategorias")
	public List<CategoriaLivro> todasCategorias() {
		return CategorialivroService.todas();
	}
	
//	@ModelAttribute("buscarEventoId")
//	public CategoriaLivro buscarEventoId() {
//		long n = 2;
//		System.out.println("PPPPPPPPPPPPPP ");
//		return CategorialivroService.buscaPor(n);
//	}

	/*
	 * @GetMapping("/pesquisa") public ModelAndView pesquisa() { ModelAndView
	 * modelAndView = new ModelAndView("livro/pesquisa-livro" );
	 * modelAndView.addObject("livros", livros.findAll() );
	 * 
	 * return modelAndView; }
	 */
	@GetMapping("/pesquisa")
	public ModelAndView pesquisa() {
		System.out.println("-------------------------------");
		
		ModelAndView modelAndView = new ModelAndView("livro/pesquisa-livro");
		modelAndView.addObject("livros", livroService.todos());

		return modelAndView;
	}
	
	

	@GetMapping("/visualisa/{id}")
	public ModelAndView visualisar(@PathVariable Long id) {
		// Livro livro = livros.findOne(id);
		Livro livro = livroService.buscaPor(id);
		//livro.getSetores().size();

		ModelAndView modelAndView = new ModelAndView("livro/ingressos_reader");
		modelAndView.addObject("livro", livro);

		return modelAndView;

	}

	/*
	 * @GetMapping("{id}") public ModelAndView edicao(@PathVariable Long id) {
	 * Livro livro = livros.findOne(id );
	 * 
	 * ModelAndView modelAndView = new ModelAndView("livro/cadastro-livro");
	 * modelAndView.addObject("livro", livro);
	 * 
	 * return modelAndView;
	 * 
	 * }
	 */

	// deve ser alterado
	// @GetMapping("{id}")
	// public ModelAndView edicao(@PathVariable Long id) {
	// System.out.println("asdasdasd jjjjjjjjj");
	// Livro livro = livroService.buscaPor(id );
	//
	// ModelAndView modelAndView = new ModelAndView("livro/cadastro-livro");
	// System.out.println("asdasdasd jjjjjjjjj 2 ");
	// modelAndView.addObject("categorialivros", CategorialivroService.todos()
	// );
	// System.out.println("asdasdasd jjjjjjjjj 3");
	// modelAndView.addObject("editoras", editoraService.todos() );
	// System.out.println("asdasdasd jjjjjjjjj 4");
	// modelAndView.addObject("livro", livro);
	// System.out.println("asdasdasd jjjjjjjjj 5");
	// return modelAndView;
	//
	//
	// }

//	@GetMapping("{id}")
//	public ModelAndView edicao(@PathVariable Integer id, Livro livro) {
//		//model.addAttribute("livro", livro);
//		//Livro livro = livroService.buscaPor(id);
//		CategoriaLivro categorialivro = CategorialivroService.buscaPor(id);
//
//		ModelAndView modelAndView = new ModelAndView("livro/ingressos_altered");
//		modelAndView.addObject("categorialivro", categorialivro);
//		//modelAndView.addObject("livro", livro);
//
//
//		return modelAndView;
//
//	}
	
	
	
//	@GetMapping("/form")
//	public String form(Model model, Livro livro) {
//		model.addAttribute("livro", livro);
//		return "livro/ingressos_create";
//	}
//	
//	@GetMapping("ingresso/{id}")
//	public ModelAndView edicao2(@PathVariable Integer id) {
//		//Livro livro = livroService.buscaPor(id);
//		CategoriaLivro categorialivro = CategorialivroService.buscaPor(id);
//
//		ModelAndView modelAndView = new ModelAndView("livro/ingressos_create");
//		modelAndView.addObject("livro", categorialivro);
//
//		return modelAndView;
//
//	}

	@GetMapping("/{id}/detalhes")
	public ModelAndView detalhes(@PathVariable("id") Long id) {

		Livro livro = livroService.buscaPor(id);
		ModelAndView modelAndView = new ModelAndView("livro/detalhes-livro");
		modelAndView.addObject("livro", livro);

		return modelAndView;

	}

	/*
	 * @RequestMapping(value = "upload", method = RequestMethod.POST) public
	 * String upload(HttpServletRequest request) throws IllegalStateException,
	 * IOException { MultipartHttpServletRequest multipartRequest =
	 * (MultipartHttpServletRequest) request; MultipartFile multipartFile =
	 * multipartRequest.getFile("file");
	 * System.out.println(multipartFile.getSize()); return
	 * "redirect:/livro/form"; }
	 */

	@PostMapping("/filtrar")
	public ModelAndView filtrar(@RequestParam(required = false) String titulo, @RequestParam Long editoraId) {

		System.out.println("-------------------------------");
		System.out.println(titulo);
		System.out.println(editoraId);

		ModelAndView modelAndView = new ModelAndView("livro/pesquisa-livro");
		modelAndView.addObject("livros", livroService.todos());

		return modelAndView;
	}

}
