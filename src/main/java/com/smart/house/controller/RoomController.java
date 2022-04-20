package com.smart.house.controller;

import com.smart.house.entity.Room;
import com.smart.house.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    RoomService roomService;

    RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public List<Room> getRoom() {
        return roomService.getRooms();
    }

    @PostMapping("/room")
    public void addRoom(Room room) {
        roomService.createRoom(room);
    }

    @PutMapping("/room/{id}")
    public void updateRoom(@PathVariable String id) {
        roomService.updateRoom(id);
    }

    public void deleteRoom(String id) {
        roomService.deleteRoom(id);
    }
}
