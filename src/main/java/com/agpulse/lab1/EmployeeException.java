package com.agpulse.lab1;

public class EmployeeException extends RuntimeException {

    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeException(Throwable cause) {
        super(cause);
    }

    public EmployeeException(String message) {
        super(message);
    }
}
