package io.security.springsecurity.service;

import io.security.springsecurity.domain.dto.RoleDto;
import io.security.springsecurity.domain.entity.Role;

import java.util.List;

public interface RoleService {

    Role getRole(long id);

    List<Role> getRoles();

    void createRole(Role role);
}