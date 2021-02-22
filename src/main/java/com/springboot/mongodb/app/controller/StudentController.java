package com.springboot.mongodb.app.controller;

import java.util.List;

import com.springboot.mongodb.app.entity.Student;
import com.springboot.mongodb.app.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id) {
        studentService.deleteStudentById(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        studentService.deleteAllStudents();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @GetMapping("/studentByName/{name}")
    public List<Student> getStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping("/studentByNameAndMail")
    public List<Student> getStudentByNameAndMail(
        @RequestParam String name,
        @RequestParam String email
    ) {
        return studentService.getStudentByNameAndEmail(name, email);
    }

    @GetMapping("/studentByNameOrMail")
    public List<Student> getStudentByNameOrMail(
        @RequestParam String name,
        @RequestParam String email
    ) {
        return studentService.getStudentByNameOrEmail(name, email);
    }

    @GetMapping("/allWithPagination")
    public List<Student> getAllWithPagination(
        @RequestParam int pageNo,
        @RequestParam int pageSize
    ) {
        return studentService.getAllWithPagination(pageNo, pageSize);
    }

    @GetMapping("/allWithSorting")
    public List<Student> allWithSorting() {
        return studentService.allWithSorting();
    }

    @GetMapping("/byDepartmentName")
    public List<Student> byDepartmentName(@RequestParam String deptName) {
        return studentService.byDepartmentName(deptName);
    }

    @GetMapping("/bySubjectName")
    public List<Student> bySubjectName(@RequestParam String subName) {
        return studentService.bySubjectName(subName);
    }

    @GetMapping("/emailLike")
    public List<Student> emailLike(@RequestParam String email) {
        return studentService.byEmailIsLike(email);
    }

    @GetMapping("/nameStartsWith")
    public List<Student> nameStartsWith(@RequestParam String name) {
        return studentService.nameStartsWith(name);
    }

    @GetMapping("/byAddressId")
    public List<Student> byAddressId(@RequestParam String addrId) {
        return studentService.byAddressId(addrId);
    }

    @GetMapping("/studentByNameQuery/{name}")
    public List<Student> getStudentByNameQuery(@PathVariable String name) {
        return studentService.getStudentByNameQuery(name);
    }
}
