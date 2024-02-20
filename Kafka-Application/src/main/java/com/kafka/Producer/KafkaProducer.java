package com.kafka.Producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	public static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	public KafkaTemplate<String, String> kafkaTemplate;
	
	
	
	public void sendMessage(String message)
	{
		logger.info(message);
		kafkaTemplate.send("kafka-topic", message);
	}
	
	
}
