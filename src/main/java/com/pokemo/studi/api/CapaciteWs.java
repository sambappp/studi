package com.pokemo.studi.api;

import com.pokemo.studi.pojo.Capacite;
import com.pokemo.studi.pojo.Pokemon;
import com.pokemo.studi.service.CapaciteService;
import com.pokemo.studi.service.impl.CapaciteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import static jdk.internal.logger.LoggerFinderLoader.service;

//import static jdk.internal.logger.LoggerFinderLoader.service;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_CAPACITE)
public class CapaciteWs {
    @Autowired
    private CapaciteService capaciteService;

    @GetMapping("{id}")
    public Capacite getCapaciteById(@PathVariable(name = "id")Long id){

        return capaciteService.getCapaciteById(id);
    }
    @PostMapping
    public void CreateCapacite(@RequestBody Capacite capacite){
        capaciteService.CreateCapacite(capacite);
    }


}
