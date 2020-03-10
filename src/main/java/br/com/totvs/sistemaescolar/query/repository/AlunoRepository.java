package br.com.totvs.sistemaescolar.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.totvs.tjf.api.jpa.repository.ApiJpaRepository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String>, 
									   	 PagingAndSortingRepository<Aluno, String>, 
									     ApiJpaRepository<Aluno> {

}
