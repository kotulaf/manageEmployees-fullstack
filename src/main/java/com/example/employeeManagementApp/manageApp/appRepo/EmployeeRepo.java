package com.example.employeeManagementApp.manageApp.appRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeManagementApp.manageApp.appModel.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    
}
