package com.example.employeepayrollapp.EmployeePayrollApp.Service;


import com.example.employeepayrollapp.EmployeePayrollApp.DTO.EmployeeDTO;
import com.example.employeepayrollapp.EmployeePayrollApp.model.Employee;

import java.util.List;

// UC2
public interface InterEmployeeService {

    Employee addEmployee(EmployeeDTO employeeDTO);   //To add employee
    List<Employee> getAllEmployees();  //Get all employee details
    Employee getEmployeeById(Long id);  // Get Employee by ID
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);  // Update Employee
    void deleteEmployee(Long id);  // Delete Employee
}
