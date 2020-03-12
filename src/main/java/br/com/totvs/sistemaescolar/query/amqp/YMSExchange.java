package br.com.totvs.sistemaescolar.query.amqp;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface YMSExchange {

	public static final String INPUT = "yms-input-events";
	
	@Input(YMSExchange.INPUT)
	SubscribableChannel inputEvent();
}
