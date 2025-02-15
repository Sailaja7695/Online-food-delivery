package com.tnsif.fooddeliverysystem.entities;

public class DeliveryPerson {

	private int deliveryPersonId;
	private String name;
	private long contactNO;
	
	
	public DeliveryPerson(int deliveryPersonId, String name, long contactNO) {
		this.deliveryPersonId = deliveryPersonId;
		this.name = name;
		this.contactNO = contactNO;
	}

	@Override
	public String toString() {
		return "DeliveryPerson [deliveryPersonId=" + deliveryPersonId + ", name=" + name + ", contactNO=" + contactNO
				+ "]";
	}
	
	
	
}
