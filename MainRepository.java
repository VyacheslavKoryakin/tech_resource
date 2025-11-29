package com.vkoryakin.diplom.techresource.Repository;

import com.vkoryakin.diplom.techresource.Entity.Brand;
import com.vkoryakin.diplom.techresource.Entity.Driver;
import com.vkoryakin.diplom.techresource.Entity.Plc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MainRepository extends JpaRepository<Brand, Long> {


    @Query(value="select name from brand where id =:id", nativeQuery=true)
    String getBrandById(long id);
}
