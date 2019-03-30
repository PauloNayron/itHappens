package com.teste.projeto.controller;

import com.teste.projeto.entity.Estoque;
import com.teste.projeto.entity.Produto;
import com.teste.projeto.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstoqueController {

    @Autowired
    EstoqueRepository estoqueRepository;

    @RequestMapping(value = "/Estoque", method = RequestMethod.GET)
    public List<Estoque> getAllEstoque() {
        return estoqueRepository.findAll();
    }

    @RequestMapping(value = "/Estoque", method = RequestMethod.POST)
    public Estoque save(@RequestBody Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    /**
     * @brief returna a lita de produtos por id
     * @param id do Estoque
     * @return Estoque
     * exemplo: localhost:9000/api/Estoque/8
     */
    @RequestMapping(value = "/Estoque/{id}", method = RequestMethod.GET)
    public Estoque getFilialById (@PathVariable Long id) {
        return estoqueRepository.getOne(id);
    }

}
