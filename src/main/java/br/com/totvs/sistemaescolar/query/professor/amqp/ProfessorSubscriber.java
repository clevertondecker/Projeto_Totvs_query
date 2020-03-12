package br.com.totvs.sistemaescolar.query.professor.amqp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import com.totvs.tjf.core.message.TOTVSMessage;

import br.com.totvs.sistemaescolar.query.YMSExchange;
import br.com.totvs.sistemaescolar.query.professor.amqp.events.ProfessorCriadoEvent;
import br.com.totvs.sistemaescolar.query.professor.repository.ProfessorService;

@EnableBinding(YMSExchange.class)
public class ProfessorSubscriber {

	@Autowired
	private ProfessorService service;
	
	@StreamListener(target = YMSExchange.INPUT, condition = ProfessorCriadoEvent.CONDITIONAL_EXPRESSION)
	public void ProfessorCriadoEvent(TOTVSMessage<ProfessorCriadoEvent> event) {
		service.handle(event.getContent());
	}
}
