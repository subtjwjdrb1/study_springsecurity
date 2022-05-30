package io.security.springsecurity.service.impl;

import io.security.springsecurity.domain.entity.Resources;
import io.security.springsecurity.domain.entity.Role;
import io.security.springsecurity.repository.ResourcesRepository;
import io.security.springsecurity.service.ResourcesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    private ResourcesRepository ResourcesRepository;

    @Transactional
    public Resources selectResources(long id) {
        return ResourcesRepository.findById(id).orElse(new Resources());
    }

    @Transactional
    public List<Resources> selectResources() {
        return ResourcesRepository.findAll();
    }

    @Transactional
    public void insertResources(Resources resources){
        ResourcesRepository.save(resources);
    }

    @Transactional
    public void deleteResources(long id) {
        ResourcesRepository.deleteById(id);
    }
}