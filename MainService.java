package com.vkoryakin.diplom.techresource.Service;

import com.vkoryakin.diplom.techresource.Entity.Brand;
import com.vkoryakin.diplom.techresource.Repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainService {
    @Autowired
    MainRepository mainRepository;

    public List<Brand> findAll() {
       return mainRepository.findAll() ;
    }
    public String getBrandById(long id) {
      return  mainRepository.getBrandById(id);
    }
}
