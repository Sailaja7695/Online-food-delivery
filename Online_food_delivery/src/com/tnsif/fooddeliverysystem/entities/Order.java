package com.tnsif.fooddeliverysystem.entities;

import java.util.HashMap;
import java.util.Map;

public class Order {

	private int orderId;
	private Customer customer;
	private Map<FoodItem, Integer> items = new HashMap<>();
	private String status;
	private DeliveryPerson deliveryperson;
	private String deliveryaddress;
	
	public Order(int orderId, Customer customer) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.items = new HashMap<>(customer.getCart().getItems());
        this.status = "Pending";
	}

	 public void assignDeliveryPerson(DeliveryPerson deliveryPerson) {
	        this.deliveryperson = deliveryPerson;
	    }

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", items=" + items + ", status=" + status
				+ ", deliveryperson=" + deliveryperson + ", deliveryaddress=" + deliveryaddress + "]";
	}

	    
}
