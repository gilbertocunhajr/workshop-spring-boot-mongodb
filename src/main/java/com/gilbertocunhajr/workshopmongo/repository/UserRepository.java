package com.gilbertocunhajr.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gilbertocunhajr.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
