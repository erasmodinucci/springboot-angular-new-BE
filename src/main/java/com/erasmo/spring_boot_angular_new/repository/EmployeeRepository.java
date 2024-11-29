package com.erasmo.spring_boot_angular_new.repository;


import com.erasmo.spring_boot_angular_new.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
