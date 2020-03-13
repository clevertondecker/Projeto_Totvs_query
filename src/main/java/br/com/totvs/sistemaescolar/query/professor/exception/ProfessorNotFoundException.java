package br.com.totvs.sistemaescolar.query.professor.exception;

import com.totvs.tjf.api.context.stereotype.ApiErrorParameter;
import com.totvs.tjf.api.context.stereotype.error.ApiNotFound;

import lombok.Getter;

@ApiNotFound("ProfessorNotFoundException")
@Getter
public class ProfessorNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -59323636429833688L;
	@ApiErrorParameter
	private final String cpf;

	public ProfessorNotFoundException(String cpf) {
		this.cpf = cpf;
	}
}
