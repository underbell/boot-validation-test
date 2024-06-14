package com.example.r2dbctest.config;

import com.example.r2dbctest.repository.UserRepository;
import java.util.List;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class TestAuthenticationManager implements ReactiveAuthenticationManager {
  private final UserRepository userRepository;

  public TestAuthenticationManager(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Mono<Authentication> authenticate(Authentication authentication) {
    var credential = authentication.getCredentials().toString();
    return userRepository
        .findById(Long.valueOf(credential))
        .map(
            user ->
                new UsernamePasswordAuthenticationToken(
                    user, null, List.of(new SimpleGrantedAuthority("USER"))));
  }
}
