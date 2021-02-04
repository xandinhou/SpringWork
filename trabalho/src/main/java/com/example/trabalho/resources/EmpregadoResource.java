package com.example.trabalho.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trabalho.entities.Empregado;
import com.example.trabalho.service.EmpregadoService;

@RestController
@RequestMapping(value = "/empregados")
public class EmpregadoResource {

	@Autowired
	private EmpregadoService service;
	
	@GetMapping
	public ResponseEntity<List<Empregado>> findAll(){
		List<Empregado> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Empregado> findById(@PathVariable Long id){
		Empregado obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
