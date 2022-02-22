package com.example.demo.controle;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dominio.Especialidade;
import com.example.demo.dto.EspecialidadeDTO;
import com.example.demo.servico.EspecialidadeServico;

@RestController
@RequestMapping(value = "/especialidades")
public class EspecialidadeControle {
	
	@Autowired
	private EspecialidadeServico servico;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Especialidade> buscaPorId(@PathVariable Integer id){
		Especialidade especialidade = servico.buscaPorId(id);
		return ResponseEntity.ok().body(especialidade);
	}
	
	@GetMapping
	public ResponseEntity<List<EspecialidadeDTO>> buscatudo(){
		List<Especialidade> lista = servico.buscaTudo();
		List<EspecialidadeDTO> listaDTO = lista.stream().map(objeto -> new EspecialidadeDTO(objeto)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listaDTO);
	}
}