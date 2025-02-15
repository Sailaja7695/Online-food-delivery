package com.tnsif.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.fooddeliverysystem.entities.Customer;

public class CustomerService {

	private List<Customer> customerList = new ArrayList<>();
	
	public void addCustomer (Customer customer) {
		customerList.add(customer);
	}
	
	public Customer getCustomer(int userId) {
		return null;
		
	}
	
	public List<Customer> getCustomers(){
		return customerList;
		
	}

}
