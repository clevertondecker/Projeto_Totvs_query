package br.com.totvs.sistemaescolar.query.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.totvs.tjf.core.message.TOTVSMessage;

import br.com.totvs.sistemaescolar.query.aluno.amqp.events.AlunoUpsertedEvent;
import br.com.totvs.sistemaescolar.query.config.SistemaEscolaExchange;
import br.com.totvs.sistemaescolar.query.repository.service.AlunoService;

@EnableBinding(SistemaEscolaExchange.class)
public class OperadorSubscriber {

	@Autowired
	private AlunoService service;

	@StreamListener(target = SistemaEscolaExchange.INPUT, condition = AlunoUpsertedEvent.CONDITIONAL_EXPRESSION)
	public void alunoUpsertedEvent(TOTVSMessage<AlunoUpsertedEvent> event) {
		service.handle(event.getContent());
	}
}
