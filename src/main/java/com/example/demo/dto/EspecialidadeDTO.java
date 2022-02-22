package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.dominio.Especialidade;

public class EspecialidadeDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String descricao;
	
	public EspecialidadeDTO() {
		super();		
	}

	public EspecialidadeDTO(Especialidade especialidade) {
		super();
		this.id = especialidade.getId();
		this.nome = especialidade.getNome();
		this.descricao = especialidade.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
