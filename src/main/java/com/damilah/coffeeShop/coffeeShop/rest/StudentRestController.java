package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){

        theStudents=new ArrayList<>();

        theStudents.add(new Student("Mario", "Bojarovski"));
        theStudents.add(new Student("Mila", "Bojarovski"));
        theStudents.add(new Student("Matea", "Bojarovski"));

    }

//    Get Student
    @GetMapping("/students")
    public List<Student> getStudents(){
        return  theStudents;
    }

//    Student by ID
    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId){

        if(studentId >= theStudents.size() || (studentId<0)){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return  theStudents.get(studentId);
    }

}
