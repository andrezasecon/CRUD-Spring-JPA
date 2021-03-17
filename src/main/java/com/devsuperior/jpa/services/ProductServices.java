package com.devsuperior.jpa.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.jpa.entities.Product;
import com.devsuperior.jpa.repository.ProductRepository;

@Service // informa ao Spring que a classe é um componente de serviço
public class ProductServices {
	
	@Autowired // solicitando ao Spring que faça uma injeção instância do ProductRepository
	private ProductRepository repository;

	public List<Product> findAll(){
		return repository.findAll(); // método que realiza consulta em banco e retorna uma lista pronta
	}
}
