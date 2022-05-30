package io.security.springsecurity.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import io.security.springsecurity.domain.entity.AccessIp;

public interface AccessIpRepository extends JpaRepository<AccessIp, Long> {

    AccessIp findByIpAddress(String IpAddress);

}
