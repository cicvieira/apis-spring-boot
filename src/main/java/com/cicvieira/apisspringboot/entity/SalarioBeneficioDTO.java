package com.cicvieira.apisspringboot.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author cicero.silva on 07/12/2022
 * @project apis-spring-boot
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalarioBeneficioDTO {
    @Id
    private Integer id;
    private String nome;
    private Integer beneficio;
    private Double salario;
    private Double vl_vendas;
    private Date mes_venda;
}




