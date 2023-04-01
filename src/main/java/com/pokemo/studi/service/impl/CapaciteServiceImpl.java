package com.pokemo.studi.service.impl;

import com.pokemo.studi.pojo.Capacite;
import com.pokemo.studi.pojo.Pokemon;
import com.pokemo.studi.repository.CapaciteRepository;
import com.pokemo.studi.service.CapaciteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CapaciteServiceImpl implements CapaciteService {
    @Autowired
    private CapaciteRepository capaciteRepository;
    //public CapaciteServiceImpl(CapaciteRepository capaciteRepository) {
      //  this.capaciteRepository = capaciteRepository;
    //}



    @Override
    public Capacite getCapaciteById(Long id) {
        Optional<Capacite> capaciteOptional = capaciteRepository.findById(id);
        return capaciteOptional.orElse(null);
    }

    @Override
    public void CreateCapacite(Capacite capacite) {
        capaciteRepository.save(capacite);
    }
}
