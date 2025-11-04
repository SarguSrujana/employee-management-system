# 🧩 Employee Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![REST API](https://img.shields.io/badge/REST-API-blue?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

### 📘 Overview
The **Employee Management System** is a CRUD-based REST API built with **Spring Boot** and **MySQL**.  
It helps manage employee details — create, read, update, and delete records efficiently.  
This project demonstrates backend development skills with layered architecture (Controller → Service → Repository).

---

### 🚀 Features
- 🧾 Create, View, Update, Delete employee records  
- 🧱 RESTful API endpoints using Spring Boot  
- 🗃️ Data persistence with MySQL and JPA  
- ⚙️ Exception handling and input validation  
- 🔍 API testing with Postman  

---

### 🧰 Tech Stack
| Category | Technologies |
|-----------|--------------|
| Language | Java |
| Framework | Spring Boot, Spring Data JPA |
| Database | MySQL |
| Build Tool | Maven |
| Tools | Eclipse, VS Code, Postman, Git |

---

### ⚙️ Setup Instructions

#### 1️⃣ Prerequisites
- Java 17+  
- MySQL Database  
- Maven 3.9+  
- Postman (for API testing)

#### 2️⃣ Database Setup
```sql
CREATE DATABASE employee_db;
```

#### 3️⃣ Configure DB in application.properties
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

#### 4️⃣ Run the Project
```bash
mvn clean install
mvn spring-boot:run
```

#### 5️⃣ API Endpoints
| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | /api/employees | Get all employees |
| GET | /api/employees/{id} | Get employee by ID |
| POST | /api/employees | Add new employee |
| PUT | /api/employees/{id} | Update employee |
| DELETE | /api/employees/{id} | Delete employee |

---

### 🧪 Example API Request (POST)
```json
POST /api/employees
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "department": "IT"
}
```

---

### 🧠 What I Learned
- Designing REST APIs using Spring Boot  
- Integrating MySQL with JPA  
- Handling CRUD operations and exceptions  
- Writing clean, modular code using Service & Repository layers  

---

### 🔗 GitHub Repository
[View on GitHub → SarguSrujana/employee-management-system](https://github.com/SarguSrujana/employee-management-system)
