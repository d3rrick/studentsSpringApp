package com.testproject.demo.models;


import javax.validation.constraints.*;

public class Student {

    @NotNull(message= "age is a required field")
    @Min(value = 5, message = "age should not be less than 5")
    @Max(value = 150, message = "age should not be greater than 150")
    private int age;

    @NotNull(message= "first name is a required field")
    private String firstName;

    @NotNull(message= "first name is a required field")
    private String lastName;

    @NotNull(message= "mobile is a required field")
    private String mobile;

    @Email(message = "Email should be valid")
    private  String email;

    public Student(int age, String firstName, String lastName,String mobile, String email) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
