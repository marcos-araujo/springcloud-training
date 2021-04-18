package com.shipping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shipping.dto.DeliveryDTO;
import com.shipping.dto.VoucherDTO;
import com.shipping.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
	
	@Autowired
	private DeliveryService deliveryService;

	@PostMapping
	public VoucherDTO reserveDelivery(@RequestBody DeliveryDTO orderDTO) {
		return deliveryService.bookOrder(orderDTO);
	}
	
}