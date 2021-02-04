package com.example.trabalho.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Dependente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cpfEmpregado;
	private String nome;
	private String grauParentesco;
	private Instant dataNascimento;
	@ManyToOne
	@JoinColumn(name ="empregado_id")
	private Empregado emp;
	
	public Dependente() {}

	public Dependente(Long id, String cpfEmpregado, String nome, String grauParentesco, Instant dataNascimento,
			Empregado emp) {
		super();
		this.id = id;
		this.cpfEmpregado = cpfEmpregado;
		this.nome = nome;
		this.grauParentesco = grauParentesco;
		this.dataNascimento = dataNascimento;
		this.emp = emp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpfEmpregado() {
		return cpfEmpregado;
	}

	public void setCpfEmpregado(String cpfEmpregado) {
		this.cpfEmpregado = cpfEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public Instant getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Instant dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Empregado getEmp() {
		return emp;
	}

	public void setEmp(Empregado emp) {
		this.emp = emp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dependente other = (Dependente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
