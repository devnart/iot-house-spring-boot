package com.smart.house.repository;

import com.smart.house.entity.Role;
import com.smart.house.enums.ERole;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role,String> {
    Optional<Role> findByName(ERole name);

}
