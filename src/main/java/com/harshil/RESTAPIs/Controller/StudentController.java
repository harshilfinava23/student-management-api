package com.harshil.RESTAPIs.Controller;

import com.harshil.RESTAPIs.Entity.Student;
import com.harshil.RESTAPIs.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController{

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getall(){
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable String id){
        return service.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @PostMapping
    public Student addStudent(@RequestBody Student s){
        return service.saveStudent(s);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteStudents(@PathVariable String id){
        service.deleteStudent(id);
        return true;
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id,
                                 @RequestBody Student s){

        return service.updateStudent(id, s);
    }

    @GetMapping("/email/{email}")
    public Student getStudentByEmail(@PathVariable String email){

        return service.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Student not found with email: " + email));
    }

    @GetMapping("/course/{course}")
    public List<Student> getByCourse(@PathVariable String course){
        return service.getByCourse(course);
    }
}