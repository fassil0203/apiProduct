package com.br.apiproduct.apiproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.apiproduct.apiproduct.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
	Produto findByid(long id);

}
