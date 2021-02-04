package com.example.trabalho.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.trabalho.entities.Empregado;
import com.example.trabalho.repositories.EmpregadoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private EmpregadoRepository empregadoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Empregado e1 = new Empregado(null, "xxx.xxx.xxx-xx","Alexandre A",18, 1900.31);
		Empregado e2 = new Empregado(null, "xxx.xxx.xxx-xx","Luis F",20, 2950.11);
		
		empregadoRepository.saveAll(Arrays.asList(e1,e2));
	}
	
	
	
}
