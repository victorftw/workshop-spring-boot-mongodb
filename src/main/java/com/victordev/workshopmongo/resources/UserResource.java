package com.victordev.workshopmongo.resources;

import com.victordev.workshopmongo.domain.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The UserResource class provides RESTful endpoints for managing user data.
 */

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  /**
   * Retrieves a list of all users.
   *
   * @return A list of User objects representing all users.
   */

  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    User maria = new User("1", "Maria Brown", "maria@gmail.com");
    User alex = new User("2", "Alex Green", "alex@gmail.com");

    List<User> list = new ArrayList<>();
    list.addAll(Arrays.asList(maria, alex));
    return ResponseEntity.ok().body(list);
  }
}
