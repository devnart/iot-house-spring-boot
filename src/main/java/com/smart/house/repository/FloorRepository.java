package com.smart.house.repository;

import com.smart.house.entity.Floor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends MongoRepository<Floor, String> {

}
