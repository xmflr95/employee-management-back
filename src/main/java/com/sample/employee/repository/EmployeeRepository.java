package com.sample.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.employee.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
