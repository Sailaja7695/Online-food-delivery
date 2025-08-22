# 🍔 Online Food Delivery System (Backend)  

## 📌 Project Overview  
This is the backend of an **Online Food Delivery System**, developed in **Java** using **Eclipse**. The system manages restaurant listings, user orders, payments, and delivery status. It provides APIs for frontend integration, ensuring smooth food ordering and tracking.  

## 🛠 Technologies Used  
- *Programming Language:* Java  
- *IDE:* Eclipse  
- *Database:* MySQL (or PostgreSQL – based on your choice)* 
- *Frameworks/Libraries:*Spring Boot, JDBC 
## 📂 Features Implemented  
✅ **User Authentication** (Login/Signup for customers & restaurants)  
✅ **Restaurant & Menu Management** (CRUD operations for restaurants & food items)  
✅ **Order Processing** (Placing, updating, and tracking orders)  
✅ **Payment Handling** (If integrated with payment gateways)  
✅ **Delivery Status Tracking**  

## 🚀 How to Run This Project  
1. Clone the repository
2. Open in Eclipse:
   Open Eclipse IDE
    Import the project (File → Import → Existing Projects into Workspace)
    Select the project folder and click Finish
3. Configure the database (if applicable):
   Update database connection settings in the configuration file.
4. Run the project:
 Right-click on the project → Run As → Java Application

   
## 🔗 API Endpoints  

    | Endpoint          | Method | Description                |
    |------------------|--------|----------------------------|
    | `/login`         | POST   | User authentication        |
    | `/register`      | POST   | Register a new user       |
    | `/restaurants`   | GET    | Fetch all restaurants      |
    | `/menu/{id}`     | GET    | Get menu of a restaurant   |
    | `/order`         | POST   | Place an order            |
    | `/order/{id}`    | GET    | Get order status          |
    | `/order/{id}`    | DELETE | Cancel an order           |


## 📢 Future Enhancements
    🔹 Integrate a frontend (React/Angular)
    🔹 Implement real-time order tracking
    🔹 Add a rating & review system

## 📫Contact
   - Email: penagalurisailaja@gmail.com
   - LinkedIn: https://www.linkedin.com/in/penagalurisailaja 
## ⭐ **Give a star** if you like the project and feel free to fork or contribute!
