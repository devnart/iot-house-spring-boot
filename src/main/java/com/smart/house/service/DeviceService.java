package com.smart.house.service;

import com.smart.house.entity.Device;
import com.smart.house.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public void addDevice(Device device) {
        deviceRepository.save(device);
    }

    public void deleteDevice(String id) {
        deviceRepository.deleteById(id);
    }

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public void updateDevice(Device device) {
        deviceRepository.save(device);
    }
}
