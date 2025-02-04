package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // class attributes
    private List<Student> theStudents;

    // define @PostConstruct to load the student data only once.
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Jane", "Ignacio"));
        theStudents.add(new Student("Gizelle", "Rodriguez"));
        theStudents.add(new Student("Jacquline", "Linda"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    // define endpoint for "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId >= theStudents.size() || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found — " + studentId);
        }
        return theStudents.get(studentId);
    }

}
