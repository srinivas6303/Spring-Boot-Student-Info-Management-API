package com.example.Rest_Api_SpringBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Rest_Api_SpringBoot.entity.Student;

public interface StudentRepository  extends JpaRepository<Student,Long>{

}
