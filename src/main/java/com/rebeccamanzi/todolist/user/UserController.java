package com.rebeccamanzi.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificadores
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private IUserRepository userRepository;

  // @RequestBody -> o userModel será recebido pelo body da request
  @PostMapping("/")
  public UserModel create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());

    if (user != null) {
      System.out.println("User already exist!");
      return null;
    }

    var userCreated = this.userRepository.save(userModel);
    return userCreated;
  }
}
