package com.provider.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class StoreOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer preparationTime;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderId")
	private List<OrderItem> items;
	
	public StoreOrder(List<OrderItem> items) {
		this.items = items;
		this.status = OrderStatus.RECEIVED;
	}
	
	public StoreOrder() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

}