package br.com.totvs.sistemaescolar.query.config;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SistemaEscolaExchange {

	public static final String INPUT = "input-events";
	
	@Input(SistemaEscolaExchange.INPUT)
	SubscribableChannel inputEvent();
}
