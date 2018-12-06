package com.upc.idss.practical.winerecomender.idssbe;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/api"})
public class WineController {

    @RequestMapping("/keys")
    public int create(@RequestBody Wine wine){
        return wine.getCountry();
        //return null;
    }

}