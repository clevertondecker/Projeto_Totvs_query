package br.com.totvs.sistemaescolar.query.aluno.exception;

import com.totvs.tjf.api.context.stereotype.ApiErrorParameter;
import com.totvs.tjf.api.context.stereotype.error.ApiNotFound;

import lombok.Getter;

@ApiNotFound("AlunoNotFoundException")
@Getter
public class AlunoNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -6571322547108586403L;
		@ApiErrorParameter
		private final String cpf;

		public AlunoNotFoundException(String cpf) {
			this.cpf = cpf;
		}
	}
