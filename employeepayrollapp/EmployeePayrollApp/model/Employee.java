package com.example.employeepayrollapp.EmployeePayrollApp.model;

import com.example.employeepayrollapp.EmployeePayrollApp.DTO.EmployeeDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name ;
    private String department;
    private double salary ;

    //Default Constructor
    public Employee() {

    }

    //Constructor (used by DTO)
    public Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // it is also for DTO impliment.
    public Employee(EmployeeDTO employeeDTO) {
        this.name=employeeDTO.name;
        this.department=employeeDTO.department;
        this.salary=employeeDTO.salary;

    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}