package com.provider.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.provider.dto.OrderItemDTO;
import com.provider.model.StoreOrder;
import com.provider.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public StoreOrder doOrder(@RequestBody List<OrderItemDTO> products) {
		LOG.info("Order received");
		return orderService.placeOrder(products);
	}
	
	@RequestMapping("/{id}")
	public StoreOrder getOrderById(@PathVariable Long id) {
		return orderService.getOrderById(id);
	}

}