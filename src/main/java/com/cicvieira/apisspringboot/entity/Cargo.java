package com.cicvieira.apisspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CARGO_TBL")
public class Cargo {

    @Id
    @GeneratedValue
    private int id;
    private String cargo;
    private Double salario;
    private int beneficio;
    private Double vl_ano_servico;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="CARGO_FUNCIONARIOS",
            joinColumns={@JoinColumn(name = "CARGO_ID")},
            inverseJoinColumns={@JoinColumn(name = "FUNCIONARIO_ID")})
    private List<Funcionario> funcionario;

}
