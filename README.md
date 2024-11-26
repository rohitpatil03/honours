
# Student Management System

This is a RESTful Spring Boot application that manages student data, allowing users to register, log in, and retrieve or update their information. The application enforces unique email registration and provides basic user management operations.

## Table of Contents
- [Features](#features)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Features
- **User Registration**: Register a new student with unique email verification.
- **User Login**: Authenticate a user with email and password.
- **Information Management**: Update and retrieve student information.
- **Validation**: Prevent duplicate account creation with the same email.

## Screenshots
### Registration
![Registration Screenshot](path/to/registration-screenshot.png)

### Login
![Login Screenshot](path/to/login-screenshot.png)

### Retrieve Info
![Retrieve Info Screenshot](path/to/retrieve-info-screenshot.png)

### Update Info
![Update Info Screenshot](path/to/update-info-screenshot.png)

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/username/repository-name.git
   cd repository-name
   ```

2. **Build the application**:
   ```bash
   mvn clean package
   ```

3. **Run the application**:
   ```bash
   java -jar target/student-management-system-0.0.1-SNAPSHOT.jar
   ```

### Alternatively, Run with Maven
```bash
mvn spring-boot:run
```

## Usage

After starting the application, you can use tools like **Postman** or **curl** to interact with the API.

## API Endpoints

| Method | Endpoint               | Description                     |
|--------|-------------------------|---------------------------------|
| POST   | `/students/register`    | Register a new student          |
| POST   | `/students/login`       | Authenticate a student          |
| GET    | `/students/{id}`        | Retrieve student info by ID     |
| PUT    | `/students/{id}`        | Update student information      |

## Technologies Used
- **Java 17**
- **Spring Boot**
- **Maven**
- **PostgreSQL** (or specify your database choice)
- **Postman** (for testing APIs)
