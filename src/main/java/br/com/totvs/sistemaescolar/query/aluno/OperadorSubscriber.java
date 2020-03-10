package br.com.totvs.sistemaescolar.query.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.totvs.tjf.core.message.TOTVSMessage;

import br.com.totvs.sistemaescolar.query.aluno.amqp.events.AlunoCriadoEvent;
import br.com.totvs.sistemaescolar.query.amqp.SistemaEscolaExchange;
import br.com.totvs.sistemaescolar.query.repository.service.AlunoService;

@EnableBinding(SistemaEscolaExchange.class)
public class OperadorSubscriber {

	@Autowired
	private AlunoService service;

	@StreamListener(target = SistemaEscolaExchange.INPUT, condition = AlunoCriadoEvent.CONDITIONAL_EXPRESSION)
	public void AlunoCriadoEvent(TOTVSMessage<AlunoCriadoEvent> event) {
		service.handle(event.getContent());
	}
}
