package com.sample.employee.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.sample.employee.entity.EmployeeEntity;
import com.sample.employee.model.Employee;
import com.sample.employee.repository.EmployeeRepository;

@Service
public class EmployServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee createEmployee(Employee employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		
		BeanUtils.copyProperties(employee, employeeEntity);
		employeeRepository.save(employeeEntity);
		
		return employee;
	}

}
