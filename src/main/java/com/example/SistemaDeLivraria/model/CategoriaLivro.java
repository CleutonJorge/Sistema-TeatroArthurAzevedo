package com.example.SistemaDeLivraria.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class CategoriaLivro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = "{livro.form.titulo.obrigatoria}")
	@Size(min = 2, message = "{livro.form.titulo.tamanho}")
	private String nomeCategoria;
	
	@NotNull(message = "{livro.form.data.obrigatoria}")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataPublicacao;
	
	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	
	private BigDecimal inteira;

	private BigDecimal meia;
	
	
	private BigDecimal inteiraF;
	
	private BigDecimal meiaF;
	
	
	private BigDecimal inteiraC;
	
	private BigDecimal meiaC;
	
	
	private BigDecimal inteiraB;
	
	private BigDecimal meiaB;
	
	private String horario;
	
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public BigDecimal getInteiraF() {
		return inteiraF;
	}

	public void setInteiraF(BigDecimal inteiraF) {
		this.inteiraF = inteiraF;
	}

	public BigDecimal getMeiaF() {
		return meiaF;
	}

	public void setMeiaF(BigDecimal meiaF) {
		this.meiaF = meiaF;
	}

	public BigDecimal getInteiraC() {
		return inteiraC;
	}

	public void setInteiraC(BigDecimal inteiraC) {
		this.inteiraC = inteiraC;
	}

	public BigDecimal getMeiaC() {
		return meiaC;
	}

	public void setMeiaC(BigDecimal meiaC) {
		this.meiaC = meiaC;
	}

	public BigDecimal getInteiraB() {
		return inteiraB;
	}

	public void setInteiraB(BigDecimal inteiraB) {
		this.inteiraB = inteiraB;
	}

	public BigDecimal getMeiaB() {
		return meiaB;
	}

	public void setMeiaB(BigDecimal meiaB) {
		this.meiaB = meiaB;
	}

	public BigDecimal getInteiraG() {
		return inteiraG;
	}

	public void setInteiraG(BigDecimal inteiraG) {
		this.inteiraG = inteiraG;
	}

	public BigDecimal getMeiaG() {
		return meiaG;
	}

	public void setMeiaG(BigDecimal meiaG) {
		this.meiaG = meiaG;
	}

	public String getCaminhoFotoLivro() {
		return caminhoFotoLivro;
	}

	public void setCaminhoFotoLivro(String caminhoFotoLivro) {
		this.caminhoFotoLivro = caminhoFotoLivro;
	}

	public void setInteira(BigDecimal inteira) {
		this.inteira = inteira;
	}

	public void setMeia(BigDecimal meia) {
		this.meia = meia;
	}

	
	private BigDecimal inteiraG;
	
	private BigDecimal meiaG;
	
	private String descricao;
	private String fotoPath;
	private String caminhoFotoLivro;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private DetalhesImagemLivro detalhesImagem;
	
	public Long temCapa(){
		if(detalhesImagem != null)
		return detalhesImagem.getId();
		else
			return (long) -1;
	}
	
	public String getFotoPath() {
		return fotoPath;
	}

	public void setFotoPath(String fotoPath) {
		this.fotoPath = fotoPath;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getInteira() {
		return inteira;
	}



	public BigDecimal getMeia() {
		return meia;
	}

//	public void setMeia(int meia) {
//		this.meia = meia;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	@Override
	public String toString() {
		return this.nomeCategoria;
	}
	
	public DetalhesImagemLivro getDetalhesImagem() {
		return detalhesImagem;
	}

	public void setDetalhesImagem(DetalhesImagemLivro detalhesImage) {
		this.detalhesImagem = detalhesImage;
	}

	public boolean temFotoCapa() {
		return (this.detalhesImagem != null) && (this.detalhesImagem.getNomeArquivo() != null);
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	// private Integer id;
	//
	// @NotEmpty(message="{livro.form.titulo.obrigatoria}")
	// @Size(min=2, message="{livro.form.titulo.tamanho}")
	// private String nomeCategoria;
	//
	//// @OneToMany(mappedBy="categoria")
	//// private List<Livro> livros;
	//
	//
	// public Integer getId() {
	// return id;
	// }
	//
	// public void setId(Integer id) {
	// this.id = id;
	// }
	//
	// public String getNomeCategoria() {
	// return nomeCategoria;
	// }
	//
	// public void setNomeCategoria(String nomeCategoria) {
	// this.nomeCategoria = nomeCategoria;
	// }

	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + ((id == null) ? 0 : id.hashCode());
	// return result;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// CategoriaLivro other = (CategoriaLivro) obj;
	// if (id == null) {
	// if (other.id != null)
	// return false;
	// } else if (!id.equals(other.id))
	// return false;
	// return true;
	// }
	//
	public boolean ehNovo() {
		return (this.id == null);
	}

	// @Override
	// public String toString() {
	// return this.nomeCategoria;
	// }

}
