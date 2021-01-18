package br.com.alterdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alterdata.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

	Produtos findById(long id);

}
