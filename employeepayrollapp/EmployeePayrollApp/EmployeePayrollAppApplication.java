package com.example.employeepayrollapp.EmployeePayrollApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeePayrollAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeePayrollAppApplication.class, args);
	}

}
// it is paste into application.properties

//spring.datasource.url=jdbc:h2:mem:payroll_service
//spring.datasource.driver-class-name=org.h2.Driver
//spring.datasource.username=sa
//spring.datasource.password=
//spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
//spring.h2.console.enabled=true

// it is for local set or connect url
//http://localhost:8080/h2-console    command to open h2 database console