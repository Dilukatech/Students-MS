package com.example.StudentMS.service;

import com.example.StudentMS.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
