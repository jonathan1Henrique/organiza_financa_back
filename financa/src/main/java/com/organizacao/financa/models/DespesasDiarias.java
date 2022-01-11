package com.organizacao.financa.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(scope = DespesasDiarias.class,generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "despesas_diarias", schema = "public")
public class DespesasDiarias implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "sq_despesas_diarias", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sq_despesas_diarias", sequenceName = "sq_despesas_diarias", initialValue = 1, allocationSize = 1)
    private Long id;

    @NotBlank(message = "Campo obrigatório")
    @Column(name = "descricao")
    private String descricao;

    @NotBlank(message = "Campo obrigatório")
    @Column(name = "dia")
    private Date dia;

    @NotBlank(message = "Campo obrigatório")
    @Column(name = "valor")
    private BigDecimal valor;

}
