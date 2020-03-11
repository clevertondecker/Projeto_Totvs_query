package br.com.totvs.sistemaescolar.query.aluno.amqp;

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
public class AlunoCriadoEvent {

	public static final String NAME = "AlunoCriadoEvent";

	public static final String CONDITIONAL_EXPRESSION = "headers['type']=='" + NAME + "'";

	private String id;
	private String nome;
	private String email;
	private String cpf;
	private String formaIngresso;
	private String matricula;
	private String turmaId;

}