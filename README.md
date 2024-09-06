## Spring Boot Student Info Management API
**Overview**<br>
The Spring Boot Student Info Management API is a RESTful API designed to manage student data efficiently.
This project leverages Spring Boot and MySQL to provide a robust backend for CRUD operations on student records.<br><br>

**Project Structure**<br>
- Controller: Manages API endpoints and requests.<br>
- Entity: Defines the Student model.<br>
- Repository: Interfaces with the database.<br>
- Application: Main entry point of the Spring Boot application.<br>

**Database Setup**<br>
Database Name: springboot_rest<br>
Table Name: Student<br>
*Columns:*
id (INT): Primary key, unique identifier for each student.<br>
student_name (VARCHAR): Name of the student.<br>
student_email (VARCHAR): Email of the student.<br>
student_address (VARCHAR): Address of the student.<br>

**Features**<br>
Create: Add new student records.<br>
Read: Retrieve details of students or list all students.<br>
Update: Modify existing student records.<br>
Delete: Remove student records by ID.<br>
Spring Boot Framework: Utilizes Spring Boot for rapid development and easy configuration.<br>
MySQL Integration: Connects to a MySQL database for persistent storage.<br>
RESTful API: Provides clean and standardized API endpoints.<br><br>

**API Endpoints**<br>
POST /api/students: Create a new student record.<br>
GET /api/students: Retrieve a list of all students.<br>
GET /api/students/{id}: Retrieve a specific student by ID.<br>
PUT /api/students/{id}: Update an existing student record by ID.<br>
DELETE /api/students/{id}: Delete a student record by ID.<br><br>

**Example Requests**<br>
**Create a Student**<br>
POST /api/students<br>
Content-Type: application/json<br>
{
  "studentName": "John Doe",
  "studentEmail": "john.doe@example.com",
  "studentAddress": "123 Main St"
}
<br><br>
**Get All Students**<br>
GET /api/students
<br><br>
**Get Student by ID**<br>
GET /api/students/1
<br><br>
**Update Student**<br>
PUT /api/students/1 <br>
Content-Type: application/json<br>
{ "studentName": "Jane Doe", "studentEmail": "jane.doe@example.com", "studentAddress": "456 Elm St" }
<br><br>
**Delete Student**<br>
DELETE /api/students/1 <br><br>

**Tools and Technologies Used**<br>
Java: The primary programming language used.<br>
Maven: For managing project dependencies and building the project.<br>
JDBC: For database connectivity.<br>
MySQL: Database used to store student records.<br>
Apache Tomcat: Server used to deploy the REST API.<br>
Postman: For testing the API endpoints.<br>
Spring Initializr Dependencies:<br>
-Spring Web: Build web applications, including RESTful services, using Spring MVC. Uses Apache Tomcat as the default embedded container.<br>
-Spring Boot DevTools: Provides fast application restarts, LiveReload, and configurations for an enhanced development experience.<br>
-Spring Data JPA: Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.<br>
-MySQL Driver: JDBC driver for MySQL.<br>
