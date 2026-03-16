package com.harshil.RESTAPIs.Services;

import com.harshil.RESTAPIs.Entity.Student;
import com.harshil.RESTAPIs.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {
    @Autowired
    private StudentRepository srepo;

    public Student saveStudent(Student s){
        return srepo.save(s);
    }

    public List<Student> getAllStudents(){
        return srepo.findAll();
    }
    public Optional<Student> findById(String id){
        return srepo.findById(id);
    }
    public void deleteStudent(String id){
        srepo.deleteById(id);
    }

    public Student updateStudent(String id, Student s){
        Student old = srepo.findById(id).orElse(null);
        if(old != null){
            if(s.getName() != null && !s.getName().isEmpty()){
                old.setName(s.getName());
            }
            if(s.getEmail() != null && !s.getEmail().isEmpty()){
                old.setEmail(s.getEmail());
            }
            if(s.getCourse() != null && !s.getCourse().isEmpty()){
                old.setCourse(s.getCourse());
            }
            return srepo.save(old);
        }else{
            throw new RuntimeException("Student not found by id : " + id);
        }
    }

    public Optional<Student> findByEmail(String email){
        return srepo.findByEmail(email);
    }

    public List<Student> getByCourse(String course){
        return srepo.findByCourse(course);
    }

}
