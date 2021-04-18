package com.shipping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipping.dto.DeliveryDTO;
import com.shipping.dto.VoucherDTO;
import com.shipping.model.Delivery;
import com.shipping.repository.DeliveryRepository;

@Service
public class DeliveryService {
	
	@Autowired
	private DeliveryRepository repository;

	public VoucherDTO bookOrder(DeliveryDTO orderDTO) {
		
		Delivery delivery = new Delivery();
		delivery.setSearchDate(orderDTO.getDeliveryDate());
		delivery.setPlannedDeliveryDate(orderDTO.getDeliveryDate().plusDays(1l));
		delivery.setDestinationAddress(orderDTO.getDestinationAddress());
		delivery.setOriginAddress(orderDTO.getOriginAddress());
		delivery.setOrderId(orderDTO.getOrderId());
		
		repository.save(delivery);
		
		VoucherDTO voucher = new VoucherDTO();
		voucher.setNumber(delivery.getId());
		voucher.setPlannedDeliveryDate(delivery.getPlannedDeliveryDate());
		return voucher;
		
	}

}