package io.security.springsecurity.service;

import io.security.springsecurity.domain.dto.UserDto;
import io.security.springsecurity.domain.entity.Account;

import java.util.List;

public interface UserService {

  List<Account> getUsers();
  UserDto getUser(Long id);
  void createUser(Account account);
  void deleteUser(Long idx);
}
