package com.teste.projeto.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idFilial;
    private Long quantidade;
    private String descricao;

    public Produto() {

    }

    public Produto(Long filial, Long quantidade, String descricao) {
        this.idFilial = filial;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(Long idFilial) {
        this.idFilial = idFilial;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
