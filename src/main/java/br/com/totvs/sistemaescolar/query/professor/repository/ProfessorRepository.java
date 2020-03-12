package br.com.totvs.sistemaescolar.query.professor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.totvs.tjf.api.jpa.repository.ApiJpaRepository;

import br.com.totvs.sistemaescolar.query.professor.repository.service.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, String>, 
									   	 PagingAndSortingRepository<Professor, String>, 
									     ApiJpaRepository<Professor> {

}
