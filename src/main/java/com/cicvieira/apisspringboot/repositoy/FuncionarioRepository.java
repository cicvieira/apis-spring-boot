package com.cicvieira.apisspringboot.repositoy;

import com.cicvieira.apisspringboot.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {


}
