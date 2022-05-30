package io.security.springsecurity.security.authentication.services;

import lombok.Data;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import io.security.springsecurity.domain.entity.Account;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class UserDetail extends org.springframework.security.core.userdetails.User {
  private Account account;
  private List<String> roles;

  public UserDetail(Account account, List<String> roles) {
    super(account.getUsername(), account.getPassword(), roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
    this.account = account;
    this.roles = roles;
  }
}
