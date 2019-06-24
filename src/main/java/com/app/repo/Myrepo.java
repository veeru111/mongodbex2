package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Myproduct;

public interface Myrepo extends MongoRepository<Myproduct,String>{

}
