package com.testproject.demo.service;

import com.testproject.demo.models.Student;
import com.testproject.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Collection<Student> getStudents(){
        return studentRepository.getAllStudents();
    }

    public Student getOne(String age){
        return  studentRepository.getOneStudent(age);
    }
}
