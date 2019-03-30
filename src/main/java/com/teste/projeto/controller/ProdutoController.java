package com.teste.projeto.controller;

import com.teste.projeto.entity.Produto;
import com.teste.projeto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @RequestMapping(value = "/estoque", method = RequestMethod.GET)
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }


}
