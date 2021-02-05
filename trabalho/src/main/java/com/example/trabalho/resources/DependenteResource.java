package com.example.trabalho.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trabalho.entities.Dependente;
import com.example.trabalho.service.DependenteService;

@RestController
@RequestMapping(value = "/dependentes")
public class DependenteResource {

	@Autowired
	private DependenteService service;
	
	@GetMapping
	public ResponseEntity<List<Dependente>> findAll(){
		List<Dependente> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Dependente> findById(@PathVariable Long id){
		Dependente obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
