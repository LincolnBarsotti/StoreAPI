# User Management REST API

This project is a **RESTful API** for managing users, built with **Java**, **Spring Security**, **Hibernate**, and **JPA**. It allows you to perform CRUD (Create, Read, Update, Delete) operations on users and manage authentication/authorization securely.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Architecture](#architecture)
- [Requirements](#requirements)
- [Setup Instructions](#setup-instructions)
- [API Endpoints](#api-endpoints)
- [Authentication & Security](#authentication--security)
- [Error Handling](#error-handling)

## Features

- **User Management**: Create, read, update, and delete user accounts.
- **Authentication**: Login with JWT tokens.
- **Authorization**: Role-based access control using Spring Security.
- **Data Persistence**: Store user information using JPA and Hibernate.
- **Validation**: Validate user data using annotations.
- **Error Handling**: Handle various errors such as resource not found, bad requests, etc.

## Technologies

- **Java**: The core programming language.
- **Spring Boot**: Framework for creating the RESTful web service.
- **Spring Security**: Provides authentication and role-based authorization.
- **JWT (JSON Web Tokens)**: Used for token-based authentication.
- **Hibernate**: ORM for managing persistence between Java objects and the database.
- **JPA (Java Persistence API)**: Specification used for data access.
- **H2 Database**: In-memory database for development and testing purposes.

## Architecture

The API follows a layered architecture:

1. **Controller Layer**: Handles HTTP requests and responses.
2. **Service Layer**: Contains the business logic.
3. **Repository Layer**: Interacts with the database via JPA repositories.
4. **Security Layer**: Manages authentication and authorization using JWT.

## Requirements

- **Java 17+**
- **Maven**
- **H2 Database** (pre-configured for development)
- **Postman** or **cURL** for testing the API.

## Setup Instructions

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/user-management-api.git
    cd user-management-api
    ```

2. **Build the project**:
    ```bash
    mvn clean install
    ```

3. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

4. The API will be available at: `http://localhost:8080`

## API Endpoints

### User Endpoints

| Method | Endpoint                | Description                    | Authentication |
|--------|-------------------------|--------------------------------|----------------|
| POST   | `/api/v1/users/register` | Register a new user            | No             |
| POST   | `/api/v1/users/login`    | Authenticate and get JWT token | No             |
| GET    | `/api/v1/users`          | Get all users                  | Yes (ROLE_ADMIN)|
| GET    | `/api/v1/users/{id}`     | Get user by ID                 | Yes            |
| PUT    | `/api/v1/users/{id}`     | Update user details            | Yes (ROLE_USER,ROLE_ADMIN)|
| DELETE | `/api/v1/users/{id}`     | Delete a user                  | Yes (ROLE_ADMIN)|

### Example Payload for User Registration

```json
{
    "username": "johndoe",
    "password": "password123",
    "email": "johndoe@example.com",
    "roles": ["ROLE_USER"]
}
