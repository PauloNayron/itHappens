package com.teste.projeto.controller;

import com.teste.projeto.entity.Pedido;
import com.teste.projeto.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PedidoController {
    @Autowired
    PedidoRepository pedidoRepository;

    @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
    public List<Pedido> getAllPedido() {
        return pedidoRepository.findAll();
    }
}
