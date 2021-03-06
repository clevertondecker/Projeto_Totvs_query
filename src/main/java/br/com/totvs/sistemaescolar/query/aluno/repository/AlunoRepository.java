package br.com.totvs.sistemaescolar.query.aluno.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.totvs.tjf.api.jpa.repository.ApiJpaRepository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String>, 
									   	 PagingAndSortingRepository<Aluno, String>, 
									     ApiJpaRepository<Aluno> {

	Optional<Aluno> getByCpf(String cpf);

}
