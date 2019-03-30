package com.teste.projeto.controller;

import com.teste.projeto.entity.Filial;
import com.teste.projeto.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FilialController {

    @Autowired
    FilialRepository filialRepository;

    @RequestMapping(value = "/filial", method = RequestMethod.GET)
    public List<Filial> getAllFilial(){
        return filialRepository.findAll();
    }
}
