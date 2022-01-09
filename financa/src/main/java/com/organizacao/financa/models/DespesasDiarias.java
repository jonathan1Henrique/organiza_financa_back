package com.organizacao.financa.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(scope = DespesasDiarias.class,generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "despesas_diarias", schema = "public")
public class DespesasDiarias implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "sq_despesas_diarias", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sq_despesas_diarias", sequenceName = "sq_despesas_diarias", initialValue = 1, allocationSize = 1)
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "dia")
    private Date dia;

    @Column(name = "valor")
    private BigDecimal valor;

}
