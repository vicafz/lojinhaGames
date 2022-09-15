package com.generation.lojaJogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojaJogos.model.ProdutoModel;

@Repository
public interface ProdutoRepository  extends JpaRepository<ProdutoModel, Long>{
	public List <ProdutoModel> findAllByNomesContainingIgnoreCase(@Param("titulo") String titulo);

}