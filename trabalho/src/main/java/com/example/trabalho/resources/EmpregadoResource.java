package com.example.trabalho.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<Empregado> insert(@RequestBody Empregado obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Empregado> update(@PathVariable Long id, @RequestBody Empregado obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}
