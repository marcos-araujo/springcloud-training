package com.provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provider.model.Product;
import com.provider.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProductsByState(String state) {
		return productRepository.findByState(state);
	}

}