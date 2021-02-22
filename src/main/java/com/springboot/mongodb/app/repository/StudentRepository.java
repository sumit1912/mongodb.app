package com.springboot.mongodb.app.repository;

import java.util.List;

import com.springboot.mongodb.app.entity.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(String name);

    List<Student> findByNameAndEmail(String name, String email);

    List<Student> findByNameOrEmail(String name, String email);

    List<Student> findByDepartmentDepartmentName(String deptName);

    List<Student> findBySubjectsSubjectName(String subName);

    List<Student> findByEmailIsLike(String email);

    List<Student> findByNameStartsWith(String name);

    List<Student> findByAddressId(String addrId);

    @Query("{ \"name\" : \"?0\" }")
    List<Student> getByName(String name);
}
