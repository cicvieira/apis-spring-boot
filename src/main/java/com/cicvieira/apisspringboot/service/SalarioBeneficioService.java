package com.cicvieira.apisspringboot.service;

import com.cicvieira.apisspringboot.entity.SalarioBeneficioDTO;
import com.cicvieira.apisspringboot.repositoy.SalarioBeneficioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cicero.silva on 07/12/2022
 * @project apis-spring-boot
 */
@Service
public class SalarioBeneficioService {

    @Autowired
    private SalarioBeneficioRepository repository;

    public List<SalarioBeneficioDTO> ListSalarioBeneficio() {
        return  repository.ListSalarioBeneficio();
    }

}
