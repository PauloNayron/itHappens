package com.teste.projeto.controller;

import com.teste.projeto.entity.Estoque;
import com.teste.projeto.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstoqueController {

    @Autowired
    EstoqueRepository estoqueRepository;

    @RequestMapping(value = "/estoque", method = RequestMethod.GET)
    public List<Estoque> getAllEstoque() {
        return estoqueRepository.findAll();
    }


}
