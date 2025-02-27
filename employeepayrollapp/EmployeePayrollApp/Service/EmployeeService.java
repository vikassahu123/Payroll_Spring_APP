package com.example.employeepayrollapp.EmployeePayrollApp.Service;

import com.example.employeepayrollapp.EmployeePayrollApp.DTO.EmployeeDTO;
import com.example.employeepayrollapp.EmployeePayrollApp.Repository.EmployeeRepository;
import com.example.employeepayrollapp.EmployeePayrollApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//UC2
@Service // Marks this as a Service Component to handle business logic
public class EmployeeService implements InterEmployeeService {


    @Autowired  // because store in a employeeRepo
   private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO)
    {
        Employee employee=new Employee(employeeDTO);
        return employeeRepository.save(employee);

    }

    @Override
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();

    }

    @Override
    public Employee getEmployeeById(Long id)
    {
        return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("employee not found"));

    }

    @Override
    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
        return employeeRepository.findById(id).map(employee ->
        {
            employee.setName(employeeDTO.getName());
            employee.setDepartment(employeeDTO.getDepartment());
            employee.setSalary(employeeDTO.getSalary());
            return employeeRepository.save(employee);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));

    }


    @Override
    public void deleteEmployee(Long id)
    {
        employeeRepository.deleteById(id);
    }



}
