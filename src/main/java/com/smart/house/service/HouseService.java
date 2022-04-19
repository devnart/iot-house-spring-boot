package com.smart.house.service;

import com.smart.house.entity.House;
import com.smart.house.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class HouseService {

    @Autowired
    private HouseRepository houseRepository;

    public List<House> findAll() {
        return houseRepository.findAll();
    }

    public House addHouse(House house) {
        return houseRepository.save(house);
    }

    public House updateHouse(String id,House house) {
        Optional<House> found = houseRepository.findById(id);

        if(found.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        found.get().setName(house.getName());
        found.get().setAddress(house.getAddress());
        return houseRepository.save(found.get());
    }

    public void deleteHouse(String id) {
        Optional<House> house = houseRepository.findById(id);
        house.ifPresent(value -> houseRepository.delete(value));
    }
}
