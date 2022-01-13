package com.organizacao.financa.repository;

import com.organizacao.financa.models.DespesasDiarias;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Date;

@Repository
@Transactional
public interface DespesasDiariasRepository extends JpaRepository<DespesasDiarias, Long>{

    Page<DespesasDiarias> findAllByDescricaoOrValorOrDiaOrId(String descricao, BigDecimal valor, Date dia, Long id, Pageable page);
}
