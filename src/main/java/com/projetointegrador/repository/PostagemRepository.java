package com.projetointegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetointegrador.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {

	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);

	public List<PostagemModel> findAllByPostagemContainingIgnoreCase(String postagem);

	public List<PostagemModel> findAllByEscolaridadeContainingIgnoreCase(String escolaridade);

	public List<PostagemModel> findAllBySubtemaContainingIgnoreCase(String subtema);
}
