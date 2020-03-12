package br.com.totvs.sistemaescolar.query.professor.amqp.events;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProfessorCriadoEvent {

	public static final String NAME = "ProfessorCriadoEvent";

	public static final String CONDITIONAL_EXPRESSION = "headers['type']=='" + NAME + "'";

	@NonNull
	private String id;
	private String nome;
	private String email;
	private String cpf;
	private String titulo;
	private String disciplinaId;

}