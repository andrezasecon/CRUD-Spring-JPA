package com.devsuperior.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.jpa.entities.Category;
import com.devsuperior.jpa.entities.Product;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	List<Category> findAll();

}
