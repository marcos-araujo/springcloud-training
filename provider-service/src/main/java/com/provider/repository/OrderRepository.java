package com.provider.repository;

import org.springframework.data.repository.CrudRepository;

import com.provider.model.StoreOrder;

public interface OrderRepository extends CrudRepository<StoreOrder, Long>{

}