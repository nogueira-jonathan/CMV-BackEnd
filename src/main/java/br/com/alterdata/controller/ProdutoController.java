package br.com.alterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.alterdata.model.Produtos;
import br.com.alterdata.repository.ProdutosRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	@GetMapping
	public List<Produtos> listar() {
		return produtosRepository.findAll();
		
	}
	
	@PostMapping
	public Produtos adicionar (@RequestBody Produtos produtos) {
		return produtosRepository.save(produtos);
	}
	
	@PutMapping
	public Produtos atualizarProduto(@RequestBody Produtos produtos) {
		return produtosRepository.save(produtos);
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/produto/{id}")
	public  Produtos obterProdutoID(@PathVariable(value="id") long id) {
		return produtosRepository.findById(id);
		
	}
}
