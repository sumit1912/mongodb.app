package com.springboot.mongodb.app.repository;

import com.springboot.mongodb.app.entity.Department;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {
}
