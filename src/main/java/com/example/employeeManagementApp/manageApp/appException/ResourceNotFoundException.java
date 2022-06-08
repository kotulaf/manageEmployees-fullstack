package com.example.employeeManagementApp.manageApp.appException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L; // it is good to define it, because the RuntimeException class uses it

    public ResourceNotFoundException(String message)
    {
        super(message); // referring to the superclass, which is ResourceNotFoundException
    }
}
