package com.cicvieira.apisspringboot.repositoy;

import com.cicvieira.apisspringboot.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */
public interface VendaRepository extends JpaRepository<Venda, Long> {


}
