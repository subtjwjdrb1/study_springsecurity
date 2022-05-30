package io.security.springsecurity.service;

import java.util.List;

import io.security.springsecurity.domain.entity.Resources;
import io.security.springsecurity.domain.entity.Role;

public interface ResourcesService {

    Resources selectResources(long id);

    List<Resources> selectResources();

    void insertResources(Resources Resources);

    void deleteResources(long id);
}