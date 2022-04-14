package com.breakfast.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Colaborador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable= true, unique= true)
	private String cpf;
	
	@Column (nullable= true)
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Iten> itens = new HashSet<>();
	
	public Long getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Iten> getItens() {
		return itens;
	}

	public void setItens(Set<Iten> itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, itens, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id) && Objects.equals(itens, other.itens)
				&& Objects.equals(name, other.name);
	}	
	
}
