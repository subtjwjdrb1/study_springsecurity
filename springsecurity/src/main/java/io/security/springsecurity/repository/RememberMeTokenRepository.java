package io.security.springsecurity.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import io.security.springsecurity.domain.entity.PersistentLogin;

import java.util.Date;
import java.util.List;

public interface RememberMeTokenRepository extends JpaRepository<PersistentLogin, String> {

    PersistentLogin findBySeries(String series);
    List<PersistentLogin> findByUsername(String username);
    Iterable<PersistentLogin> findByLastUsedAfter(Date expiration);

}
