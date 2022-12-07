package com.cicvieira.apisspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioVO {

    private String nome;
    private Date mes_venda;

}
