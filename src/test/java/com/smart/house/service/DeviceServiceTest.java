package com.smart.house.service;

import com.smart.house.entity.Device;
import com.smart.house.enums.Status;
import com.smart.house.repository.DeviceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DeviceServiceTest {

    @InjectMocks
    DeviceService deviceService;

    @Mock
    DeviceRepository deviceRepository;

    Device device = new Device("kshksdh",2, Status.OFF,"ksdjsd");

    @Test
    void addDevice() {
        when(deviceRepository.save(device)).thenReturn(device);
        assertEquals(device, deviceService.addDevice(device));
    }

    @Test
    void getAllDevices() {
        List<Device> devices = List.of(device);
        when(deviceRepository.findAll()).thenReturn(devices);
        assertEquals(devices, deviceService.getAllDevices());
    }

    @Test
    void updateDevice() {
        when(deviceRepository.save(device)).thenReturn(device);
        assertEquals(device, deviceService.updateDevice(device));
    }
}