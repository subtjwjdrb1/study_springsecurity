package io.security.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.security.springsecurity.domain.entity.Account;

public interface UserRepository extends JpaRepository<Account, Long> {

  Account findByUsername(String username);

  int countByUsername(String username);

  @Override
  void delete(Account account);

}