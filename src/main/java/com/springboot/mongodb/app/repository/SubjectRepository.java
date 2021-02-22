package com.springboot.mongodb.app.repository;

import com.springboot.mongodb.app.entity.Subject;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {
}
