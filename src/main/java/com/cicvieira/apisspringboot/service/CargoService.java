package com.cicvieira.apisspringboot.service;

import com.cicvieira.apisspringboot.entity.Cargo;
import com.cicvieira.apisspringboot.repositoy.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    public List<Cargo> getCargos() {
        return repository.findAll();
    }
}
