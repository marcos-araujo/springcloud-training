package com.shipping.dto;

import java.time.LocalDate;

public class VoucherDTO {

	private Long number;
	
	private LocalDate plannedDeliveryDate;

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public LocalDate getPlannedDeliveryDate() {
		return plannedDeliveryDate;
	}

	public void setPlannedDeliveryDate(LocalDate plannedDeliveryDate) {
		this.plannedDeliveryDate = plannedDeliveryDate;
	}

}
