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

@Entity(name = "Objetivos")
public class Objetivo implements Serializable {
    @Id
    private Long id;
    @Column(length = 565)
    private String metaGlobal;
    @Column(length = 565)
    private String metaLocal;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "objetivo_id")
    private List<Descricaoindicador> indicadores;

}
