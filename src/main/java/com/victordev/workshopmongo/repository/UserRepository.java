package com.victordev.workshopmongo.repository;

import com.victordev.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface defines a Spring Data MongoDB repository for the User entity. It provides basic
 * CRUD operations and queries for User objects.
 */

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
