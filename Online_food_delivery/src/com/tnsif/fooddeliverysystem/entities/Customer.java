package com.tnsif.fooddeliverysystem.entities;

public class Customer extends User{

	private Cart cart;

	public Customer(int userid, String username, long contactNo, Cart cart) {
		super(userid, username, contactNo);
		this.cart = cart;
	}

	// Getter method for 'cart'
    public Cart getCart() {
        return cart;
    }

	@Override
	public String toString() {
		return super.toString() + ", Cart=" + cart;
	}
    

}
