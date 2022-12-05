package com.cicvieira.apisspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VENDAS_TBL")
public class Venda {

    @Id
    @GeneratedValue
    private int id;
    private Date mes_venda;
    private Double vl_vendas;

}
