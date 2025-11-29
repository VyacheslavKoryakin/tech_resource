package com.vkoryakin.diplom.techresource.Controller;

import com.vkoryakin.diplom.techresource.Entity.Driver;
import com.vkoryakin.diplom.techresource.Entity.Plc;
import com.vkoryakin.diplom.techresource.Service.DriverService;
import com.vkoryakin.diplom.techresource.Service.MainService;
import com.vkoryakin.diplom.techresource.Service.PlcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api")
public class MainController {
    @Autowired
    MainService mainService;
    @Autowired
    DriverService driverService;
    @Autowired
    PlcService plcService;
@GetMapping("/main")
    public String findAll(Model model) {
    System.out.println(mainService.findAll());
        model.addAttribute("brand", mainService.findAll());

        return "index";
    }

    @GetMapping("/findByBrand")
    public String findAllByBrand(@RequestParam long brandId, Model model, Model model2) {
        List<Driver> drivers = driverService.findByBrandId(brandId);
        List<Plc> plcs = plcService.findByBrandId(brandId);
        model.addAttribute("drivers", drivers);
        model2.addAttribute("plcs", plcs);
        return "brand_list";
    }

}
