package io.security.springsecurity.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import io.security.springsecurity.domain.entity.RoleHierarchy;

public interface RoleHierarchyRepository extends JpaRepository<RoleHierarchy, Long> {

    RoleHierarchy findByChildName(String roleName);
}
