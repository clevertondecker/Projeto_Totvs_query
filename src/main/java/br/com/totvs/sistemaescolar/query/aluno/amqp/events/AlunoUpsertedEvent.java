package br.com.totvs.sistemaescolar.query.aluno.amqp.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public final class AlunoUpsertedEvent {

	public static final String NAME = "AlunoUpsertedEvent";

	public static final String CONDITIONAL_EXPRESSION = "headers['type']=='" + NAME + "'";

	private String id;

	private String nome;

	private String email;

	private String cpf;

	private String matricula;

	private String formaIngresso;
}
