package com.smart.house.controller;

import com.smart.house.entity.Device;
import com.smart.house.service.DeviceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {

    DeviceService deviceService;

    DeviceController(DeviceService deviceService){
        this.deviceService = deviceService;
    }

    @GetMapping("/devices")
    public List<Device> getAllDevices(){
        return deviceService.getAllDevices();
    }

    @PostMapping("/device/add")
    public void addDevice(@RequestBody Device device){
        deviceService.addDevice(device);
    }

    @PostMapping("/device/delete/{id}")
    public void deleteDevice(@PathVariable String id){
        deviceService.deleteDevice(id);
    }

    @PutMapping("/device/update")
    public void updateDevice(@RequestBody Device device){
        deviceService.updateDevice(device);
    }
}
