package com.example.employeeManagementApp.manageApp.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeManagementApp.manageApp.appModel.Employee;
import com.example.employeeManagementApp.manageApp.appRepo.EmployeeRepo;



@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    //get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeRepo.findAll();
    }
    
}
