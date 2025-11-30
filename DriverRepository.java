package com.vkoryakin.diplom.techresource.Repository;

import com.vkoryakin.diplom.techresource.Entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Query(value = "select * from driver",nativeQuery=true)
    List<Driver>findAll();


    @Query(value= "select * from driver where brand_id =:brandId", nativeQuery=true)
    List<Driver> findByBrandId(long brandId);


    @Query(value="select document from driver where id =:driverId", nativeQuery=true)
    String findDocById(long driverId);


    @Query(value = "insert into driver (name, document, brand_id) values(:driverName, :driverDocument, :driverId)", nativeQuery = true)
     void saveDriver(String driverName, String driverDocument, long driverId) ;


}
