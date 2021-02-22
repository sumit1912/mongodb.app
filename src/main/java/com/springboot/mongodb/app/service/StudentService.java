package com.springboot.mongodb.app.service;

import java.util.List;

import com.springboot.mongodb.app.entity.Student;
import com.springboot.mongodb.app.repository.AddressRepository;
import com.springboot.mongodb.app.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, AddressRepository addressRepository) {
        this.studentRepository = studentRepository;
        this.addressRepository = addressRepository;
    }

    public Student createStudent(Student student) {
        if (student.getAddress() != null) {
            addressRepository.save(student.getAddress());
        }
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> getStudentByNameAndEmail(String name, String email) {
        return studentRepository.findByNameAndEmail(name, email);
    }

    public List<Student> getStudentByNameOrEmail(String name, String email) {
        return studentRepository.findByNameOrEmail(name, email);
    }

    public List<Student> getAllWithPagination(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return studentRepository.findAll(pageable).getContent();
    }

    public List<Student> allWithSorting() {
        Sort sort = Sort.by(Sort.Direction.ASC, "name");
        return studentRepository.findAll(sort);
    }

    public List<Student> byDepartmentName(String deptName) {
        return studentRepository.findByDepartmentDepartmentName(deptName);
    }

    public List<Student> bySubjectName(String subName) {
        return studentRepository.findBySubjectsSubjectName(subName);
    }

    public List<Student> byEmailIsLike(String email) {
        return studentRepository.findByEmailIsLike(email);
    }

    public List<Student> nameStartsWith(String name) {
        return studentRepository.findByNameStartsWith(name);
    }

    public void deleteAllStudents() {
        studentRepository.deleteAll();
    }

    public List<Student> byAddressId(String addrId) {
        return studentRepository.findByAddressId(addrId);
    }

    public List<Student> getStudentByNameQuery(String name) {
        return studentRepository.getByName(name);
    }
}
