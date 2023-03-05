package com.example.customquery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customquery.dao.StudentRepository;
import com.example.customquery.model.Student;

@Service
public class StudentService {

    @Autowired
    StudentRepository srepo;

    public void saveStudent(Student s) {
        srepo.save(s);

    }

    public List<Student> getStudents() {
        return srepo.findByActive();
    }

    public List<Student> getbyfirstname(String firstName) {
        return srepo.findByfirstname(firstName);
    }

    public List<Student> getByLastName(String lastName) {
        return srepo.findBylastname(lastName);
    }

    public List<Student> getByAge(Integer age) {
        return srepo.findByAge(age);
    }

}
