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
	
	public Dependente insert(Dependente obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Dependente update(Long id, Dependente obj) {
		Dependente entity = repository.getOne(id);
		updateData(entity,obj);
		return repository.save(entity);
	}

	private void updateData(Dependente entity, Dependente obj) {
		entity.setCpfEmpregado(obj.getCpfEmpregado());
		entity.setDataNascimento(obj.getDataNascimento());
		entity.setEmp(obj.getEmp());
		entity.setGrauParentesco(obj.getGrauParentesco());
		entity.setNome(obj.getNome());
	}
}
