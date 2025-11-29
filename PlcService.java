package com.vkoryakin.diplom.techresource.Service;

import com.vkoryakin.diplom.techresource.Entity.Driver;
import com.vkoryakin.diplom.techresource.Entity.Plc;
import com.vkoryakin.diplom.techresource.Repository.PlcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlcService {
  @Autowired
  PlcRepository plcRepository;

    public List<Plc> findByBrandId(long brandId) {
        return plcRepository.findByBrandId(brandId);
    }
}
