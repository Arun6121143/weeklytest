package com.example.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.university.studentmodel.Student;

@Service
public class StudentService {
    private static List<Student> students = new ArrayList<>();
    static{
        students.add(new Student(1,"Arun","Menon",22,"IC"));
        students.add(new Student(2,"Arjun","Menon",19,"BCA"));
        students.add(new Student(3,"Adarsh","Nair",20,"CE"));
        students.add(new Student(4,"Adithyan","Nair",18,"EC"));
    }

    public List<Student> getAll(){
        return students;
    }
    public Student findbyid(int id){
        return students.stream().filter(t-> t.getStudentId()==id).findFirst().get();

    }
    public void addStudent(Student student) {
        students.add(student);
    }
     
    public void updateStudent(int studentId, Student newStudent) {
    
        Student student = findbyid(studentId);
        student.setDepartment(newStudent.getDepartment());
    }
    public void deleteStudent(int id){
        Student s = findbyid(id);
        students.remove(s);
    }

}

