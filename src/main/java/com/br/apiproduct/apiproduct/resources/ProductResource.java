package com.br.apiproduct.apiproduct.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.apiproduct.apiproduct.models.Produto;
import com.br.apiproduct.apiproduct.repository.ProdutoRepository;

@RestController
@RequestMapping(value="api")

public class ProductResource {


	@Autowired
	ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	public List<Produto>listaProdutos(){
		return produtoRepository.findAll();

	}
	@GetMapping("/produto/{id}")
	public Produto listaProdutounico(@PathVariable(value="id")long id) {
		return produtoRepository.findByid(id);
	}
	
	@PostMapping("/produto")
	public Produto salvarProduto (@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	@DeleteMapping("/produto")
	public void deletaProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	@PutMapping("/produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	
	}

}
