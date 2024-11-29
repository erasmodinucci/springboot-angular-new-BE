package com.erasmo.spring_boot_angular_new.controller;


import com.erasmo.spring_boot_angular_new.model.Employee;
import com.erasmo.spring_boot_angular_new.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Api/V1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/Employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
