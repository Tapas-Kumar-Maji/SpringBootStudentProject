package com.school.main.service;

import com.school.main.entity.Address;
import com.school.main.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.school.main.repository.StudentRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        return repository.saveAndFlush(student);
    }

    @Override
    public List<Student> getStudentList() {
        return repository.findAll();
    }

    public Student getStudentById(String studentId){
        if(repository.findById(studentId).isPresent()){
        return repository.findById(studentId).get();
        }
        return null;
    }

    @Override
    public Student updateStudent(Student student, String studentId) {
        if(repository.findById(studentId).isPresent()) {
            Student originalStudent = repository.findById(studentId).get();
            Address updatedAddress = updateStudentAddress(originalStudent.getAddress(),student.getAddress());
            originalStudent.setAddress(updatedAddress);
            repository.saveAndFlush(originalStudent);
        }
       return null;
    }

    private Address updateStudentAddress(Address currentAddress, Address updatedAddress){
        currentAddress.setAddressLine1(updatedAddress.getAddressLine1());
        currentAddress.setCity(updatedAddress.getCity());
        currentAddress.setCountry(updatedAddress.getCountry());
        currentAddress.setState(updatedAddress.getState());
        return currentAddress;
    }
    @Override
    public void deleteStudentById(String studentId) {
        repository.deleteById(studentId);
    }


    @Override
    @Scheduled(cron = "0 */30 * * * *")
    public void executeScheduleTask(){
        Student student = new Student();
        student.setName("Tapas");
        student.setAge("26");

        Address address = new Address();
        address.setAddressLine1("24 Marks Street");
        address.setCity("Kolkata");
        address.setState("WB");
        address.setCountry("India");
        student.setAddress(address);
        repository.saveAndFlush(student);
    }
}
