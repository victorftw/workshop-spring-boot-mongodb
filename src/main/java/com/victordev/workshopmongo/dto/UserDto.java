package com.victordev.workshopmongo.dto;

import com.victordev.workshopmongo.domain.User;
import java.io.Serializable;

/**
 * Represents a Data Transfer Object (DTO) for the User entity. This class is used to transfer User
 * data between the service layer and the REST controller.
 */

public class UserDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;
  private String name;
  private String email;

  public UserDto() {

  }

  /**
   * Constructor to create a UserDTO from a User object.
   *
   * @param obj The User object from which to create the DTO.
   */

  public UserDto(User obj) {
    id = obj.getId();
    name = obj.getName();
    email = obj.getEmail();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
