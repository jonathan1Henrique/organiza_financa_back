package com.organizacao.financa.repository;

import com.organizacao.financa.models.DespesasDiarias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DespesasDiariasRepository extends JpaRepository<DespesasDiarias, Long> {
}
