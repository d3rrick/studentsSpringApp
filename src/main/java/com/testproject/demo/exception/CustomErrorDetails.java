package com.testproject.demo.exception;

import java.util.Date;

public class CustomErrorDetails {
    private Date timestamp;
    private String message;
    private String errorDetails;


//    constructor
    public CustomErrorDetails(Date timestamp, String message, String errorDetails) {
        this.timestamp = timestamp;
        this.message = message;
        this.errorDetails = errorDetails;
    }



//    getters
    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorDetails() {
        return errorDetails;
    }



}
