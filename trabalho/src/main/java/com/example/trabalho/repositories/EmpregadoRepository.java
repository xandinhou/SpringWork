package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trabalho.entities.Empregado;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}
