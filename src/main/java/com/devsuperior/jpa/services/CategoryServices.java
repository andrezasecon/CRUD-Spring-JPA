package com.devsuperior.jpa.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.jpa.entities.Category;
import com.devsuperior.jpa.repository.CategoryRepository;

@Service // informa ao Spring que a classe é um componente de serviço
public class CategoryServices {
	
	@Autowired // solicitando ao Spring que faça uma injeção instância do ProductRepository
	private CategoryRepository catRepository;

	public List<Category> findAll(){
		return catRepository.findAll(); // método que realiza consulta em banco e retorna uma lista pronta
	}
}
