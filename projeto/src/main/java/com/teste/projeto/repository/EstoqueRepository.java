package com.teste.projeto.repository;

import com.teste.projeto.entity.Estoque;
import com.teste.projeto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
