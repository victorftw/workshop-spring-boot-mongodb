package com.victordev.workshopmongo.services;

import com.victordev.workshopmongo.domain.User;
import com.victordev.workshopmongo.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This service class handles operations related to the User entity. It interacts with the
 * UserRepository to perform CRUD operations and retrieve User data.
 */

@Service
public class UserService {

  @Autowired
  private UserRepository repo;

  public List<User> findAll() {
    return repo.findAll();
  }

}
