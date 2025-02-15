package com.tnsif.fooddeliverysystem.entities;


import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<FoodItem, Integer> items = new HashMap<>();

    // Add an item or update its quantity
    public void addItem(FoodItem item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }
    
    // Remove an item from the map
    public void removeItem(FoodItem item) {
        items.remove(item);
    }

    // Get all items and their quantities
    public Map<FoodItem, Integer> getItems() {
        return items; // Return a copy to prevent external modifications
    }

    

	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}
    
    
}
