package com.cicvieira.apisspringboot.controller;

import com.cicvieira.apisspringboot.entity.Funcionario;
import com.cicvieira.apisspringboot.entity.Venda;
import com.cicvieira.apisspringboot.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@RestController /* Arquitetura REST */
public class VendaController {

    @Autowired
    private VendaService serviceVenda;

    /*
    @PostMapping(value = "/ListVendas", consumes = "application/json", produces = "application/json")
    public List<Venda> ListVendas(@RequestBody Venda venda, HttpServletResponse response) {
        return serviceVenda.getVendas();
    }*/

    @GetMapping(value = "/ListVendas", produces = "application/json")
    public List<Venda> findAllVendas() {
        return serviceVenda.getVendas();
    }

}
