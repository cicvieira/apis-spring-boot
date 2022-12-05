package com.cicvieira.apisspringboot.service;

import com.cicvieira.apisspringboot.entity.Cargo;
import com.cicvieira.apisspringboot.entity.Funcionario;
import com.cicvieira.apisspringboot.repositoy.CargoRepository;
import com.cicvieira.apisspringboot.repositoy.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getFuncionarios() {
        return repository.findAll();
    }
}
