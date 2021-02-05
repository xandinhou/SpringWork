package com.example.trabalho.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.trabalho.entities.Dependente;
import com.example.trabalho.entities.Empregado;
import com.example.trabalho.repositories.DependenteRepository;
import com.example.trabalho.repositories.EmpregadoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private EmpregadoRepository empregadoRepository;
	
	@Autowired
	private DependenteRepository dependenteRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Empregado e1 = new Empregado(null, "xxx.xxx.xxx-x1","Alexandre A",18, 1900.31);
		Empregado e2 = new Empregado(null, "xxx.xxx.xxx-x2","Luis F",20, 2950.11);
		
		Dependente d1 = new Dependente(null, "xxx.xxx.xxx-x1","Joaquim A", "Neto", Instant.parse("2001-08-20T19:53:07Z"), e1);
		Dependente d2 = new Dependente(null, "xxx.xxx.xxx-x2","Fernanda F", "Filha", Instant.parse("2002-05-20T19:53:07Z"), e2);
	    Dependente d3 = new Dependente(null, "xxx.xxx.xxx-x1","JoaO A", "Filho", Instant.parse("2003-03-20T19:53:07Z"), e1);


		empregadoRepository.saveAll(Arrays.asList(e1,e2));
		dependenteRepository.saveAll(Arrays.asList(d1,d2,d3));
	}	
}
