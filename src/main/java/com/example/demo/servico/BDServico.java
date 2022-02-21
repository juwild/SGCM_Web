package com.example.demo.servico;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominio.Especialidade;
import com.example.demo.dominio.Medico;
import com.example.demo.repositorio.EspecialidadeRepositorio;
import com.example.demo.repositorio.MedicoRepositorio;

@Service
public class BDServico {
	@Autowired
	private EspecialidadeRepositorio especialidadeRepositorio;
	@Autowired
	private MedicoRepositorio medicoRepositorio;
	
	public void criaBaseDeDados() {
		
		Especialidade especialidade01 = new Especialidade (null, "Cardiologia", " Cardiologista é o especialista nas doenças do coração.");
		Especialidade especialidade02 = new Especialidade (null, "Dermatologia", " dermatologista cuida da prevenção e tratamento das doenças da pele.");
		
		Medico medico01 = new Medico(null, 5458, "Maria Brown", "988888888", "maria_brown@gmail.com", especialidade01);
		Medico medico02 = new Medico(null, 5437, "Alex Green", "977777777", "alex@gmail.com", especialidade02);
		Medico medico03 = new Medico(null, 4987, "Maria Aparecida", "988883457", "maria_aparecida@gmail.com", especialidade01);
				
		especialidade01.getMedicos().addAll(Arrays.asList(medico01,medico03));
		especialidade02.getMedicos().addAll(Arrays.asList(medico02));
		
		especialidadeRepositorio.saveAll(Arrays.asList(especialidade01,especialidade02));
		medicoRepositorio.saveAll(Arrays.asList(medico01,medico02,medico03));
	}
}
