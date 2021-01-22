package br.com.alterdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	private String nome;
	
	@NotNull
	@NotBlank
	private int valorCompra;
	
	@NotNull
	@NotBlank
	private int valorCompraFinal;
	
	@NotNull
	@NotBlank
	private int estoqueInicial;
	
	@NotNull
	@NotBlank
	private int estoqueFinal;
	
	@NotNull
	@NotBlank
	private int vendas;
	
	


}
