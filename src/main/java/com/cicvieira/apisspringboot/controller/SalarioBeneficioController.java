package com.cicvieira.apisspringboot.controller;

import com.cicvieira.apisspringboot.entity.FuncionarioVO;
import com.cicvieira.apisspringboot.entity.SalarioBeneficioDTO;
import com.cicvieira.apisspringboot.service.SalarioBeneficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cicero.silva on 07/12/2022
 * @project apis-spring-boot
 */

@RestController /* Arquitetura REST */
public class SalarioBeneficioController {

    @Autowired
    private SalarioBeneficioService service;

    @PostMapping(value = "/ListSalarioBeneficio", produces = "application/json")
    public List<SalarioBeneficioDTO> ListSalarioBeneficio(@RequestBody List<FuncionarioVO> func)  {

        return service.ListSalarioBeneficio();

    }
}
