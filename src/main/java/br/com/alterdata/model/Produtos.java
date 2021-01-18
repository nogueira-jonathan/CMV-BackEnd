package br.com.alterdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private int valorCompra;
	
	@Column(nullable = true)
	private int valorCompraFinal;
	
	@Column(nullable = true)
	private int estoqueInicial;
	
	@Column(nullable = true)
	private int estoqueFinal;
	
	@Column(nullable = true)
	private int vendas;
	
	


}
