package com.smart.house.service;

import com.smart.house.entity.Floor;
import com.smart.house.repository.FloorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FloorServiceTest {

    @InjectMocks
    private FloorService floorService;

    @Mock
    FloorRepository floorRepository;

    Floor floor = new Floor("dsds",1,"aa");
    @Test
    void findAll() {
        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        when(floorRepository.findAll()).thenReturn(floors);
        assertEquals(floors.size(),floorService.findAll().size());
    }

    @Test
    void addFloor() {
        when(floorRepository.save(floor)).thenReturn(floor);
        assertEquals(floor,floorService.addFloor(floor));
    }

    @Test
    void updateFloor() {
        when(floorRepository.save(floor)).thenReturn(floor);
        assertEquals(floor,floorService.updateFloor(floor));
    }

    @Test
    void deleteFloor() {
    }
}