package com.shipping.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long orderId;
	
	private LocalDate searchDate;
	
	private LocalDate plannedDeliveryDate;
	
	private String originAddress;
	
	private String destinationAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public LocalDate getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(LocalDate searchDate) {
		this.searchDate = searchDate;
	}

	public LocalDate getPlannedDeliveryDate() {
		return plannedDeliveryDate;
	}

	public void setPlannedDeliveryDate(LocalDate plannedDeliveryDate) {
		this.plannedDeliveryDate = plannedDeliveryDate;
	}

	public String getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

}