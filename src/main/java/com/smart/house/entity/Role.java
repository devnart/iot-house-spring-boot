package com.smart.house.entity;

import com.smart.house.enums.ERole;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("roles")
public class Role {
    @Id
    private String id;
    private ERole name;

}
