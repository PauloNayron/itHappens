package com.teste.projeto.controller;

import com.teste.projeto.entity.Filial;
import com.teste.projeto.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FilialController {

    @Autowired
    FilialRepository filialRepository;

    @RequestMapping(value = "/Filial", method = RequestMethod.GET)
    public List<Filial> getAllFilial(){
        return filialRepository.findAll();
    }

    @RequestMapping(value = "/Filial", method = RequestMethod.POST)
    public Filial save(@RequestBody Filial filial) {
        return filialRepository.save(filial);
    }

    @RequestMapping(value = "/Filial/{id}", method = RequestMethod.GET)
    public Filial getFilialById (@PathVariable Long id) {
        return filialRepository.getOne(id);
    }
}
