# 🎓 Student Management API

A RESTful backend application built using **Spring Boot** to manage students and courses.  
This project demonstrates CRUD operations, REST API design, and database integration.

---

## 🚀 Features

- Add new students
- Update student details
- Delete students
- Search student by email
- Search students by course
- RESTful API endpoints
- Database integration using MongoDB

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **MongoDB**
- **Maven**
- **REST API**

---

## 📂 Project Structure

```
student-management-api
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── harshil
│       │           └── studentmanagement
│       │               │
│       │               ├── Controller
│       │               │   └── StudentController.java
│       │               │
│       │               ├── Services
│       │               │   └── StudentService.java
│       │               │
│       │               ├── Repository
│       │               │   └── StudentRepository.java
│       │               │
│       │               ├── Entity
│       │               │   └── Student.java
│       │               │
│       │               └── StudentManagementApplication.java
│       │
│       └── resources
│           │
│           ├── application.properties
│           └── static
│
├── target
│
├── pom.xml
│
└── README.md
```

---

## 📡 API Endpoints

### Student APIs

| Method | Endpoint | Description |
|------|------|------|
| GET | /students | Get all students |
| POST | /students | Add new student |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |
| GET | /students/email/{email} | Find student by email |
| GET | /students/course/{course} | Find students by course |

---

## ⚙️ How to Run the Project

1. Clone the repository

```bash
git clone https://github.com/Harshilfinava2311/student-management-api
```

2. Open the project in **IntelliJ IDEA / VS Code**

3. Configure **MongoDB database**

Make sure MongoDB is running locally.

Example configuration in application.properties:

spring.data.mongodb.uri=mongodb://localhost:27017/studentdb

4. Run the application

```bash
mvn spring-boot:run
```

5. Test APIs using **Postman**

---

## 📷 API Testing

Use **Postman** to test endpoints like:

- Create Student
- Get All Students
- Update Student
- Delete Student

---

## 👨‍💻 Author

**Harshil Finava**

GitHub:  
https://github.com/Harshilfinava2311

---

⭐ If you like this project, consider giving it a star!
