package com.devsuperior.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.jpa.entities.Product;
import com.devsuperior.jpa.services.ProductServices;

@RestController // informa ao Spring que essa classe será um controlador Rest (endpoint) da aplicação 
@RequestMapping(value = "/products") // informa ao Spring o caminho do controlador
public class ProductController {
	
	@Autowired
	private ProductServices service;
	
	@GetMapping // informa ao Spring que o método será get para retornar informações
	public ResponseEntity<List<Product>> findAll(){ // ReponseEntity classe do Java Spring 
		List<Product> list = service.findAll();	    // para retornar uma resposta http
		return ResponseEntity.ok(list); // retorna uma lista
		
	}

}
