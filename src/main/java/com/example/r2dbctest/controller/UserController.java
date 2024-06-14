package com.example.r2dbctest.controller;

import com.example.r2dbctest.entity.User;
import com.example.r2dbctest.repository.UserRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
public class UserController {
  private final UserRepository userRepository;

  @GetMapping("/users/1")
  public Flux<User> usersAbnormalViolated(
      @Valid UserDto dto,
      @RequestParam(name = "page", defaultValue = "1") @Positive int pageNo,
      @RequestParam(name = "size", defaultValue = "30") int pageSize) {
    return userRepository.findAll();
  }

  @GetMapping("/users/2")
  public Flux<User> usersNormalViolated(
      @Valid UserDto dto,
      @RequestParam(name = "page", defaultValue = "1") int pageNo,
      @RequestParam(name = "size", defaultValue = "30") int pageSize) {
    return userRepository.findAll();
  }

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
}
