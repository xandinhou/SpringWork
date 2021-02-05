package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trabalho.entities.Dependente;

@Repository
public interface DependenteRepository extends JpaRepository<Dependente, Long> {

}
