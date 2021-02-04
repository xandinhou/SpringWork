package com.example.trabalho.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trabalho.entities.Empregado;

@RestController
@RequestMapping(value = "/empregados")
public class EmpregadoResource {

	@GetMapping
	public ResponseEntity<Empregado> findAll(){
		Empregado e = new Empregado(1L, "xxx.xxx.xxx-xx","Alexandre A",18, 1900.31);
		
		return ResponseEntity.ok().body(e);
	}
}
