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
@Table(name = "FUNCIONARIOS_TBL")
public class Funcionario {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private Date contratacao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="FUNCIONARIO_VENDAS",
            joinColumns={@JoinColumn(name = "FUNCIONARIO_ID")},
            inverseJoinColumns={@JoinColumn(name = "VENDA_ID")})
    private List<Venda> venda;

}
