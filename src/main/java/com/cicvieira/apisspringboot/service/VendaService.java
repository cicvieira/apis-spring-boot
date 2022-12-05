package com.cicvieira.apisspringboot.service;

import com.cicvieira.apisspringboot.entity.Venda;
import com.cicvieira.apisspringboot.repositoy.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public List<Venda> getVendas() {
        return repository.findAll();
    }
}
