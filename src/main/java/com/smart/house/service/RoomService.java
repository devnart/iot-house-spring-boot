package com.smart.house.service;

import com.smart.house.entity.Room;
import com.smart.house.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    public void createRoom(Room room) {
        roomRepository.save(room);
    }

    public void updateRoom(String id) {
        Optional<Room> room = roomRepository.findById(id);
        room.ifPresent(value -> roomRepository.save(value));
    }

    public void deleteRoom(String id) {
        roomRepository.deleteById(id);
    }
}
