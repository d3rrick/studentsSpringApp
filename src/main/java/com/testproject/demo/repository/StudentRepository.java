package com.testproject.demo.repository;

import com.testproject.demo.exception.StudentNotFoundException;
import com.testproject.demo.models.Student;
import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@Repository
public class StudentRepository {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(30, "jane", "doe", "716668272","test@gmail.com" ));
                put(2, new Student(34, "john", "dee", "716668272","test@gmail.com" ));
                put(3, new Student(45, "foo", "bar", "716668272","test@gmail.com" ));
                put(4, new Student(12, "jones", "ken", "716668272","test@gmail.com" ));

            }
        };
        System.out.println(students.values());
    }

    private StudentNotFoundException studentNotFoundException;

    public Collection<Student> getAllStudents(){
        return students.values();
    }

    public Student getOneStudent(int age)  {

        return students.values().stream()
                .filter(student -> age == student.getAge())
                .findFirst()
                .orElse(null);
    }

}
