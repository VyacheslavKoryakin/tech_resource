package com.vkoryakin.diplom.techresource.Service;

import com.vkoryakin.diplom.techresource.Entity.Driver;
import com.vkoryakin.diplom.techresource.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    private DriverRepository driverRepository;


    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    public List<Driver> findByBrandId(long brandId) {
        return driverRepository.findByBrandId(brandId);
    }

    public String findDocByID(long driverId) {
        return driverRepository.findDocById(driverId);
    }
}
