package com.kafka.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.Model.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger logs = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics = "jsonkafka-topic" , groupId = "myGroup" )
	public void consume(User user)
	{
		logs.info(user.toString());
		
	}
	
	
}
