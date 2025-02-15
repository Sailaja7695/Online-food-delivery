package com.tnsif.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.fooddeliverysystem.entities.FoodItem;
import com.tnsif.fooddeliverysystem.entities.Restaurant;

public class FoodService {
	private List<Restaurant> restaurants = new ArrayList<>();
	
	public void addRestaurant1(Restaurant restaurant) 
	{
		restaurants.add(restaurant);
	}
	public void addRestaurant (Restaurant restaurant) {
		restaurants.add(restaurant);
	}
	public List<Restaurant> getRestaurants () {
		return restaurants;
	}
	public List<FoodItem> getAllFoodItems() {
		List<FoodItem> allFoodItems = new ArrayList<>();
		for (Restaurant restaurant : restaurants) {
			allFoodItems.addAll(restaurant.getMenu());
			}
		return allFoodItems;
	}
	public void addFoodItemToRestaurant (int restaurantId, FoodItem foodItem) {
		//add code to add food item into restaurant
	}
	public void removeFoodItemFromRestaurant (int restaurantId, int foodItemId) {

//add code to remove given item from restaurant
	}
	}