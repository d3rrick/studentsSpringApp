package com.testproject.demo.controller;


import com.testproject.demo.models.Student;
import com.testproject.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public Student getOneStudent(@PathVariable("age") String age){
        return studentService.getOne(age);
    }

    @PostMapping
    public Object addStudent(@Valid @RequestBody Student student){
        return ResponseEntity.ok(student);
    }

}
