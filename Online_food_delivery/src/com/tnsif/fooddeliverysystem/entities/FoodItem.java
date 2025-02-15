package com.tnsif.fooddeliverysystem.entities;

public class FoodItem {
	
	private int Id;
	private String name;
	private double price;
	public FoodItem(int Id, String name, double price) {
		this.Id = Id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItem [Id=" + Id + ", name=" + name + ", price=" + price + "]";
	}
	
	


}