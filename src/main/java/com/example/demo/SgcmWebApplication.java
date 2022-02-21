package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dominio.Especialidade;
import com.example.demo.dominio.Medico;
import com.example.demo.repositorio.EspecialidadeRepositorio;
import com.example.demo.repositorio.MedicoRepositorio;

@SpringBootApplication
public class SgcmWebApplication  implements CommandLineRunner{

	@Autowired
	private EspecialidadeRepositorio especialidadeRepositorio;
	@Autowired
	private MedicoRepositorio medicoRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(SgcmWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Especialidade especialidade = new Especialidade (null, "Cardiologia", " Cardiologista é o especialista nas doenças do coração e seu sistema circulatório");
		
		Medico medico = new Medico(null, 5458, "Maria Brown", "988888888", "maria@gmail.com", especialidade);
				
		especialidade.getMedicos().addAll(Arrays.asList(medico));
		this.especialidadeRepositorio.saveAll(Arrays.asList(especialidade));
		this.medicoRepositorio.saveAll(Arrays.asList(medico));
	}
}
