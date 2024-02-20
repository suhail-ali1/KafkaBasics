package com.kafka.Producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka.Model.User;

@Service
public class JsonKafkaProducer {
	
	private static final Logger logs = LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String, User> kafkatemp;

	public void sendMessage(User data)
	{
		logs.info(data.toString());
		
		Message<User> message = MessageBuilder
				                .withPayload(data)
				                .setHeader(KafkaHeaders.TOPIC , "jsonkafka-topic")
				                .build();
		kafkatemp.send(message);
		
	}
	
}
