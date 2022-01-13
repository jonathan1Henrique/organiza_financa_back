package com.organizacao.financa.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(scope = DespesasDiarias.class,generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "despesas_diarias", schema = "public")
public class DespesasDiarias implements Serializable{

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "sq_despesas_diarias", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sq_despesas_diarias", sequenceName = "sq_despesas_diarias", initialValue = 1, allocationSize = 1)
    private Long id;

    @NotEmpty(message = "{descricao.obrigatoria}")
    @Column(name = "descricao")
    private String descricao;

    @NotNull(message ="{data.obrigatoria}")
    @Column(name = "dia")
    private Date dia;

    @NotNull(message = "{valor.obrigatorio}")
    @Column(name = "valor")
    private BigDecimal valor;

}
