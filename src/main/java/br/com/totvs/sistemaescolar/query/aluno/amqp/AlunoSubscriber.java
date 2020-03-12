package br.com.totvs.sistemaescolar.query.aluno.amqp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import com.totvs.tjf.core.message.TOTVSMessage;
import br.com.totvs.sistemaescolar.query.aluno.amqp.events.AlunoCriadoEvent;

import br.com.totvs.sistemaescolar.query.amqp.YMSExchange;
import br.com.totvs.sistemaescolar.query.repository.service.AlunoService;

@EnableBinding(YMSExchange.class)
public class AlunoSubscriber {

	@Autowired
	private AlunoService service;

	@StreamListener(target = YMSExchange.INPUT, condition = AlunoCriadoEvent.CONDITIONAL_EXPRESSION)
	public void AlunoCriadoEvent(TOTVSMessage<AlunoCriadoEvent> event) {
		service.handle(event.getContent());
	}
}
