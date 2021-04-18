package com.provider.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provider.dto.OrderItemDTO;
import com.provider.model.StoreOrder;
import com.provider.model.OrderItem;
import com.provider.model.Product;
import com.provider.repository.OrderRepository;
import com.provider.repository.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public StoreOrder placeOrder(List<OrderItemDTO> items) {
		
		if(items == null) {
			return null;
		}
		
		List<OrderItem> orderItems = toOrderItem(items);
		StoreOrder order = new StoreOrder(orderItems);
		order.setPreparationTime(items.size());
		return orderRepository.save(order);
	}
	
	public StoreOrder getOrderById(Long id) {
		return this.orderRepository.findById(id).orElse(new StoreOrder());
	}

	private List<OrderItem> toOrderItem(List<OrderItemDTO> items) {
		
		List<Long> produtcIds = items
				.stream()
				.map(item -> item.getId())
				.collect(Collectors.toList());
		
		List<Product> orderProducts = productRepository.findByIdIn(produtcIds);
		
		List<OrderItem> pedidoItens = items
			.stream()
			.map(item -> {
				Product product = orderProducts
						.stream()
						.filter(p -> p.getId() == item.getId())
						.findFirst().get();
				
				OrderItem orderItem = new OrderItem();
				orderItem.setProduct(product);
				orderItem.setQuantity(item.getQuantity());
				return orderItem;
			})
			.collect(Collectors.toList());
		
		return pedidoItens;
		
	}
	
}