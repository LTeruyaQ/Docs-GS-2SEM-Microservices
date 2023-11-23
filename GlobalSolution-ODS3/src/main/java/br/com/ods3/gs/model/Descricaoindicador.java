package br.com.ods3.gs.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Descricaoindicadores")
public class Descricaoindicador implements Serializable {
    @Id
    private Long id;
    @Column(length = 565)
    private String descIndicador;
//    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "descricaoIndicador")
//    private List<IndicadorAno> indicadoresAnos;
}
