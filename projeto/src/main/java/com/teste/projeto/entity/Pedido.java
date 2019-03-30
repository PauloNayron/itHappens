package com.teste.projeto.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> itens;
    private Long idFilial;
    private String tipo;

    public Pedido() {

    }

    public Pedido(Long id, List<Produto> itens, Long idFilial) {
        this.id = id;
        this.itens = itens;
        this.idFilial = idFilial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public Long getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(Long idFilial) {
        this.idFilial = idFilial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
