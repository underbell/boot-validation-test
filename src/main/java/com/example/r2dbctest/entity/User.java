package com.example.r2dbctest.entity;

import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class User {
  @Id private Long id;
  private String name;
  private Boolean useYn;

  public User() {}

  public User(Long id, String name, Boolean useYn) {
    this.id = id;
    this.name = name;
    this.useYn = useYn;
  }

  public User updateName(String name) {
    this.name = name;
    return this;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Boolean getUseYn() {
    return useYn;
  }
}
