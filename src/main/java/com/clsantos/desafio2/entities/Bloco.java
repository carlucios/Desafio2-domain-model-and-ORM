package com.clsantos.desafio2.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Bloco() {
    }

    public Bloco(Integer id, Instant inicio, Instant fim, Atividade atividade) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.atividade = atividade;
    }

    public Integer getId() {
        return id;
    }

    public Bloco setId(Integer id) {
        this.id = id;
        return this;
    }

    public Instant getInicio() {
        return inicio;
    }

    public Bloco setInicio(Instant inicio) {
        this.inicio = inicio;
        return this;
    }

    public Instant getFim() {
        return fim;
    }

    public Bloco setFim(Instant fim) {
        this.fim = fim;
        return this;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public Bloco setAtividade(Atividade atividade) {
        this.atividade = atividade;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bloco bloco = (Bloco) o;
        return Objects.equals(id, bloco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
