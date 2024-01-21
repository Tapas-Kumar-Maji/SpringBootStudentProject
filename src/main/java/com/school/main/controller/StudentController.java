package com.school.main.controller;

import com.school.main.entity.Student;
import com.school.main.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/")
    public List<Student> getAllStudents(){
        return service.getStudentList();

    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") String studentId){
        return service.getStudentById(studentId);
    }

    @PutMapping("/{id}")
    public Student updateStudentById(@RequestBody Student student, @PathVariable("id") String studentId){
        return service.updateStudent(student, studentId);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable("id") String studentId){
        service.deleteStudentById(studentId);
        return "deleted successfully";
    }

}
