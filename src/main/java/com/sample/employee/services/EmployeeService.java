package com.sample.employee.services;

import java.util.List;

import com.sample.employee.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
