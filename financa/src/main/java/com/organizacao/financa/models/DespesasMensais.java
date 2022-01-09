package com.organizacao.financa.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(scope = DespesasMensais.class,generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "despesas_mensais", schema = "public")
public class DespesasMensais implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "sq_despesas_mensais", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sq_despesas_mensais", sequenceName = "sq_despesas_mensais", initialValue = 1, allocationSize = 1)
    private Integer id;

    @Column(name = "total_gasto")
    private BigDecimal totalGasto;

    @Column(name = "orcamento_mes")
    private BigDecimal orcamentoMes;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "despesas_diarias", referencedColumnName = "id")
    private DespesasDiarias despesasDiarias;

}
