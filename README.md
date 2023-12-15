## Project Structure

The repository is organized into separate projects for each question:

1. **Question 1 - HashMap Response**
   - `Controller.java`: Contains a simple Spring Boot REST API with a HashMap-based response.

2. **Question 2 - Employee Management System**
   - `Employee.java`: Entity representing an employee.
   - `EmployeeRepository.java`: Repository for database interactions.
   - `EmployeeService.java`: Service with CRUD operations.
   - `EmployeeController.java`: REST API endpoints for employee management.

3. **Question 3 - External API Integration**
   - `APIData.java`: Entity for data received from an external API.
   - `APIDataRepository.java`: Repository for database interactions.
   - `APIDataService.java`: Service for fetching data from an external API and storing it in the database.

4. **Question 4 - CompletableFuture Backend Service**
   - `BackendService.java`: Service with an asynchronous method using CompletableFuture.
   - `BackendServiceTest.java`: Test cases for the BackendService.

## Running the Projects

### Prerequisites
- Java Development Kit (JDK) installed
- Maven installed

### Instructions

1. **Question 1 - HashMap Response:**
   - Run the `MyApplication` class.
   - Access the API at [http://localhost:8080/api/data](http://localhost:8080/api/data).

2. **Question 2 - Employee Management System:**
   - Run the `YourApplication` class.
   - Access the API at [http://localhost:8080/api/employees](http://localhost:8080/api/employees).
   - Use tools like Postman for CRUD operations (POST, GET, PUT, DELETE).

3. **Question 3 - External API Integration:**
   - Run the `YourApplication` class.
   - Access the H2 Console at [http://localhost:8080/h2-console](http://localhost:8080/h2-console) to view the database.
   - Service (`APIDataService`) fetches data from an external API and saves it in the database.

4. **Question 4 - CompletableFuture Backend Service:**
   - Run the `YourApplication` class.
   - The `BackendService` performs an asynchronous operation using `CompletableFuture`.
   - Test cases in `BackendServiceTest` verify the behavior.
