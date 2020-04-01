package com.kshrd.HibernateJpa.service;


import com.kshrd.HibernateJpa.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService  {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
