package com.school.main.service;

import com.school.main.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getStudentList();
    Student getStudentById(String studentId);
    Student updateStudent(Student student, String studentId);
    void deleteStudentById(String studentId);
    void executeScheduleTask();

}
