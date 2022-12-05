package com.cicvieira.apisspringboot.controller;

import com.cicvieira.apisspringboot.entity.Cargo;
import com.cicvieira.apisspringboot.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@RestController /* Arquitetura REST */
public class CargoController {

    @Autowired
    private CargoService serviceCargo;

    /*
    @PostMapping(value = "/ListCargos", consumes = "application/json", produces = "application/json")
    public List<Cargo> ListCargos(@RequestBody Cargo cargo, HttpServletResponse response) {
        return serviceCargo.getCargos();
    }*/

    @GetMapping(value = "/ListCargos", produces = "application/json")
    public List<Cargo> findAllCargos() {
        return serviceCargo.getCargos();
    }

}
