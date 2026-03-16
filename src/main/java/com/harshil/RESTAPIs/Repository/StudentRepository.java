package com.harshil.RESTAPIs.Repository;

import com.harshil.RESTAPIs.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student,String> {
    Optional<Student> findByEmail(String email);
    List<Student> findByCourse(String course);
}
