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
	@Column
	private String nome;
	
	@NotNull
	@NotBlank
	@Column
	private int valorCompra;
	
	@NotNull
	@NotBlank
	@Column
	private int valorCompraFinal;
	
	@NotNull
	@NotBlank
	@Column
	private int estoqueInicial;
	
	@NotNull
	@NotBlank
	@Column
	private int estoqueFinal;
	
	@NotNull
	@NotBlank
	@Column
	private int vendas;
	
	


}
