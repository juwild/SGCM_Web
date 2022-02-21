package com.example.demo.configuracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.servico.BDServico;

@Configuration
@Profile("dev")
public class DesenvolvimentoConfiguracao {
	@Autowired
	private BDServico bdServico;

	@Bean
	public void criarBaseDeDados() {
		this.bdServico.criaBaseDeDados();	
	}
}
