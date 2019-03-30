package com.teste.projeto.controller;

import com.teste.projeto.entity.Pedido;
import com.teste.projeto.entity.Produto;
import com.teste.projeto.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PedidoController {
    @Autowired
    PedidoRepository pedidoRepository;

    @RequestMapping(value = "/PedidoEstoque", method = RequestMethod.GET)
    public List<Pedido> getAllPedido() {
        return pedidoRepository.findAll();
    }


    /**
     * @brief post de pedido
     * @param pedido
     * @return pedido
     * @example method post
     * {
     * 	"idFilial": 1,
     * 	"tipo": "entrada",
     * 	"itens": [
     *                {
     * 	        "idFilial": 1,
     * 	        "quantidade": 200,
     * 	        "descricao": "Arroz"
     *        },
     *        {
     * 	        "idFilial": 1,
     * 	        "quantidade": 100,
     * 	        "descricao": "Feijao"
     *        }
     * 		]
     * }
     */
    @RequestMapping(value = "/PedidoEstoque", method = RequestMethod.POST)
    public Pedido save(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    /**
     * @brief returna a lita de produtos por id
     * @param id do pedido
     * @return lista de produtos
     * exemplo: localhost:9000/api/ItemPedidoEstoque/8
     */
    @RequestMapping(value = "ItemPedidoEstoque/{id}", method = RequestMethod.GET)
    public List<Produto> getProdutos (@PathVariable Long id) {
        Pedido pedido = pedidoRepository.getOne(id);
        return pedido.getItens();
    }

    /**
     * @brief deleta um pedido por id
     * @param id
     */
    @RequestMapping(value = "/PedidoEstoque/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }
}
