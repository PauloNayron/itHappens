package com.teste.projeto.controller;

import com.teste.projeto.entity.Produto;
import com.teste.projeto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @RequestMapping(value = "/produto", method = RequestMethod.GET)
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @RequestMapping(value = "/produto", method = RequestMethod.POST)
    public Produto save(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }


}
