package com.cicvieira.apisspringboot.repositoy;

import com.cicvieira.apisspringboot.entity.SalarioBeneficioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author cicero.silva on 05/12/2022
 * @project apis-spring-boot
 */

@Repository
@Transactional
public interface SalarioBeneficioRepository extends JpaRepository<SalarioBeneficioDTO, Long> {

    @Query(value = "SELECT func.id,\n" +
            "func.nome as nome,\n" +
            "car.beneficio as beneficio,\n" +
            "car.salario as salario,\n" +
            "vd.vl_vendas as vl_vendas,\n" +
            "vd.mes_venda as mes_venda \n" +
            "FROM cicvieira.funcionarios_tbl as func\n" +
            "left join cicvieira.cargo_funcionarios as cf on cf.funcionario_id = func.id\n" +
            "left join cicvieira.cargo_tbl as car on car.id = cf.cargo_id \n" +
            "left join cicvieira.funcionario_vendas as fv on fv.funcionario_id = func.id\n" +
            "left join cicvieira.vendas_tbl as vd on vd.id = fv.venda_id\n" +
            "where func.nome = \"Ana Silva\";", nativeQuery = true)
    List<SalarioBeneficioDTO> ListSalarioBeneficio();
}
