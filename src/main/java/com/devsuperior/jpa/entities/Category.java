package com.devsuperior.jpa.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // informa ao Spring que esta classe é uma entidate no banco
@Table(name = "tb_category") // nomeia a tabela
public class Category {

	@Id // informa ao Spring que esse atribudo é um identificador (*ID)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	private Set<Product> products = new HashSet<>();
	
	public Category() {

	}

	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}
	
}
	
