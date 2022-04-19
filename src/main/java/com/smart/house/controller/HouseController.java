package com.smart.house.controller;

import com.smart.house.entity.House;
import com.smart.house.repository.HouseRepository;
import com.smart.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("/house")
    public List<House> getHouse(){
        return houseService.findAll();
    }

    @PostMapping("/house")
    public House addHouse(@RequestBody House house){
        System.out.println("house data " + house);
        return houseService.addHouse(house);
    }

    @PutMapping("/house/{id}")
    public House updateHouse(@PathVariable String id, @RequestBody House house) {
        return houseService.updateHouse(id,house);
    }

    @DeleteMapping("/house/{id}")
    public void deleteHouse(@PathVariable String id){
        houseService.deleteHouse(id);
    }
}
