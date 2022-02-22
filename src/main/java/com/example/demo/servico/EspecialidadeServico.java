package com.example.demo.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominio.Especialidade;
import com.example.demo.excecao.ObjetoNaoEncontrado;
import com.example.demo.repositorio.EspecialidadeRepositorio;

@Service
public class EspecialidadeServico {
	@Autowired
	private EspecialidadeRepositorio repositorio;

	public Especialidade buscaPorId (Integer id) {
		Optional<Especialidade> especialidade = repositorio.findById(id);
		return especialidade.orElseThrow(() -> new ObjetoNaoEncontrado("Objeto não encontrado! Id:" + id+ " Tipo: "+ Especialidade.class.getName()));
	}
	
	public List<Especialidade> buscaTudo (){
		return repositorio.findAll();
	}
}
