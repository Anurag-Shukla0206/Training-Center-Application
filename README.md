# Buyogo - Backend Assessment Training Center Application



<h1 align="center">Buyogo-Traini8</h1>

<p align="center">
    <a href="https://www.java.com/" target="_blank">
        <img src="https://img.shields.io/badge/Java-17-red" alt="Java 17">
    </a>
    <a href="https://maven.apache.org/" target="_blank">
        <img src="https://img.shields.io/badge/Maven-3.8.1-blue" alt="Maven 3.8.1">
    </a>
    <a href="https://spring.io/projects/spring-boot" target="_blank">
        <img src="https://img.shields.io/badge/Spring Boot-3.2.5-brightgreen" alt="Spring Boot 3.2.5">
    </a>
  
</a>

</p>

<hr>

## Dependencies

- [Spring Boot Starter Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa): Provides support for Spring Data JPA, enabling easy interaction with databases using JPA.
- [Spring Boot Starter Validation](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation): Includes validation support for Spring MVC applications.
- [Spring Boot Starter Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web): Provides basic web support, including embedded Tomcat server and Spring MVC.
- [MySQL Connector/J](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j): JDBC driver for connecting to MySQL databases.
- [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok): Reduces boilerplate code by providing annotations to generate getters, setters, constructors, and more.
- [Spring Boot Starter Test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test): Includes dependencies for testing Spring Boot applications.
- [Springdoc OpenAPI Starter WebMVC UI](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui): Integrates OpenAPI documentation into Spring Boot applications.


## Validation Rules
- Center_Name can not be `NULL`  , only less than `40 characters` accepted.
- Cente_Code must not be `BLANK`  and only exactly `12 AlphaNumeric Characters` accepted.
- Contact_Email cannot be `NULL` But if email is present should be a `Valid Format`.
- Contact_Phone must Phone_Number should be a Valid Format. `eg: 4567897654`, [10 digits of Numbers`]


- Error message will show  if there's an validation voilation with `HTTP Status Code: 400`.


## Swagger Support for API Documentation

The project includes Swagger support for API documentation. Swagger is a powerful tool that provides interactive documentation for RESTful APIs, enabling developers to explore and test endpoints easily. By integrating Swagger into your project, you can enhance the usability and understanding of your API, making it easier for developers to integrate with your system.

### Key Benefits of Swagger:
- **Interactive Documentation:** Swagger generates interactive documentation that allows developers to explore and test endpoints directly from the documentation interface.
- **Ease of Integration:** Developers can easily understand and integrate with your API by referring to the comprehensive documentation provided by Swagger.
- **Consistency:** Swagger ensures that the API documentation remains consistent with the actual implementation, reducing the chances of discrepancies.
- **Time-Saving:** With Swagger, developers can quickly understand the API structure and functionalities, saving time on integration and troubleshooting.

### Swagger Configuration

The Swagger configuration (`OpenApiConfig` class) provides support for interactive documentation of RESTful APIs using Swagger. It includes:

- **Info:** Provides general information about the API, such as contact details, description, title, version, license, and terms of service.
- **Servers:** Specifies the servers where the API is hosted, allowing developers to interact with different environments.
- **Security:** Defines security requirements for accessing the API. In this case, it requires bearer token authentication.


## Database Setup

To set up the database for the WishlistManagement application, follow these steps:

1. Open the `application.properties` file in the project's `src/main/resources` directory.

2. Configure the datasource properties according to your MySQL database setup:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/<Your Database Name>?autoReconnect=true&useSSL=false&createDatabaseIfNotExist=true
   spring.datasource.username=your_database_username
   spring.datasource.password=your_database_password
   spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   ```

   Replace `your_database_username` and `your_database_password` with your MySQL database credentials.

3. Optionally, configure Hibernate properties for SQL logging:
   ```
   spring.jpa.properties.hibernate.show_sql=true
   spring.jpa.properties.hibernate.use_sql_comments=true
   spring.jpa.properties.hibernate.format_sql=true
   ```

   These properties enable SQL logging in the console for debugging purposes.


## Accessing the Application

You can access the application through your web browser by navigating to `http://localhost:8080`.

## Custom Port Configuration

If you need to define your own port for accessing the application, you can do so by configuring it in the `application.properties` file. Simply specify the desired port number in the configuration file, and the application will listen on that port upon startup.


### Author
 👨‍💼 **Anurag Shukla**
 
  

### Show Your Support 
 Give a ⭐ if this project help you!
