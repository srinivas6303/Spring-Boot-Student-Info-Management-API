package com.example.Rest_Api_SpringBoot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest_Api_SpringBoot.entity.Student;
import com.example.Rest_Api_SpringBoot.repo.StudentRepository;


@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepo;

    // Creating a student
    @PostMapping("/api/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentRepo.save(student), HttpStatus.CREATED);
    }

    // Retrieving all students
    @GetMapping("/api/students")
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(studentRepo.findAll(), HttpStatus.OK);
    }

    // Retrieving a single student by ID
    @GetMapping("/api/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable long id) {
        Optional<Student> student = studentRepo.findById(id);
        if (student.isPresent()) {
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Updating a student by ID
    @PutMapping("/api/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student stud) {
        Optional<Student> student = studentRepo.findById(id);
        if (student.isPresent()) {
            Student existingStudent = student.get();
            existingStudent.setStudentName(stud.getStudentName());
            existingStudent.setStudentEmail(stud.getStudentEmail());
            existingStudent.setStudentAddress(stud.getStudentAddress());
            return new ResponseEntity<>(studentRepo.save(existingStudent), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Deleting a student by ID
    @DeleteMapping("/api/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
        Optional<Student> student = studentRepo.findById(id);
        if (student.isPresent()) {
            studentRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
