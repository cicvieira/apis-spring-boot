package com.cicvieira.apisspringboot.controller;

import com.cicvieira.apisspringboot.entity.Cargo;
import com.cicvieira.apisspringboot.entity.Funcionario;
import com.cicvieira.apisspringboot.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@RestController /* Arquitetura REST */
public class FuncionarioController {

    @Autowired
    private FuncionarioService serviceFuncionario;

    /*
    @PostMapping(value = "/ListFuncionarios", consumes = "application/json", produces = "application/json")
    public List<Funcionario> ListFuncionarios(@RequestBody Funcionario funcionario, HttpServletResponse response) {
        return serviceFuncionario.getFuncionarios();
    }*/

    @GetMapping(value = "/ListFuncionarios", produces = "application/json")
    public List<Funcionario> findAllFuncionarios() {
        return serviceFuncionario.getFuncionarios();
    }

}
