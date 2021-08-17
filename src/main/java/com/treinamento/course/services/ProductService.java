package com.treinamento.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento.course.entites.Product;
import com.treinamento.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository ProductRepository;
	
	public List<Product> findAll(){
		
		return ProductRepository.findAll();
	}
	
	
	public Product findById(Long id) {
		
		Optional<Product> obj = ProductRepository.findById(id);
		
		return obj.get();
	}
	
}
