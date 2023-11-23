package br.com.ods3.gs.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity (name = "indicadores_ano")
public class IndicadorAno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String regiao;
    @Column
    private double consumo;
    @Column
    private Long ano;
//    @ManyToOne
//    @JoinColumn(name = "descricao_indicador_id")
//    private Descricaoindicador descricaoIndicador;



}
