package com.testproject.demo.controller;


import com.testproject.demo.exception.StudentNotFoundException;
import com.testproject.demo.models.Student;
import com.testproject.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Collection;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public Collection<Student> getAll(){
        return studentService.getStudents();
    }

    @GetMapping("/students/{age}")
    public Student getOneStudent(@PathVariable("age") int age) throws StudentNotFoundException {
        Student student =  studentService.getOne(age);
        System.out.println(student);
        if(student == null){
            throw new StudentNotFoundException("No student with age =  "+ age +" ." );
        }
        return student ;
    }

    /*
    * started here to handle exceptions --> call it v1
     */
    @PostMapping("/create/student")
    public ResponseEntity<Void> addStudent(@Valid @RequestBody Student student){
        try{
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(URI.create("/create/student"));
            return new ResponseEntity<>(headers, HttpStatus.CREATED);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
        }
    }

}
