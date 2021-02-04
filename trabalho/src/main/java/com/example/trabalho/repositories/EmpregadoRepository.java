package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho.entities.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}
