package com.teste.projeto.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Filial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idEstoque;
    private String nome;

    public Filial() {
    }

    public Filial(Long idEstoque, String nome) {
        this.idEstoque = idEstoque;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Long idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
