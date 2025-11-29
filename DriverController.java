package com.vkoryakin.diplom.techresource.Controller;

import com.vkoryakin.diplom.techresource.Entity.Driver;
import com.vkoryakin.diplom.techresource.Service.DriverService;
import com.vkoryakin.diplom.techresource.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/dr")
public class DriverController {
    @Autowired
    DriverService driverService;
    @Autowired
    MainService mainService;

   @GetMapping("/findAll")
    public String findAll(Model model) {
        List<Driver> drivers = driverService.findAll();
        model.addAttribute("drivers", drivers);
        return "index";
    }
    @GetMapping("/findByBrandId")
    public String findByBrandId(@RequestParam long brandId, Model model, Model model2) {
        List<Driver> drivers = driverService.findByBrandId(brandId);
        String driverBrand = mainService.getBrandById(brandId);
        model2.addAttribute("driverBrand", driverBrand);
        model.addAttribute("drivers", drivers);
        return "driverList";
    }
    @GetMapping("/findDocById")
    public String findDocById(@RequestParam long driverId, Model model) {
       String driverDoc = driverService.findDocByID(driverId);
       model.addAttribute("driverDoc", driverDoc);
       return "driverList";
    }
}
