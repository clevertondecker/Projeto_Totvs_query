package br.com.totvs.sistemaescolar.query.aluno.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
public class Aluno {

	@Id
	@Column
	private String id;
	private String nome;
	private String email;
	private String cpf;
	private String matricula;
	private String formaIngresso;
	private String turmaId;

}
