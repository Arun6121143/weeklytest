package com.example.customquery.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.customquery.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value = "select * from student_tbl where active=true", nativeQuery = true)
    public List<Student> findByActive();

    @Query(value = "select * from student_tbl where first_name = :firstName", nativeQuery = true)
    public List<Student> findByfirstname(String firstName);

    @Query(value = "select * from student_tbl where last_name = :lastName", nativeQuery = true)
    public List<Student> findBylastname(String lastName);

    @Query(value = "select * from student_tbl where age = :age", nativeQuery = true)
    public List<Student> findByAge(Integer age);
}
