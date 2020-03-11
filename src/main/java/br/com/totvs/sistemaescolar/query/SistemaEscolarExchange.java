package br.com.totvs.sistemaescolar.query;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SistemaEscolarExchange {

	public static final String INPUT = "SistemaEscolarExchange-input-events";
	
	@Input(SistemaEscolarExchange.INPUT)
	SubscribableChannel inputEvent();
}
