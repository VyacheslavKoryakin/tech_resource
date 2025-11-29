package com.vkoryakin.diplom.techresource.Repository;

import com.vkoryakin.diplom.techresource.Entity.Driver;
import com.vkoryakin.diplom.techresource.Entity.Plc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlcRepository extends JpaRepository<Plc, Long> {


    @Query(value= "select * from plc where brand_id =:brandId", nativeQuery=true)
    List<Plc> findByBrandId(long brandId);
}
