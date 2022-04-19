package com.smart.house.repository;

import com.smart.house.entity.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends MongoRepository<House, String> {
}
