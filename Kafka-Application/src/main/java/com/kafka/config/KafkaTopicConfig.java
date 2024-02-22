package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

// Creating Kafka Topic Using This Configuration Class

@Configuration
public class KafkaTopicConfig {
	
	// Kafka Topic First
	@Bean
	public NewTopic topic()
	{
		return TopicBuilder.name("kafka-topic").build();
// We can Split this topic into partitions for example partitions(10)
	}
	
	// Kafka Topic Second..
	@Bean
	public NewTopic topic2()
	{
		return TopicBuilder.name("jsonkafka-topic").build();

	}

}
