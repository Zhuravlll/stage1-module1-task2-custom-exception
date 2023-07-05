package com.epam.mjc;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(long id) {
        this("Could not find student with ID " + id);
    }
}
