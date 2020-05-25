package com.testproject.demo.exception;

import java.util.function.Supplier;

public class StudentNotFoundException extends Exception{

    private static  final long serialVersion = 1L;

    public StudentNotFoundException(String message) {
        super(message);
    }
}
