package com.victordev.workshopmongo.resources;

import com.victordev.workshopmongo.domain.User;
import com.victordev.workshopmongo.dto.UserDto;
import com.victordev.workshopmongo.services.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired
  private UserService service;

  /**
   * Retrieves a list of users and converts them to UserDto objects.
   *
   * @return A ResponseEntity containing a list of UserDto objects.
   */

  @GetMapping
  public ResponseEntity<List<UserDto>> findAll() {
    List<User> list = service.findAll();
    List<UserDto> listDto = list.stream().map(x -> new UserDto(x)).collect(Collectors.toList());
    return ResponseEntity.ok().body(listDto);
  }
}
