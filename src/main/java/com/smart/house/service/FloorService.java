package com.smart.house.service;

import com.smart.house.entity.Floor;
import com.smart.house.entity.House;
import com.smart.house.repository.FloorRepository;
import com.smart.house.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class FloorService {

    @Autowired
    private FloorRepository floorRepository;

    public List<Floor> findAll() {
        return floorRepository.findAll();
    }

    public Floor addFloor(Floor floor) {
        return floorRepository.save(floor);
    }

    public Floor updateFloor(String id, Floor floor) {
        Optional<Floor> floor1 = floorRepository.findById(id);

        if(floor1.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        floor1.get().setHouseId(floor.getHouseId());
        floor1.get().setNumber(floor.getNumber());
        return floorRepository.save(floor1.get());
    }

    public void deleteFloor(String id) {
    }
}
