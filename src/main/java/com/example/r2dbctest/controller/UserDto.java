package com.example.r2dbctest.controller;

import jakarta.validation.constraints.NotBlank;

public class UserDto {
  @NotBlank private String name;

  public @NotBlank String getName() {
    return name;
  }
}
