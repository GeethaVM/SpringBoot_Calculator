# SpringBoot_Calculator
A simple Calculator exposed as Rest API, built with Java 8 using Spring Boot.

# Requirement
Java 8 and IDE for SpringBoot project

# Build / Execute the project
All Spring Boot applications can be runned in the terminal using the following command ./mvnw spring-boot:run

After that the application can be accessed using the below urls nmentioned in sample requests and responses.

# Sample request and response
Request : GET (http://localhost:8080/calculatorApi/v1/addition?number1=7&number2=9)
Response : answer : 16.0 , detail : 7.0 + 9.0 = 16.0

Request : GET (http://localhost:8080/calculatorApi/v1/subtraction?number1=7&number2=9)
Response : answer : -2.0 , detail : 7.0 - 9.0 = -2.0

Request : GET (http://localhost:8080/calculatorApi/v1/multiplication?number1=7&number2=9)
Response : answer : 63.0 , detail : 7.0 * 9.0 = 63.0

Request : GET (http://localhost:8080/calculatorApi/v1/division?number1=7&number2=9)
Response : answer : 0.7777777777777778 , detail : 7.0 / 9.0 = 0.7777777777777778

Request : GET (http://localhost:8080/calculatorApi/v1/square/7)
Response : answer : 49.0 , detail : Square of 7.0 = 49.0

Request : GET (http://localhost:8080/calculatorApi/v1/squareroot/9)
Response : answer : 3.0 , detail : Squareroot of 9.0 = 3.0

Request : GET (http://localhost:8080/calculatorApi/v1/factorial/4)
Response : answer : 24.0 , detail : 4 ! = 24.0

Request : POST (http://localhost:8080/calculatorApi/v1/min-max)
Body : [10,-5,7,15,-7,-6,16,19,-15,9,-100,87]
Response :  min : -100 , max : 87



