package com.example.trabalho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trabalho.entities.Dependente;
import com.example.trabalho.repositories.DependenteRepository;


@Service
public class DependenteService {

	@Autowired
	private DependenteRepository repository;
	
	public List<Dependente> findAll(){
		return repository.findAll();
	}
	
	public Dependente findById(Long id) {
		Optional<Dependente> obj = repository.findById(id);
		
		return obj.get();
	}
}
