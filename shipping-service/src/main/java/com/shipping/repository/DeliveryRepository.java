package com.shipping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shipping.model.Delivery;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long>{

}