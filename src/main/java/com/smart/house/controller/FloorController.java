package com.smart.house.controller;

import com.smart.house.entity.Floor;
import com.smart.house.entity.House;
import com.smart.house.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FloorController {

    @Autowired
    private FloorService floorService;

    @GetMapping("/floor")
    public List<Floor> getFloor(){
        return floorService.findAll();
    }

    @PostMapping("/floor")
    public Floor addFloor(@RequestBody Floor floor){
        System.out.println("floor data " + floor);
        return floorService.addFloor(floor);
    }

    @PutMapping("/floor/{id}")
    public Floor updateFloor(@PathVariable String id, @RequestBody Floor floor) {
        return floorService.updateFloor(id,floor);
    }

    @DeleteMapping("/floor/{id}")
    public void deleteFloor(@PathVariable String id){
        floorService.deleteFloor(id);
    }
}
