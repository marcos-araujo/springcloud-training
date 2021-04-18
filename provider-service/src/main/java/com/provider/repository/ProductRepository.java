package com.provider.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.provider.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByState(String state);
	
	List<Product> findByIdIn(List<Long> id);
}