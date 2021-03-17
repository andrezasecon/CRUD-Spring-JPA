package com.devsuperior.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAll();
	
	
	
	

}
