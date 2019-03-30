package com.teste.projeto.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Estoque implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Estoque() {

    }

    public Estoque(List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
