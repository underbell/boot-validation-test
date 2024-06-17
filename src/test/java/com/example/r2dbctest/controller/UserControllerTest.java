package com.example.r2dbctest.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
class UserControllerTest {
  @Autowired private WebTestClient webTestClient;

  @Test
  void usersAbnormalViolated() {
    webTestClient
        .get()
        .uri("/users/1")
        .accept(MediaType.APPLICATION_JSON)
        .exchange()
        .expectStatus()
        .is4xxClientError();
  }

  @Test
  void usersNormalViolated() {
    webTestClient
        .get()
        .uri("/users/2")
        .accept(MediaType.APPLICATION_JSON)
        .exchange()
        .expectStatus()
        .is4xxClientError();
  }
}
