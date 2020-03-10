package br.com.totvs.sistemaescolar.query.amqp;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SistemaEscolaExchange {

	public static final String INPUT = "sistema_escolar-input-events";
	
	@Input(SistemaEscolaExchange.INPUT)
	SubscribableChannel inputEvent();
}
