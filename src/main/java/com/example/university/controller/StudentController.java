package com.example.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.service.StudentService;
import com.example.university.studentmodel.Student;

@RestController
@RequestMapping("/api/Students")
public class StudentController {
    @Autowired
    private StudentService stuservice;

    @GetMapping("/Get all students")
    public List<Student> getAll(){
        return stuservice.getAll();
    }
    @GetMapping("Get student by Id/StudentId/{id}")
    public Student findbyid(@PathVariable int id){
        return stuservice.findbyid(id);
    }
    @PostMapping("Add student")
    public void addStudent(@RequestBody Student student){
        stuservice.addStudent(student);
    }
    @PutMapping("update/StudentById/{studentId}")
    public void updateStudent(@PathVariable int studentId, @RequestBody Student student){
         stuservice.updateStudent(studentId,student);
    }
    @DeleteMapping("delete student/StudentId/{id}")
    public void deletestudent(@PathVariable int id){
        stuservice.deleteStudent(id);
    }
    



}
