package com.springboot.mongodb.app.repository;

import com.springboot.mongodb.app.entity.Address;
import com.springboot.mongodb.app.entity.Department;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
}
