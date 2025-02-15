package com.tnsif.fooddeliverysystem.application;


import java.util.*;

import com.tnsif.fooddeliverysystem.entities.Customer;
import com.tnsif.fooddeliverysystem.entities.DeliveryPerson;
import com.tnsif.fooddeliverysystem.entities.FoodItem;
import com.tnsif.fooddeliverysystem.entities.Restaurant;

public class FoodDeliverySystem {
    private static Map<Integer, Restaurant> restaurants = new HashMap<>();
    private static Map<Integer, DeliveryPerson> deliveryPersons = new HashMap<>();
    private static Map<Integer, Customer> customers = new HashMap<>();
    //private static 1int orderIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> adminMenu(scanner);
                case 2 -> customerMenu(scanner);
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void adminMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Add Food Item to Restaurant");
            System.out.println("3. Remove Food Item from Restaurant");
            System.out.println("4. View Restaurants and Menus");
            System.out.println("5. View Orders");
            System.out.println("6. Add Delivery Person");
            System.out.println("7. Assign Delivery Person to Order");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addRestaurant(scanner);
                case 2 -> addFoodItem(scanner);
                case 3 -> removeFoodItem(scanner);
                case 4 -> viewRestaurants();
                case 5 -> viewOrders();
                case 6 -> addDeliveryPerson(scanner);
                case 7 -> assignDeliveryPerson(scanner);
                case 8 -> {
                    System.out.println("Exiting Admin Module...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addRestaurant(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Restaurant Name: ");
        String name = scanner.next();
        restaurants.put(id, new Restaurant(id, name));
        System.out.println("Restaurant added successfully!");
    }

    private static void addFoodItem(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        Restaurant restaurant = restaurants.get(restaurantId);
        if (restaurant == null) {
            System.out.println("Restaurant not found!");
            return;
        }

        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();
        System.out.print("Enter Food Item Name: ");
        String foodItemName = scanner.next();
        System.out.print("Enter Food Item Price: ");
        double price = scanner.nextDouble();

        restaurant.addFoodItem(new FoodItem(foodItemId, foodItemName, price));
        System.out.println("Food item added successfully!");
    }

    private static void removeFoodItem(Scanner scanner) {
        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        Restaurant restaurant = restaurants.get(restaurantId);
        if (restaurant == null) {
            System.out.println("Restaurant not found!");
            return;
        }

        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();
        restaurant.removeFoodItem(foodItemId);
        System.out.println("Food item removed successfully!");
    }

    private static void viewRestaurants() {
        System.out.println("\nRestaurants and Menus:");
        for (Restaurant restaurant : restaurants.values()) {
            System.out.println("Restaurant ID: " + restaurant.getId() + ", Name: " + restaurant.getName());
            for (FoodItem foodItem : restaurant.getMenu()) {
                System.out.println("  - " + foodItem);
            }
        }
    }

    private static void viewOrders() {
        System.out.println("Feature coming soon...");
    }

    private static void addDeliveryPerson(Scanner scanner) {
        System.out.print("Enter Delivery Person ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Delivery Person Name: ");
        String name = scanner.next();
        System.out.print("Enter Contact Number: ");
        long contactNo = scanner.nextLong();

        deliveryPersons.put(id, new DeliveryPerson(id, name, contactNo));
        System.out.println("Delivery person added successfully!");
    }

    private static void assignDeliveryPerson(Scanner scanner) {
        System.out.println("Feature coming soon...");
    }

    private static void customerMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View Food Items");
            System.out.println("3. Add Food to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addCustomer(scanner);
                case 2 -> viewFoodItems();
                case 3 -> addFoodToCart(scanner);
                case 4 -> viewCart(scanner);
                case 5 -> placeOrder(scanner);
                case 6 -> viewCustomerOrders(scanner);
                case 7 -> {
                    System.out.println("Exiting Customer Module...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addCustomer(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Username: ");
        String username = scanner.next();
        System.out.print("Enter Contact Number: ");
        long contactNo = scanner.nextLong();

        customers.put(id, new Customer(id, username, contactNo, null));
        System.out.println("Customer created successfully!");
    }

    private static void viewFoodItems() {
        viewRestaurants();
    }

    private static void addFoodToCart(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        Customer customer = customers.get(customerId);
        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }

        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();
        Restaurant restaurant = restaurants.get(restaurantId);
        if (restaurant == null) {
            System.out.println("Restaurant not found!");
            return;
        }

        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();
        FoodItem foodItem = restaurant.getMenu().stream()
                .filter(item -> item.getId() == foodItemId)
                .findFirst()
                .orElse(null);
        if (foodItem == null) {
            System.out.println("Food item not found!");
            return;
        }

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        customer.getCart().addItem(foodItem, quantity);
        System.out.println("Food item added to cart!");
    }

    private static void viewCart(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        Customer customer = customers.get(customerId);
        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }

        System.out.println("Cart: " + customer.getCart().getItems());
    }

    private static void placeOrder(Scanner scanner) {
        System.out.println("Feature coming soon...");
    }

    private static void viewCustomerOrders(Scanner scanner) {
        System.out.println("Feature coming soon...");
    }
}
