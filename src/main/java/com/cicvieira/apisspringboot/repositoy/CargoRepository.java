package com.cicvieira.apisspringboot.repositoy;

import com.cicvieira.apisspringboot.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */
public interface CargoRepository extends JpaRepository<Cargo, Integer> {


}
